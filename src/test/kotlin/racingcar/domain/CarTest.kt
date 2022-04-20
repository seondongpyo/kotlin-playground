package racingcar.domain

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class CarTest {

    @DisplayName("자동차 생성 - 이름")
    @Test
    fun create() {
        assertThat(Car("james")).isEqualTo(Car("james"))
    }
}
