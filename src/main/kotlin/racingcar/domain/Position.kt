package racingcar.domain

class Position(
    private var value: Int
) {

    constructor(): this(DEFAULT_VALUE)

    companion object {
        private const val DEFAULT_VALUE = 0
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
