package lotto.domain

class LottoRanks(
    private val ranks: List<LottoRank>
) {

    fun totalPrize(): Int {
        return ranks.stream()
            .mapToInt { rank -> rank.prizeMoney() }
            .sum()
            .toInt()
    }

}
