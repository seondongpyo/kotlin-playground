package lotto.domain

import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatThrownBy
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class WinningLottoTicketTest {

    @DisplayName("6개의 로또 번호와 보너스 번호로 당첨 번호를 갖는 로또 생성")
    @Test
    fun create() {
        assertThat(WinningLottoTicket(listOf(1, 2, 3, 4, 5, 6), 7))
            .isEqualTo(WinningLottoTicket(listOf(1, 2, 3, 4, 5, 6), 7))
    }

    @DisplayName("6개의 로또 번호와 보너스 번호가 중복되면 예외 발생")
    @Test
    fun duplicate() {
        assertThatThrownBy { WinningLottoTicket(listOf(1, 2, 3, 4, 5, 6), 6) }
            .isInstanceOf(IllegalArgumentException::class.java)
    }

    @DisplayName("당첨 확인 결과, 로또 번호가 5개 일치하고 보너스 번호가 일치하면 2등")
    @Test
    fun second() {
        val winningLottoTicket = WinningLottoTicket(listOf(1, 2, 3, 4, 5, 6), 7)
        assertThat(winningLottoTicket.match(LottoTicket(listOf(1, 2, 3, 4, 5, 7)))).isEqualTo(LottoRank.SECOND)
    }
}
