package com.paran.animal;

public interface DoIt {
   
	void doSomething(int i, double x);
   
   int doSomethingElse(String s);
   
   default boolean didItWork(int i, double x, String s) {
   // do something
       System.out.println("DoIt");
       return true;
   }
   
   public static void main(String[] args) {
	   DoIt obj1 = new DoSomething();
	   obj1.doSomethingElse("aa");
	   obj1.doSomething(1, 20);
	   obj1.didItWork(1, 2, "aa");
	   
   }
}

interface DoItPlus extends DoIt {
   default boolean didItWork(int i, double x, String s){
       DoIt.super.didItWork(i, x, s);
       System.out.println("DoItPlus");   
       return true;
   }
}

class DoSomething implements DoItPlus{

   @Override
   public void doSomething(int i, double x) {
     // TODO Auto-generated method stub
     didItWork(1,1.1,"a");
   }

   @Override
   public int doSomethingElse(String s) {
     // TODO Auto-generated method stub
     return 0;
   }

}

