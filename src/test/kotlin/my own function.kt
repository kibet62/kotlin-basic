fun kibet(){
    var myname="kibet"
    println("my name is $myname")
}
fun main(args: Array<String>) {
    kibet()  // calling function

    majina("Gilbert",  "kibet",20)
    about("safaricom","senior software engeneer",2022)

}


fun majina(fname:String,lname:String,age:Int,){

    println("my name is $fname $lname and i am $age years old ")
}
fun about(wplace :String,occupation :String,since :Int){
    println("i work at $wplace company as a $occupation since $since upto date")
}