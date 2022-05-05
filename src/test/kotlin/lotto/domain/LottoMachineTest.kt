package lotto.domain

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

class LottoMachineTest {

    @DisplayName("입력한 금액만큼 로또 티켓을 발급 (1000원당 1장)")
    @ValueSource(ints = [5_000, 9_999])
    @ParameterizedTest
    fun issueLottoTickets(money: Long) {
        val lottoTicketCount = LottoMoney(money).availableLottoTicketCount()
        val lottoTicketMachine = LottoTicketMachine()
        val lottoTickets = lottoTicketMachine.issueLottoTickets(lottoTicketCount)
        assertThat(lottoTickets.size()).isEqualTo(lottoTicketCount)
    }
}
