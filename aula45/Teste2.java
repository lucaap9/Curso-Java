package src.com.lucas.cursojava.aula45;

public class Teste2 {

	public static void main(String[] args) {

		Object obj1 = obterString();
		String s1 = (String) obj1;
		
		Object obj2 = "Minha String";
		String s2 = (String) obj2;
		
		Object obj3 = obterInteiro();
		int i3 = (int) obj3;
		System.out.println(i3);
		System.out.println(s2);
		System.out.println(s1);
	}
	
	
	public static String obterString(){
		return "minha String";
	}
	public static int obterInteiro(){
		return 1;
	}
}
