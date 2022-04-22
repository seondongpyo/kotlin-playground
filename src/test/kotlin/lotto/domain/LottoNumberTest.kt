package lotto.domain

import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatThrownBy
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

class LottoNumberTest {

    @DisplayName("유효한 로또 번호")
    @ValueSource(ints = [1, 45])
    @ParameterizedTest
    fun valid(value: Int) {
        assertThat(LottoNumber(value)).isEqualTo(LottoNumber(value))
    }

    @DisplayName("유효하지 않은 로또 번호")
    @Test
    fun invalid() {
        assertThatThrownBy { LottoNumber(0) }
            .isInstanceOf(IllegalArgumentException::class.java)
    }
}
