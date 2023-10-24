fun main(args: Array<String>) {
    var char= 'C'
     when(char){
         'A','E','I','O','U' -> println("$char is a vowel")
         else -> println("$char is a consonant")
     }
    var mynum=78
    when(mynum){
        in 1 .. 9 -> println("$mynum is a single digit num")
        in 10 .. 99 -> println("$mynum is a double digit num")
        in 100 .. 999 -> println("$mynum is a three digit digit num")

        else -> println("$mynum has more than three digit")
    }
}