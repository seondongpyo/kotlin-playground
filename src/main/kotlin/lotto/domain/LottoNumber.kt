package lotto.domain

class LottoNumber(
    private val value: Int
) {

    init {
        require(value in MIN_VALUE..MAX_VALUE)
    }

    fun value(): Int {
        return value
    }

    companion object {
        const val MIN_VALUE = 1
        const val MAX_VALUE = 45
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as LottoNumber

        if (value != other.value) return false

        return true
    }

    override fun hashCode(): Int {
        return value
    }
}
