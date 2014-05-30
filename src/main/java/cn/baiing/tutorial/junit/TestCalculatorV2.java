package cn.baiing.tutorial.junit;

public class TestCalculatorV2 {
    private int nbErrors=0;

    public void testAdd() {
        Calculator calculator = new Calculator();
        double result = calculator.add(10, 50);
        if (result != 60) {
            throw new RuntimeException("Bad result: " + result);
        }
    }

    public static void main(String[] args) {
        TestCalculatorV2 test = new TestCalculatorV2();
        try {
            test.testAdd();
        } catch (Throwable e) {
            test.nbErrors++;
            e.printStackTrace();
        }
        if (test.nbErrors > 0) {
            throw new RuntimeException("There were " + test.nbErrors
                    + " error(s)");
        }
    }
}
