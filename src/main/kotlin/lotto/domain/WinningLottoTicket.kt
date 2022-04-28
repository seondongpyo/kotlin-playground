package lotto.domain

class WinningLottoTicket(
    numbers: List<Int>,
    bonusNumber: Int
) {

    init {
        if (numbers.contains(bonusNumber)) {
            throw IllegalArgumentException()
        }
    }

    fun match(purchasedTicket: LottoTicket): LottoRank {
        return LottoRank.NONE
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
