//Placement Assignment (25-11-2022)
//Class, Objects, Variables, Methods & Constructors Coding Questions

//1. Java Program to Illustrate Use of All Features of Abstract Class

abstract class AbstractFeatues{
	int a;
	int b;
	AbstractFeatues(){
		
	}
	
	//Show only neccesary things
	AbstractFeatues(int a, int b){
		this.a=a;
		this.b=b;
	}
	
	//hidding the implementation of method //must be define in child class
	abstract int add();
	
	
	//Abstract can have concreate mothod(non-abstarct metod)
	int sub(){
		
		return a-b;
	}
	
	//Abstract can have final mothod(child class not change)
	final int mult(){  //final and abstract cannot combine
		
		return a*b;
	}
	
	//Abstract can have static mothod
	static int div(int x,int y){//as non static member can not access so
		
		return x/y;
	}
}

class AbstractFeatuesDemo extends AbstractFeatues {
	
	AbstractFeatuesDemo(){
	}
	
	AbstractFeatuesDemo(int a,int b){
		super(a,b);
	}
	int add(){
		return a+b;
	}
	
	public static void main(String args[]){
		//AbstractFeatues obj=new AbstractFeatues(5,10);//object of abstract class cannot initiated(Created)
		AbstractFeatuesDemo obj=new AbstractFeatuesDemo(10,5);
		
		System.out.println("Add "+ obj.add());
		System.out.println("Sub "+ obj.sub());
		System.out.println("Mult "+ obj.mult());
		System.out.println("Div "+ div(10,5)); //without child object
    }	
}




//2. Java Program to Illustrates Use of Abstract Class and Method

abstract class AbstractClass{
	int a;
	int b;
	AbstractClass(){
		
	}
	
	AbstractClass(int a, int b){
		this.a=a;
		this.b=b;
	}
	
	abstract int add();
	abstract int sub();
	
	final int mult(){ 
		
		return a*b;
	}
	
	static int div(int x,int y){
		
		return x/y;
	}
}

class AbstractClassDemo extends AbstractClass {
	
	AbstractClassDemo(){
	}
	
	AbstractClassDemo(int a,int b){
		super(a,b);
	}
	int add(){
		return a+b;
	}
	int sub(){
		return a-b;
	}
	
	public static void main(String args[]){
		AbstractClassDemo obj=new AbstractClassDemo(20,10);
		
		System.out.println("Add "+ obj.add());
		System.out.println("Sub "+ obj.sub());
		System.out.println("Mult "+ obj.mult());
		System.out.println("Div "+ div(20,10));
}	
}



//3. Java Program to Illustrates Use of Instance Inner Class

class OuterClass{
	
	int add(int a,int b){
		return a+b;
	}
	class InnerClass{
		int sub(int a,int b){
		return a-b;
	}
	}
	
	public static void main(String args[]){
		OuterClass obj=new OuterClass() ;
		OuterClass.InnerClass obj1=obj.new InnerClass();
		
		System.out.println("Hello ji"+ obj.add(5,10));
	}
}

//4. Java Program to Illustrates Use of Static Inner Class



//5. Java Program to Illustrates Use of Referencing the Object from Inner Class




//6. Java Program to Create Outer Class Bank Account and the Inner Class Interest in it






//7. Java Program to Implement Shape Interface using Circle and Rectangle Class

interface Shape{//Static constants and abstract method only also beware about privileges
	
	int x=1; //must initialize //internally public static final int x=1;
	int area(int a,int b);  //Internally public abstract int area(int a, int b);
	
}

class Circle implements Shape{
	
	public int area(int a,int b){
		
		return (int)3.14*(x*x);
	}
}

class Rectangle implements Shape{
	
	public int area(int l,int b){
		
		return x*b;
	}
}

class ShapeDemo{
	
	public static void main(String args[]){
		Shape c1 =new Circle();
		Shape r1 =new Rectangle();
		System.out.println("Circle "+ c1.area(5,6));
		System.out.println("Rectangle "+ r1.area(5,6));
		
	}
	
}


//8. Java Program to Count Number of Objects Created for Class

class ObjectCount{
	static int count;
	
