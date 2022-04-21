package racingcar.domain

import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatThrownBy
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class AttemptCountTest {

    @DisplayName("유효한 시도 횟수")
    @Test
    fun valid() {
        assertThat(AttemptCount(1)).isEqualTo(AttemptCount(1))
    }

    @DisplayName("유효하지 않은 시도 횟수")
    @Test
    fun invalid() {
        assertThatThrownBy { AttemptCount(0) }
            .isInstanceOf(IllegalArgumentException::class.java)
    }

    @DisplayName("시도 횟수가 1 이상이라면 진행 상태")
    @Test
    fun decrease() {
        val attemptCount = AttemptCount(2)
        attemptCount.decrease()
        assertThat(attemptCount.isZero()).isFalse
    }

    @DisplayName("시도 횟수가 0이면 종료 상태")
    @Test
    fun end() {
        val attemptCount = AttemptCount(1)
        attemptCount.decrease()
        assertThat(attemptCount.isZero()).isTrue
    }
}
