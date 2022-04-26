package lotto.domain

import java.util.stream.Collectors

class LottoTickets(
    private val tickets: List<LottoTicket>
) {

    fun size(): Int {
        return tickets.size
    }

    fun match(winningLottoTicket: LottoTicket): List<LottoRank> {
        return tickets.stream()
            .map { ticket -> ticket.match(winningLottoTicket) }
            .collect(Collectors.toList())
    }

}
