class WordDeck {
    var words = setOf<Word>(
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
    var filteredWords: MutableSet<Word> = mutableSetOf()
    fun filterByLanguage(words: MutableSet<Word>,language: String) {
        filteredWords = words.filter { it.language == language}.toMutableSet()
    }
    fun filterByDifficulty(words: MutableSet<Word>, difficulty: Int) {
        filteredWords = words.filter { it.difficultylvl == difficulty}.toMutableSet()
    }
    fun reset() {
        filteredWords = words as MutableSet<Word>
    }
}