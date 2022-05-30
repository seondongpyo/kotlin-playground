package racingcar.domain

import java.util.stream.Collectors
import kotlin.streams.toList

class CarNames(
    names: String
) {

    private val names = names.split(",")
                            .stream()
                            .toList()

    fun toCars(): Cars {
        val cars = names.stream()
            .map { Car(it) }
            .collect(Collectors.toList())
        return Cars(cars)
    }

    fun names(): List<String> {
        return names
    }

}
