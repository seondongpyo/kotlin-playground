package lotto.domain

import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatThrownBy
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class LottoTicketTest {

    @DisplayName("6개의 번호로 로또 티켓 생성")
    @Test
    fun create() {
        assertThat(LottoTicket(listOf(1, 2, 3, 4, 5, 6))).isEqualTo(LottoTicket(listOf(1, 2, 3, 4, 5, 6)))
    }

    @DisplayName("인자로 전달된 번호에 중복이 있다면 로또 티켓 생성 시 예외가 발생")
    @Test
    fun invalid() {
        assertThatThrownBy { LottoTicket(listOf(1, 2, 3, 4, 5, 5)) }
            .isInstanceOf(IllegalArgumentException::class.java)
    }

    @DisplayName("로또 티켓에 특정 로또 번호가 포함되어 있는지 확인")
    @Test
    fun contains() {
        val lottoTicket = LottoTicket(listOf(1, 2, 3, 4, 5, 6))
        assertThat(lottoTicket.contains(LottoNumber(1))).isTrue
    }

    @DisplayName("로또 티켓끼리 비교하여 당첨 결과 확인")
    @MethodSource("matchArguments")
    @ParameterizedTest
    fun match(numbers: List<Int>, result: LottoRank) {
        val lottoTicket = LottoTicket(listOf(1, 2, 3, 4, 5, 6))
        assertThat(lottoTicket.match(LottoTicket(numbers))).isEqualTo(result)
    }

    companion object {
        @JvmStatic
        fun matchArguments(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(listOf(1, 2, 3, 4, 5, 6), LottoRank.FIRST),
                Arguments.of(listOf(1, 2, 3, 4, 5, 7), LottoRank.SECOND),
                Arguments.of(listOf(1, 2, 3, 4, 7, 8), LottoRank.THIRD),
                Arguments.of(listOf(1, 2, 3, 7, 8, 9), LottoRank.FOURTH),
                Arguments.of(listOf(1, 2, 7, 8, 9, 10), LottoRank.NONE),
                Arguments.of(listOf(1, 7, 8, 9, 10, 11), LottoRank.NONE),
                Arguments.of(listOf(7, 8, 9, 10, 11, 12), LottoRank.NONE),
            )
        }
    }
}
