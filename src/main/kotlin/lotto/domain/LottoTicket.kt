package lotto.domain

import java.util.stream.Collectors

class LottoTicket(
    numbers: List<Int>
) {

    private val numbers: Set<LottoNumber>

    init {
        this.numbers = numbers.stream()
            .map { number -> LottoNumber(number) }
            .collect(Collectors.toSet())

        if (this.numbers.size != 6) {
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
