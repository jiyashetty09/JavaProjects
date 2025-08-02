 //method overloading
class Parent {
    public void method1(int age,int years){
        System.out.println("method1 is called");
    } 

    public void method1(int num1,float pointer){
        System.out.println("method 2 is calling");
    }
    public static void main(String[] args) {
        Parent obj1=new Parent();
        obj1.method1(9,2004);
        Parent obj2=new Parent();
        obj2.method1(9,12.5f);
    }
}
