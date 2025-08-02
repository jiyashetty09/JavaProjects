

//abstraction means showing only the essential data to the user while hiding the entire internal working of inside

abstract class Animal {
     abstract void sleep();

        void makesound(){
            System.out.println("Every animal makes a particular sound!");
}
}

class Dog extends Animal{
      void sleep(){
     System.out.println("Dog sleeps for 10 hrs max a day!");
     }

        void makesound(){
            super.makesound();//calls the method of the parent class
            System.out.println("BHAW BHAW ........!");//it also calls the method of child class Dog
        }
        public static void main(String[] args) {
            Animal obj1=new Dog();
            obj1.makesound();;
            obj1.sleep();
        }

}
    
    
     
    
      

