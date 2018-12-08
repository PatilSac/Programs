package assignment;

public class test {
		static{
			System.out.println("Static");
			m1();
		}
		static{
			System.out.println("Static");
			m1();
		}
		{
			System.out.println("Nonstatic");
			m1();
		}
		
		static void m1(){
			
		}
		public test() {
			System.out.println("BlockEx constructor");
		}
		
		public static void main(String[] args) {
			test e1 = new test();
			test e2 = new test();
		}
	

}
