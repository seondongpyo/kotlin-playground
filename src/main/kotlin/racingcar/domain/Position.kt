package racingcar.domain

import kotlin.math.max

class Position(
    private var value: Int
) {

    init {
        require(value >= DEFAULT_VALUE)
    }

    constructor() : this(DEFAULT_VALUE)

    companion object {
        const val DEFAULT_VALUE = 0
    }

    fun increase() {
        value += 1
    }

    fun findGreaterPosition(position: Int): Int {
        return max(value, position)
    }

    fun value(): Int {
        return value
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Position

        if (value != other.value) return false

        return true
    }

    override fun hashCode(): Int {
        return value
    }
}
