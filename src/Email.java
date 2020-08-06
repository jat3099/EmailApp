import java.util.Scanner;

public class Email {

    private String name;
    private String lastName;
    private String password;
    private String deparment;
    private String email;
    private int defaultPasswordLength =7;
    private int mailBoxCapacity =500;
    private String alternativeEmail;
    private String companySuffix= "StrakIndustry.com";

    //Constructor to recevie the first name and last name
    public Email(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
        System.out.println("EMAIL CREATED: " + this.name+" " + this.lastName+" ");

        //call the method asking for the deparment
        this.deparment = setDepartment();
        System.out.println("Deparment choosen: "+ this.deparment);

        //call a method that return the password
        this.password = passwordGenerator(defaultPasswordLength);
        System.out.println("Your choosen password is " + this.password);

        //combine elements to generate email
        email = name.toLowerCase() + "." + lastName.toLowerCase() +"@"+deparment+"."+ companySuffix;
        System.out.println("Your email is: "+ email);

    }

    //ask for the deparment

    private String setDepartment(){
        System.out.print("Enter the deparment\n1 for sales\n2 for Development\n3 for accounting\nEnter deparment code: ");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if(depChoice ==1){return "sales"; }
        else if(depChoice ==2){return "dev";}
        else if(depChoice == 3){return "accounting";}
        else {return "nothing";}

    }


    //generate a random password
    private String passwordGenerator(int length){
        String passwordSet = "QWERTYUIOPLKJHGFDSAZXCVBNM1234567890!@#$%^&*&";
        char[] password = new char[length];
        //generating a random number

        for(int i=0; i<length; i++){

           int ran= (int) (Math.random() * passwordSet.length());
           password [i] = passwordSet.charAt(ran);

        }
        return new String(password);
    }

    //set the mailbox capacity
    public void setMailBoxCapacity(int capacity){
        this.mailBoxCapacity = capacity;
    }

    //set an alternative email
    public void setAlternativeEmail(String alEmail){
        this.alternativeEmail = alEmail;
    }
    //change the password option
    public void changePassWord(String password){

    }

    public int getMailBoxCapacity(){
        return mailBoxCapacity;
    }

    public String getalternateEmail(){
        return alternativeEmail;
    }

    public String getPassword(){
        return password;
    }


}
