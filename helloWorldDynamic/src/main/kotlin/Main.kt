fun main() {
    val friends = arrayOf("Jeroen", "James", "Sophie", "Megan", "Simon")
    for (friend in friends) {
        greet(friend)
    }
    greet( "bob")
}
fun greet(name:String){
        println("Hello $name")
    }
