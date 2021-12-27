package src.com.lucas.cursojava.aula43;

public class Teste {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();
		
		aluno.setCurso("Ciência da computação");
		double[] notas= {10,9,8,7};
		aluno.setNotas(notas);
		
		System.out.println(aluno);
		
		
		String s1 = "sadsbanoaniasf";
		String s2 = "sadsbanoaniasF";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		
		Aluno aluno2 = new Aluno();
		
		aluno2.setCurso("Ciência da computação");
		double[] notas2= {10,5,8,7};
		aluno2.setNotas(notas2);
		
		System.out.println(aluno.equals(aluno2));
		
	}

}
