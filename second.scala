object first_question extends App{
    class Rational(x:Int,y:Int){
        def numer:Int=x/gcd(x.abs,y.abs)
        def denom:Int=y/gcd(x.abs,y.abs)
       private def gcd(a:Int,b:Int):Int=b match {
            case x if x==0 => a
            case x if x>a=> gcd(x,a)
            case _ =>gcd(b,a%b)
         }
        override def toString=numer+"/"+denom
        def neg():Rational={
            new Rational(-numer,denom)
        }
        def sub(right:Rational):Rational={
            new Rational((this.numer*right.denom)-(right.numer*this.denom),right.denom*this.denom)
        }
    }
    val x:Rational=new Rational(3,4)
    val y:Rational=new Rational(5,8)
    val z:Rational=new Rational(2,7)
    print( x sub y sub z)

}