package lotto.domain

import java.math.BigDecimal

class LottoRanks(
    private val ranks: List<LottoRank>
) {

    fun totalPrize(): BigDecimal {
        return ranks.stream()
            .mapToInt { it.prizeMoney() }
            .sum()
            .toBigDecimal()
    }

    fun countOf(rank: LottoRank): Int {
        return ranks.stream()
            .filter { it == rank }
            .count()
            .toInt()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as LottoRanks

        if (ranks != other.ranks) return false

        return true
    }

    override fun hashCode(): Int {
        return ranks.hashCode()
    }
}
