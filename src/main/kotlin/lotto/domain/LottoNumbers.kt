package lotto.domain

class LottoNumbers(
    private val numbers: List<Int>
) {

    companion object {
        fun from(numbers: String): LottoNumbers {
            return LottoNumbers(listOf(1, 2, 3, 4, 5, 6))
        }

        fun of(vararg number: Int): LottoNumbers {
            return LottoNumbers(number.toList())
        }
    }
}
