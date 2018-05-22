import java.util.ArrayList;
import java.util.Scanner;

public class PeopleMethods {

    /*Static initialization of ArrayList of people*/
    ArrayList<Person> legendsOfQAC = new ArrayList<>();

    public void populateArray(){
        //People created
        Person ekaterina = new Person("Ekaterina", 23, "Consultant");
        Person liam = new Person("Liam", 23, "Consultant");
        Person chris = new Person("Christopher", 25, "Consultant");
        Person sam = new Person("Sam", 24, "Consultant");
        Person benny = new Person("Benny", 21, "Consultant");
        Person george = new Person("George", 24, "Consultant");
        Person robert = new Person("Robert", 23, "Consultant");
        Person jarrad = new Person("Jarrad", 23, "Consultant");
        Person daryl = new Person("Daryl", 27, "Consultant");
        Person hussein = new Person("Hussein", 22, "Consultant");
        Person tibor = new Person("Tibor", 27, "Consultant");
        Person nawid = new Person("Nawid", 25, "Consultant");
        Person merveille = new Person("Merveille", 23, "Consultant");

        //People added to ArrayList
        legendsOfQAC.add(ekaterina);
        legendsOfQAC.add(liam);
        legendsOfQAC.add(chris);
        legendsOfQAC.add(sam);
        legendsOfQAC.add(benny);
        legendsOfQAC.add(george);
        legendsOfQAC.add(robert);
        legendsOfQAC.add(jarrad);
        legendsOfQAC.add(daryl);
        legendsOfQAC.add(hussein);
        legendsOfQAC.add(tibor);
        legendsOfQAC.add(nawid);
        legendsOfQAC.add(merveille);
    }

    public void printArray(){
        //Loop through people to print all in the ArrayList
        for (Person person : legendsOfQAC) {
            System.out.println(person.toString());
        }
    }

    public void searchArray(){
        //Condition variable initialization for do loop
        Boolean isSearching = true;

        //Do-while loop that scans user input and lets user search the people by name. Exit to stop loop
        do {
            Scanner userInput = new Scanner(System.in);
            String searchString = "Please enter a name to find in the database. 'Exit' to stop searching";
            System.out.println(searchString);
            String userLine = userInput.nextLine();
            if (userLine.equalsIgnoreCase("exit")) {
                isSearching = false;
            } else {
                findPersonByName(userLine, legendsOfQAC);

            }
        } while (isSearching);
    }


    //Search method by name
    public void findPersonByName(String nameToFind, ArrayList<Person> listOfPeople) {
        for (Person person : listOfPeople) {
            if (person.getName().equalsIgnoreCase(nameToFind)) {
                System.out.println(person.toString());
            }

        }
    }



}
