object first_question extends App{
    class Rational(x:Int,y:Int){
        def numer:Int=x/gcd(x,y)
        def denom:Int=y/gcd(x,y)
        private def gcd(a:Int,b:Int):Int=b match {
            case x if x==0 => a
            case x if x>a=> gcd(b,x)
            case _ =>gcd(b,a%b)
         }
        override def toString=numer+"/"+denom
        def neg():Rational={
            new Rational(-numer,denom)
        }
      
    }

}