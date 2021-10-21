class Commedian(override val name: String): Person(name) {
    override fun chat(){
        laugh()
    }
    fun laugh(){
        println("Why is a mummy surrounded by fabric, because he is complicated")
    }
}
