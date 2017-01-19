//stack using list

class StackUsingList{
  def push(element:Int,l: List[Int]){
		var myList= l :+ element
		myList
	}
	

  def pop(l:List[Int]){
	var myList=l.drop(1)
	mylist
	}
}


object Stack1{
	
	val obj=new StackUsingList
	val stacklist = obj.push(1,List(2,3,4))
	println(stacklist)
}
	

