package srp;

import java.util.Map;

public class Afection {

	double calculateAfection(Map<ISymptom,Integer> sintoma) {
		double afection=0;
		for (ISymptom c:sintoma.keySet()) {
			if (c.getCovidImpact()>50) 
				afection=afection+c.getSeverityIndex()*sintoma.get(c);
		}
		afection=afection/(sintoma.size());
		return afection;
	}
}
