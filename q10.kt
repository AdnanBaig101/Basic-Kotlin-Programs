sealed class ScreenState {
    object Loading : ScreenState()
    data class Success(val data: String) : ScreenState()
}

fun main() {
    val state: ScreenState = ScreenState.Success("Loaded")

    when (state) {
        is ScreenState.Loading -> println("Loading...")
        is ScreenState.Success -> println(state.data)
    }
}
