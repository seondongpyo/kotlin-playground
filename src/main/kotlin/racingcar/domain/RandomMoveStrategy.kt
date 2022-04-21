package racingcar.domain

import java.util.Random

class RandomMoveStrategy : MoveStrategy {

    companion object {
        private const val MIN_MOVABLE_NUMBER = 4
        private const val BOUND_NUMBER = 10
        private val random = Random()
    }

    override fun isMovable(): Boolean {
        return random.nextInt(BOUND_NUMBER) >= MIN_MOVABLE_NUMBER
    }
}
