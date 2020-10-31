package isp;

import java.util.HashMap;
import java.util.Map;

public class Covid19Pacient extends Pacient {
	public Covid19Pacient(String name, int years) {
		super(name, years);
	}
	Map<ISymptom,Integer> sintoma=new HashMap<ISymptom,Integer>();
	public void addSymptom(ISymptom respiratory, Integer pisua){
		sintoma.put(respiratory,pisua);
	}
	
	double calcCovid19Impact(CalcAfectionAbstract ca, CalcIncrementAbstract incr) {
		double afection=0;
		double increment=0;
		double impact;
		//calculate afection
		afection=ca.calculateSymptomsAfection (this);
		//calculate increment
		increment=incr.getIncrementByYear (this, (int)afection);
		//calculate impact
		impact=afection+increment;
		return impact;
	}
}
