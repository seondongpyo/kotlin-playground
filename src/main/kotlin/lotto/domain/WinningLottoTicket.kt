package lotto.domain

class WinningLottoTicket(
    private val ticket: LottoTicket,
    private val bonusNumber: LottoNumber
) {
    constructor(numbers: Set<Int>, bonusNumber: Int)
            : this(LottoTicket(numbers), LottoNumber(bonusNumber))

    init {
        if (ticket.contains(bonusNumber)) {
            throw IllegalArgumentException()
        }
    }

    fun match(purchasedTicket: LottoTicket): LottoRank {
        val matchCount = purchasedTicket.match(ticket)
        val hasBonusNumber = purchasedTicket.contains(bonusNumber)
        return LottoRank.from(matchCount, hasBonusNumber)
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
