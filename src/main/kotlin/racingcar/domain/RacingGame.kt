package racingcar.domain

class RacingGame(
    private val cars: Cars,
    private val attemptCount: AttemptCount
) {

    fun race(strategy: MoveStrategy) {
        cars.race(strategy)
        attemptCount.decrease()
    }

    fun isEnd(): Boolean {
        return attemptCount.isZero()
    }
}
