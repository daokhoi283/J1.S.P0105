
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class ValidData {
    Scanner sc = new Scanner(System.in);
    public int inputInt(String msg){
        while (true) {            
            try {
                System.out.print(msg);
                int input = Integer.parseInt(sc.nextLine());
                if(input < 1){
                System.out.println("Invalid input data, please re-enter!");
                continue;
            }
                return input;
            } catch (NumberFormatException e) {
                System.out.println("Input data must a number, please re-enter!");
            }
        }
    }
    public double inputDouble(String msg){
        while (true) {            
            try {
                System.out.print(msg);
                double input = Double.parseDouble(sc.nextLine());
                if(input < 1){
                System.out.println("Invalid input data, please re-enter!");
                continue;
            }
                return input;
            } catch (NumberFormatException e) {
                System.out.println("Input data must a number, please re-enter!");
            }
        }
    }
    public int inputChoice(int min, int max){
        while (true) {
            int input = inputInt("Enter your choice: ");
            if(input < min || input > max){
                System.out.println("Your choice must from " + min + " to " + max + ", please re-enter!");
                continue;
            }
            return input;
        }
    }
    public String inputString(String msg){
        while (true) {
            System.out.print(msg);
            String input = sc.nextLine();
            if(input.isEmpty()){
                System.out.println("Input data can not empty, please re-enter!");
                continue;
            }
            return input;
        }
    }
    public String isDuplicate(ProductList p){
        while (true) {       
            boolean check = false;
            String ID = inputString("Enter Product ID: ");
            for(Products p1: p){
            if(p1.getID().contains(ID)){
                check = true;
                System.out.println("Product ID already exist, please re-enter!");
            }
        }
            if(!check){
                return ID;
            }
        }
    }
    public String isDuplicateKepper(ArrayList<Storekeeper> S){
        while (true) {       
            boolean check = false;
            String ID = inputString("Enter Storekeeper ID: ");
            for(Storekeeper st: S){
            if(st.getID().contains(ID)){
                check = true;
                System.out.println("Product ID already exist, please re-enter!");
            }
        }
            if(!check){
                return ID;
            }
        }
    }
    public String isNotDuplicate(ProductList p){
        while (true) {        
            String ID = inputString("Enter Product ID you want to update: ");
            for(Products p1: p){
            if(p1.getID().contains(ID)){ 
                return ID;
            }
        }
            System.out.println("Product ID does not exist, please re-enter!");
        }
    }
    public String validDate(String msg){
        while (true) {           
            SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
            try {
                String date = inputString(msg);
                sdf.setLenient(false);
                sdf.parse(date);  
                return  date;
            } catch (Exception e) {
                System.out.println("Input date not valid, please re-enter!"); 
            } 
        }
    }
    public int compareDate(String date1, String date2){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
        try {
            Date d1 = sdf.parse(date1);
            Date d2 = sdf.parse(date2);
            return d1.compareTo(d2);
        } catch (Exception e) {
            return 0;
        }
    }
}
