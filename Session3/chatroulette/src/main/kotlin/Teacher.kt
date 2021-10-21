class Teacher(override val name:String): Person(name) {
   override fun chat(){
        funfact()
    }
    fun funfact(){
        println("Did you know that Kotlin is the new Java language")
    }
}

