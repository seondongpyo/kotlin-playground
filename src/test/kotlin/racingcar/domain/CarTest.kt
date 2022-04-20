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

    @DisplayName("자동차가 전진하면 위치 값이 1 증가한다.")
    @Test
    fun move() {
        val car = Car("james")
        car.move()
        assertThat(car.isLocatedAt(1)).isTrue
    }
}
