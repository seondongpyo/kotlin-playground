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
        assertThat(LottoTicket(setOf(1, 2, 3, 4, 5, 6))).isEqualTo(LottoTicket(setOf(1, 2, 3, 4, 5, 6)))
    }

    @DisplayName("인자로 전달된 번호에 중복이 있다면 로또 티켓 생성 시 예외가 발생")
    @Test
    fun invalid() {
        assertThatThrownBy { LottoTicket(setOf(1, 2, 3, 4, 5, 5)) }
            .isInstanceOf(IllegalArgumentException::class.java)
    }

    @DisplayName("로또 티켓에 특정 로또 번호가 포함되어 있는지 확인")
    @Test
    fun contains() {
        val lottoTicket = LottoTicket(setOf(1, 2, 3, 4, 5, 6))
        assertThat(lottoTicket.contains(LottoNumber(1))).isTrue
    }

    @DisplayName("로또 티켓끼리 비교하여 일치하는 번호의 개수 확인")
    @MethodSource("matchArguments")
    @ParameterizedTest
    fun match(numbers: Set<Int>, result: Int) {
        val lottoTicket = LottoTicket(setOf(1, 2, 3, 4, 5, 6))
        assertThat(lottoTicket.match(LottoTicket(numbers))).isEqualTo(result)
    }

    companion object {
        @JvmStatic
        fun matchArguments(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(setOf(1, 2, 3, 4, 5, 6), 6),
                Arguments.of(setOf(1, 2, 3, 4, 5, 7), 5),
                Arguments.of(setOf(1, 2, 3, 4, 7, 8), 4),
                Arguments.of(setOf(1, 2, 3, 7, 8, 9), 3),
                Arguments.of(setOf(1, 2, 7, 8, 9, 10), 2),
                Arguments.of(setOf(1, 7, 8, 9, 10, 11), 1),
                Arguments.of(setOf(7, 8, 9, 10, 11, 12), 0),
            )
        }
    }
}
