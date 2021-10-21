class Commedian(override val name: String): Person(name) {
    override fun talk(){
        laugh()
    }
    fun laugh(){
        println("Why is a mummy surrounded by fabric, because he is complicated")
    }
}
