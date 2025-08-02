public class typesofvariables {
  int var1;//instance variable
  static int var2;//static variable
   public void func1(){
    int a=79;//local variable(only block level)
    System.out.println("value of local variable is: "+a);
   }
     
   public void func2(int s ,int i ){
      this.var1=s;
      this.var2=i;
      System.out.println("static variable="+(++var1));
      System.out.println("instance  variable="+(++var2));


   }
    public static void main(String[] args) {
        typesofvariables object1= new typesofvariables();
        object1.func1();
        object1.func2(1, 1);

        typesofvariables object2= new typesofvariables();
        object2.func1();
        object2.func2(1, 1);
        

    }
}