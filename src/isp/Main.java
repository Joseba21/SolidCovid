package isp;

public class Main {
	public static void main(String[] args) {

		Yearable p = new Pertsona("joseba", 21);
		Yearable p2 = new Pertsona("mikel", 80);

		CalcIncrementAbstract incr = new CalcIncrement();
		System.out.println("Increment: " + incr.getIncrementByYear(p,40));
		System.out.println("Increment: " + incr.getIncrementByYear(p2,40));

	}
}
