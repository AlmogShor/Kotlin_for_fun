package bot

import java.util.Scanner


val scanner = Scanner(System.`in`) // Do not change this line

fun main() {
    greet("Mowgli", "2021") // change it as you need
    remindName()
    guessAge()
    count()
    test()
    end()
}

fun greet(assistantName: String, birthYear: String) {
    println("Hello! My name is ${assistantName}.")
    println("I was created in ${birthYear}.")
    println("Please, remind me your name.")
}

fun remindName() {
    val name = scanner.nextLine()
    println("What a pleasant name you have, ${name}!")
}

fun guessAge() {
    println("Let me guess your age.")
    println("Enter remainders of dividing your age by 3, 5 and 7.")
    val rem3 = scanner.nextInt()
    val rem5 = scanner.nextInt()
    val rem7 = scanner.nextInt()
    val age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105
    println("Your age is ${age}; that's a good time to start programming!")
}

fun count() {
    println("Now I will prove to you that I can count to any number you want.")
    val num = scanner.nextInt()
    for (i in 0..num) {
        print(i)
        println("!")
    }
}

fun test() {
    println("Let's test your programming knowledge.")
    println("Which number between 0-9 I'm thinking of right now?")
    println("0.")
    println("1.")
    println("2.")
    println("3.")
    println("4.")
    println("5.")
    println("6.")
    println("7.")
    println("8.")
    println("9.")
//    println("What is your guess?")

    var bool = false
    while (!bool) {
        val ans = scanner.nextInt()
        when (ans) {
            0 -> bool = true

            1 -> println("Please, try again.")
            2 -> println("Please, try again.")
            3 -> println("Please, try again.")
            4 -> println("Please, try again.")
            5 -> println("Please, try again.")
            6 -> println("Please, try again.")
            7 -> println("Please, try again.")
            8 -> println("Please, try again.")
            9 -> println("Please, try again.")
        }

    }
}

fun end() {
    println("Congratulations, have a nice day!") // Do not change this text
}
