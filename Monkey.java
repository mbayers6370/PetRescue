
public class Monkey extends RescueAnimal {

    // Instance variable
    private String species;
    private float tailLength;
    private float height;
    private float bodyWeight;
	private String breed;
    
    //Default Constructor
    public Monkey() {
    }

    // Constructor
    public Monkey(String name, String breed, String gender, String age,
    	    String weight, String acquisitionDate, String acquisitionCountry,
    		String trainingStatus, boolean reserved, String inServiceCountry) {
        setName(name);
        setBreed(breed);
        setGender(gender);
        setAge(age);
        setWeight(weight);
        setAcquisitionDate(acquisitionDate);
        setAcquisitionLocation(acquisitionCountry);
        setTrainingStatus(trainingStatus);
        setReserved(reserved);
        setInServiceCountry(inServiceCountry);
    }

	public String getBreed() {
		return breed;
	}
    
	private void setBreed(String breed) {
		this.breed = breed;
		
	}

	// Accessor Method
    public String getSpecies() {
        return species;
    }

    // Mutator Method
    public void setSpecies(String species) {
        this.species = species;
    }
    
    // Accessor Method
    public float getTailLength() {
        return tailLength;
    }

    // Mutator Method
    public void setTailLength(float tailLength) {
        this.tailLength = tailLength;
    }
    
    // Accessor Method
    public float getHeight() {
        return height;
    }

    // Mutator Method
    public void setHeight(float height) {
        this.height = height;
    }
    
    // Accessor Method
    public float getBodyWeight() {
        return bodyWeight;
    }

    // Mutator Method
    public void setSpecies(float bodyWeight) {
        this.bodyWeight = bodyWeight;
    }



}