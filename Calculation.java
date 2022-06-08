class Calculation {
    int sum(int a, int b)

    {
        return (a + b);
    }

    double sum(int a, int b) {
        return (a + b);
    }

    public static void main(String args[]) {
        Calculation obj = new Calculation();
        int result = obj.sum(20, 20); // Compile Time Error
    }
}