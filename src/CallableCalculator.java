
import java.util.concurrent.Callable;

public class CallableCalculator implements Callable<Double>{
    
    double a;
    double b;
    int n;

    public CallableCalculator(double a, double b, int n) {
        this.a = a;
        this.b = b;
        this.n = n;
    }
    
    @Override
    public Double call() throws Exception {
        Calculator calc = new Calculator(a, b, n);
        return calc.calculate();
    }
    
}
