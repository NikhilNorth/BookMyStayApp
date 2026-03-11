class Room {
    String type;
    double price;
    int availableRooms;

    public Room(String type, double price, int availableRooms) {
        this.type = type;
        this.price = price;
        this.availableRooms = availableRooms;
    }

    public void displayRoom() {
        System.out.println("Room Type: " + type);
        System.out.println("Price per night: ₹" + price);
        System.out.println("Available Rooms: " + availableRooms);
        System.out.println("---------------------------");
    }

    public boolean bookRoom() {
        if (availableRooms > 0) {
            availableRooms--;
            return true;
        } else {
            return false;
        }
    }
}