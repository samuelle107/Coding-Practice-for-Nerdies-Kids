import java.util.Random
import kotlin.system.exitProcess

open class BaseGame(val game_name:String)
{
    //Randomly picks one room to have the keys
    private val keyGenerator = Random().nextInt(11-1)+1
    //Boolean variable to check if you have the key
    var gotKey = false
    //Keeps track of what room you are in
    var currentRoom = 1
    //Amount of times you are able to search
    private var searchLimit = 5
    //Monster name
    var setMonster = "poltergeist"
    //Room Names
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
    //Booleans to check if you have searched the room yet
    var checkRoomOne = false
    var checkRoomTwo = false
    var checkRoomThree = false
    var checkRoomFour = false
    var checkRoomFive = false
    var checkRoomSix = false
    var checkRoomSeven = false
    var checkRoomEight = false
    var checkRoomNine = false
    var checkRoomTen = false
    //Function to start the game message
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
    //Function to end the game.  Pick a location in the map and place end function there
    fun end()
    {
        if(!gotKey)
        {
            println("")
            println("Ah man, you made it, but you didn't get your car keys.")
            println("Hey, did you hear that?")
            println("A $setMonster comes out the walls and pulls you into the dark....")
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
        println("")
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
    //RNG death lol
    private fun survive()
    {
        val chance = Random().nextInt(101-1)+1
        if(chance >= 95)
        {
            println("")
            println("As you go for the door, you hear footsteps come closer.")
            println("Your vision goes dark.")
            println("Your body becomes numb.")
            println("You hear a sinister laugh.")
            println("The $setMonster got you.")
            println("Sorry, you didn't make it....")
            exitProcess(0)
        }
    }
    //Asks the user if they want to search or not
    private fun search(room_key:Boolean):Boolean
    {
        if((searchLimit != 0) && (!gotKey))
        {
            println("")
            println("Do you want to search?  Enter yes or no")
            val input = readLine()
            if(input == "yes")
            {
                if(room_key)
                {
                    println("You found your car keys!")
                    gotKey = true
                    return true
                }
                else
                {
                    println("It isn't here....")
                    println("You hear footsteps come closer.")
                    searchLimit--
                    return true
                }
            }
        }
        else if(searchLimit == 0)
        {
            println("You don't have any more time to search.")
            return false
        }
        return false
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
        if(!checkRoomOne)
        {
            if(search(room_key))
            {
                checkRoomOne = true
            }
        }
        survive()
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
        if(!checkRoomTwo)
        {
            if(search(room_key))
            {
                checkRoomTwo = true
            }
        }
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
        if(!checkRoomThree)
        {
            if(search(room_key))
            {
                checkRoomThree = true
            }
        }
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
        if(!checkRoomFour)
        {
            if(search(room_key))
            {
                checkRoomFour = true
            }
        }
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
        if(!checkRoomFive)
        {
            if(search(room_key))
            {
                checkRoomFive = true
            }
        }
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
        if(!checkRoomSix)
        {
            if(search(room_key))
            {
                checkRoomSix = true
            }
        }
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
        if(!checkRoomSeven)
        {
            if(search(room_key))
            {
                checkRoomSeven = true
            }
        }
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
        if(!checkRoomEight)
        {
            if(search(room_key))
            {
                checkRoomEight = true
            }
        }
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
        if(!checkRoomNine)
        {
            if(search(room_key))
            {
                checkRoomNine = true
            }
        }
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
        if(!checkRoomTen)
        {
            if(search(room_key))
            {
                checkRoomTen = true
            }
        }
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
                    {
                        location5()
                    }
                    else if (direction == "down")
                    {
                        println("You cannot go that way, try again.")
                        location1()
                    }
                    else if(direction == "left")
                    {
                        location2()
                    }
                    else if (direction == "right")
                    {
                        location3()
                    }
                }
                2->
                {
                    var direction = getDirection()
                    if(direction == "up")
                    {
                        location4()
                    }
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
                    {
                        location1()
                    }
                }
                3->
                {
                    var direction = getDirection()
                    if(direction == "up")
                    {
                        location6()
                    }
                    else if (direction == "down")
                    {
                        println("You cannot go that way, try again.")
                        location3()
                    }
                    else if(direction == "left")
                    {
                        location1()
                    }
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
                        location9()
                    }
                    else if (direction == "down")
                    {
                        location2()
                    }
                    else if(direction == "left")
                    {
                        println("You cannot go that way, try again.")
                        location4()
                    }
                    else if (direction == "right")
                    {
                        location5()
                    }
                }
                5->
                {
                    var direction = getDirection()
                    if(direction == "up")
                    {
                        location8()
                    }
                    else if (direction == "down")
                    {
                        location1()
                    }
                    else if(direction == "left")
                    {
                        location4()
                    }
                    else if (direction == "right")
                    {
                        location6()
                    }
                }
                6->
                {
                    var direction = getDirection()
                    if(direction == "up")
                    {
                        location7()
                    }
                    else if (direction == "down")
                    {
                        location3()
                    }
                    else if(direction == "left")
                    {
                        location5()
                    }
                    else if (direction == "right")
                    {
                        scoreboard()
                        end()
                    }
                }
                7->
                {
                    var direction = getDirection()
                    if(direction == "up")
                    {
                        println("You cannot go that way, try again.")
                        location7()
                    }
                    else if (direction == "down")
                    {
                        location6()
                    }
                    else if(direction == "left")
                    {
                        location8()
                    }
                    else if (direction == "right")
                    {
                        println("You cannot go that way, try again.")
                        location7()
                    }
                }
                8->
                {
                    var direction = getDirection()
                    if(direction == "up")
                    {
                        location10()
                    }
                    else if (direction == "down")
                    {
                        location5()
                    }
                    else if(direction == "left")
                    {
                        location9()
                    }
                    else if (direction == "right")
                    {
                        location7()
                    }
                }
                9->
                {
                    var direction = getDirection()
                    if(direction == "up")
                    {
                        println("You cannot go that way, try again.")
                        location9()
                    }
                    else if (direction == "down")
                    {
                        location4()
                    }
                    else if(direction == "left")
                    {
                        println("You cannot go that way, try again.")
                        location9()
                    }
                    else if (direction == "right")
                    {
                        location8()
                    }
                }
                10->
                {
                    var direction = getDirection()
                    if(direction == "up")
                    {
                        scoreboard()
                        end()
                    }
                    else if (direction == "down")
                    {
                        location8()
                    }
                    else if(direction == "left")
                    {
                        println("You cannot go that way, try again.")
                        location10()
                    }
                    else if (direction == "right")
                    {
                        println("You cannot go that way, try again.")
                        location10()
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