Crash my main
fun main(){
    /*
      all the class is initiated and there print functions are here
     */
    val students = Students("Bangladesh")
    with(students){
        println("\nStudents info provided bellow\n_________________")
        println("Name: $name")
        println("$age years old")
        println("University: $institute")
        println("Resident of ${getCountry()}")
        println("Bus fare: ${busFare()}")

    }

    val bjitTrainee = BjitTrainee("Bangladesh")
    with(bjitTrainee){
        println("\nBJIT Trainee Info provided bellow\n_________________________")

        println("Name: $name")
        println("$age years old")
        println("Company ${getCompay()}")
        println("Resident of ${getCountry()}")
        println("Bus fare: ${busFare()}")
    }
}
/*
person clas it is the top parent class have  name and age
 */
abstract class Person(private var country: String){
    abstract val name: String
    abstract val age: Int
    abstract fun busFare(): Double
    fun getCountry(): String {
        return country
    }
}
/*
this is student class. they contains institute and universitydistance for Busfare
 */
open class Students(country: String): Person(country){
    override val name: String = "Plabon"
    override val age: Int = 22
    val institute: String = "East West University"
    val universityDistance = 10.0
    override fun busFare(): Double {
        return (universityDistance*2.5)/2
    }



}
/*
this is employee class that have company and officedistance
 */
open class Emloyee(country: String): Person(country){
    override val name: String = "Sizan"
    override val age: Int = 22
    val company: String = "BJIT"
    val officeDistance = 22.0
    override fun busFare(): Double {
        return officeDistance*2.5
    }
}
/*
this is bjittrainee class
 */
class BjitTrainee(country: String) : Emloyee(country){
    override val name: String = "Ihsan"
    override val age: Int = 23
    fun getCompay() : String{
        return super.company
    }
    override fun busFare(): Double{
        return super.busFare()/2
    }
}