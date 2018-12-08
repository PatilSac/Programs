package assignment;

public class test2 {
	static{
		System.out.println("Welcome to technocredits");
	}
	{
		System.out.println("GM");
	}
	test2(){
		System.out.println("D");
	}
	test2(int x){
		System.out.println("1");
	}
	;
	public static void main(String[] args) {
		System.out.println("Hi");
		test2 r1 = new test2();
		test2 r2 = new test2(13);
	}
}

