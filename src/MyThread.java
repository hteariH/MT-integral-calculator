
public class MyThread implements Runnable {

    double a;
    double b;
    int n;
    Resulter resulter;

    @Override
    public void run() {
        Calculator calc = new Calculator(a, b, n);
        double res = calc.calculate();
        resulter.addResult(res);
    }

    public MyThread(double a, double b, int n, Resulter resulter) {
        this.a = a;
        this.b = b;
        this.n = n;
        this.resulter = resulter;
    }

}
