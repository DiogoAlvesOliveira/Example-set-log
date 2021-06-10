package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ProgramStudents {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		Set<Integer> a = new HashSet<>();
		Set<Integer> b = new HashSet<>();
		Set<Integer> c = new HashSet<>();
		
		System.out.println("Quantos Alunos no Curso A? ");
		int n = s.nextInt();
		System.out.println("Insira 1 código para cada aluno cadastrado, ao todo são " + n + " códigos");
		for(int i = 0; i < n; i++) {
			int number = s.nextInt();
			a.add(number);
		}
		System.out.println("Quantos Alunos no Curso B? ");
		n = s.nextInt();
		System.out.println("Insira 1 código para cada aluno cadastrado, ao todo são " + n + " códigos");
		for(int i = 0; i < n; i++) {
			int number = s.nextInt();
			b.add(number);
		}
		System.out.println("Quantos Alunos no Curso C? ");
		n = s.nextInt();
		System.out.println("Insira 1 código para cada aluno cadastrado, ao todo são " + n + " códigos");
		for(int i = 0; i < n; i++) {
			int number = s.nextInt();
			c.add(number);
		}
		Set<Integer>total = new HashSet<>(a);
		total.addAll(b);
		total.addAll(c);
		
		System.out.println("Total de Alunos são: " + total.size());
		
	s.close();
	}

}
