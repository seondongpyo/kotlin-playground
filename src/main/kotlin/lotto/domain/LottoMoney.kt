package lotto.domain

class LottoMoney(
    private val value: Int
) {

    init {
        if (value < MONEY_PER_TICKET) {
            throw IllegalArgumentException()
        }
    }

    companion object {
        private const val MONEY_PER_TICKET = 1_000
    }

    fun availableLottoTicketCount(): Int {
        return value / MONEY_PER_TICKET
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
