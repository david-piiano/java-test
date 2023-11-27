public class PersonInfo {
    private String firstName;
    private String lastName;
    private String SSN;

    public PersonInfo(String firstName, String lastName, String SSN) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.SSN = SSN;
    }

    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Usage: java PersonInfo <firstName> <lastName> <SSN>");
            System.exit(1);
        }

        PersonInfo person = new PersonInfo(args[0], args[1], args[2]);
        System.out.println("First Name: " + person.firstName);
        System.out.println("Last Name: " + person.lastName);
        System.out.println("SSN: " + person.SSN);
    }
}
