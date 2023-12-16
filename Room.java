package EscapeRoom;

public class Room {
	private String name;
    private String description;
    private boolean isLocked;
    private Item keyItem;

    public Room(String name, String description) {
        this.name = name;
        this.description = description;
        this.isLocked = true;
        this.keyItem = null;
    }

    public void unlock(Item key) {
        if (key == keyItem) {
            isLocked = false;
            System.out.println(name + " is now unlocked!");
        } else {
            System.out.println("The key doesn't work here.");
        }
    }

    public boolean isLocked() {
        return isLocked;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setKeyItem(Item item) {
        this.keyItem = item;
    }
}
