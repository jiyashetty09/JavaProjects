import java.util.ArrayList;
import java.util.Scanner;

public class TaskManager {
    public static void main(String[] args) {
        String task;
        ArrayList<String> list=new ArrayList<>();
        System.out.println("Hii What is Your Name?.....");
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();

        //For Unconditional Loop Or Else The  Program Stops Fter ONe iteration
        while (true) {   
            
        System.out.println("What You need to check on \n 1.Add a Task \n 2. View All The Tasks \n 3. Empty the List \n 4.Exit...");
        int Choice=sc.nextInt();
        sc.nextLine();
        switch(Choice){
            case 1:
            System.out.println("Enter The Task....");
            task=sc.nextLine();
            list.add(task);
            break;

            case 2:
            System.out.println("Displaying The Tasks.....");
            for(int i=0;i<list.size();i++){
                System.out.println(list.get(i));
            }
            break;

            case 3:
            System.out.println("Clearing All The Details.....");
            list.clear();
            for(int i=0;i<list.size();i++){
                System.out.println(list.get(i));
            }
            System.out.println("Tasks Cleared from the List");
            break;

            case 4:
            System.out.println("Exiting... Goodbye!");
                System.exit(0);
                break;

        }

    }
}
    
}
