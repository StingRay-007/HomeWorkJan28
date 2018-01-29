package HomeWorkJan28;

public class HomeWorkJan28NonStaticNonVoid {	
   public int getbalance() {
	   	System.out.println("I have only zero balance");
	   	return 0;
   		}
   
   public static void main(String[] args) {
	
	   	HomeWorkJan28NonStaticNonVoid jan28 = new HomeWorkJan28NonStaticNonVoid();
	   	jan28.getbalance();
  		}
  }