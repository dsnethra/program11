// about return :  reurn is a key word tahts stops the execution and come out from the method
//  in void return type main method not written any reference thats why we are not uding any return type 


class Person {
	
static String name(){
	System.out.println("get person  name :" );
	return "nandish";
}

static int age(){
	System.out.println("get person age");
	return 45;
}

static long mobileNo(){
System.out.println	("enter mobile number");
long num = 9723456745L;
return num;
}


static double height (){
	System.out.println("get the height");
	return 4.89;
}

static float weight(){
	System.out.println("get the height");
	return 67.55f;
}


static String email(){
	System.out.println("get the email");
	return "nethravathids2001@gmail.com";
}

static long salary(){
	System.out.println("get the salary");
	return 4500000L;
}

static String fatherName(){
	System.out.println("get the father name");
	return "Shivalingappa A";
}

static String motherName(){
	System.out.println("get the mother name");
	return "Jayamma B R";
}

static String friendName(){
	System.out.println("get the friend name");
	return "Deepa";
}


static String inspiration(){
	System.out.println("get the person name who inspired you");
	return "MSP sir";
}



}


class PersonRun {
	public static void main(String[] args){
		String name= Person.name();
		System.out.println("person name :" + name);
		int age=Person.age();
		System.out.println("Person age :" + age);
		long mobileNo=Person.mobileNo();
			System.out.println("mobile num :" + mobileNo);
			double height=Person.height();
			System.out.println("height :" + height);
			double weight=Person.weight();
			System.out.println("weight :" + weight);
			String email=Person.email();
			System.out.println("email id :" + email);
			String fatherName=Person.fatherName();
			System.out.println("father name :"+ fatherName);
			String mother=Person.motherName();
			System.out.println("mother name :"+ mother);
			String friend=Person.friendName();
			System.out.println("friend name :"+ friend);
			long salary=Person.salary();
			System.out.println("salary :"+ salary);
			String inspiration=Person.inspiration();
			System.out.println("inspired by :"+ inspiration);
			
			
		
		
		
	}
}


