package racingcar.domain

class Name(
    private val value: String
) {

    init {
        require(value.isNotEmpty() && value.length <= MAX_LENGTH)
    }

    companion object {
        private const val MAX_LENGTH = 5
    }

    fun value(): String {
        return value
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Name

        if (value != other.value) return false

        return true
    }

    override fun hashCode(): Int {
        return value.hashCode()
    }
}
