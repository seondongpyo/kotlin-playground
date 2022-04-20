package racingcar.domain

class AttemptCount(
    private val value: Int
) {

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
