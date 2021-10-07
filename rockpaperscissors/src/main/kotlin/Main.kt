import java.awt.Choice

fun main(args: Array<String>){
    val options = arrayOf("rock", "paper", "scissors")
    val computedChoise = getComputedChoise(options)
    val playerChoise = getPlayerChoise(options)
    printResult(playerChoise, computedChoise)
}
fun getComputedChoise(optionsParam : Array<String>) =
    optionsParam[(Math.random() * optionsParam.size).toInt()]

fun getPlayerChoise(optionsParam: Array<String>): String{
    var isValidChoise = false
    var playerChoise = ""

        while(!isValidChoise){
        println("Please choose any of the following")
        for(item in optionsParam) print(" $item")
        println(".")

    val playerInput = readLine()
        if(playerInput != null && playerInput in optionsParam){
            isValidChoise = true
            playerChoise = playerInput
        }
        if(!isValidChoise) println("Choose you must young paragrim!")
}
    return playerChoise
}
fun printResult(playerChoise: String, computedChoise: String){
    val result:String

    if(playerChoise == computedChoise) result = "Tie"
    else if((playerChoise == "scissors" && computedChoise == "paper" ||
        playerChoise == "paper" && computedChoise == "rock" ||
        playerChoise == "rock" && computedChoise == "scissors")) result = "You win"
    else result = "You lose"

    println("Your choise is $playerChoise, the computer choise $computedChoise")
    println("$result")
}