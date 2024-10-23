package calculadora;

public class CaluladoraImpl implements Calculadora {
	
	@Override
	public int calcular(int i1, char op, int i2) {
            int res;
            res = switch (op) {
                case '+' -> i1+i2;
                case '-' -> i1-i2;
                case '*' -> i1*i2;
                case '/' -> i1/i2;
                default -> 0;
            };
            return res;
	}

}
