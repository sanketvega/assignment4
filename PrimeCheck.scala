
class IsPrime {
    def isprimenum(number :Int) : Boolean ={
    var flag = true
    if(number == 0 || number == 1)
      flag= false
      
    
      for(iterator <- 2 to (number/2)){
        if (number % iterator == 0)
          flag = false
        }
      flag
  }

}
 object PrimeCheck extends App{
   val isPrimeobj = new IsPrime
   val series = List(2, 4, 5, 7, 8)
   var check = false
   for(iterator <- series) {
     check = isPrimeobj.isprimenum(iterator)
     if(check == true)
       println(iterator)
   }
   



}

