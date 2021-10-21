fun main(){

    val persons = arrayOf(Student("Michael"),
        Teacher("John"), Commedian("Mike"))
    // Array<Person>
    val chatPartner = persons.random()
    chatPartner.chat()
    chatPartner.talk()
}