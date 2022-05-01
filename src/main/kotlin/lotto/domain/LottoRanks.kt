package lotto.domain

import java.math.BigDecimal

class LottoRanks(
    private val ranks: List<LottoRank>
) {

    fun totalPrize(): BigDecimal {
        return ranks.stream()
            .mapToInt { rank -> rank.prizeMoney() }
            .sum()
            .toBigDecimal()
    }

}
