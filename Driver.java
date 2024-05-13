import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
    private static ArrayList<Dog> dogList = new ArrayList<Dog>();
    private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();
	static Scanner scanner = new Scanner(System.in);
    // Instance variables (if needed)


    public static void main(String[] args) {


        initializeDogList();
        initializeMonkeyList();

        // Add a loop that displays the menu, accepts the users input
        // and takes the appropriate action.
	// For the project submission you must also include input validation
        // and appropriate feedback to the user.
        // Hint: create a Scanner and pass it to the necessary
        // methods 
	// Hint: Menu options 4, 5, and 6 should all connect to the printAnimals() method.
        
        //using this to break the while loop in the case of 'q'
    	boolean input = true;
        
        while (input) {
        	
        	//displaying main menu
        	displayMenu();
        	char option = scanner.next().charAt(0);
        	
        	switch(option) {
        	case '1':
        		intakeNewDog(); //new dog form
        		break;
        	case '2':
        		intakeNewMonkey(); // new monkey form
        		break;
        	case '3':
        		reserveAnimal(scanner); // reserve an animal form
        		break;
        	case '4':
        		printAnimals("dog"); // prints list of all dogs
        		break;
        	case '5':
        		printAnimals("monkey"); // prints list of all monkeys
        		break;
        	case '6':
        		printAnimals("available"); // prints list of all animals
        		break;
        	case 'q':
        		input = false; // setting to false breaking the loop and exiting system
        		System.out.println("You have successfully exited the system, have a nice day!");
        		break;
        	default:
        		System.out.println("Not an option, try again!"); // catch for all other cases besides the 7 above(1,2,3,4,5,6,q)
        	}
        }

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
        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "intake", false, "United States");
        Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", true, "Canada");

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);

    }

    
    // Adds monkeys to a list for testing
    //Optional for testing
    public static void initializeMonkeyList() {
    	
    	Monkey monkey1 = new Monkey("Bob", "Squirrel Monkey", "male", "1", "5.3", "10-12-2022", "United States", "in service", true, "United States");
    	Monkey monkey2 = new Monkey("Susan", "Squirrel Monkey", "male", "3", "4.5", "10-12-2021", "United States", "intake", false, "United States");
    	
    	// Adds monkey1, 2 to the monkeyList
    	monkeyList.add(monkey1);
    	monkeyList.add(monkey2);
    	
    }


    // Complete the intakeNewDog method
    // The input validation to check that the dog is not already in the list
    // is done for you
    public static void intakeNewDog() {
        System.out.println("What is the dog's name?");
        String name = scanner.next();
        for(Dog dog: dogList) {
            if(dog.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis dog is already in our system\n\n");
                return; //returns to menu
            }
        }
        
        
        // Add the code to instantiate a new dog and add it to the appropriate list
        System.out.println("What is the dog's breed?");
        String breed = scanner.next();
        System.out.println("What is the dog's gender?");
        String gender = scanner.next();
        System.out.println("What is the dog's age?");
        String age = scanner.next();
        System.out.println("What is the dog's weight?");
        String weight = scanner.next();
        System.out.println("What is the dog's acquisition date? (mm-dd-yyyy");
        String acquisitionDate = scanner.next();
        System.out.println("What is the dog's acquisition country?");
        String acquisitionCountry = scanner.next();
        System.out.println("What is the dog's training status?");
        String trainingStatus = scanner.next();
        System.out.println("Is the dog reserved?");
        boolean reserved = scanner.nextBoolean();scanner.nextLine();
        System.out.println("What is the dog's Service Country?");
        String serviceCountry = scanner.next();
        Dog newdog = new Dog(name,breed,gender,age,weight,acquisitionDate,acquisitionCountry,trainingStatus,reserved,serviceCountry);
        dogList.add(newdog);
    }


        // Complete intakeNewMonkey
	//Instantiate and add the new monkey to the appropriate list
        // For the project submission you must also  validate the input
	// to make sure the monkey doesn't already exist and the species type is allowed
        public static void intakeNewMonkey() {
        	System.out.println("What is the monkey's name?");
            String name = scanner.next();
            for(Monkey monkey: monkeyList) {
                if(monkey.getName().equalsIgnoreCase(name)) {
                    System.out.println("\n\nThis monkey is already in our system\n\n");
                    return;
                }
            }
            
            System.out.println("What is the monkey's breed?");
            String breed = scanner.next();
            System.out.println("What is the monkey's gender?");
            String gender = scanner.next();
            System.out.println("What is the monkey's age?");
            String age = scanner.next();
            System.out.println("What is the monkey's species?");
            String species = scanner.next();
            System.out.println("What is the monkey's acquisition date? (mm-dd-yyyy");
            String acquisitionDate = scanner.next();
            System.out.println("What is the monkey's acquisition country?");
            String acquisitionCountry = scanner.next();
            System.out.println("What is the monkey's training status?");
            String trainingStatus = scanner.next();
            System.out.println("Is the monkey reserved?");
            boolean reserved = scanner.nextBoolean();scanner.nextLine();
            System.out.println("What is the monkey's Service Country?");
            String serviceCountry = scanner.next();
            Monkey newmonkey=new Monkey(name,breed,gender,age,species, acquisitionDate,acquisitionCountry,trainingStatus,reserved,serviceCountry);
            monkeyList.add(newmonkey);
        }

        // Complete reserveAnimal
        // You will need to find the animal by animal type and in service country
        public static void reserveAnimal(Scanner scanner) {
            System.out.println("What kind of animal would you like to reserve? (Dog or Monkey)");
            String animalType = scanner.next().toLowerCase();
            
            if(animalType.equalsIgnoreCase("dog")) {
            		for(Dog dog: dogList) {
                        System.out.println("What is the name of the " + animalType + " you would like to reserve?");
                        String animalName = scanner.next().toLowerCase();
                    if(dog.getName().equalsIgnoreCase(animalName)) {
                        System.out.println("\n\nYou have reserved " + dog.getName() + "! \n\n");
                        dog.setReserved(true);
                        return; //returns to menu
                    }
                    else {
                    	System.out.println("\n\n We apologize " + dog.getName() + " is already reserved! \n\n");
                        return; //returns to menu
                    }
            	}
            }
            
            if(animalType.equalsIgnoreCase(animalType)) {
            	for(Monkey monkey: monkeyList) {
            		System.out.println("What is the name of the " + animalType + " you would like to reserve?");
                    String animalName = scanner.next().toLowerCase();
                    if(monkey.getName().equalsIgnoreCase(animalName)) {
                        System.out.println("\n\nYou have reserved " + monkey.getName() + "! \n\n");
                        monkey.setReserved(true);
                        return; //returns to menu
                    }
                    else {
                    	System.out.println("\n\n We apologize " + monkey.getName() + " is already reserved! \n\n");
                        return; //returns to menu
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
        public static void printAnimals(String listType) {
            if (listType.equalsIgnoreCase("dog")) {
                for (Dog dog : dogList) { //iterating through dogs and printing their attributes
                    System.out.println("Dog: " + dog.getName() + " Breed: " + dog.getBreed() + " Gender: " + dog.getGender()
                            + " Age: " + dog.getAge() + " Weight: " + dog.getWeight()
                            + "\nAcquisition Date: " + dog.getAcquisitionDate()
                            + "\nAcquisition Country: " + dog.getAcquisitionLocation()
                            + "\nReserved: " + dog.getReserved() + "\nTraining Status: "
                            + dog.getTrainingStatus() + "\nService country: " + dog.getInServiceLocation() + "\n\n");
                }
            } else if (listType.equalsIgnoreCase("monkey")) {
                for (Monkey monkey : monkeyList) { //iterating through monkeys to print their attributes
                    System.out.println("Monkey: " + monkey.getName() + " Breed: " + monkey.getBreed() + " Gender: " + monkey.getGender()
                            + " Age: " + monkey.getAge() + " Weight: " + monkey.getWeight()
                            + "\nAcquisition Date: " + monkey.getAcquisitionDate()
                            + "\nAcquisition Country: " + monkey.getAcquisitionLocation()
                            + "\nReserved: " + monkey.getReserved() + "\nTraining Status: "
                            + monkey.getTrainingStatus() + "\nService country: " + monkey.getInServiceLocation() + "\n\n");
                }
            } else if (listType.equalsIgnoreCase("available")) { //printing all available animals in regards to their reserved state
                for (Dog dog : dogList) {
                    if (!dog.getReserved()) {
                        System.out.println("Dog: " + dog.getName() + " Breed: " + dog.getBreed() + " Gender: " + dog.getGender()
                                + " Age: " + dog.getAge() + " Weight: " + dog.getWeight()
                                + "\nAcquisition Date: " + dog.getAcquisitionDate()
                                + "\nAcquisition Country: " + dog.getAcquisitionLocation()
                                + "\nReserved: " + dog.getReserved() + "\nTraining Status: "
                                + dog.getTrainingStatus() + "\nService country: " + dog.getInServiceLocation()  + "\n\n");
                    }
                }
                for (Monkey monkey : monkeyList) {
                    if (!monkey.getReserved()) {
                        System.out.println("Monkey: " + monkey.getName() + " Breed: " + monkey.getBreed() + " Gender: " + monkey.getGender()
                                + " Age: " + monkey.getAge() + " Weight: " + monkey.getWeight()
                                + "\nAcquisition Date: " + monkey.getAcquisitionDate()
                                + "\nAcquisition Country: " + monkey.getAcquisitionLocation()
                                + "\nReserved: " + monkey.getReserved() + "\nTraining Status: "
                                + monkey.getTrainingStatus() + "\nService country: " + monkey.getInServiceLocation() + "\n\n");
                    }
                }
            }
        }

        }

