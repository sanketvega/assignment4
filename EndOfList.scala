class Logic{
var index=0
var value=0
def LastElement(l:List[Int])=
{
	for(iterator<-l)
	{	
		value=iterator
		index=index+1
	}
	println(s"Index is $index and Value is $value")
}
}
object EndOfList extends App{
val list=List(5,2,7,9,10,54,36)
val obj=new Logic
obj.LastElement(list)
}
