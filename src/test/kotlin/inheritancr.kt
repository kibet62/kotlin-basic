open class ourparent{
    val dad="like taking photos"
    val mum="like cooking and cleaning"

}
class boychild:ourparent(){

    fun mvulana(){
        println(dad)
    }

}
class girlchild :ourparent(){

    fun msichana(){
        println(mum)
    }

}

fun main(args: Array<String>) {
    val myobj=boychild()
    myobj.mvulana()
    val myobj2=girlchild()
    myobj2.msichana()
}