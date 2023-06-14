package algoritmosJava;

import java.util.ArrayList;
import java.util.List;

public class PesquisaBinaria01 {
	

	public static void main(String[] args) {
		
		List<Integer> minhaLista = new ArrayList<>();
		minhaLista.add(1);
		minhaLista.add(3);
		minhaLista.add(5);
		minhaLista.add(7);
		minhaLista.add(9);
		
		System.out.println(pesquisaBinaria(minhaLista, 3));
		System.out.println(pesquisaBinaria(minhaLista, -1));
		System.out.println(pesquisaBinaria(minhaLista, 0));
		System.out.println(pesquisaBinaria(minhaLista, 1));
		System.out.println(pesquisaBinaria(minhaLista, 8));	

	}
	
	public static Object pesquisaBinaria(List<Integer> minhaLista, int item) {
		
		int baixo = 0;
		int alto = (minhaLista.size() - 1);
		int meio;
		int chute;
		
		while(baixo <= alto) {
			meio = (baixo + alto) / 2;
			chute = minhaLista.get(meio);
			if(chute == item) {
				return meio;
			}
			else if(chute > item) {
				alto = meio - 1;
			}
			else {
				baixo = meio + 1;
			}
		}
		
		return null;
	}
	
}
