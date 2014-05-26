import static org.junit.Assert.*;

import org.junit.Test;


public class teste {
	
	String nome = "Leonardo";
	String sexo = "masculino";
	String matricula = "81011017";
	String caso1 = "LCC";
	String caso2 = "SI";
	char[] juntanome = {'k','e','l','s','o','n'};
	String nome1 = new String(juntanome);
	int idade = 21;
	@Test
	public void test() {
		assertEquals(nome, "Leonardo");
		assertEquals(sexo, "masculino");
		assertEquals(matricula, "81011017");
		System.out.println(caso1.equalsIgnoreCase(caso2));
		assertEquals(nome1, "kelson");
		assertEquals(idade, 21);
		
		
		
	}

}
