package racingcar.domain

class AlwaysMoveStrategy : MoveStrategy {

    override fun isMovable(): Boolean {
        return true
    }
}
