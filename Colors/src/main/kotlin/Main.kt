import kotlin.random.Random

fun main() {
    val colors = arrayOf("red", "blue", "green", "yellow", "orange", "purple", "pink", "brown")

    println("Welcome to the Color Guessing Game!")
    println("Try to guess the color...")

    val randomColor = colors[Random.nextInt(colors.size)]

    var guess: String? = readLine()?.trim()?.toLowerCase()

    while (guess != null) {
        if (guess == randomColor) {
            println("Congratulations! You guessed it right!")
            break
        } else {
            println("Sorry, that's incorrect. Try again!")
            guess = readLine()?.trim()?.toLowerCase()
        }
    }
}
