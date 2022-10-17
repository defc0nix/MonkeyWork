public class Monkey extends RescueAnimal {

    // Instance variables
    private String species;
    private String bodyLength;
    private String height;
    private String tailLength;

    // Constructor
    public Monkey(String name, String species, String gender, String age,
            String weight, String tailLength, String height, String bodyLength, String acquisitionDate,
            String acquisitionCountry, String trainingStatus, boolean reserved, String inServiceCountry) {

        setName(name);
        setSpecies(species);
        setGender(gender);
        setAge(age);
        setWeight(weight);
        setTailLength(tailLength);
        setHeight(height);
        setBodyLength(bodyLength);
        setAcquisitionDate(acquisitionDate);
        setAcquisitionLocation(acquisitionCountry);
        setTrainingStatus(trainingStatus);
        setReserved(reserved);
        setInServiceCountry(inServiceCountry);

    }

    private void setBodyLength(String bodyLength) {
        this.bodyLength = bodyLength;
    }

    private void setHeight(String height) {
        this.height = height;
    }

    void setTailLength(String tailLength) {
        this.tailLength = tailLength;
    }

    public Monkey() {

    }

    // Accessor Method
    public String getSpecies() {
        return species;
    }

    // Mutator Method
    public void setSpecies(String monkeySpecies) {
        species = monkeySpecies;
    }

    @Override
    public String toString() {
        return "Type of animal is Monkey of the species " + species + " and body length " + bodyLength
                + " , height is " + height + ", tail length " + tailLength + " and " + super.toString();
    }
}
