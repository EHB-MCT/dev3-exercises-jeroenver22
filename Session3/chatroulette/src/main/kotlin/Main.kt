fun main(){

    val persons = arrayOf(Person("Michael"),Person("John"))
    val randomPerson = persons.random()
    println(randomPerson)
    randomPerson.chat()
}