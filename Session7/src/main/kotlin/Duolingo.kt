 class Duolingo {
     var chosenlanguage: String = "English"
     var selectedCount: Int = 5
     constructor(chosenlanguage: String = "English",
                 selectedCount: Int = 5) {
         this.selectedCount = selectedCount
         this.chosenlanguage = chosenlanguage
         filterWords()
     }

    val words = setOf<Word>(
        Word("wereld", "world", "Engels"),
        Word("Zwemmen", "Swimming", "Engels"),
        Word("lopen", "running", "Engels"),
        Word("tijger", "tiger", "Engels"),
        Word("onderzeeêr", "submarine","Engels"),
        Word("warmte", "värm", "Zweeds"),
        Word("zeehond", "täta", "zweeds"),
        Word("Hallo", "Halla", "Zweeds"),
        Word("autostrade", "motorväg", "Zweeds"),
        Word("Kerstmis","Jul", "Zweeds")

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

