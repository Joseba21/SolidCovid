package dip;

public class Main {

	public static void main(String[] args) {
		Covid19Pacient persona = new Covid19Pacient("joseba", 21);
		
		CalcAfectionAbstract ac = new CalcAfection();
		CalcIncrementAbstract incr = new CalcIncrement();
		
		ISymptom cardio = new CardioVascularSymptom(54,1,14);
		ISymptom respiratory = new RespiratorySymptom(3,2,10);
		ISymptom muscular = new NeuroMuscularSymptom(1,1,7);
		
		persona.addSymptom(cardio, 90);
		persona.addSymptom(respiratory, 90);
		persona.addSymptom(muscular, 90);

		double impact = persona.calcCovid19Impact(ac,incr);
		System.out.println("Covid Impaktuaren balioa = " + impact);
		

	}
}
