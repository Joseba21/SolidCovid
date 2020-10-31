package srp;

public class Main {

	public static void main(String[] args) {
		//Pertsona sortu
		Covid19Pacient personaJoven = new Covid19Pacient("joseba", 21);
		Covid19Pacient personaAdulta = new Covid19Pacient("pepe", 80);
		
		//Sintomak sortu
		ISymptom cardio = new CardioVascularSymptom(2,1,14);
		ISymptom respiratory = new RespiratorySymptom(3,2,10);
		ISymptom muscular = new NeuroMuscularSymptom(1,1,7);
		
		ISymptom cardio2 = new CardioVascularSymptom(55,2,20);
		ISymptom respiratory2 = new RespiratorySymptom(60,2,10);
		ISymptom muscular2 = new NeuroMuscularSymptom(80,3,7);
		
		//Sintomak gehitu
		personaJoven.addSymptom(cardio, 90);
		personaJoven.addSymptom(respiratory, 90);
		personaJoven.addSymptom(muscular, 90);
		
		personaAdulta.addSymptom(cardio2, 90);
		personaAdulta.addSymptom(respiratory2, 90);
		personaAdulta.addSymptom(muscular2, 90);

		//Funtzioari deitu eta inprimatu
		double impactJoven = personaJoven.calcCovid19Impact();
		System.out.println("Covid Impaktuaren balioa = " + impactJoven);
		
		double impactAdulto = personaAdulta.calcCovid19Impact();
		System.out.println("Covid Impaktuaren balioa = " + impactAdulto);
		
		//Funtzio berriari deitu
		int daysJoven = personaJoven.sanatedDays();
		System.out.println("Sendatzeko behar diren egunak: " + daysJoven + " egun");
		
		int daysAdulto = personaAdulta.sanatedDays();
		System.out.println("Sendatzeko behar diren egunak: " + daysAdulto + " egun");
	}
}
