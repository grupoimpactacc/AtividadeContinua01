package teste;

public class Arranjo {
	
	int[] a = {940, 880, 830, 790, 750, 660, 650, 590, 510, 940};

	public Integer menor() {
		
		int menorValor = a[0];
		int i;
		
		for (i = 0; i < a.length; i++) {
			if (menorValor >= a[i]) {
				menorValor = a[i];
			}
		}		
		return menorValor;
	}

	public Integer maior() {
		
		int maiorValor = a[0];
		int i;
		
		for (i = 0; i < a.length; i++) {
			if (maiorValor <= a[i]) {
				maiorValor = a[i];
			}
		}
		return maiorValor;
	}

	public Integer soma() {
		
		int resultado = 0;
		int i = 0;
		
		for (i = 0; i < a.length; i++) {
			resultado = resultado + a[i];
		}
		return resultado;
	}

	public Integer repeticoes(int i) {
		
		int cont = 0;
		int j;
		
		for (j = 0; j < a.length; j++) {
			if (i == a[j]) {
				cont = cont + 1;
			}			
		}		
		return cont;
	}
}
