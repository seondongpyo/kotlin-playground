package lotto.view

import lotto.domain.LottoMoney
import lotto.domain.LottoRank
import lotto.domain.LottoRanks
import lotto.domain.LottoTickets
import java.util.*

class ResultView {

    companion object {
        private const val MESSAGE_RESULT_PER_PRIZE = "%d개 일치 (%d원)- %d개"
        private const val MESSAGE_RESULT_2ND_PRIZE = "%d개 일치, 보너스 볼 일치 (%d원)- %d개"

        fun showPurchasedLottoTickets(lottoTickets: LottoTickets) {
            val tickets = lottoTickets.tickets()
            println("%d개를 구매했습니다.".format(tickets.size))
            tickets.forEach { println(it.numbers()) }
            println()
        }

        fun showTotalPrizes(money: LottoMoney, lottoRanks: LottoRanks) {
            println(System.lineSeparator() + "당첨 통계" + System.lineSeparator() + "---------")
            Arrays.stream(LottoRank.values())
                .filter { !it.isNone() }
                .sorted(Comparator.comparingInt(LottoRank::prizeMoney))
                .forEach { printResultPerRank(lottoRanks, it) }
            println("총 수익률은 %.2f입니다.".format(money.calculateEarningRate(lottoRanks.totalPrize())))
        }

        private fun printResultPerRank(lottoRanks: LottoRanks, rank: LottoRank) {
            val count = lottoRanks.countOf(rank)
            var message = MESSAGE_RESULT_PER_PRIZE

            if (rank.isSecond()) {
                message = MESSAGE_RESULT_2ND_PRIZE
            }

            println(message.format(rank.matchCount(), rank.prizeMoney(), count))
        }
    }
}
