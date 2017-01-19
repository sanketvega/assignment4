//sum and multiplication of list

class Logic{


	def Calculate(l:List[Int])={
		
		var mul =1
		
		for(iterator <- l)
		{
			sum=sum+iterator
			mul=mul*iterator
		}
	println(sum)
	println(mul)
}
	
}

object sum_mul extends App{

val obj=new Logic
obj.Calculate(List(1,2,3,4))
}
