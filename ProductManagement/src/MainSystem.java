public class MainSystem {
    public static void disPlayMenu(){
        System.out.println("Main menu: ");
        System.out.println("\t1. Add Storekeeper");
        System.out.println("\t2. Add product");
        System.out.println("\t3. Update product");
        System.out.println("\t4. Search product by Name, Category, Storekeeper, ReceiptDate");
        System.out.println("\t5. Sort product by Expiry date, Date of manufacture");
        System.out.println("\t6. Quite");
    }
    public static void main(String[] args) {
        ValidData vd = new ValidData();
        ProductList p = new ProductList();
        while (true) {            
            disPlayMenu();
            int choice = vd.inputChoice(1, 6);
            switch(choice){
                case 1:
                    p.addStorekeeper();
                    break;
                case 2:
                    p.addProduct();
                    break;
                case 3:
                    p.UpdateProduct();
                    break;
                case 4:
                    p.search();
                    break;
                case 5:
                    p.sort();
                    break;
                case 6:
                    return;
            }
        }
}
}
