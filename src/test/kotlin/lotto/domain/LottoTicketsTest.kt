package lotto.domain

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class LottoTicketsTest {

    @DisplayName("로또 티켓 번호들로 여러 장의 로또 티켓 묶음을 생성")
    @Test
    fun create() {
        val lottoTickets = LottoTickets(
            listOf(
                LottoTicket(listOf(1, 2, 3, 4, 5, 6)),
                LottoTicket(listOf(7, 8, 9, 10, 11, 12)),
                LottoTicket(listOf(13, 14, 15, 16, 17, 18)),
            ))

        assertThat(lottoTickets.size()).isEqualTo(3)
    }

    @DisplayName("로또 티켓 묶음과 당첨 번호를 비교하여 모든 당첨 결과를 구한다.")
    @Test
    fun match() {
        val lottoTickets = LottoTickets(
            listOf(
                LottoTicket(listOf(1, 2, 3, 4, 5, 6)),
                LottoTicket(listOf(1, 2, 3, 4, 5, 7)),
                LottoTicket(listOf(1, 2, 3, 4, 7, 8)),
            ))

        val winningLottoTicket = LottoTicket(listOf(1, 2, 3, 4, 5, 6))

        assertThat(lottoTickets.match(winningLottoTicket))
            .containsExactly(LottoRank.FIRST, LottoRank.SECOND, LottoRank.THIRD)
    }
}
