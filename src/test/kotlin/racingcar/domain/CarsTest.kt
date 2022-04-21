package racingcar.domain

import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class CarsTest {

    @DisplayName("자동차 경주 우승자를 구한다.")
    @Test
    fun winners() {
        val cars = Cars(
            listOf(
                Car("Son", 5),
                Car("Kane", 5),
                Car("Lucas", 4)
            )
        )

        val winners = cars.winners()

        assertThat(winners).containsExactly(
            Car("Son", 5),
            Car("Kane", 5)
        )
    }
}
