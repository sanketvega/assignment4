/**
  * Created by shubhra on 18/1/17.
  */
class Tiffin {
   def pay(mode: String,amount: Int)=
  {
    mode match {
      case "Paytm" => val new_amount = 0.02 * amount + amount
        new_amount
      case "Freecharge" => val new_amount = 0.2 * amount + amount
        new_amount
      case "Net Banking" => val new_amount = 5 + amount
        new_amount
      case "Card Payment" => val new_amount = 1.5 + amount
        new_amount
      case "Cash" => amount
      case _ => "None"

    }
  }

}

object PatternMatch extends App{
  val TiffinObj = new Tiffin
  val new_amount = TiffinObj.pay("Card Payment", 500)
  println(s"Amount to be paid is $new_amount")
}
