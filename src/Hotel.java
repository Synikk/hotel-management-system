import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hotel {

    String name;
    String address;
    int postcode;
    ArrayList<Guest> guestList;
    ArrayList<Staff> staffList;
    ArrayList<Room> roomList;
    ArrayList<Booking> bookingList;
    int[] singleRoomNumbers;
    int[] doubleRoomNumbers;
    int[] twinDoubleRoomNumbers;
    int[] suiteRoomNumbers;

    public Hotel(String name, String address, int postcode){
        this.name = name;
        this.address = address;
        this.postcode = postcode;
        this.guestList = new ArrayList<>();
        this.staffList = new ArrayList<>();
        this.roomList = new ArrayList<>();
        this.bookingList = new ArrayList<>();

        singleRoomNumbers = new int[]{1,2,3,4,5,6,7,8,9,10};
        doubleRoomNumbers = new int[]{11,12,13,14,15,16,17,18,19,20};
        twinDoubleRoomNumbers = new int[]{21,22,23,24,25,26,27,28};
        suiteRoomNumbers = new int[]{29,30};

        Room singleOne = new Single(1);
        Room singleTwo = new Single(2);
        Room singleThree = new Single(3);
        Room singleFour = new Single(4);
        Room singleFive = new Single(5);
        Room singleSix = new Single(6);
        Room singleSeven = new Single(7);
        Room singleEight = new Single(8);
        Room singleNine = new Single(9);
        Room singleTen = new Single(10);




    }

    public void addGuest(Guest guest){
        guestList.add(guest);
    }

    public void addGuests(List guest){
        guestList.addAll(guest);
    }

    public void printGuestList(){
        for (Guest g : this.guestList){
            System.out.println("UID: " + g.uid);
            System.out.println("Full Name: " + g.firstName + " " + g.lastName);
            System.out.println("Credit Card Number: " + g.creditCardNumber);
            System.out.println();
        }
    }

    public void checkIn( Room room, List guests, int days){
        bookingList.add(new Booking(room,guests,days));
    }

    public void addStaff (Staff staff){
        staffList.add(staff);
    }

    public void printStaffList(){
        for (Staff s : this.staffList){
            System.out.println("Staff ID: " + s.StaffId);
            System.out.println("Full Name: " + s.firstName + " " + s.lastName);
            System.out.println("Role: " + s.role);
        }
    }

}

class Booking {

    public Booking(Room room, List guest, int duration){}
}
