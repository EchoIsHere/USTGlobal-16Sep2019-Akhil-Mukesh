package com.ustglobal.exception.firstclass;


public class TestE {

	public static void main(String[] args) {
		System.out.println("main started");

		String s = "hello";

		int[] a = {10,20,30};

		int b = 10;
		
		

		try {
 
			String s1 = s.toUpperCase();

			System.out.println(s1);

			System.out.println(a[2]);

			System.out.println(b/0);

		}
		
		catch(Exception e) { //general catch block
			
			e.printStackTrace();
			System.out.println("exception occured");
		}
//		catch(NullPointerException npe){
//
//			System.out.println("don't play with null");
//
//		}catch(ArrayIndexOutOfBoundsException aio) {
//
//			System.out.println("index not found");
//
//		}catch(ArithmeticException ae) {
//
//			System.out.println("divide by zro error");
//		
//		}

		System.out.println("main ended");
	}

}
