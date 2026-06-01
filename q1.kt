class BankAccount {
    private var balance: Double = 0.0

    fun deposit(amount: Double) {
        if (amount > 0) {
            balance += amount
        }
    }

    fun showBalance() {
        println("Balance: $balance")
    }
}

fun main() {
    val account = BankAccount()
    account.deposit(1000.0)
    account.showBalance()
}
