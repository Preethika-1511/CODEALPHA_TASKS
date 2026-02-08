import java.util.Scanner;

class Room {
    int roomNo;
    String type;
    boolean booked;

    Room(int roomNo, String type) {
        this.roomNo = roomNo;
        this.type = type;
        this.booked = false;
    }
}

public class HotelReservationSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Room[] rooms = {
            new Room(101, "Standard"),
            new Room(102, "Deluxe"),
            new Room(103, "Suite")
        };

        while (true) {
            System.out.println("\n1. View Rooms");
            System.out.println("2. Book Room");
            System.out.println("3. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                for (Room r : rooms) {
                    System.out.println("Room " + r.roomNo + " | " + r.type +
                            " | " + (r.booked ? "Booked" : "Available"));
                }

            } else if (choice == 2) {
                System.out.print("Enter room number: ");
                int num = sc.nextInt();

                boolean found = false;
                for (Room r : rooms) {
                    if (r.roomNo == num && !r.booked) {
                        r.booked = true;
                        found = true;
                        System.out.println("Room booked successfully!");
                        break;
                    }
                }
                if (!found)
                    System.out.println("Room not available!");

            } else {
                break;
            }
        }
        sc.close();
    }
}