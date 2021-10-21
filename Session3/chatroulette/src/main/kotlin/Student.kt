class Student(override val name: String): Person(name), ChatPartner {
    override fun chat(){
        gossip()
    }
    fun gossip(){
        println("Bummer, nothing to share")
    }
}
