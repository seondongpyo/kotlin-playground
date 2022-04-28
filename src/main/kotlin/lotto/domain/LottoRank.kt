package lotto.domain

import java.util.*

enum class LottoRank(
    private val matchCount: Int,
    private val prizeMoney: Int
) {

    FIRST(6, 2_000_000_000),
    SECOND(5, 1_500_000),
    THIRD(4, 50_000),
    FOURTH(3, 5_000),
    NONE(0, 0);

    companion object {
        fun from(matchCount: Int): LottoRank {
            return Arrays.stream(values())
                .filter { rank -> rank.hasCount(matchCount) }
                .findFirst()
                .orElse(NONE)
        }

        fun from(matchCount: Int, hasBonusNumber: Boolean): LottoRank {
            if (matchCount == 5 && hasBonusNumber) {
                return SECOND
            }

            return Arrays.stream(values())
                .filter { rank -> rank.hasCount(matchCount) }
                .findFirst()
                .orElse(NONE)
        }
    }

    fun hasCount(matchCount: Int): Boolean {
        return this.matchCount == matchCount
    }
}
