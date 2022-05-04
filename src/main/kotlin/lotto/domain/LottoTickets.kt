package lotto.domain

import java.util.stream.Collectors

class LottoTickets(
    private val tickets: List<LottoTicket>
) {

    fun size(): Int {
        return tickets.size
    }

    fun match(winningLottoTicket: WinningLottoTicket): List<LottoRank> {
        return tickets.stream()
            .map { ticket -> winningLottoTicket.match(ticket) }
            .collect(Collectors.toList())
    }

    fun tickets(): List<LottoTicket> {
        return tickets
    }

}
