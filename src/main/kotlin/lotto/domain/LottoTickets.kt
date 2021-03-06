package lotto.domain

import java.util.stream.Collectors

class LottoTickets(
    private val tickets: List<LottoTicket>
) {

    fun size(): Int {
        return tickets.size
    }

    fun match(winningLottoTicket: WinningLottoTicket): LottoRanks {
        val ranks = tickets.stream()
            .map { winningLottoTicket.match(it) }
            .collect(Collectors.toList())
        return LottoRanks(ranks)
    }

    fun tickets(): List<LottoTicket> {
        return tickets
    }

}
