//stack using list

class StackUsingList{					//class to implement Stack using list
  def push(element:Int,l: List[Int]):List[Int]={	//function to add element to the stack
		val myList= l :+ element
		myList
	}
	

  def pop(l:List[Int])={				//function to delete element from the stack
	val myList=l.init
	myList
	}
}


object Stack1 extends App{
	
	val obj = new StackUsingList			//Instantiating class stackUsingList
	val stacklist1 = obj.push(5,List(2,3,4))
	println(s"The list after pushing element 5 is $stacklist1")
	val stacklist2 = obj.push(6,List(2,3,4,5))
	println(s"The list after pushing element 6 is $stacklist2")
	val poplist = obj.pop(stacklist2)
	println(s"The list after popping last element is $poplist")
}
	

