package lotto.view

import lotto.domain.LottoRank
import lotto.domain.LottoRanks
import lotto.domain.LottoTickets
import java.util.*

class ResultView {

    companion object {
        fun showPurchasedLottoTickets(lottoTickets: LottoTickets) {
            val tickets = lottoTickets.tickets()
            println("%d개를 구매했습니다.".format(tickets.size))
            tickets.forEach { ticket -> println(ticket.numbers()) }
            println()
        }

        fun showTotalPrizes(lottoRanks: LottoRanks) {
            println("\n당첨 통계\n---------")
            Arrays.stream(LottoRank.values())
                .filter { rank -> !rank.isNone() }
                .sorted(Comparator.comparingInt(LottoRank::prizeMoney))
                .forEach { rank -> printResultPerRank(lottoRanks, rank) }
        }

        private fun printResultPerRank(lottoRanks: LottoRanks, rank: LottoRank) {
            val count = lottoRanks.countOf(rank)
            println("%d개 일치 (%d원)- %d개".format(rank.matchCount(), rank.prizeMoney(), count))
        }
    }
}
