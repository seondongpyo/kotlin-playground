package lotto.domain

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class LottoMoneyTest {

    @DisplayName("금액 생성")
    @Test
    fun create() {
        assertThat(LottoMoney(1000)).isEqualTo(LottoMoney(1000))
    }
}