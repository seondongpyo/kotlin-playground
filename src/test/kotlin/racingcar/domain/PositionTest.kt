package racingcar.domain

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class PositionTest {

    @DisplayName("유효한 자동차 위치")
    @Test
    fun valid() {
        assertThat(Position(1)).isEqualTo(Position(1))
    }
}
