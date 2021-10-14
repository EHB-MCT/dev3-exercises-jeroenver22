fun main(){
    println("Welcome adventure to your story, you are currently traveling through one of the deadliest places of the earth." +
            "Depending on your choices we will see if you can survive long enough to get back home safely ")
    challengeOne()

}

fun challengeOne(){
    println("Intro challenge 1")
    println("There is a pack of wild animals running at you please select one of the weapons to defend yourself!")

    val answers = setOf<String>("gun", "sword", "shield", "knives", "bow")
    println(answers)
    val userAnswer  = readLine()

    if(answers.contains(userAnswer)){
        win()
        }else{
            gameOver()
        }
}
fun win(){
    println("Congratz!")
}

fun gameOver(){
    println("You are eaten by the lions")
}
