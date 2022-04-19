package racingcar.domain

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class NameTest {

    @DisplayName("유효한 자동차 이름")
    @Test
    fun valid() {
        assertThat(Name("james")).isEqualTo(Name("james"))
    }
}
