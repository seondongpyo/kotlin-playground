package lotto.domain

import java.util.stream.Collectors
import java.util.stream.IntStream

class LottoTicketMachine {

    private val lottoNumberPool = IntStream.rangeClosed(LottoNumber.MIN_VALUE, LottoNumber.MAX_VALUE)
        .boxed()
        .collect(Collectors.toList())

    companion object {
        private const val MONEY_PER_TICKET = 1_000
    }

    fun issueLottoTickets(count: Int): LottoTickets {
        val lottoTickets = arrayListOf<LottoTicket>()
        for (index in 0 until count) {
            lottoTickets.add(LottoTicket(pickLottoNumbers()))
        }
        return LottoTickets(lottoTickets)
    }

    private fun pickLottoNumbers(): Set<Int> {
        lottoNumberPool.shuffle()
        return IntStream.range(0, 6)
            .mapToObj { index -> lottoNumberPool[index] }
            .sorted()
            .collect(Collectors.toSet())
    }

}
