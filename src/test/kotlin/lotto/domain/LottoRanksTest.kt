package lotto.domain

import lotto.domain.LottoRank.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import java.math.BigDecimal

class LottoRanksTest {

    @DisplayName("모든 당첨 결과로 전체 당첨 금액을 계산")
    @Test
    fun totalPrize() {
        val ranks = LottoRanks(listOf(FIRST, SECOND, THIRD, FOURTH, FIFTH, NONE))
        assertThat(ranks.totalPrize()).isEqualTo(BigDecimal.valueOf(2_031_555_000))
    }
}
