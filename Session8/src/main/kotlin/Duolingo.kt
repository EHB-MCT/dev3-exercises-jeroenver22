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
             selectedWords.remove(selectedWord)
         }else{
             println("The selected word was " + selectedWord.translated)
         }
         println("You still have " + selectedWords.count() +" to guess")

        }
     println("You made it")
    }


 }

