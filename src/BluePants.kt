import java.util.Random
import kotlin.system.exitProcess

open class BaseGame(val game_name:String)
{
    //Assigns a number from 1-6 to keyGenerator
    val keyGenerator = Random().nextInt(7-1)+1
    private var gotKey = false
    var currentRoom = 1

    fun start()
    {
        println("Thank you for playing $game_name")
        println("")
        println("You went exploring in a haunted house and you realized how dumb that was and now you want to go home.")
        println("Your goal is to survive and make it out the house.")
        println("To make the situation worst, you lost the keys to your car.")
        println("Your keys are in one of these rooms, so you have to search every room until you find it.")
        println("Good luck.")
        println("")
    }
    fun end()
    {
        if(gotKey == false)
        {
            println("")
            println("Ah man, you made it, but you didn't get your car keys.")
            println("Hey, did you hear that?")
            println("A poltergeist comes out the walls and pulls you into the dark....")
            println("GAME OVER")
        }
        if(gotKey == true)
        {
            println("Hey you made it out alive!")
            println("As you drive away in your car, you realize that listening to Lindsey and letting her convince you to go to that house was dumb.")
            println("You live to see another day.")
        }
    }
    //This function asks the user for the direction.  Only lets the user go either up, down, left, or right
    fun getDirection(currentRoom:Int): String
    {
        println("What direction do you want to go?  Enter up, down, left, or right")
        var direction = readLine()
        while ((direction != "up")&&(direction != "down")&&(direction != "left")&&(direction != "right"))
        {
            println("Sorry, you cannot go that way.")
            println("What direction do you want to go?  Enter up, down, left, or right")
            direction = readLine()
        }
        return direction
    }
    fun survive():Boolean
    {
        val chance = Random().nextInt(101-1)+1
        if(chance > 95)
        {
            println("As you go for the door, you hear footsteps come closer.")
            println("Your vision goes dark.")
            println("Your body becomes numb.")
            println("You hear a sinister laugh.")
            println("Sorry, you didn't make it....")
            exitProcess(0)
        }
        println("You proceed to the next room.")
        return true
    }
    fun search(room_key:Boolean)
    {
        if(room_key)
            println("You found the key!")
        gotKey = true
    }
    fun location1(room:String)
    {
        currentRoom = 1
        var room_key:Boolean = false
        if(keyGenerator == 1)
        {
            room_key = true
        }
        println("You are in $room")
        search(room_key)
        survive()
    }
    fun location2(room:String)
    {
        currentRoom = 2
        var room_key:Boolean = false
        if(keyGenerator == 2)
        {
            room_key = true
        }
        println("You are in $room")
        search(room_key)
        survive()
    }
    fun location3(room:String)
    {
        currentRoom = 3
        var room_key:Boolean = false
        if(keyGenerator == 3)
        {
            room_key = true
        }
        println("You are in $room")
        search(room_key)
        survive()
    }
    fun location4(room:String)
    {
        currentRoom = 4
        var room_key:Boolean = false
        if(keyGenerator == 4)
        {
            room_key = true
        }
        println("You are in $room")
        search(room_key)
        survive()
    }
    fun location5(room:String)
    {
        currentRoom = 5
        var room_key:Boolean = false
        if(keyGenerator == 5)
        {
            room_key = true
        }
        println("You are in $room")
        search(room_key)
        survive()
    }
    fun location6(room:String)
    {
        currentRoom = 6
        var room_key:Boolean = false
        if(keyGenerator == 6)
        {
            room_key = true
        }
        println("You are in $room")
        search(room_key)
        survive()
    }
}

//Just in case, this is the way you inherit, or extend from a function.
class NewGame(game_name:String, keyGenerator: Int):BaseGame(game_name)
{

}

fun main(args: Array<String>)
{
    var test = BaseGame("test")
    test.start()
    test.location1("1")
    test.location2("2")
    test.location3("3")
    test.location4("4")
    test.location5("5")
    test.location6("6")
    test.end()
    println("Hi Lindsey")
}