package com.jason.myjavatrips;

public class A {
    private final int s = 111;

    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        A a = new A();
        A.B b = a.new B();
        b.mb(333);
        String string = "9,21,";
        String[] arr = string.split(",");
        double count = 0L;
        for (String s : arr) {
            count += Math.pow(2, Integer.valueOf(s) - 1);
        }
        System.out.println(count);
        java.text.NumberFormat nf = java.text.NumberFormat.getInstance();
        nf.setGroupingUsed(false);
        System.out.println("d:=" + nf.format(count));
    }

    public class B {
        private final int s = 222;

        public void mb(int s) {
            System.out.println(s); // 局部变量s
            System.out.println(this.s); // 内部类对象的属性s
            System.out.println(A.this.s); // 外层类对象属性s
            System.out.println(System.getProperty("sun.boot.class.path"));
        }
    }
}
