package isp;

public class CalcAfection extends CalcAfectionAbstract {

	double calculateSymptomsAfection(Covid19Pacient covid19Pacient) {
		double afection=0;
		for (ISymptom c:covid19Pacient.sintoma.keySet()) {
			if (c.getCovidImpact()>50) 
				afection=afection+c.getSeverityIndex()*covid19Pacient.sintoma.get(c);
		}
		afection=afection/(covid19Pacient.sintoma.size());
		return afection;
	}
}
