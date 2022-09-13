
object first_question extends App{
    class Account(ni:String,n:Int,b:Double){
        val nic:String=ni
        val acnumber:Int=n
        var balance:Double=b

        override def toString="<NIC :"+nic+"  "+"Account no. :"+acnumber+"  "+"Balance :"+balance+">\n"
        def transfer(amount:Double,that:Account):Account={
            if (this.balance-amount < 0) {
                print("No enough money to transfer")
                new Account(that.nic,that.acnumber,that.balance)
            }
            else{
                this.balance=this.balance-amount
                new Account(that.nic,that.acnumber,that.balance+amount)
            }
        }
    }

    
    // first function
    def isNeg(acc:Account):Boolean= acc.balance match{
            case x if x<0 => true
            case _ =>false

    }
    def findNeg=(l:List[Account])=>l.filter(isNeg(_))


    // second function
   def findSum=(l:List[Account])=>l.map(_.balance).reduce((x,y)=>x+y)

   
    //third function
    def calcInterest(acc:Account):Account= acc.balance match{
        case x if x>0 => new Account(acc.nic,acc.acnumber,acc.balance * 1.05)
        case _ =>new Account(acc.nic,acc.acnumber,acc.balance * 1.1)
    }
    
     def finalBal=(l:List[Account])=>l.map(calcInterest(_))

     
    //function calls
    val accList=List(new Account("2323",343,-100),new Account("4343",344,-100),new Account("5454",345,190))
    println("Bank Accounts :"+accList+"\n")
    println("Negative balance accounts :"+findNeg(accList).map((x)=>x.acnumber)+"\n")
    println("Total of all account balances :"+findSum(accList)+"\n")
    println("Account balances after adding interest :"+finalBal(accList)+"\n")
    
}