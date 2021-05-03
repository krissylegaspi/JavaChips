public class Main {

    // Create a new switch statement using char instead of int
    // create a new char variable
    // create a switch statement testing for
    // A, B, C, D, or E
    // display a message if any of these are found and then break
    // Add a default which displays a message saying not found

    public static void main(String[] args) {

        char myChar = 'D';

        switch(myChar) {
            case 'A':
                System.out.println("The char was A");
                break;
            case 'B':
                System.out.println("The char was B");
                break;
            case 'C': case 'D': case 'E':
                System.out.println(myChar + " was found");
                break;
            default:
                System.out.println("Not found.");
                break;
        }
    }
}
