package com.jason.myjavatrips;

public class InnerClass {
    public InnerClass() {
         Inner s1 = new Inner();
         s1.a = 10;
         Inner s2 = new Inner();
         s2.a = 20;
         InnerClass.Inner s3 = new InnerClass.Inner();
         System.out.println(s1.a);
         System.out.println(s2.a);
         System.out.println(s3.a);
    }

    class Inner {
        public int a = 5;
   }

   public static void main(String[] args) {
	   InnerClass t = new InnerClass();
        Inner r = t.new Inner();
        System.out.println(r.a);
       }
    }
