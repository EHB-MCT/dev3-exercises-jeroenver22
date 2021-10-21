
open class Person(open val name : String):ChatPartner {
    override fun chat(){
    println("Hello $name give a short introduction about yourself")
    }

    override fun introduce() {
        println("Hello my name is $name")
    }

}
