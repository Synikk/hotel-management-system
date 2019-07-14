import java.util.ArrayList;
import java.util.Random;

public class Guest {

    int uid;
    protected String firstName;
    String lastName;
    String creditCardNumber;
    ArrayList<Integer> idList = new ArrayList<>();


    public Guest(String firstName, String lastName, String creditCardNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.creditCardNumber = creditCardNumber;

        //Generates a random ID then invokes the method to check that the ID is not already in the guestlist

        Random random = new Random();
        int newId = random.nextInt(1000);

        while (uniqueIdCheck(newId)== false){
            newId = random.nextInt(1000);
        }

        this.uid = newId;
        idList.add(newId);

    }

    public boolean uniqueIdCheck(int newId){
        for (Integer id : idList){
            if (id.intValue() == newId){
                return false;
            }
        }
        return true;
    }

    public int getUid() {
        return uid;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

}
