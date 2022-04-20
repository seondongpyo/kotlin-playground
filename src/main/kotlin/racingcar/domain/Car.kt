package racingcar.domain

class Car(
    name: String,
    position: Int
) {

    private val name = Name(name)
    private val position = Position(position)

    constructor(name: String) : this(name, Position.DEFAULT_VALUE)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Car

        if (name != other.name) return false
        if (position != other.position) return false

        return true
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + position.hashCode()
        return result
    }
}
