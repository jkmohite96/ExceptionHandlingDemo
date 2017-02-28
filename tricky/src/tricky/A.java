package tricky;

import java.io.IOException;

public class A {

	String name;
	static int xyz;
	
	
	public static void main(String[] args) {
		System.out.println("inside main method");
		A a = new A();
		try {
			a.method1(null,"admin123",10);
		} catch (Exception e) {
		}
		method2();
		a.method3();
		
		System.out.println("main method execution completed");
	}

	private void method1(String username, 
			String password,int i) {
		boolean returnValue = false;  //Local variable
		System.out.println("inside method1 method");

		//if(username==null || password == null)
			try {
				throw new Exception();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		/*if(username.equals("admin") && password.equals("admin123") )
			returnValue=true;
		else 
			returnValue=false;

		System.out.println("method1 execution completed");
		
		method3();
		
		return returnValue;*/
	}

	private static int method2() {
		System.out.println("inside method2 method");
		System.out.println("method2 execution completed");
		return 0;

	}

	private void method3() {
		System.out.println("inside method3 method");
		System.out.println("method3 execution completed");

	}
	
}





























/**
 * 
 * Exception - Any event or abnormal condition
 * which interrupts the normal flow your prog
 * 
 * Error - A condition which could not be handled 
 * programmatically such as system faults -
 * outofmemory, stackoverflow etc.
 * 
 * Five important keywords for exception handling
 * 
 * 
 * try - Risky code - which might throw an exception
 * Try block gets executed once
 * 
 * Catch - code to handle the exception - which mean what to do 
 * once exception is occoured in ur prog
 * catch clock gets executed once but only if exception comes
 * and that should be similar type that block or parent
 * If you are using multiple catch blocks, child type of 
 * exceptions should come first or followed by parent exception
 * 
 * 
 * 
 * finally - resource cleanup code such closing the connections
 * files buffers etc
 * Finally blocks gets executed always even if there exection or no 
 * exception only there two situation in which finally will be executed
 * 1. Error in try or catch block 2. if developer has written
 * System.exit(); explicitly.
 * 
 * 
 * throw - We use throw keyword to throw an exception, it should be
 * followed by exeption type object
 * at once we can throw single exception type of object however in one
 * method we can have multiple throw only there is no gurrented
 * throw in a method 
 * 
 * ideally it should be used to throw user defined/custom type of 
 * exception
 * 
 * 
 * throws - we write throws at method signature, it should be 
 * followed by exception type of class.
 * There is no rule for sequence of exeception tht you write in 
 * method signature, you can take parent first and then child
 * and vice-versa.
 * 
 */

