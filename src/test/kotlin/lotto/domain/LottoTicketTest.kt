package lotto.domain

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class LottoTicketTest {

    @DisplayName("6개의 번호로 로또 티켓 생성")
    @Test
    fun create() {
        assertThat(LottoTicket(listOf(1, 2, 3, 4, 5, 6))).isEqualTo(LottoTicket(listOf(1, 2, 3, 4, 5, 6)))
    }
}
