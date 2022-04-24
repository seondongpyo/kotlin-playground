package lotto.domain

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class LottoRankTest {

    @DisplayName("로또 당첨 결과 - 1등")
    @Test
    fun first() {
        assertThat(LottoRank.from(6)).isEqualTo(LottoRank.FIRST)
    }

    @DisplayName("로또 당첨 결과 - 2등")
    @Test
    fun second() {
        assertThat(LottoRank.from(5)).isEqualTo(LottoRank.SECOND)
    }
}
