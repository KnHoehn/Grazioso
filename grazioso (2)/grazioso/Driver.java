import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
    private static ArrayList<Dog> dogList = new ArrayList<Dog>();
    private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>(); // Creates a new array list for monkeys
    // Instance variables (if needed)

    public static void main(String[] args) {
    	
    	Scanner scanner = new Scanner(System.in); // Allows for input
    	String userInput; // Declares userInput as a string

        initializeDogList();
        initializeMonkeyList();
       

        // Add a loop that displays the menu, accepts the users input
        // and takes the appropriate action.
        
        Driver.displayMenu(); // Displays the menu
        userInput = scanner.nextLine(); // Allows input
        
        // While-loop that displays the menu and accesses the different methods
        while (!userInput.equals("q")) { // Loop will continue looping until the user inputs "q"
        	if (userInput.equals("1")) { // Accesses intakeNewDog method if user inputs "1"
        		Driver.intakeNewDog(scanner);
        	}
        	else if (userInput.equals("2")) { // Accesses intakeNewMonkey method if user inputs "2"
        		Driver.intakeNewMonkey(scanner);
        	}
        	else if (userInput.equals("3")) { // Accesses reserveAnimal method if user inputs "3"
        		Driver.reserveAnimal(scanner);
        	}
        	// Accesses printAnimals method if user inputs "4", "5", or "6"
        	else if (userInput.equals("4")) {
        		Driver.printAnimals(userInput);
        	}
        	else if (userInput.equals("5")) {
        		Driver.printAnimals(userInput);
        	}
        	else if (userInput.equals("6")) {
        		Driver.printAnimals(userInput);
        	}
        	else { // Prints "invalid input" if user inputs an invalid input
        		System.out.println("Invalid input");
        	}
        	Driver.displayMenu(); // Displays menu
        	userInput = scanner.nextLine(); // Gets user input
        }
	// For the project submission you must also include input validation
        // and appropriate feedback to the user.
        // Hint: create a Scanner and pass it to the necessary
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
        System.out.println("Enter a menu selection.");
    }


    // Adds dogs to a list for testing
    public static void initializeDogList() {
        Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "intake", false, "United States");
        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", false, "United States");
        Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", true, "Canada");
        
        // Added animal types for dogs in this list
        dog1.setAnimalType("Dog");
        dog2.setAnimalType("Dog");
        dog3.setAnimalType("Dog");

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
    }


    // Adds monkeys to a list for testing
    //Optional for testing
    public static void initializeMonkeyList() {
    	Monkey monkey1 = new Monkey("Jerry", "Marmoset", "male", "2", "5", "10", "15", "20", "02/02/2023", "Africa", "Phase II", false, "United States");
    	// Added monkey "Jerry" for testing
    	monkey1.setAnimalType("Monkey"); // Added animal type for monkey in this list
    	monkeyList.add(monkey1);

    }


    // Complete the intakeNewDog method
    // The input validation to check that the dog is not already in the list
    // is done for you
    public static void intakeNewDog(Scanner scanner) {
        System.out.println("What is the dog's name?");
        String name = scanner.nextLine();
        for(Dog dog: dogList) {
            if(dog.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis dog is already in our system.\n\n");
                return; //returns to menu
            }
        }
        System.out.println("What is the dog's breed?"); // Prompts user for dog's breed
        String breed = scanner.nextLine(); // Assigns breed with user input
        System.out.println("What is the dog's age?"); // Prompts user for dog's age
    	String age = scanner.nextLine(); // Assigns age with user input
    	System.out.println("What is the dog's gender?"); // Prompts user for dog's gender
    	String gender = scanner.nextLine(); // Assigns gender with user input
        System.out.println("What is the dog's weight?"); // Prompts user for dog's weight
        String weight = scanner.nextLine(); // Assigns weight with user input
        System.out.println("What is the dog's acquisition date?"); // Prompts user for dog's acquisition date
        String acquisitionDate = scanner.nextLine(); // Assigns acquisition date with user input
        System.out.println("What is the dog's acquisition country?"); // Prompts user for dog's acuisition country
        String acquisitionCountry = scanner.nextLine(); // Assigns dog's acquisition country with user input
        System.out.println("What is the dog's training status?"); // Prompts for dog's training status
        String trainingStatus = scanner.nextLine(); // Assigns training status with user input
        System.out.println("Where is the dog in service?"); // Prompts user for dog's service area
        String inServiceCountry = scanner.nextLine(); // Assigns dog's service area with user input
        System.out.println("Is the dog reserved? (true/false)"); // Prompts user for if dog is reserved
        boolean reserved = scanner.nextBoolean(); // assigns reserved with user input boolean
        // Add the code to instantiate a new dog and add it to the appropriate list
        // Creates dog object
        Dog newDog = new Dog(name, breed, gender, age, weight, acquisitionDate, acquisitionCountry, trainingStatus, reserved, inServiceCountry);
        newDog.setAnimalType("Dog"); // Added set animal type as dog
        dogList.add(newDog); // Adds newly created dog to dogList
        System.out.println("Dog added"); // Prints to let the user know the dog was added to the system
        scanner.nextLine(); // Gets user's next input
    	}
        
    
        // Complete intakeNewMonkey
	//Instantiate and add the new monkey to the appropriate list
        // For the project submission you must also  validate the input
	// to make sure the monkey doesn't already exist and the species type is allowed
        public static void intakeNewMonkey(Scanner scanner) {
        	System.out.println("What is the monkey's name?"); // Prompts user for monkey's name
        	String name = scanner.nextLine(); // Assigns name with user input
        	for(Monkey monkey: monkeyList) { // Checks if monkey is already in monkeyList
        		if(monkey.getName().equalsIgnoreCase(name)) {
                    System.out.println("\n\nThis monkey is already in our system\n\n"); // Prints if monkey is already in the list
                    return; // Returns to menu loop
        		}
        	}
        	System.out.println("What is the monkey's species?"); // Prompts user for monkey's species
        	String species = scanner.nextLine(); // Assigns species with user input
        	// Checks if user input is a valid monkey species
        	if (species.equalsIgnoreCase("Capuchin") || species.equalsIgnoreCase("Guenon") || species.equalsIgnoreCase("Macaque") ||
        	species.equalsIgnoreCase("Marmoset") || species.equalsIgnoreCase("Squirrel Monkey") || species.equalsIgnoreCase("Tamarin")) {
        		System.out.println("What is the monkey's age?"); // Promts user for monkey's age
        		String age = scanner.nextLine(); // Assigns age with user input
        		System.out.println("What is the monkey's gender?"); // Prompts user for monkey's gender
        		String gender = scanner.nextLine(); // Assigns gender with user input
            	System.out.println("What is the monkey's weight?"); // Prompts user for monkey's weight
            	String weight = scanner.nextLine(); // Assigns weight with user input
            	System.out.println("What is the monkey's tail length?"); // Prompts user for monkey's tail length
            	String tailLength = scanner.nextLine(); // Assigns tail length with user input
            	System.out.println("What is the monkey's height?"); // Prompts user for monkey's height
            	String height = scanner.nextLine(); // Assigns height with user input
            	System.out.println("What is the monkey's body length"); // Prompts user for monkey's body length
            	String bodyLength = scanner.nextLine(); // Assigns body length with user input
            	System.out.println("What is the monkey's acquisition date?"); // Prompts user for monkey's acquisition date
            	String acquisitionDate = scanner.nextLine(); // Assigns acquisition date with user input
            	System.out.println("What is the monkey's acquisition country?"); // Prompts user for monkey's acuisition country
            	String acquisitionCountry = scanner.nextLine(); // Assigns monkey's acquisition country with user input
            	System.out.println("What is the monkey's training status?"); // Prompts for monkey's training status
            	String trainingStatus = scanner.nextLine(); // Assigns training status with user input
            	System.out.println("Where is the monkey in service?"); // Prompts user for monkey's service area
            	String inServiceCountry = scanner.nextLine(); // Assigns monkey's service area with user input
            	System.out.println("Is the monkey reserved? (true/false)"); // Prompts user for if monkey is reserved
            	boolean reserved = scanner.nextBoolean(); // assigns reserved with user input boolean
            	// Creates monkey object
            	Monkey newMonkey = new Monkey(name, species, gender, age, weight, tailLength, height, bodyLength, 
            	acquisitionDate, acquisitionCountry,trainingStatus, reserved, inServiceCountry);
            	newMonkey.setAnimalType("Monkey"); // Added set animal type as monkey
            	monkeyList.add(newMonkey); // Adds newly created monkey to monkeyList
            	System.out.println("Monkey added"); // Prints to let the user know the monkey was added to the system
            	scanner.nextLine(); // Gets user's next input
        	}
        	else {
        		System.out.println("Species not allowed."); // Prints if user inputs an invalid species
        		return; // returns to menu loop
        		}
        	   }
        
        // Complete reserveAnimal
        // You will need to find the animal by animal type and in service country
        public static void reserveAnimal(Scanner scanner) {
            System.out.println("What is the animal's type?"); // Prompts user for input of animal's type
            String type = scanner.nextLine(); // Grabs input from user and saves as "type"
            if (type.equalsIgnoreCase("Dog")) { // Loops that iterates if user inputs "Dog"
            	System.out.println("What is the animal's country?"); // Prompts user for input of dog's country
                String country = scanner.nextLine(); // Grabs input from user and saves as "country"
            	for (Dog dog: dogList) { // Scans through array list dogList to find matching user inputted attributes
            		if (dog.getAnimalType().equalsIgnoreCase(type) && (dog.getInServiceLocation().equalsIgnoreCase(country))) {
            			dog.setReserved(true); // Updates animal's reserved stats to true
            			System.out.println("Reserved status updated."); // Prints to let the user know the reserved status was updated
            			break; // Breaks the loop
            		}
            		else {
            			System.out.println("No animal of that type and location available"); // Prints if dogs with matching attributes is found
            			break; // Breaks the loop
            		}
            	}	
            }
            else if (type.equalsIgnoreCase("Monkey")) { // Loop that iterates if user inputs "Monkey"
            	System.out.println("What is the animal's country?"); // Prompts the user for monkey's country
                String country = scanner.nextLine(); // Grabs input from user and saves as "country"
            	for (Monkey monkey: monkeyList) { // Scans through array list monkeyList to find matching inputted attributes
            		if (monkey.getAnimalType().equalsIgnoreCase(type) && (monkey.getInServiceLocation().equalsIgnoreCase(country))) {
            			monkey.setReserved(true); // Updates monkey's reserve status to true
            			System.out.println("Reserved statues updated."); // Prints to let the user know the monkey's reserve status was updated
            			break; // Breaks the loop
            		}
            		else {
            			System.out.println("No animal of that type and location available"); // Prints if no monkey's matching attributes is found
            			break; // Breaks the loop
            		}
            	}
            }
            else {
            	System.out.println("No animal of that type available."); // Prints if user inputs an invalid animal type
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
        public static void printAnimals(String userInput) { // Added an argument to printAnimals so that the method knows which loop to iterate
            if (userInput.equals("4")) { // Loop that iterates if user's input was "4" in the main menu
            	for (int i = 0; i < dogList.size(); ++i) { // Iterates over doglist and prints each dog's information
            		System.out.println("Dog " + (i + 1) + ":");
            		System.out.println("Name: " + dogList.get(i).getName());
            		System.out.println("Breed: " + dogList.get(i).getBreed());
            		System.out.println("Age: " + dogList.get(i).getAge());
            		System.out.println("Gender: " + dogList.get(i).getGender());
            		System.out.println("Weight: " + dogList.get(i).getWeight());
            		System.out.println("Acquisition Date: " + dogList.get(i).getAcquisitionDate());
            		System.out.println("Acquisition Country: " + dogList.get(i).getAcquisitionLocation());
            		System.out.println("Training Status: " + dogList.get(i).getTrainingStatus());
            		System.out.println("Service Country: " + dogList.get(i).getInServiceLocation());
            		System.out.println("Reserved Status: " + dogList.get(i).getReserved());
            		System.out.println("");
            	}
            }
            else if (userInput.equals("5")) { // Loop that iterates if user inputs "5" in the main menu
            	for (int i = 0; i < monkeyList.size(); ++i) { // Loop that prints each monkey's information
            		System.out.println("Monkey " + (i + 1) + ":");
            		System.out.println("Name: " + monkeyList.get(i).getName());
            		System.out.println("Species: " + monkeyList.get(i).getSpecies());
            		System.out.println("Age: " + monkeyList.get(i).getAge());
            		System.out.println("Gender: " + monkeyList.get(i).getGender());
            		System.out.println("Weight: " + monkeyList.get(i).getWeight());
            		System.out.println("Height: " + monkeyList.get(i).getHeight());
            		System.out.println("Tail Length: " + monkeyList.get(i).getTailLength());
            		System.out.println("Body Length: " + monkeyList.get(i).getBodyLength());
            		System.out.println("Acquisition Date: " + monkeyList.get(i).getAcquisitionDate());
            		System.out.println("Acquisition Country: " + monkeyList.get(i).getAcquisitionLocation());
            		System.out.println("Training Status: " + monkeyList.get(i).getTrainingStatus());
            		System.out.println("Service Country: " + monkeyList.get(i).getInServiceLocation());
            		System.out.println("Reserved Status: " + monkeyList.get(i).getReserved());
            		System.out.println("");
            	}
            }
            else if (userInput.equals("6")) { // Loop that iterates if user inputs "6" in the main menu
            	// Loop that prints all animals that are "in service" and their information
            	for (int i = 0; i < dogList.size(); ++i) { // Loops over dog array list
            		if (dogList.get(i).getTrainingStatus().equals("in service")) { // Checks if dog is in service and prints accordingly
            			System.out.println("Dog " + (i + 1) + ":");
            			System.out.println("Name: " + dogList.get(i).getName());
            			System.out.println("Breed: " + dogList.get(i).getBreed());
            			System.out.println("Age: " + dogList.get(i).getAge());
            			System.out.println("Gender: " + dogList.get(i).getGender());
            			System.out.println("Weight: " + dogList.get(i).getWeight());
            			System.out.println("Acquisition Date: " + dogList.get(i).getAcquisitionDate());
            			System.out.println("Acquisition Country: " + dogList.get(i).getAcquisitionLocation());
            			System.out.println("Training Status: " + dogList.get(i).getTrainingStatus());
            			System.out.println("Service Country: " + dogList.get(i).getInServiceLocation());
            			System.out.println("Reserved Status: " + dogList.get(i).getReserved());
            			System.out.println("");
            		}
            	}
            	for (int i = 0; i < monkeyList.size(); ++i) { // Loops over monkey array list
            		if (monkeyList.get(i).getTrainingStatus().equals("in service")) { // Checks if monkey is "in service" and prints accordingly
            			System.out.println("Monkey " + (i + 1) + ":");
            			System.out.println("Name: " + monkeyList.get(i).getName());
            			System.out.println("Species: " + monkeyList.get(i).getSpecies());
            			System.out.println("Age: " + monkeyList.get(i).getAge());
            			System.out.println("Gender: " + monkeyList.get(i).getGender());
            			System.out.println("Weight: " + monkeyList.get(i).getWeight());
            			System.out.println("Height: " + monkeyList.get(i).getHeight());
            			System.out.println("Tail Length: " + monkeyList.get(i).getTailLength());
            			System.out.println("Body Length: " + monkeyList.get(i).getBodyLength());
            			System.out.println("Acquisition Date: " + monkeyList.get(i).getAcquisitionDate());
            			System.out.println("Acquisition Country: " + monkeyList.get(i).getAcquisitionLocation());
            			System.out.println("Training Status: " + monkeyList.get(i).getTrainingStatus());
            			System.out.println("Service Country: " + monkeyList.get(i).getInServiceLocation());
            			System.out.println("Reserved Status: " + monkeyList.get(i).getReserved());
            			System.out.println("");
            		}
            	}
            }
        }
}
