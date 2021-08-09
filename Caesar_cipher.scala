object Caesar_cipher {
  def main(args: Array[String]): Unit = {

    val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

    val E=(c:Char,key:Int,a:String)=>
      a((a.indexOf(c.toUpper)+key)%a.size)

    val D=(c:Char,key:Int,a:String)=>
      a(if((a.indexOf(c.toUpper)-key)%a.size >=0)
        (a.indexOf(c.toUpper)-key)%a.size
      else a.size+(a.indexOf(c.toUpper)-key)%a.size)

    val cipher=(algo:(Char,Int,String)=>
      Char,s:String,key:Int,a:String)=>
      s.map(algo(_,key,a))

  val text = "Today is the day to the attark";
    val s = text.replace(" ","")


    val ct=cipher(E,s,5,alphabet)

    val pt=cipher(D,ct,5,alphabet)
    println("Original text = Today tis the day to the attar");
    println("Encripted word ___");
    println(ct);
    println("decrypted word ___");
    println(pt);




  }

}
