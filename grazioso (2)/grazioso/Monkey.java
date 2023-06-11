
public class Monkey extends RescueAnimal {
	
	// Declares values as private strings
	private String tailLength;
	private String height;
	private String bodyLength;
	private String species;
	
	// Constructor for the class
	public Monkey(String name, String species, String gender, String age, String weight, String tailLength,
			String height, String bodyLength, String acquisitionDate, String acquisitionCountry,
			String trainingStatus, Boolean reserved, String inServiceCountry) {
		setName(name);
		setGender(gender);
		setWeight(weight);
		setTailLength(tailLength);
		setHeight(height);
		setBodyLength(bodyLength);
		setSpecies(species);
		setAcquisitionDate(acquisitionDate);
		setAcquisitionLocation(acquisitionCountry);
		setTrainingStatus(trainingStatus);
		setReserved(reserved);
		setInServiceCountry(inServiceCountry);
		}
	// Creates a mutator for species
	public void setSpecies(String monkeySpecies) {
		species = monkeySpecies;
	}
	// Creates an accessor for species
	public String getSpecies() {
		return species;
	}
	// Creates a mutator for tailLength
	public void setTailLength(String tailLength) {
		this.tailLength = tailLength;
	}
	// Creates an accessor for tailLength
	public String getTailLength() {
		return tailLength;
	}
	// Creates a mutator for height
	public void setHeight(String height) {
		this.height = height;
	}
	//Creates an accessor for height
	public String getHeight() {
		return height;
	}
	// Creates a mutator for bodyLength
	public void setBodyLength(String bodyLength) {
		this.bodyLength = bodyLength;
	}
	// Creates an accessor for bodyLength
	public String getBodyLength() {
		return bodyLength;
	}
}
