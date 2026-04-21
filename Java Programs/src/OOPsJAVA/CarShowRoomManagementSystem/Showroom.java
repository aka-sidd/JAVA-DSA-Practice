package OOPsJAVA.CarShowRoomManagementSystem;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Showroom implements utility {
    String showroom_name;
    String showroom_address;
    int total_Employees;
    int total_cars_in_Stock = 0;
    String manager_name;

    @Override
    public void get_details(){
        System.out.println("ShowRoom Name: " + showroom_name);
        System.out.println("ShowRoom Address:" + showroom_address);
        System.out.println("Manager Name: " + manager_name);
        System.out.println("Total Employees: " + total_Employees);
        System.out.println("Total Cars in Stock: " + total_cars_in_Stock);
    }
    @Override
    public void set_details(){
        Scanner sc = new Scanner(System.in);
        System.out.println("=========================== *** ENTER SHOWROOM DETAILS *** ===========================");
        System.out.println();
        System.out.println("SHOWROOM NAME: ");
        showroom_name = sc.nextLine();
        System.out.println("SHOWROOM ADDRESS");
        showroom_address = sc.nextLine();
        System.out.println("MANAGER NAME: ");
        manager_name = sc.nextLine();
        System.out.println("TOTAL NUMBER OF EMPLOYEES: ");
        total_Employees = sc.nextInt();
        System.out.println("TOTAL CARS IN STOCK: ");
        total_cars_in_Stock = sc.nextInt();


    }

}


