package racingcar.domain

class AlwaysStopStrategy : MoveStrategy {

    override fun isMovable(): Boolean {
        return false
    }
}
