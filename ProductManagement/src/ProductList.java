import java.util.ArrayList;
public class ProductList extends ArrayList<Products>{
    ValidData vd = new ValidData();
    ArrayList<Storekeeper> store = new ArrayList<>();
    public void addStorekeeper(){ 
        String ID = vd.isDuplicateKepper(store);
        String Name = vd.inputString("Enter Storekeeper Name: ");
        String Location = vd.inputString("Enter Storekeeper Location: ");
        int age = vd.inputInt("Enter Storekeeper Age: ");
        store.add(new Storekeeper(ID, Name, Location, age)); 
        System.out.println("Added storekeeper successful!"); 
    } 
    public void addProduct(){
        String ID = vd.isDuplicate(this); 
        String Name = vd.inputString("Enter Product Name: ");
        String Location = vd.inputString("Enter Product Location: ");
        double price = vd.inputDouble("Enter Product Price: "); 
        String exDate = vd.validDate("Enter Expiry Date: ");
        String manuDate = vd.validDate("Enter Date of manufacture: ");
        String cate = vd.inputString("Enter Product Category: ");
        String keeperID = vd.inputString("Enter Storekeeper ID: ");
        String reDate = vd.validDate("Enter Product ReceiptDate: ");
        add(new Products(ID, Name, Location, exDate, manuDate, cate, keeperID, reDate, price));
        System.out.println("Added products successful!"); 
    }
    public void UpdateProduct(){
        String ID = vd.isNotDuplicate(this);
        String Name = vd.inputString("Enter New Product Name: ");
        String Location = vd.inputString("Enter New Product Location: ");
        double price = vd.inputDouble("Enter New Product Price: "); 
        String exDate = vd.validDate("Enter New Expiry Date: ");
        String manuDate = vd.validDate("Enter New Date of manufacture: ");
        String cate = vd.inputString("Enter New Product Category: ");
        String keeperID = vd.inputString("Enter New Storekeeper ID: ");
        String reDate = vd.validDate("Enter New Product ReceiptDate: ");
        Products p = new Products();
        p.setName(Name);
        p.setLocation(Location);
        p.setPrice(price);
        p.setExDate(exDate);
        p.setManuDateString(manuDate);
        p.setCategory(cate);
        p.setStorekeeper(keeperID);
        p.setReDate(reDate);
        System.out.println("Updated products successful!"); 
    }
    public void seachbyName(){
        String Name = vd.inputString("Enter product name you want to search: ");
        boolean check = false;
        for(Products p: this){
            if(p.getName().equals(Name)){
                check = true;
                System.out.println(p);  
            }
        }
        if(!check){ 
           System.out.println("Product does not exist!");
        } 
    }
    public void seachbyCategory(){
        String category = vd.inputString("Enter product category you want to search: ");
        boolean check = false;
        for(Products p: this){
            if(p.getCategory().equals(category)){
                check = true;
                System.out.println(p);   
            }   
        }
        if(!check){ 
           System.out.println("Product does not exist!");
        } 
    }
    public void seachbyStorekeeper(){
        String ID = vd.inputString("Enter storekeeper ID you want to search: ");
        boolean check = false;
        for(Products p: this){
            if(p.getStorekeeper().equals(ID)){
                check = true;
                System.out.println(p);  
            }  
        }
        if(!check){ 
           System.out.println("Product does not exist!");
        } 
    }
    public void seachbyReDate(){
        String reDate = vd.inputString("Enter receiptDate you want to search: ");
        boolean check = false;
        for(Products p: this){
            if(p.getReDate().equals(reDate)){
                check = true;
                System.out.println(p); 
            }
        }
        if(!check){ 
           System.out.println("Product does not exist!");
        } 
    }
    public void search(){
        System.out.println("Please choose 1 to Search by Name, 2 to Search by Category, 3 to Search by StorekeeperID and 4 to Search by ReceipDate");
        int choice = vd.inputChoice(1, 4);
        switch(choice){
            case 1:
                seachbyName();
                break;
            case 2:
                seachbyCategory();
                break;
            case 3:
                seachbyStorekeeper();
                break;
            case 4:
                seachbyReDate();
                break;
        }
    }
    public void disPlay(){
        for(Products p : this){
            System.out.println(p);
        }
    }
    public void sortByExDate(){
        for(int i=0; i < size(); i++){
            for(int j = i + 1; j < size(); j++){
                if(vd.compareDate(this.get(i).getExDate(), this.get(j).getExDate()) > 0){
                    Products p = this.get(i);
                    this.set(i, this.get(j));
                    this.set(j, p);
                }
            }
        }
        disPlay();
    }
    public void sortByManuDate(){
        for(int i=0; i < size(); i++){
            for(int j = i + 1; j < size(); j++){
                if(vd.compareDate(this.get(i).getManuDateString(), this.get(j).getManuDateString()) > 0){
                    Products p = this.get(i);
                    this.set(i, this.get(j));
                    this.set(j, p);
                }
            }
        }
        disPlay();
    }
    public void sort(){
        System.out.println("Please choose 1 to Sort by Expiry Date and 2 to Sort by Date of manufacture");
        int choice = vd.inputChoice(1, 2);
        switch(choice){
            case 1:
                sortByExDate();
                break;
            case 2:
                sortByManuDate();
                break; 
        }
    }
}
