package practice;

public class ArgumentsTest {
	public static void main(String[] args) {
		sum();
		sum1();
		sum2();
		sum(7, 8);
		sum(6, 7, 8);
		
	}
  public static void sum() {
	 int a=8+9;
	 System.out.println(a);
  }
  public static void sum1( ) {
	  int a =5+6;
	  System.out.println(a);
  }
  public static void sum2() {
	  int a=2+3+1;
	  System.out.println(a);
  }
  public static void sum(int b, int c) {
	  int a=b+c;
	  System.out.println(a);
	  
  }
  
  public static void sum(int b, int c, int d) {
	  int a=b+c+d;
	  System.out.println(a);
  }

}
 
  

