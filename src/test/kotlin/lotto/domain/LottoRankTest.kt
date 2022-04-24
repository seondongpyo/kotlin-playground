package lotto.domain

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class LottoRankTest {

    @DisplayName("일치하는 로또 번호 개수에 따른 당첨 결과를 반환")
    @Test
    fun rank() {
        assertThat(LottoRank.from(6)).isEqualTo(LottoRank.FIRST)
    }
}
