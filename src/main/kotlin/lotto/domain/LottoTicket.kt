package lotto.domain

import java.util.stream.Collectors

class LottoTicket(
    numbers: Set<Int>
) {

    private val numbers: Set<LottoNumber>

    init {
        this.numbers = numbers.stream()
            .map { LottoNumber(it) }
            .collect(Collectors.toSet())

        if (this.numbers.size != VALID_SIZE) {
            throw IllegalArgumentException()
        }
    }

    fun match(lottoTicket: LottoTicket): Int {
        return numbers.stream()
            .filter { lottoTicket.contains(it) }
            .count()
            .toInt()
    }

    fun contains(target: LottoNumber): Boolean {
        return numbers.contains(target)
    }

    fun numbers(): List<Int> {
        return numbers.stream()
            .map { it.value() }
            .sorted()
            .collect(Collectors.toList())
    }

    companion object {
        private const val VALID_SIZE = 6
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
