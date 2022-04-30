package lotto.domain

import java.util.stream.Collectors

class LottoNumbers(
    private val numbers: Set<Int>
) {

    companion object {
        fun from(numbers: String): LottoNumbers {
            val lottoNumbers = numbers.split(",")
                .stream()
                .map { number -> Integer.parseInt(number) }
                .collect(Collectors.toSet())
            return LottoNumbers(lottoNumbers)
        }

        fun of(vararg number: Int): LottoNumbers {
            return LottoNumbers(number.toSet())
        }
    }

    fun toLottoTicket(): LottoTicket {
        return LottoTicket(numbers)
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as LottoNumbers

        if (numbers != other.numbers) return false

        return true
    }

    override fun hashCode(): Int {
        return numbers.hashCode()
    }
}
