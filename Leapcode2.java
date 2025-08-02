import java.util.LinkedList;

public class Leapcode2 {

    public LinkedList<Integer> sum(LinkedList<Integer> l1,LinkedList<Integer> l2){
        LinkedList<Integer> l3=new LinkedList<>();
            for(int i=0;i<l1.size();i++){          //size() is used for the linkedlist 
                   l3.add(l1.get(i)+l2.get(i));
            }
            return l3;
            
    }
    public static void main(String[] args) {
        LinkedList<Integer> l1=new LinkedList<>();
        l1.add(1);
        l1.add(2);
        l1.add(5);

        LinkedList<Integer> l2=new LinkedList<>();
        l2.add(4);
        l2.add(9);
        l2.add(9);//duplicacy is allowed in linkedlist

        Leapcode2 obj1=new Leapcode2();
       ;
        System.out.println(obj1.sum(l1,l2));


    }
}
