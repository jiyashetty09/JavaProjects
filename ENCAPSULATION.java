public class ENCAPSULATION {
    private String accountholdername;
    private int amount;

    public void setname(String name){
    this.accountholdername=name;
   }
    public String getname(){
     return accountholdername;
    }

      // For amount
     public void setamount(int amount){
    this.amount=amount;
   }
    public int getamount(){
     return amount;
    }



    public static void main(String[] args) {

        ENCAPSULATION obj1=new ENCAPSULATION();
        obj1.setname("jiya");
        obj1.getname();
        obj1.setamount(10000000);
        obj1.getamount();

        
    }
    
}
