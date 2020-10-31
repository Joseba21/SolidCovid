package dip;

public class CalcIncrement extends CalcIncrementAbstract{

	double calculateIncrementPerYear(Pacient covid19Pacient, double afection) {
		double increment=0;
		if (covid19Pacient.years>65) 
			increment=afection*0.5;
		if (covid19Pacient.years<=65 && covid19Pacient.years>=45) 
			increment=afection*0.3;
		//Baldintza hau ez da beharrezkoa increment 0 itzuliko duelako berdin berdin
		//if (years<10) 
			//increment=afection*0;
		return increment;
	}
}
