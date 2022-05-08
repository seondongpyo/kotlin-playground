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

    @DisplayName("모든 당첨 결과 중에서 특정 로또 당첨 등수가 몇 번인지 확인")
    @Test
    fun countOf() {
        val ranks = LottoRanks(listOf(FIRST, SECOND, NONE, NONE, NONE))
        assertThat(ranks.countOf(NONE)).isEqualTo(3)
    }
}
