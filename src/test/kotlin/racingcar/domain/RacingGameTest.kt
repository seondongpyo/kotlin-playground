package racingcar.domain

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class RacingGameTest {

    @DisplayName("자동차 경주 - 미완주 상태")
    @Test
    fun race() {
        val cars = Cars(listOf(Car("Son"), Car("Kane"), Car("Lucas")))
        val attemptCount = AttemptCount(5)

        val racingGame = RacingGame(cars, attemptCount)
        racingGame.race(AlwaysMoveStrategy())

        assertThat(racingGame.isEnd()).isFalse
    }

    @DisplayName("자동차 경주 - 완주 상태")
    @Test
    fun finish() {
        val cars = Cars(listOf(Car("Son"), Car("Kane"), Car("Lucas")))
        val attemptCount = AttemptCount(1)

        val racingGame = RacingGame(cars, attemptCount)
        racingGame.race(AlwaysMoveStrategy())

        assertThat(racingGame.isEnd()).isTrue
    }
}
