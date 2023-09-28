public class Storekeeper {
    String ID, Name, Location;
    int age; 
    public Storekeeper(String ID, String Name, String Location, int age) {
        this.ID = ID;
        this.Name = Name;
        this.Location = Location;
        this.age = age;
    } 
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Storekeeper{" + "ID=" + ID + ", Name=" + Name + ", Location=" + Location + ", age=" + age + '}';
    }
    
    
}
