package racingcar.domain

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class CarNamesTest {

    @DisplayName("자동차 이름을 ','로 구분하여 생성한다.")
    @Test
    fun create() {
        val names = "Son,Kane,Lucas"
        val carNames = CarNames(names)
        assertThat(carNames.names()).containsExactly("Son", "Kane", "Lucas")
    }
}
