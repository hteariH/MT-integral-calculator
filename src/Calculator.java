


public class Calculator implements Runnable {

    public double result = 0;
    double a;
    double b;
    int n;

    @Override 
    public void run() {
        result += calculate();

    }

    public Calculator(double a, double b, int n) {
        this.a = a;
        this.b = b;
        this.n = n;
    }

    public double calculate() {
        Function f = new Function();
        double t = (b - a) / n;
        double sum = 0;
        for (int i = 1; i < n; i++) {
            double x = (a + i * t);
            sum += f.calculate(x);
        }
        return t * ((f.calculate(a)+f.calculate(b))/2+sum);
         
    }

}