	ObjectCount(){
		
		count++;
	}
	public static void main(String args[]){
		ObjectCount obj1=new ObjectCount();
		ObjectCount obj2=new ObjectCount();
		ObjectCount obj3=new ObjectCount();
		ObjectCount obj4=new ObjectCount();
		ObjectCount obj=obj4;//just refer the reference of object obj4 
		obj=obj3; //just refer the reference of object obj4
		System.out.println("Total Object Created "+count); //only 4 object created
	
	
	}
}


//9. Java Program to Implement the Passing and Returning Objects
interface Xyz{
	Xyz method(Object x1);
}

class ObjectReturn implements Xyz{
	ObjectReturn x;
	
	
	public Xyz method(Object x1){
		
		Xyz x2=(Xyz)x1;
		return x2;
		
	}
	
	
	ObjectReturn method1(ObjectReturn y){ //Top most class is Object we can also use current class name
		x=(ObjectReturn)y;
		return x; 
	}
	
	public static void main(String args[]){
		ObjectReturn obj=new ObjectReturn();
		
		System.out.println("Return Object is method 1 ClassName@HashCode : "+ obj.method1(obj));
		System.out.println("Return Object is method ClassName@HashCode : "+ obj.method(obj));
	}
}



//10. Java Program to Swap Objects using Swap() Method

class SwapObject{
	
	SwapObject obj3;
	void swap(Object obj1,Object obj2){
		
		System.out.println("Before Swapping Object 1 :"+ obj1);
		System.out.println("Before Swapping Object 2 :"+obj2);
		
		
		SwapObject obj3=(SwapObject)obj1;
		obj1=(SwapObject)obj2;
		obj2=(SwapObject)obj3;
		
		System.out.println("After Swapping Object 1 :"+ obj1);
		System.out.println("After Swapping Object 2 :"+obj2);
	}
	public static void main(String args[]){
		SwapObject obj1=new SwapObject();
		SwapObject obj2=new SwapObject();
		obj2.swap(obj1,obj2);
		
		
		
	}
}


//11. Java Program to Illustrate Use of Methods in a Class

class MethodClass{
	
	int add(int a,int b){
		//Provide reusibility of the code
		return a+b;
	}
	public static void main(String args[]){
		MethodClass obj =new MethodClass();
		System.out.println(obj.add(5,10));
		System.out.println(obj.add(15,20));//Dont write code again
		
	}
}



//12. Java Program to Create a Method without Parameters and with Return Type

class MethodClass1{
	
	double add(){
		int a=5;
		int b=20;
		return a+b; //with return type
	}
	public static void main(String args[]){
		MethodClass1 obj =new MethodClass1();
		System.out.println(obj.add());
		
		
	}
}



//13. Java Program to Create a Method without Parameters and Return Type

class MethodClass2{
	
	String add(String str){
		
		return str; //with return type
	}
	public static void main(String args[]){
		MethodClass2 obj =new MethodClass2();
		System.out.println(obj.add("Hello"));
		
		}
}





//14. Java Program to Create a Method with 2 Parameters and without Return Type

class MethodClass3{
	
	void add(double a,float b){
		double a1=a;
		float b1=b;
		System.out.println("Add : "+ (a1+b1));
	}
	public static void main(String args[]){
		MethodClass3 obj =new MethodClass3();
		
		obj.add(2.5D, 1.0f);
		
	}
}




//15. Java Program to Illustrate the Use of HashCode() Method

class HashCodeClass{
	int a=5;
	String name="YJB";
	public int hashCode(){//override
		//method present in Object Class
		//return hashcode number//(like address)//className@hashcodeValue in hexaDecimal
		//in equal method hashCode() used for comapre
		
		return a;
	}
	
	public static void main(String args[]){
		HashCodeClass obj5=new HashCodeClass();
		
		System.out.println("HashCode : "+obj5);
	}
}


//16. Java Program to Illustrate Use of Final Keyword

final class FinalClass{ //cannot inherit
	
	final int a=5; //can not change 
	
	final void add(){ // overloading possible but overriding not
	
		//a=10;//error
	}
	void add(int a){
		
	}
	public static void main(String args[]){
		FinalClass obj=new FinalClass();
		//obj.a=50; //error
		
	}
}


//17. Java Program to Illustrate Use of Constructor

