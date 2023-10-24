fun main(args: Array<String>) {
    val majina= arrayOf("Kibet","Gilbert",76,56,87,'g',true)

    val myarr=  arrayOf<Int>(4,10,72,54,45)

    myarr[1]=5

    println("my name is ${majina[0]}")
    println("the sum of 43+33=${majina[2]}")
    println(myarr[1])

    val myarr2=myarr.sorted()
    println(myarr2)
}