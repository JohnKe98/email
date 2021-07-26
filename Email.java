public class Email {
    private String firstName;
    private String lastName;
    private String department;
    private int mailboxCapacity;
    private String alternateEmail;
    
    //constructer to receive first name and last name
    public Email(String firstName, String lastName){
    this.firstName = firstName;
    this.lastName = lastName;

    System.out.println("EMAIL CREATED:" + this.firstName + " " + this.lastName);
    }

    }

