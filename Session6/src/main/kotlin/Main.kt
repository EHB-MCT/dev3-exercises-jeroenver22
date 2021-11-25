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
                ":" + "3306 (this is your port, this is the default)" + "/" +
                credentials.databaseName,
        connectionProps)



}