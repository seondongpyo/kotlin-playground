package racingcar.view

import racingcar.domain.Car
import java.util.stream.Collectors

class ResultView {

    companion object {
        private const val SYMBOL = "-"

        fun showPosition(cars: List<Car>) {
            val builder = StringBuilder()
            for (car in cars) {
                builder.append("%s : %s%n".format(car.name(), SYMBOL.repeat(car.position())))
            }
            println(builder.toString())
        }

        fun showWinners(winners: List<Car>) {
            val winnerNames = winners.stream()
                .map { it.name() }
                .collect(Collectors.joining(","))
            println("우승자는 %s 입니다.".format(winnerNames))
        }
    }
}
