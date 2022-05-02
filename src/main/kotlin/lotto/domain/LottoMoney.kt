package lotto.domain

class LottoMoney(
    private val value: Int
) {

    init {
        if (value < 1_000) {
            throw IllegalArgumentException()
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        return true
    }

    override fun hashCode(): Int {
        return javaClass.hashCode()
    }
}
