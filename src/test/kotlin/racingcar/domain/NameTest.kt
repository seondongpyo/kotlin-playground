package racingcar.domain

import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatThrownBy
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

class NameTest {

    @DisplayName("유효한 자동차 이름")
    @Test
    fun valid() {
        assertThat(Name("james")).isEqualTo(Name("james"))
    }

    @DisplayName("유효하지 않은 자동차 이름 - 공백 또는 6글자 이상")
    @ValueSource(strings = ["", "jackson"])
    @ParameterizedTest
    fun invalid(value: String) {
        assertThatThrownBy { Name(value) }
            .isInstanceOf(IllegalArgumentException::class.java)
    }
}
