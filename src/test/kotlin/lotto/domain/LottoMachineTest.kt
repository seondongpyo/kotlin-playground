package lotto.domain

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class LottoMachineTest {

    @DisplayName("입력한 금액만큼 로또 티켓을 발급 (1000원당 1장)")
    @Test
    fun issueLottoTickets() {
        val lottoTicketMachine = LottoTicketMachine()
        val lottoTickets = lottoTicketMachine.issueLottoTickets(5000)
        assertThat(lottoTickets.size()).isEqualTo(5)
    }
}
