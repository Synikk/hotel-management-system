
public class Staff {

    Number StaffId;
    String firstName;
    String lastName;
    String role;

    public Staff(Number staffId, String firstName, String lastName, String role){
        this.StaffId = staffId;
        this.firstName = firstName;
        this.lastName = lastName;

        if (role.toLowerCase().equals("cleaner") | role.toLowerCase().equals("receptionist") | role.toLowerCase().equals("housekeeper") | role.toLowerCase().equals("cook")){
            this.role = role;
        } else{
            throw new IllegalArgumentException("Valid roles are: cleaner, receptionist, housekeeper, cook");
        }

    }
}
