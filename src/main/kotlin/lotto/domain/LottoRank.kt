package lotto.domain

enum class LottoRank {
    FIRST;

    companion object {
        fun from(matchCount: Int): LottoRank {
            return FIRST
        }
    }
}
