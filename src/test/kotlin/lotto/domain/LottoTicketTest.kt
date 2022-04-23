package lotto.domain

import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatThrownBy
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class LottoTicketTest {

    @DisplayName("6개의 번호로 로또 티켓 생성")
    @Test
    fun create() {
        assertThat(LottoTicket(listOf(1, 2, 3, 4, 5, 6))).isEqualTo(LottoTicket(listOf(1, 2, 3, 4, 5, 6)))
    }

    @DisplayName("인자로 전달된 번호에 중복이 있다면 로또 티켓 생성 시 예외가 발생")
    @Test
    fun invalid() {
        assertThatThrownBy { LottoTicket(listOf(1, 2, 3, 4, 5, 5)) }
            .isInstanceOf(IllegalArgumentException::class.java)
    }
}
