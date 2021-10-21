fun main(){

    val persons = arrayOf(Student("Michael"),
        Teacher("John"), Commedian("Mike"), chatbot())
    // Array<Person>
    val chatPartner = persons.random()
    chatPartner.chat()
    chatPartner.talk()
}