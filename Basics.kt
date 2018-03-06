/**
 * Sarah Twomey 3/5/18
 */


const val sample1: Byte = 0x3a
const val acceleration = 9.800
const val integral: Char = '\u222b'
const val greeting: String = "Hello"

fun main(args: Array<String>) {
    val sample2: Byte = 58
    val heartRate: Int = 85
    val deposits: Double = 135002796.toDouble()
    val mass: Float = 14.6.toFloat() 
    val distance: Double = 129.763001 
    val lost: Boolean = true
    val expensive: Boolean = true
    val choice: Int = 2
    val name: String = "Karen"
    
    
    if(sample1 == sample2) {
        println("The samples are equal.")
    } else {
        println("The samples are not equal.")
    }
    
    if(heartRate >= 40 && heartRate <= 80) {
        println("Heart rate is normal.")
    } else {
        println("Heart rate is not normal.")
    }
    
    if(deposits >= 100000000) {
        println("You are exceedingly wealthy.")
    } else {
        println("Sorry you are so poor.")
    }
    
    val force: Float = mass*acceleration.toFloat()
    println("force = " + force)

    println(distance.toString() + " is the distance.");
    
    if(lost == true && expensive == true) {
        println("I am really sorry! I will get the manager.")
    } 
    if (lost == true && expensive == false) {
        println("Here is a coupon for 10% off.")
    }
    
    println( when {
        choice == 1 -> "You chose 1."
        choice == 2 -> "You chose 2."
        choice == 3 -> "You chose 3."
        else -> "You made an unknown choice."
    })
    
    println(integral + " is an integral.")
    
    for(i in 5..10) {
        println("i = " + i)
    }
    
    var age = 0
    while(age <= 6) {
        println("age = " + age)
        ++age
    }
    
    println(greeting + " " + name)
}
