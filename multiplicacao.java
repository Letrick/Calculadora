

public class multiplicacao implements ICalculadora
{
    @Override
    public Integer calcula(final Integer n1, final Integer n2) {
        return n1 * n2;
    }
    
    @Override
    public Float calcula(final Float n1, final Float n2) {
        return n1 * n2;
    }
    
    @Override
    public Double calcula(final Double n1, final Double n2) {
        return n1 * n2;
    }
    
    @Override
    public Integer calcula(final Integer[] numeros) {
        Integer mult = 1;
        for (int i = 0; i < numeros.length; ++i) {
            mult *= numeros[i];
        }
        return mult;
    }
    
    @Override
    public Float calcula(final Float[] numeros) {
        Float mult = 1.0f;
        for (int i = 0; i < numeros.length; ++i) {
            mult *= numeros[i];
        }
        return mult;
    }
    
    @Override
    public Double calcula(final Double[] numeros) {
        Double mult = 1.0;
        for (int i = 0; i < numeros.length; ++i) {
            mult *= numeros[i];
        }
        return mult;
    }
}
