package srp;

public class Increment {

	double calculateIncrement(double afection, int years) {
		double increment=0;
		if (years>65) 
			increment=afection*0.5;
		if (years<=65 && years>=45) 
			increment=afection*0.3;
		//Baldintza hau ez da beharrezkoa increment 0 itzuliko duelako berdin berdin
		//if (years<10) 
			//increment=afection*0;
		return increment;
	}
}
