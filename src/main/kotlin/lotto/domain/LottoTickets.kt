package lotto.domain

class LottoTickets(
    private val tickets: List<LottoTicket>
) {

    fun size(): Int {
        return tickets.size
    }

    fun match(winningLottoTicket: LottoTicket): List<LottoRank> {
        return emptyList()
    }

}
