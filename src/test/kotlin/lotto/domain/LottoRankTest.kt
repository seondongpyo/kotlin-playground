package lotto.domain

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class LottoRankTest {

    @DisplayName("일치하는 로또 번호 개수에 따른 로또 당첨 결과 반환")
    @MethodSource("rankPerCountArguments")
    @ParameterizedTest
    fun rankPerCount(matchCount: Int, hasBonusNumber: Boolean, rank: LottoRank) {
        assertThat(LottoRank.from(matchCount, hasBonusNumber)).isEqualTo(rank)
    }

    companion object {

        @JvmStatic
        fun rankPerCountArguments(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(6, false, LottoRank.FIRST),
                Arguments.of(5, true, LottoRank.SECOND),
                Arguments.of(5, false, LottoRank.THIRD),
                Arguments.of(4, false, LottoRank.FOURTH),
                Arguments.of(3, false, LottoRank.FIFTH),
                Arguments.of(2, false, LottoRank.NONE),
                Arguments.of(1, false, LottoRank.NONE),
                Arguments.of(0, false, LottoRank.NONE),
            )
        }
    }
}
