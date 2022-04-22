package lotto.domain

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class LottoNumberTest {

    @DisplayName("유효한 로또 숫자")
    @Test
    fun valid() {
        assertThat(LottoNumber(1)).isEqualTo(LottoNumber(1))
    }
}
