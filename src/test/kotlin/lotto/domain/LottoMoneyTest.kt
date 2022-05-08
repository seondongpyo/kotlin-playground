package lotto.domain

import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatThrownBy
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import java.math.BigDecimal

class LottoMoneyTest {

    @DisplayName("금액 생성")
    @Test
    fun create() {
        assertThat(LottoMoney(1000)).isEqualTo(LottoMoney(1000))
    }

    @DisplayName("금액 생성 시, 액수가 1000원 미만일 경우 예외 발생")
    @Test
    fun invalid() {
        assertThatThrownBy { LottoMoney(999) }
            .isInstanceOf(IllegalArgumentException::class.java)
    }

    @DisplayName("주어진 금액으로 구매 가능한 로또 매수 계산")
    @Test
    fun availableLottoTicketCount() {
        val lottoMoney = LottoMoney(5000)
        assertThat(lottoMoney.availableLottoTicketCount()).isEqualTo(5)
    }

    @DisplayName("수익률 계산")
    @Test
    fun calculateEarningRate() {
        val lottoMoney = LottoMoney(5000)
        val totalPrize = BigDecimal.valueOf(5000)
        assertThat(lottoMoney.calculateEarningRate(totalPrize)).isEqualTo(BigDecimal.valueOf(1))
    }
}
