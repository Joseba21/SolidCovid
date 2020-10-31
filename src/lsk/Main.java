package lsk;

public class Main {

	public static void main(String[] args) {
		//Pertsona sortu
		Covid19Pacient persona = new Covid19Pacient("joseba", 21);

		//Sintomak sortu
		Symptom cardio = new CurableSymptom("cardio",2,1);
		Symptom respiratory = new CurableSymptom("respiratory",3,2);
		Symptom muscular = new CurableSymptom("muscular",1,1);
		Symptom tristura = new IncurableSymptom("tristura",1,1);

		//Sintomak gehitu
		persona.addSymptom(cardio, 90);
		persona.addSymptom(respiratory, 90);
		persona.addSymptom(muscular, 90);
		persona.addSymptom(tristura, 90);

		//showSymptoms() funtzioa deitu
		persona.showSymptoms();

		//cure() funtzioa deitu
		persona.cure();
	}
}
