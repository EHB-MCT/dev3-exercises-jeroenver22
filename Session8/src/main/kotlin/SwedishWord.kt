class SwedishWord(
    override val original: String,
    override val translated: String,
    override var difficultylvl: Int = 1,
):
    Word(original, translated, "Zweeds", difficultylvl) {
}