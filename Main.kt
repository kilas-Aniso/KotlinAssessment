
fun main(args: Array<String>) {
  println( fruits("Mango"))
    multiplesSix()

    var currentAccount = CurrentAccount("125378472829","AnisoKilas",50000000.0 )
    println( currentAccount.deposit(50000.0))
   println( currentAccount.withdraw(10000.0))
    currentAccount.details()

    var savingsAccount = SavingsAccount("6826893943629",
        "Aniso Kilas", 20000000.0, withdrwals = 3)
    savingsAccount.withdraw(10000.0)

}

//Write and invoke one function that takes in a random string and returns the
//following values: first character, last character, length of the string and
//whether it begins with a vowel or not. (6pts)

fun fruits(fruit:String):Any{
//    first character
 return {
    var first = fruit[0]
     var last =fruit[-1]
     val length = fruit.length
     length

 }
}
//Create a function that takes in a password as a parameter. For a password to
//be valid it must meet the following conditions:
//1. Must be at least 8 characters long
//2. Must be at most 16 characters long
//3. Must not be “password”
//4. Must contain a digit
//Your function should determine whether the password provided is valid or not.
//The function returns true/false (7pts)

fun makePassword(password:String){


}


//Create a function that prints out multiples of 6 and 8 between 1 and 1000. For
//multiples of both 6 and 8 it should print out “Bingo!” (5pts)

fun multiplesSix() {
    for (i in 1..1000)
        if (i / 6 == 0 && i / 8 == 0) {
            println("Bingo!")
        } else if (i / 8 == 0) {
            println(i)
        } else if (i / 6 == 0) {
            println(i)
        } else {
            println(i)

        }
}

//Create a class CurrentAccount with the following attributes: account number,
//account name, balance. It has the following functions:
//a. deposit(amount: Double) - Increments the balance by the amount
//deposited
//b. withdraw(amount: Double) - Decrements the balance by the amount
//withdrawn
//c. details() - Prints out the account number and balance and name in
//this format: “Account number x with balance y is operated by z” (6pts)



open class CurrentAccount( var accountNumber:String, var accountName: String, var  balance: Double){
    fun deposit(amount: Double): Double {
        return balance + amount

    }

   open fun withdraw(amount: Double): Double {
        return balance - amount
    }

    fun details() {
        println("Accoun number $accountNumber wih $balance is operated by $accountName")
    }
}

//Create another class SavingsAccount. It has the same functions and
//attributes as the current account except for one attribute, withdrawals: Int.
//Withdrawals is a counter variable that is used to keep track of how many
//withdrawals have been made from the account in a year. The only other
//difference is that the savings account withdraw() method first checks if the
//number of withdrawals is less than 4 for it to allow one to withdraw money
//from the account. It also increments the withdrawals attribute after a
//successful withdrawal (6pts)

class SavingsAccount(accountNumber: String,accountName: String,balance: Double ,var withdrwals: Int)
    :CurrentAccount(accountNumber,accountName,balance){
    override fun withdraw(amount: Double):Double{
       if (withdrwals<4){
           println( " $amount successfully with drawn")
           withdrwals++
       }
        else{
            println("withdrawal limit reached")
       }
        return amount
    }

    }
