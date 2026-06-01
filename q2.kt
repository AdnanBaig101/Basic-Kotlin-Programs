class Thermostat {
    var temperature: Double = 25.0
        private set

    fun setTemperature(value: Double) {
        temperature = value
    }
}

fun main() {
    val t = Thermostat()
    t.setTemperature(30.0)
    println(t.temperature)
}
