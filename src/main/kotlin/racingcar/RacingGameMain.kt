package racingcar

import racingcar.domain.AttemptCount
import racingcar.domain.CarNames
import racingcar.domain.RacingGame
import racingcar.view.InputView

fun main() {
    val names = InputView.carNames()
    val count = InputView.attemptCount()

    val cars = CarNames(names).toCars()
    val attemptCount = AttemptCount(count)
    val racingGame = RacingGame(cars, attemptCount)

}
