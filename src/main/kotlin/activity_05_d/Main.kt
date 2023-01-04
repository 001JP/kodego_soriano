package activity_05_d


/*
Coverage : OOP Inheritance, Encapsulation, Polymorphism, Abstraction

You are tasked to create a game.

The game is snake and ladders.

Identify and create the class that will be needed to implement Snakes and ladders.

Hint:

You will need an array to represent the board.

You will need snakes, ladders and players.

Use all OOP concepts.*/


val playersAndPosition = HashMap<String, Int>()
var winner = false


abstract class SnakeAndLaddersBoard(){

    protected val board = Array(101) { i -> i*1}
    protected val snakes = mapOf<Int, Int>(
        17 to 7,
        54 to 43,
        64 to 60,
        62 to 19,
        87 to 36,
        93 to 73,
        94 to 75,
        98 to 79
    )

    protected val ladders = mapOf<Int, Int>(
        1 to 38,
        4 to 14,
        9 to 31,
        21 to 42,
        28 to 84,
        51 to 67,
        72 to 91,
        80 to 99,
    )

     protected fun onDiceRoll(): Int {
        val result = (1..6).random()

        println("You rolled $result")

        return result
    }
}

class Play(player: String, playerCurrentPosition: Int): SnakeAndLaddersBoard() {

    private val diceResult: Int = onDiceRoll()
    private var updatedPosition: Int = playerCurrentPosition + diceResult

    init {
        if(snakes.containsKey(updatedPosition)){
            updatedPosition = snakes.getValue(updatedPosition)
            println("$player got snaked! Your new position is $updatedPosition")
        }
        if(ladders.containsKey(updatedPosition)) {
            updatedPosition = ladders.getValue(updatedPosition)
            println("$player you ladder up!! Your new position is $updatedPosition")
        }
        if (updatedPosition == 100){
            println("$player you win!")
            winner = true
        } else if (updatedPosition > 100) {
            val stepBack = updatedPosition%100
            updatedPosition -= (updatedPosition % 100)+stepBack
            println("$player stepped back, your new position is $updatedPosition")
        } else {
            playersAndPosition[player] = board[updatedPosition]
            println("$player moved to position $updatedPosition")
        }
        println("--------------")
    }
}


fun main() {

 startGame()

}

fun runGame(){
    do {
        for (player in playersAndPosition){

            if (winner)
                break

            println("${player.key}'s turn")
            println("You're in position ${player.value}, enter R to roll the dice.")
            val input = readLine().toString()

            if (input.contains("R", true)) {
                Play(player.key, player.value)
            } else {
                println("YOU ENTERED AN INVALID INPUT")
            }
        }

    } while (!winner)
}


fun startGame(){
    for(number in 1..5){

        println("ENTER PLAYER $number NAME:")
        val playerName = readLine().toString()

        playersAndPosition[playerName] = 0

        println("$playerName added!")
        println("Enter START or ADD another player.")
        val input = readLine().toString()

        if (input == "START"){
            break
        }
    }
    runGame()
}