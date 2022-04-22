package lotto.domain

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

class LottoNumberTest {

    @DisplayName("유효한 로또 숫자")
    @ValueSource(ints = [1, 45])
    @ParameterizedTest
    fun valid(value: Int) {
        assertThat(LottoNumber(value)).isEqualTo(LottoNumber(value))
    }
}
