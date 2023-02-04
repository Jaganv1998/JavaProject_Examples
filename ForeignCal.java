package accessModifier;

import accessModifier.CalculatorDemo;

public class ForeignCal extends UseCal {

	public static void main(String[] args)
	{
	CalculatorDemo c = new CalculatorDemo();
	c.oddNumbers();
	c.subNumbers();
	c.divNumbers();
	
	ForeignCal f = new ForeignCal();
	f.oddNumbers();
	f.subNumbers();
	f.divNumbers();
	
	UseCal u = new UseCal();
	u.oddNumbers();
	u.subNumbers();
	u.divNumbers();
	
	}
	
}
