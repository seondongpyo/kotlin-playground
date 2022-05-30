package lotto.domain

import java.util.stream.Collectors
import java.util.stream.IntStream

class LottoTicketMachine {

    private val lottoNumberPool = IntStream.rangeClosed(LottoNumber.MIN_VALUE, LottoNumber.MAX_VALUE)
                                    .boxed()
                                    .collect(Collectors.toList())

    fun issueLottoTickets(totalLottoTicketCount: Int, manualLottoTicketNumbers: List<LottoNumbers>): LottoTickets {
        val autoLottoTicketCount = totalLottoTicketCount - manualLottoTicketNumbers.size
        val autoLottoTickets = issueAutoLottoTickets(autoLottoTicketCount)
        val manualLottoTickets = issueManualLottoTickets(manualLottoTicketNumbers)

        val lottoTickets = arrayListOf<LottoTicket>()
        lottoTickets.addAll(autoLottoTickets)
        lottoTickets.addAll(manualLottoTickets)

        return LottoTickets(lottoTickets)
    }

    private fun issueAutoLottoTickets(autoLottoTicketCount: Int): List<LottoTicket> {
        return IntStream.range(0, autoLottoTicketCount)
            .mapToObj { LottoTicket(pickLottoNumbers()) }
            .collect(Collectors.toList())
    }

    private fun pickLottoNumbers(): Set<Int> {
        lottoNumberPool.shuffle()
        return IntStream.range(0, 6)
            .mapToObj { lottoNumberPool[it] }
            .sorted()
            .collect(Collectors.toSet())
    }

    private fun issueManualLottoTickets(manualLottoTicketNumbers: List<LottoNumbers>): List<LottoTicket> {
        return manualLottoTicketNumbers.stream()
            .map { it.toLottoTicket() }
            .collect(Collectors.toList())
    }

}
