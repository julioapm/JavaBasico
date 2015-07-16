package main;

import introducao.Professor;

public class Programa {

	public static void main(String[] args) {
		Professor prof1;
		prof1 = new Professor();
		prof1.setNome("Júlio");
		prof1.setMatricula("1234");
		prof1.setCargaHoraria(14);
		System.out.println(prof1.getCargaHorariaMensal());
	}

}
