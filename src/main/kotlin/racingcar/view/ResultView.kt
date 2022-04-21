package racingcar.view

import racingcar.domain.Car

class ResultView {

    companion object {
        private const val SYMBOL = "-"

        fun showPosition(cars: List<Car>) {
            val builder = StringBuilder()
            for (car in cars) {
                builder.append("%s : %s%n".format(car.name(), positionToSymbol(car.position())))
            }
            println(builder.toString())
        }

        private fun positionToSymbol(position: Int): String {
            val builder = StringBuilder()
            for (index in 0 until position) {
                builder.append(SYMBOL)
            }
            return builder.toString()
        }
    }
}
