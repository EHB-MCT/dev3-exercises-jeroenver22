fun main(){

    val persons = arrayOf(Student("Michael"),
        Teacher("John"), Commedian("Mike"), Chatbot())
    // Array<Person>
    val chatPartner = persons.random()
    chatPartner.chat()
    chatPartner.introduce()
}