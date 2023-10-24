open class mobileaccount(
    val accountnumber: String,
    var balance: Double
){
    fun deposit(amount:Double)
    {
        balance +=amount
    }
    open fun withdraw(amount: Double){
        if (balance>=amount){
            balance-=amount
        }else{
            println("insufficient funds")
        }
    }
    fun checkbalance():Double{
        return balance
    }
}
class mpesaaccount(
    accountnumber: String,
    balance: Double,
    var phonenumber:String
):MobileMoneyAccount(accountnumber,balance){

    fun sendmoney(recipient:mpesaaccount,amount: Double){
        if (balance>=amount +10.00){
            balance-=amount +10.00
            println("withdarw $amount KES (charges 10 ksh free)")
        }else{
            println("insufficient funds")

        }
    }
}

fun main(args: Array<String>) {
    var fred= mpesaaccount("234563",1500.0,"0727429688")
    var joan= mpesaaccount("373938",600,0704658629)
    fred.sendmoney(joan,500)
}
