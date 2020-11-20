class Esop2018 {
	boolean test1 (boolean english, boolean math, boolean science, boolean bonus){
		boolean passing = true;
		if (!english){
		    english= false;       // # error: *english* should be *passing*
		}
		if (!math){
		    if (bonus) {passing = true;}
		    else passing=false;
		}
		if (!math){
		    if (bonus) {passing = true;}		 //# error: *math* should be *science*
		    else passing=false;
		}
		return passing;
	} 
}