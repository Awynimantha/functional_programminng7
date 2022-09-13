object first_question extends App{
    class Account(id:String,n:Int,b:Double){
        val nic:String=id
        val acnumber:Int=n
        var balance:Double=b

        override def toString="\nAccount deatil\n"+"NIC :"+nic+"\n"+"Account no. :"+acnumber+"\n"+"Balance :"+balance
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


  val ac1=new Account("12",234,123.4)
  var ac2=new Account("13",343,0)
 ac2=ac1.transfer(100.2,ac2)
  println(ac1)
  println(ac2)

}