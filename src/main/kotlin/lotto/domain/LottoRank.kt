package lotto.domain

enum class LottoRank {
    FIRST,
    SECOND;

    companion object {
        fun from(matchCount: Int): LottoRank {
            return FIRST
        }
    }
}
