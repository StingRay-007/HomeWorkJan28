package HomeWorkJan28;

public class HomeWorkJan28GetSetChild extends HomeWorkJan28GetSetParent{

	public static void main(String[] args) {
		HomeWorkJan28GetSetParent abc = new HomeWorkJan28GetSetParent();
			abc.getC();
			abc.setC("King");
			System.out.println(abc.getC());
			abc.getN();
			abc.setN(1000);
			System.out.println(abc.getN());
			abc.getC();
			abc.setC("John");
			System.out.println(abc.getC());
			abc.getN();
			abc.setN(2000);
			System.out.println(abc.getN());
	}
	
}
