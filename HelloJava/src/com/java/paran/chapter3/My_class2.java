package com.java.paran.chapter3;
class OuterDemo {
   // private variable of the outer class
   private int num;
   private InnerDemo innerObj;
   
   // inner class
   public class InnerDemo {
      public int getNum() {
         System.out.println("This is the getnum method of the inner class");
         return num;
      }
   }
   
   public OuterDemo(int num){
   this.num = num;
   innerObj = new InnerDemo();
   }
   
   public InnerDemo getInnerObj(){
   return innerObj;
   }
}

public class My_class2 {

   public static void main(String args[]) {
      // Instantiating the outer class
      OuterDemo outer = new OuterDemo(100);
      // Instantiating the inner class
      OuterDemo.InnerDemo inner = outer.new InnerDemo();
      System.out.println(inner.getNum());
      
      OuterDemo outer1 = new OuterDemo(200);
      System.out.println(outer1.getInnerObj().getNum());      
   }
}
