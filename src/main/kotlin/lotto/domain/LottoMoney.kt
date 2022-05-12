package lotto.domain

import java.math.BigDecimal

class LottoMoney(
    private val value: BigDecimal
) {

    init {
        if (value < MONEY_PER_TICKET) {
            throw IllegalArgumentException()
        }
    }

    constructor(value: Long) : this(BigDecimal.valueOf(value))

    fun availableLottoTicketCount(): Int {
        return value.divide(MONEY_PER_TICKET).toInt()
    }

    fun calculateEarningRate(totalPrize: BigDecimal): BigDecimal {
        return totalPrize.divide(value)
    }

    companion object {
        private val MONEY_PER_TICKET = BigDecimal.valueOf(1_000)
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
