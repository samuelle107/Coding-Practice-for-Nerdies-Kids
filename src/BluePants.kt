import java.util.Random
import kotlin.system.exitProcess

open class BaseGame(val game_name:String)
{
    //Assigns a number from 1-6 to keyGenerator
    val keyGenerator = Random().nextInt(11-1)+1
    var gotKey = false
    var currentRoom = 1
    var searchLimit = 3

    var setRoomOne = "Room 1"
    var setRoomTwo = "Room 2"
    var setRoomThree = "Room 3"
    var setRoomFour = "Room 4"
    var setRoomFive = "Room 5"
    var setRoomSix = "Room 6"
    var setRoomSeven = "Room 7"
    var setRoomEight = "Room 8"
    var setRoomNine = "Room 9"
    var setRoomTen = "Room 10"

    fun start()
    {
        println("Thank you for playing $game_name")
        println("")
        println("You went exploring in a haunted house and you realized how dumb that was and now you want to go home.")
        println("To make the situation worst, you realize the keys to your car are not in your pocket.")
        println("They must have fallen out somehow, so they have to be in one of the rooms you explored.")
        println("This means you have to go back and check every room...")
        println("Your goal is to find you car keys and make it out of the house.")
        println("")
        println("Good luck...")
        println("")
        location1()
    }
    fun end()
    {
        if(!gotKey)
        {
            println("")
            println("Ah man, you made it, but you didn't get your car keys.")
            println("Hey, did you hear that?")
            println("A poltergeist comes out the walls and pulls you into the dark....")
            println("GAME OVER")
            exitProcess(0)
        }
        if(gotKey)
        {
            println("")
            println("Hey you made it out alive!")
            println("As you drive away in your car, you realize that listening to Lindsey and letting her convince you to go to that house was dumb.")
            println("You live to see another day.")
            exitProcess(0)
        }
    }
    //This function asks the user for the direction.  Only lets the user go either up, down, left, or right
    fun getDirection(): String
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
    private fun survive()
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
    }
    private fun search(room_key:Boolean)
    {
        if((searchLimit != 0) && (!gotKey))
        {
            println("Do you want to search?  Enter yes or no")
            var input = readLine()
            if(input == "yes")
            {
                if(room_key)
                {
                    println("You found your car keys!")
                    gotKey = true
                }
                else
                {
                    println("It isn't here....")
                    println("You hear footsteps come closer.")
                    searchLimit--
                }
            }
        }
        else if(searchLimit == 0)
        {
            println("You don't have any more time to search.")
        }
    }
    fun location1()
    {
        currentRoom = 1
        var room_key:Boolean = false
        if(keyGenerator == 1)
        {
            room_key = true
        }
        println("You are in $setRoomOne")
        search(room_key)
        //survive()
    }
    fun location2()
    {
        currentRoom = 2
        var room_key:Boolean = false
        if(keyGenerator == 2)
        {
            room_key = true
        }
        println("You are in $setRoomTwo")
        search(room_key)
        survive()
    }
    fun location3()
    {
        currentRoom = 3
        var room_key:Boolean = false
        if(keyGenerator == 3)
        {
            room_key = true
        }
        println("You are in $setRoomThree")
        search(room_key)
        survive()
    }
    fun location4()
    {
        currentRoom = 4
        var room_key:Boolean = false
        if(keyGenerator == 4)
        {
            room_key = true
        }
        println("You are in $setRoomFour")
        search(room_key)
        survive()
    }
    fun location5()
    {
        currentRoom = 5
        var room_key:Boolean = false
        if(keyGenerator == 5)
        {
            room_key = true
        }
        println("You are in $setRoomFive")
        search(room_key)
        survive()
    }
    fun location6()
    {
        currentRoom = 6
        var room_key:Boolean = false
        if(keyGenerator == 6)
        {
            room_key = true
        }
        println("You are in $setRoomSix")
        search(room_key)
        survive()
    }
    fun location7()
    {
        currentRoom = 7
        var room_key:Boolean = false
        if(keyGenerator == 7)
        {
            room_key = true
        }
        println("You are in $setRoomSeven")
        search(room_key)
        survive()
    }
    fun location8()
    {
        currentRoom = 8
        var room_key:Boolean = false
        if(keyGenerator == 8)
        {
            room_key = true
        }
        println("You are in $setRoomEight")
        search(room_key)
        survive()
    }
    fun location9()
    {
        currentRoom = 9
        var room_key:Boolean = false
        if(keyGenerator == 9)
        {
            room_key = true
        }
        println("You are in $setRoomNine")
        search(room_key)
        survive()
    }
    fun location10()
    {
        currentRoom = 10
        var room_key:Boolean = false
        if(keyGenerator == 10)
        {
            room_key = true
        }
        println("You are in $setRoomTen")
        search(room_key)
        survive()
    }
}

//Just in case, this is the way you inherit, or extend from a function.
class NewGame(game_name:String):BaseGame(game_name)
{
    var itemValue = 0

    fun loot():Int
    {
        itemValue = 10
        return itemValue
    }
    fun scoreboard()
    {
        println("Your total score is $itemValue")
    }
    fun map()
    {
        while(1==1)
        {
            when(currentRoom)
            {
                1->
                {
                    var direction = getDirection()
                    if(direction == "up")
                        location5()
                    else if (direction == "down")
                    {
                        println("You cannot go that way, try again.")
                        location1()
                    }
                    else if(direction == "left")
                        location2()
                    else if (direction == "right")
                        location3()
                }
                2->
                {
                    var direction = getDirection()
                    if(direction == "up")
                        location4()
                    else if (direction == "down")
                    {
                        println("You cannot go that way, try again.")
                        location2()
                    }
                    else if(direction == "left")
                    {
                        println("You cannot go that way, try again.")
                        location2()
                    }
                    else if (direction == "right")
                        location1()
                }
                3->
                {
                    map()
                    var direction = getDirection()
                    if(direction == "up")
                        location6()
                    else if (direction == "down")
                    {
                        println("You cannot go that way, try again.")
                        location3()
                    }
                    else if(direction == "left")
                        location1()
                    else if (direction == "right")
                    {
                        println("You cannot go that way, try again.")
                        location3()
                    }
                }
                4->
                {
                    println("You see an item.")
                    println("You pick up an item at it is worth ${loot()} points")
                    var direction = getDirection()
                    if(direction == "up")
                    {
                        println("You cannot go that way, try again.")
                        location4()
                    }
                    else if (direction == "down")
                        location2()
                    else if(direction == "left")
                    {
                        println("You cannot go that way, try again.")
                        location4()
                    }
                    else if (direction == "right")
                        location5()
                }
                5->
                {
                    var direction = getDirection()
                    if(direction == "up")
                    {
                        println("You cannot go that way, try again.")
                        location5()
                    }
                    else if (direction == "down")
                        location1()
                    else if(direction == "left")
                        location4()
                    else if (direction == "right")
                        location6()
                }
                6->
                {
                    var direction = getDirection()
                    if(direction == "up")
                    {
                        println("You cannot go that way, try again.")
                        location6()
                    }
                    else if (direction == "down")
                        location3()
                    else if(direction == "left")
                        location5()
                    else if (direction == "right")
                    {
                        scoreboard()
                        end()
                    }
                }
                else->
                {
                    exitProcess(0)
                }
            }
        }
    }
}

fun main(args: Array<String>)
{
    var test = NewGame("Fallout 4")
    test.start()
    test.map()
}