class ConstructorClass{
	int rollNo;
	String name;
	ConstructorClass(){ //To initialize default value
		this.rollNo=10;
		name="XYZ";   //this.name="XYZ" //if same variable name is not then no need to use this keyword
	}
	public static void main(String args[]){
		ConstructorClass obj =new ConstructorClass();
		System.out.println("Roll No : "+obj.rollNo +" name "+obj.name);
		
	}
}



//18. Java Program to Illustrates Use of Chaining Constructor

class ConstructorChaining{
	int rollNo;
	String name;
	ConstructorChaining(){ 
		this.rollNo=10;
		   
	}
	
	ConstructorChaining(String name){ 
		this();//call default constructor 
		this.name=name;   
	}
	public static void main(String args[]){
		ConstructorChaining obj =new ConstructorChaining("YJB");
		System.out.println("Roll No : "+obj.rollNo +" name "+obj.name);
		
	}
}



//19. Java Program to Create an Object for Class and Assign Value in the Object using Constructor
class ConstructorAssign{
	
	int rollNo;
	String name;
	
	ConstructorAssign(int rollNo, String name){
		this.rollNo=rollNo;
		this.name=name;
		
	}
	void get(){
		
		System.out.println("Roll No "+ rollNo);
		System.out.println("Name "+ name);
	}
	public static void main(String args[]){
		ConstructorAssign obj=new ConstructorAssign(100,"YJB");
		obj.get();
		
	}
}




//20. String Constructor Program in Java






//21. Java Program to Allocate and Initialize Super Class Members using Constructor

class SuperClass{
	int a;
	int b;
	SuperClass(int a){
		this.a=a;
	}
	int add(){
		
		return a+b;
	}
	
	
}

class SuperClassDemo extends SuperClass{
	
	SuperClassDemo(int a1,int b1){
		super(a1);
		super.b=b1;
		
		System.out.println("Addition is "+ super.add());
	}
	
	
	public static void main(String args[]){
		SuperClassDemo obj=new SuperClassDemo(11,50);
		
		System.out.println("Addition is "+ obj.add());
		
	}
}


//22. Java Program to Check the Accessibility of Static and Non-Static Variable by a Static Method

class StaticClass{
	int a=5;
	static int b=10;
	
	static void method1(){
		StaticClass obj1=new StaticClass();
		System.out.println("value of Non Static in static method A: " + obj1.a);//cannot access non static memebers
		System.out.println("value of  Static A in static method :" + b);
		
	}
	
	public static void main(String args[]){
		StaticClass obj=new StaticClass();
		System.out.println("value of Non Static A " + obj.a);
		System.out.println("value of  Static in main method B " + b);
		method1();
		
		
		
	}
}



//23. Java Program to Demonstrate Usage of an Instance Variable in the Test Class

class Test{
	int a;
	int b;
	
	void add(){
		
		System.out.println("Addition of two instance Number is : " + (a+b));
	}
	public static void main(String args[]){
		Test obj=new Test();
		System.out.println("Before initialize instance variable ");
		obj.add();
		obj.a=5;
		obj.b=15;
		System.out.println("After initialize instance variable ");
		obj.add();
		
	}
}




//24. Java Program to Demonstrate Usage of a Static Variable in the Test Class


class TestClass{

	static int b=10;
	
	int method1(){
		
		
		return b;
	
	}

	public static void main(String args[]){
		TestClass obj=new TestClass();
		System.out.println("value b before changing :" + b);
		b=15;
		System.out.println("value of  Static after changing " + obj.method1());
		
		
		
		
	}
}



//25. Java Program to Check Whether Which One is Executed First, Static Block or the Static Method


class Block{
	
	Block(){
		System.out.println("Inside the Constructor block");
		
	}
	
	static{
		
		System.out.println("Inside the static block"); //Executed without object and call only once
	}
	
	{
		
		System.out.println("Inside the non-static block");
	}
	
	public static void main(String args[]){
		Block obj=new Block();//Static then non-static then constructor
		Block obj1=new Block(); ///How many object ==Non static and constructor call
	}
}


//26. Java Program to Calculate Sum of Two Byte Values using Type Casting


class SumByte{
	
	 void add(byte a,byte b){
		 
		 int sum=(int)a+(int)b;
		 System.out.println(sum);
	 }
	
	public static void main(String args[]){
		
		byte a=10;
		byte b=30;
		
		
		SumByte obj=new SumByte();
		System.out.println("Sum of Byte value is: ");
		obj.add(a,b);
		
	}
}