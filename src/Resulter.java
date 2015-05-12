class Resulter {
    private double result;
    private int count;
    public Resulter() {
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
    
    public synchronized void addResult(double result){
        this.result += result;
        count++;
        notify();
    }

    public int getCount() {
        return count;
    }
     
}
