package lotto.domain

import java.util.*

enum class LottoRank(
    private val matchCount: Int,
    private val prizeMoney: Int
) {

    FIRST(6, 2_000_000_000),
    SECOND(5, 30_000_000),
    THIRD(5, 1_500_000),
    FOURTH(4, 50_000),
    FIFTH(3, 5_000),
    NONE(0, 0);

    companion object {
        fun from(matchCount: Int, hasBonusNumber: Boolean): LottoRank {
            val rank = Arrays.stream(values())
                .filter { it.hasCount(matchCount) }
                .findFirst()
                .orElse(NONE)

            if (matchCount == 5 && !hasBonusNumber) {
                return THIRD
            }

            return rank
        }
    }

    fun hasCount(matchCount: Int): Boolean {
        return this.matchCount == matchCount
    }

    fun matchCount(): Int {
        return this.matchCount
    }

    fun prizeMoney(): Int {
        return this.prizeMoney
    }

    fun isNone(): Boolean {
        return this == NONE
    }

    fun isSecond(): Boolean {
        return this == SECOND
    }
}
