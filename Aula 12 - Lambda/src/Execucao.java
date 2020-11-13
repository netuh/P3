import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Execucao {

	public static void escreve() {
		System.out.println("teste");
	}
	
	
	public static void main(String[] args) {
		List<Pessoa> p = new LinkedList<Pessoa>();
		
		p.add(new Pessoa("Neto"));
		p.add(new Pessoa("Joao"));
		p.add(new Pessoa("Maria"));
		p.add(new Pessoa("Aabraao"));
		p.add(new Pessoa("Ziraldo"));
		p.add(new Pessoa("Julia"));
		
		System.out.println("Antes do Sort");
		for (Pessoa pessoa : p) {
			System.out.println(pessoa.getNome());
		}
		
		Collections.sort(p,Pessoa::compareTo);
		System.out.println("Depois do Sort");
		for (Pessoa pessoa : p) {
			System.out.println(pessoa.getNome());
		}
		List<String> strings = new LinkedList<String>();
		
		strings.add("Neto");
		strings.add("Aabraao");
		strings.add("Joao");
		strings.add("Ziraldo");
		strings.add("Maria");

		System.out.println(strings);
		Collections.sort(strings, (String s1, String s2) ->  {
			   if (s1.length () < s2.length ()) return -1;
			   if (s1.length () > s2.length ()) return +1;
			   return 0;
			});
		System.out.println(strings);
		
		Thread t1 = new Thread(() -> System.out.println("começou"));
		t1.start();
		
		Thread t2 = new Thread(() -> {System.out.println("começou");
									 System.out.println("E vai terminar");});
		
		
		for (int i = 0; i <4; i ++) {
			  int index = i; // uma variável final
			  Date agora = new Date (); // efetivamente final
			  new Thread (
			    () -> {
			      System.out.println ("thread iniciado, índice" + index +
			                                    "em hora "+ agora);
			      escreve();
			    }
			  ).start();
			}
		
		t2.start();
		
		List<Integer> dl = new LinkedList<Integer>();
		dl.add(1);
		dl.add(2);
		dl.add(3);
		dl.add(4);
		dl.add(5);
		dl.add(6);
		
		dl.stream().map(x -> Math.sqrt(x)).forEach(y -> System.out.println(y));
		
		dl.stream().map(Math::sqrt).forEach(System.out::println);
		
		
		List <Double> dl2 = Arrays.asList (3.0, 4.0, 2.0, 1.0);
		Collections.sort (dl2, Double::compareTo);
		System.out.println(dl2);

		
		
	}
}
