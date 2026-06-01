import kotlinx.coroutines.delay

suspend fun fetchWeather(): String {
    delay(1000)
    return "Sunny"
}
