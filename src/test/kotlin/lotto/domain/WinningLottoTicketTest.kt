package lotto.domain

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class WinningLottoTicketTest {

    @DisplayName("6개의 로또 번호와 보너스 번호로 당첨 번호를 갖는 로또 생성")
    @Test
    fun create() {
        assertThat(WinningLottoTicket(listOf(1, 2, 3, 4, 5, 6), 7))
            .isEqualTo(WinningLottoTicket(listOf(1, 2, 3, 4, 5, 6), 7))
    }
}
