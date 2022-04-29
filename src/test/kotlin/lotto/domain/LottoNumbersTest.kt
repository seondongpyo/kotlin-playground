package lotto.domain

import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class LottoNumbersTest {

    @DisplayName("사용자가 입력한 값으로 로또 번호 묶음을 생성한다.")
    @Test
    fun create() {
        val numbers = "1,2,3,4,5,6"
        assertThat(LottoNumbers.from(numbers)).isEqualTo(LottoNumbers.of(1, 2, 3, 4, 5, 6))
    }
}
