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
        challengeTwo()
        }else{
            gameOver()
        }
}

fun challengeTwo(){
    println("A huge cloud of Mosquitos are following you, you see a bit further a river to which you can run to and probably" +
            "dive into it and hold your breath until they leave")
    println("Pick low or high")
    diceRoll()
}
fun diceRoll(){
    val dice = (1..6).shuffled().first()


    val userAnswer = readLine()

    var acceptedAnswers = setOf<Int>()

    if(userAnswer == "low" ){
        acceptedAnswers = setOf<Int>(1,2,3)
    }else{
        acceptedAnswers = setOf<Int>(4,5,6)
    }
    if(acceptedAnswers.contains(dice)){
            println("You have safely made it into the water")
        }else{
            println("You where too slow and you died because the musquitos sucked all your blood")
    }
            println("you have rolled  $dice")
}

fun win(){
    println("Congratz!")
    challengeTwo()
}

fun gameOver(){
    println("You are eaten by the lions")
}