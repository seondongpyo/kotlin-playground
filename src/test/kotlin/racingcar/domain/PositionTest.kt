package racingcar.domain

import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatThrownBy
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class PositionTest {

    @DisplayName("유효한 자동차 위치")
    @Test
    fun valid() {
        assertThat(Position(1)).isEqualTo(Position(1))
    }

    @DisplayName("최초 자동차 위치는 0")
    @Test
    fun initial() {
        assertThat(Position().value()).isZero
    }

    @DisplayName("유효하지 않은 자동차 위치 - 음수")
    @Test
    fun invalid() {
        assertThatThrownBy { Position(-1) }
            .isInstanceOf(IllegalArgumentException::class.java)
    }
}
