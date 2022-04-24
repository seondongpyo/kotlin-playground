package lotto.domain

enum class LottoRank {
    FIRST,
    SECOND;

    companion object {
        fun from(matchCount: Int): LottoRank {
            if (matchCount == 6) {
                return FIRST
            }
            return SECOND
        }
    }
}
