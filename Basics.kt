 /**
 * We declare a package-level function main which returns Unit and takes
 * an Array of strings as a parameter. Note that semicolons are optional.
 */


//Declare a constant of type unsigned 8 bit integer named sample1 with an initial value of 0x3A
const val sample1: Byte = 0x3a
//Declare a float constant named acceleration that has an initial value of 9.800
const val acceleration = 9.800
//Declare a constant that is a character type named integral that has a value of “\u{222B}”
//not working
//const val integral: Char = '\u{222B}'

//Create a string constant named greeting that has an initial value of “Hello”
const val greeting: String = "Hello"

fun main(args: Array<String>) {
    println("Hello, world!")
    
    //Declare a variable of type unsigned 8 bit integer named sample2 with an initial value of 58
    val sample2: Byte = 58
    //Declare an integer variable named heartRate with an initial value of 85
    val heartRate: Int = 85
    //Declare a double variable named deposits that has an initial value of 135002796
    val deposits: Double = 135002796.toDouble()
    //Declare a float variable named mass that has an initial value of 14.6
    val mass: Float = 14.6.toFloat() 
    //Declare a double variable named distance that has an initial value of 129.763001
    val distance: Double = 129.763001 
    //Declare a boolean variable named lost that has an initial value of true
    val lost: Boolean = true
    //Declare a boolean variable named expensive that has an initial value of true
    val expensive: Boolean = true
    //Declare an integer variable named choice with an initial value of 2
    val choice: Int = 2
    //Create a string variable named name that has an initial value of “Karen”
    val name: String = "Karen"
    
    
    //Compare sample1 to sample2 and if they are equal display “The samples are equal.” otherwise display “The samples are not equal.”
    if(sample1 == sample2) {
        println("The samples are equal.")
    } else {
        println("The samples are not equal.")
    }
    //If heartRate is greater than equal to 40 and less than equal to 80 display “Heart rate is normal.” otherwise display “Heart rate is not normal.”
    if(heartRate >= 40 && heartRate <= 80) {
        println("Heart rate is normal.")
    } else {
        println("Heart rate is not normal.")
    }
    //If deposits is greater than or equal to 100000000 display “You are exceedingly wealthy.” otherwise display “Sorry you are so poor.”
    if(deposits >= 100000000) {
        println("You are exceedingly wealthy.")
    } else {
        println("Sorry you are so poor.")
    }
    //Declare a variable called force that is assigned to the mass times the acceleration. The force variable must be of the same type as the type that results from the multiplication of mass and acceleration.
    val force: Float = mass*acceleration.toFloat()
    //Display the calculated force preceded by the string “force = ”. The output should look like the following (actual value will be different): force = 2.345
    println("force = " + force)
    //Display the value of distance followed by “ is the distance.”
    println(distance.toString() + " is the distance.");
    //Using lost and expensive display “I am really sorry! I will get the manager.” if lost and expensive are both true and “Here is coupon for 10% off.” if lost is true and expensive is false.
    println( when{
      lost == true && expensive == true -> "I am really sorry! I will get the manager."
      lost == true && expensive == false -> "Here is a coupon for 10% off."
      else -> "Thanks for shopping here."
    })
    
    //Use the Kotlin “when” expression and the variable choice to display “You chose 1.” if choice is 1, “You chose 2.” if choice is 2, “You chose 3.” if choice is 3, and “You made an unknown choice.” if choice is something other than 1, 2, or 3.
    println( when {
        choice == 1 -> "You chose 1."
        choice == 2 -> "You chose 2."
        choice == 3 -> "You chose 3."
        else -> "You made an unknown choice."
    })
    //Using the character constant integral, display the character in integral followed by the string “ is an integral.”
    //not working
    //println(integral + " is an integral.")
}
