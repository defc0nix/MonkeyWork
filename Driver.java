import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
    private static ArrayList<Dog> dogList = new ArrayList<Dog>();
    private static ArrayList<Monkey> monkeyArrayList = new ArrayList<Monkey>(); //this arraylist will store the monkeys
    // Instance variables (if needed)
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //initializing our scanner
        
        initializeDogList();
        initializeMonkeyList();
        // Add a loop that displays the menu, accepts the users input
        boolean exit = false; //sentinel variable. will terminate the program when value is true
        while(!exit){//this loop will keep displaying the menu and asking the user's input until user has entered 'q'
            displayMenu();
            char option = scan.next().charAt(0);
            if(option=='1'){
                intakeNewDog(scan);
            }else if(option=='2'){
                intakeNewMonkey(scan);
            }else if(option=='3'){
                reserveAnimal(scan);
            }else if(option=='4'){
                printAnimals("dog");
            }else if(option=='5'){
                printAnimals("monkey");
            }else if(option=='6'){
                printAnimals("available");
            }else if(option=='q'){
                exit = true;
            }
        }
        // and takes the appropriate action.
        // For the project submission you must also include input validation
        // and appropriate feedback to the user.
        // Hint: create Scanner and pass it to the necessary
        // methods
        // Hint: Menu options 4, 5, and 6 should all connect to the printAnimals() method.
        }
    
    // This method prints the menu options
    public static void displayMenu() {
        System.out.println("\n\n");
        System.out.println("\t\t\t\tRescue Animal System Menu");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all animals that are not reserved");
        System.out.println("[q] Quit application");
        System.out.println();
        System.out.println("Enter a menu selection");
    }

     // Adds dogs to a list for testing
    public static void initializeDogList() {
        Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "intake", false, "United States");
        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", false, "United States");
        Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", true, "Canada");
        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
    }

    // Adds monkeys to a list for testing
    //Optional for testing
    public static void initializeMonkeyList() {
        Monkey monkey1 = new Monkey("Marcel", "male", "1", "15.6", "07-12-2019", "United States", "in service", true, "United States", 44, 10, 30, "macaque");
        Monkey monkey2 = new Monkey("Coco", "male", "3", "25.2", "02-29-2080", "Brazil", "Phase I", false, "Brazil", 46, 11, 32, "tamarin");
        Monkey monkey3 = new Monkey("Ally", "female", "4", "15.6", "07-14-2017", "Canada", "in service", false, "Canada", 43, 9, 28, "squirrel monkey");
        monkeyArrayList.add(monkey1);
        monkeyArrayList.add(monkey2);
        monkeyArrayList.add(monkey3);

    }

    // Complete the intakeNewDog method
    // The input validation to check that the dog is not already in the list
    // is done for you
    public static void intakeNewDog(Scanner scanner) {
        System.out.println("What is the dog's name?");
        String name = scanner.nextLine();
        for(Dog dog: dogList) {
            if(dog.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis dog is already in our system\n\n");
                return; //returns to menu
            }
        }

          // Add the code to instantiate a new dog and add it to the appropriate list  
        System.out.println("What is the dog's breed?");
        String breed = scanner.nextLine();
        System.out.println("What is the dog's gender?");
        String gender = scanner.nextLine();
        System.out.println("What is the dog's age?");
        String age = scanner.nextLine();
        System.out.println("What is the dog's weight?");
        String weight = scanner.nextLine();
        System.out.println("What is the dog's acquisition date?");
        String acDate = scanner.nextLine();
        System.out.println("What is the dog's acquisition country?");
        String acCountry = scanner.nextLine();
        System.out.println("What is the dog's training status?");
        String trainingStatus = scanner.nextLine();
        System.out.println("Is the dog reserved? [true or false]");
        boolean reserve = scanner.nextBoolean();
        System.out.println("What is the dog's service country?");
        String serviceCountry = scanner.nextLine();
        dogList.add(new Dog(name, breed, gender, age, weight, acDate, acCountry, trainingStatus, reserve, serviceCountry));
    }

     // Complete intakeNewMonkey
    //Instantiate and add the new monkey to the appropriate list
    // For the project submission you must also validate the input
    // to make sure the monkey doesn't already exist and the species type is allowed
    public static void intakeNewMonkey(Scanner scanner) {
        System.out.println("What is the monkey's name?");
        String name = scanner.nextLine();
        for(Monkey monkey: monkeyArrayList) {
            if(monkey.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis monkey is already in our system\n\n");
                return; //returns to menu
            }
        }
      // Add the code to instantiate a new dog and add it to the appropriate list 
        System.out.println("What is the monkey's species?");
        String species = scanner.nextLine().toLowerCase();
        if(!species.equals("capuchin") && !species.equals("guenon") && !species.equals("macaque")
                && !species.equals("marmoset") && !species.equals("squirrel monkey") && !species.equals("tamarin")){
            System.out.println("\n\nThis monkey is not eligible for training\n\n");
            return;
        }

        System.out.println("What is the monkey's gender?");
        String gender = scanner.nextLine();
        System.out.println("What is the monkey's age?");
        String age = scanner.nextLine();
        System.out.println("What is the monkey's weight?");
        String weight = scanner.nextLine();
        System.out.println("What is the monkey's acquisition date?");
        String acDate = scanner.nextLine();
        System.out.println("What is the monkey's acquisition country?");
        String acCountry = scanner.nextLine();
        System.out.println("What is the monkey's training status?");
        String trainingStatus = scanner.nextLine();
        System.out.println("Is the dog reserved? [true or false]");
        boolean reserve = scanner.nextBoolean();
        System.out.println("What is the monkey's service country?");
        String serviceCountry = scanner.nextLine();
        System.out.println("What is the monkey's body length?");
        int bodyLength = scanner.nextInt();
        System.out.println("What is the monkey's tail length?");
        int tailLength = scanner.nextInt();
        System.out.println("What is the monkey's height?");
        int height = scanner.nextInt();
        monkeyArrayList.add(new Monkey(name, gender, age, weight, acDate, acCountry, trainingStatus, reserve, serviceCountry, bodyLength, tailLength, height, species));
    }

    // Complete reserveAnimal
    // You will need to find the animal by animal type & in service country
    public static void reserveAnimal(Scanner scanner) {
        System.out.println("Enter animal type: [Dog or Monkey]");
        String type = scanner.next().toLowerCase();
        if(!type.equals("dog") && !type.equals("monkey")){
            System.out.println("Invalid input");
            return;
        }
        System.out.println("Enter animal service country: ");
        String serviceCountry = scanner.next().toLowerCase();
        if(type.equals("dog")){
            for(int i=0; i<dogList.size(); i++){
                if(dogList.get(i).getInServiceLocation().equals(serviceCountry) && !dogList.get(i).getReserved()){
                    System.out.println(dogList.get(i).toString() + " successfully reserved.");
                    return;
                }
            }
        }else{
            for(int i=0; i<monkeyArrayList.size(); i++){
                if(monkeyArrayList.get(i).getInServiceLocation().equals(serviceCountry) && !monkeyArrayList.get(i).getReserved()){
                    System.out.println(monkeyArrayList.get(i).getName() + " successfully reserved.");
                    return;
                                   }
            }
        }
    }

    // Complete printAnimals
    // Include the animal name, status, acquisition country and if the animal is reserved.
    // Remember that this method connects to three different menu items.
    // The printAnimals() method has three different outputs
    // based on the listType parameter
    // dog - prints the list of dogs
    // monkey - prints the list of monkeys
    // available - prints a combined list of all animals that are
    // fully trained ("in service") but not reserved
    // Remember that you only have to fully implement ONE of these lists.
    // The other lists can have a print statement saying "This option needs to be implemented".
    // To score "exemplary" you must correctly implement the "available" list.
    public static void printAnimals(String type) {
        if(type.toLowerCase().equals("dog")){
            System.out.println("List of dogs: ");
            for(Dog dog: dogList){
                System.out.println(dog.getName() + "\t" + dog.getTrainingStatus() + "\t" + dog.getAcquisitionLocation() + "\t" + dog.getReserved());
            }
        }else if(type.toLowerCase().equals("monkey")){
            System.out.println("List of dogs: ");
            for(Monkey monkey: monkeyArrayList){
                System.out.println(monkey.getName() + "\t" + monkey.getTrainingStatus() + "\t" + monkey.getAcquisitionLocation() + "\t" + monkey.getReserved());
            }
        }else if(type.toLowerCase().equals("available")){
            System.out.println("List of available animals: ");
            for(Dog dog: dogList){
                if(dog.getTrainingStatus().equalsIgnoreCase("in service") && !dog.getReserved()){
                    System.out.println(dog.getName() + "\t" + dog.getTrainingStatus() + "\t" + dog.getAcquisitionLocation() + "\t" + dog.getReserved());
                }
            }

            for(Monkey monkey: monkeyArrayList){
                if(monkey.getTrainingStatus().equalsIgnoreCase("in service") && !monkey.getReserved()){
                    System.out.println(monkey.getName() + "\t" + monkey.getTrainingStatus() + "\t" + monkey.getAcquisitionLocation() + "\t" + monkey.getReserved());
                }
            }
        }
    }

}
