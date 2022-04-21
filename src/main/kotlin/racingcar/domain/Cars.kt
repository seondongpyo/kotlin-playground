package racingcar.domain

import java.util.stream.Collectors

class Cars(
    private val cars: List<Car>
) {

    fun race(strategy: MoveStrategy) {
        for (car in cars) {
            car.move(strategy)
        }
    }

    fun winners(): List<Car> {
        val maxPosition = findMaxPosition()
        return cars.stream()
            .filter { car -> car.isLocatedAt(maxPosition) }
            .collect(Collectors.toList())
    }

    private fun findMaxPosition(): Int {
        var position = 0
        for (car in cars) {
            position = car.findFurtherPosition(position)
        }
        return position
    }

}
