package ocp;

public class Main {

	public static void main(String[] args) {
		//Pertsona sortu
		Covid19Pacient persona = new Covid19Pacient("joseba", 21);
		
		//Sintomak sortu
		ISymptom cardio = new CardioVascularSymptom(2,1,14);
		ISymptom respiratory = new RespiratorySymptom(3,2,10);
		ISymptom muscular = new NeuroMuscularSymptom(1,1,7);
		
		//Sintomak gehitu
		persona.addSymptom(cardio, 90);
		persona.addSymptom(respiratory, 90);
		persona.addSymptom(muscular, 90);

		//Funtzioari deitu eta inprimatu
		double impact = persona.calcCovid19Impact();
		System.out.println("Covid Impaktuaren balioa = " + impact);
		
		//Funtzio berriari deitu
		int days = persona.sanatedDays();
		System.out.println("Sendatzeko behar diren egunak: " + days + " egun");
	}
}
