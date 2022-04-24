package lotto.domain

import java.util.*

enum class LottoRank(
    private val matchCount: Int
) {

    FIRST(6),
    SECOND(5),
    NONE(0);

    companion object {
        fun from(matchCount: Int): LottoRank {
            return Arrays.stream(values())
                .filter { rank -> rank.matchCount == matchCount }
                .findFirst()
                .orElse(NONE)
        }
    }
}
