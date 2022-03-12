package stage1

fun main() {

    while (true) {
        println("Task (hide, show, exit):")

        when (val command = readln()) {
            "hide" -> println("Hiding message in image.")
            "show" -> println("Obtaining message from image.")
            "exit" -> break
            else -> println("Wrong task: $command")
        }
    }

    println("Bye!")
}