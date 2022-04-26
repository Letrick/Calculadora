package classes;

import interfaces.ICalculadora;

public class multiplicacao implements ICalculadora {

	 

	@Override
	public Integer calcula(Integer n1, Integer n2) {
		return n1 * n2;
	}

	@Override
	public Float calcula(Float n1, Float n2) {
		
		
		return n1 * n2;
	}

	@Override
	public Double calcula(Double n1, Double n2) {
		return n1 * n2;
	}

	@Override
	public Integer calcula(Integer[] numeros) {
		Integer mult = 1;
		for (int i = 0; i < numeros.length; i++) {
			mult *= numeros[i];
		}
		return mult;
	}

	@Override
	public Float calcula(Float[] numeros) {
		Float mult = 1.0f;
		for (int i = 0; i < numeros.length; i++) {
			mult *= numeros[i];
		}
		return mult;
	}
	

	@Override
	public Double calcula(Double[] numeros) {
		Double mult = 1.0d;
		for (int i = 0; i < numeros.length; i++) {
			mult *= numeros[i];
		}
		return mult;
	}
	}


	
	

