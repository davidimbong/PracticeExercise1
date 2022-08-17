import java.util.*

fun main(args: Array<String>) {

    val scan = Scanner(System.`in`)
    println("Input range: ")

    var num1 = scan.nextInt()
    var num2 = scan.nextInt()

    for (num in num1..num2){
        when (num % 2) {
            0 -> println("$num - Even")
            1 -> println ("$num - Odd")
        }
    }

}