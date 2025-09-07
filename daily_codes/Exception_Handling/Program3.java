interface Demo {
    void m1();
}
class Outer {
    public static void main(String[] args) {
        Demo obj = new Demo() {
        };
    }
}
//Program3.java:6: error: <anonymous Outer$1> is not abstract and does not override abstract method m1() in Demo
//        Demo obj = new Demo() {
//                              ^
//1 error
