package isp;

public class CalcIncrement extends CalcIncrementAbstract{

	// adin eta afection indize bat emanda, afekzio indizea adinaren arabera inkrementatzen du
	public double getIncrementByYear(Yearable p, int afection){
		if (p.getYears()>65) return afection*0.5; else return 0;
	}
}
