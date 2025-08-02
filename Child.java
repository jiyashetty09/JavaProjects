class Parent {
    //method overriding(Runtime polymorphism)
    public void method1(){
        System.out.println("parent class method");
    }
}
public class Child extends Parent{
     public void method1(){
        System.out.println("child class method ");
    }
    public static void main(String[] args) {
        Parent obj1=new Child();
        obj1.method1();
    }
}

//method overloading
