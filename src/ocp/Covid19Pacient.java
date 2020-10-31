package ocp;
import java.util.HashMap;
import java.util.Map;

public class Covid19Pacient extends Pacient {

	public Covid19Pacient(String name, int years) {
		super(name, years);
	}
	/*
	Map<CardioVascularSymptom,Integer> cardios=new HashMap<CardioVascularSymptom,Integer>();
	Map<NeuroMuscularSymptom,Integer> neuros=new HashMap<NeuroMuscularSymptom,Integer>();
	Map<RespiratorySymptom,Integer> respirs=new HashMap<RespiratorySymptom,Integer>();
	 */
	Map<ISymptom,Integer> sintoma=new HashMap<ISymptom,Integer>();
	public void addSymptom(ISymptom c, Integer pisua){
		sintoma.put(c,pisua);
	}

	double calcCovid19Impact() {
		double afection=0;
		double increment=0;
		double impact;
		//calculate afection
		for (ISymptom c:sintoma.keySet())
			afection=afection+c.getSeverityIndex()*sintoma.get(c);
		afection=afection/(sintoma.size());

		//calculate increment
		if (getYears()>65) increment=afection*0.5;
		//calculate impact
		impact=afection+increment;
		return impact;
	}

	int sanatedDays() {
		int maxDays=0;
		int days=0;
		//calculate sanatedDays
		for (ISymptom c:sintoma.keySet()) {
			days=c.getAffectedDays();
			maxDays = Math.max(maxDays, days);
		}
		return maxDays;
	}
}
