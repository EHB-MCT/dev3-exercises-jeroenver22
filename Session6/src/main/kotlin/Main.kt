import java.sql.DriverManager
import java.util.*

fun main(){
    Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance()
    // Prepare credentials
    val connectionProps = Properties()
    val credentials = Credentials()
    connectionProps["user"] = credentials.user
    connectionProps["password"] = credentials.password

// Create the connection: this will allow us to run queries on it later
    val connection =  DriverManager.getConnection(
        "jdbc:" + "mysql" + "://" +
                credentials.hostName +
                ":" + "3306" + "/" +
                credentials.databaseName,
        connectionProps)
    val search = println("To what city would you like to go ?")
    val input = readLine()
    val statement = connection.prepareStatement("SELECT departure_time from rides \n" +
    "INNER JOIN cities on rides.train_city_id = cities.departure_city_id \n" +
            "WHERE cities.`name`= ?")
    // Replace the var without allowing full queries to be entered
        statement.setString(1, input)
    val result = statement.executeQuery()
    while(result.next()) {
        result.getString("departure_time")
        println("Your train is leaving at: " + result.getString( "departure_time"))
    }





}
fun askCity(){

}