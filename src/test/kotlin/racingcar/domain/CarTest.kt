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

    @DisplayName("자동차 생성 시 기본 위치 값은 0")
    @Test
    fun defaultPosition() {
        val car = Car("james")
        assertThat(car.isLocatedAt(0)).isTrue
    }
}
