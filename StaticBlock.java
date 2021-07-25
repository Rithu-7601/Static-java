
public class StaticBlock {
	
	static {
		System.out.println("Static block 1");
		System.out.println("App designed and developed by");
	}

	
	
	public static void main(String[] args) {
		System.out.println("MAIN METHOD ");
	}
	static {
		System.out.println("static block-2");
		System.out.println("edureka");
	}

}
//output
//Static block 1
//App designed and developed by
//static block-2
//edureka
//MAIN METHOD