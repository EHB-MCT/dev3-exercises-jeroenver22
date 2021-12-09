 class Duolingo {
     var chosenlanguage: String = "Zweeds"
     var selectedCount: Int = 5

     constructor(chosenlanguage: String = "Zweeds",
                 selectedCount: Int = 5) {
         this.selectedCount = selectedCount
         this.chosenlanguage = chosenlanguage
         if(chosenlanguage == chosenlanguage){
             filterWords()
         }else{
             throw Exception("Please choose a valid language")
         }
     }

    val words = setOf<Word>(
        EnglishWord("wereld", "world" ),
        EnglishWord("Zwemmen", "Swimming" ),
        EnglishWord("lopen", "running"),
        EnglishWord("tijger", "tiger"),
        EnglishWord("onderzeeêr", "submarine"),
        SwedishWord("warmte", "värm"),
        SwedishWord("zeehond", "täta"),
        SwedishWord("Hallo", "Halla"),
        SwedishWord("autostrade", "motorväg"),
        SwedishWord("Kerstmis","Jul")

    )
     var wordSet = mutableSetOf<Word>()
     fun filterWords() {
         wordSet = words.filter { it.language == chosenlanguage }.toMutableSet()
     }

 fun play(){
     val selectedWords = wordSet.shuffled().take(5).toMutableSet()
     var i = selectedWords.size
     while(selectedWords.isNotEmpty()){
         val selectedWord = selectedWords.random()
         println("Translate the selected word to " + "${selectedWord.language} : " + selectedWord.original)
         val userAnswer = readLine()

         if(selectedWord.translated == userAnswer){

             selectedWord.difficultylvl -= 1
             if(selectedWord.difficultylvl < 1){
                 selectedWord.difficultylvl = 1
             }
             selectedWords.remove(selectedWord)
             println("The difficulty of the word went down by one, difficulty lvl is " + selectedWord.difficultylvl)

         }else{
             selectedWord.difficultylvl += 2
             println("The selected word was " + selectedWord.translated)
             println("The difficulty of the word changed to " + selectedWord.difficultylvl)
         }
         println("You still have " + selectedWords.count() +" to guess")

        }
     println("You made it")
    }


 }

