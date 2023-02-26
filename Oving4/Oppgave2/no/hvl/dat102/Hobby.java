package no.hvl.dat102;

public class Hobby { 

	private String hobbyNavn;  

	public Hobby(String hobby){ 
		hobbyNavn = hobby; 
	} 
	
	public String getHobbyNavn() {
		return hobbyNavn;
	}
	
	public void setHobbyNavn(String hobbyNavn) {
		this.hobbyNavn = hobbyNavn;
	}
	
	public String toString(){ 
		//... returnerer hobbynavnet med ”<” foran og ”>” bak som  
		// String (Eksempel: <tegne, male>) 
		// Merk: Kan også ha uten  «<» og «>», men forsøk med. 
		return "<" + hobbyNavn + ">";
	} 
	
	@Override
	public boolean equals(Object hobby2){  
		// eventuelt fylle ut først med "standard" kode        
		// som vi ofte har med overkjøring av 
		// equals-metoden generert av Eclipse 
		Hobby hobbyDenAndre = (Hobby)hobby2; 
		return(hobbyNavn.equals(hobbyDenAndre.getHobbyNavn())); 
	} 
}
