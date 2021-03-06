package racingcar.domain

class AttemptCount(
    private var value: Int
) {

    init {
        require(value >= MIN_VALUE)
    }

    companion object {
        private const val MIN_VALUE = 1
    }

    fun decrease() {
        value -= 1
    }

    fun isZero(): Boolean {
        return value == 0
    }

    fun value(): Int {
        return value
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as AttemptCount

        if (value != other.value) return false

        return true
    }

    override fun hashCode(): Int {
        return value
    }
}
