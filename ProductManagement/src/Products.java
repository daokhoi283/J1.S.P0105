public class Products {
    String ID, Name, Location, exDate, manuDateString, Category, Storekeeper, reDate;
    Double price; 
    public Products(){};
    public Products(String ID, String Name, String Location, String exDate, String manuDateString, String Category, String Storekeeper, String reDate, Double price) {
        this.ID = ID;
        this.Name = Name;
        this.Location = Location;
        this.exDate = exDate;
        this.manuDateString = manuDateString;
        this.Category = Category;
        this.Storekeeper = Storekeeper;
        this.reDate = reDate;
        this.price = price;
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

    public String getExDate() {
        return exDate;
    }

    public void setExDate(String exDate) {
        this.exDate = exDate;
    }

    public String getManuDateString() {
        return manuDateString;
    }

    public void setManuDateString(String manuDateString) {
        this.manuDateString = manuDateString;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }

    public String getStorekeeper() {
        return Storekeeper;
    }

    public void setStorekeeper(String Storekeeper) {
        this.Storekeeper = Storekeeper;
    }

    public String getReDate() {
        return reDate;
    }

    public void setReDate(String reDate) {
        this.reDate = reDate;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    } 

    @Override
    public String toString() {
        return "ID= " + ID + ", Name= " + Name + ", Location= " + Location + ", ExpiryDate= " + exDate + ", Date of manufacture= " + manuDateString + ", Category= " + Category + ", Storekeeper= " + Storekeeper + ", ReceiptDate= " + reDate + ", Price= " + price;
    }
    
}
