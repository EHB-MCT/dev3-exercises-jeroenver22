 class Duolingo {

     var selectedCount: Int = 5
    var words: WordDeck = wordDeck()
     constructor(chosenlanguage: String = "Zweeds",
                 selectedCount: Int = 5) {
         this.selectedCount = selectedCount
     }

     var wordDeck = WordDeck()
     var wordSet = mutableSetOf<Word>()
   //  fun filterWords() {
     //    wordSet = wordDeck.words.filter { it.language == chosenlanguage }.toMutableSet()
    // }

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

