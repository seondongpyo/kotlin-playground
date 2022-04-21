package racingcar.domain

import kotlin.streams.toList

class CarNames(
    names: String
) {

    private val names = names.split(",")
                            .stream()
                            .toList()

    fun names(): List<String> {
        return names
    }

}
