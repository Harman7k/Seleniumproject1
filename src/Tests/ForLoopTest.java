package Tests;

public class ForLoopTest {

	public static void main(String[] args) {
		

     System.out.println(1);
     System.out.println(2);
     System.out.println(3);
     System.out.println(4);
     
     int i = 1; 
     
     for(i=1; i<=15; i=i+1)  {
    	 System.out.println(i);
    	 if(i==5) {
     System.out.println("got 5");
    
     break;
     
    	 }
     }
     
    	
     System.out.println("After the loop");
	
     
	}
}



