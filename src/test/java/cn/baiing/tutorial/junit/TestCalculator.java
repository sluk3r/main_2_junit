package cn.baiing.tutorial.junit;

public class TestCalculator {
	public static voidmain(String[] args)
	{
		Calculator calculator = newCalculator();
		doubleresult = calculator.add(10,50);
		if(result != 60)
		{
			System.out.println("Bad result: " + result);
		}
	}
}
