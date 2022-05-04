package lotto.view

import lotto.domain.LottoTickets

class ResultView {

    companion object {
        fun showPurchasedLottoTickets(lottoTickets: LottoTickets) {
            val tickets = lottoTickets.tickets()
            println("%d개를 구매했습니다.".format(tickets.size))
            tickets.forEach {ticket -> println(ticket.numbers())}
            println()
        }
    }
}
