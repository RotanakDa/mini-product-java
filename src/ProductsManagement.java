import model.Student;
import utils.RenderTable;
import model.Product;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductsManagement {
    static void pressEnterKey(){
        Scanner input = new Scanner(System.in);
        System.out.println("====================== Press Enter to Continue =====================");
        input.nextLine();
    }
    public static void main(String[] args) {
        System.out.println();
        System.out.println(" ██████╗███████╗████████╗ █████╗ ██████╗          ██╗ █████╗ ██╗   ██╗ █████╗ \n" +
                        "██╔════╝██╔════╝╚══██╔══╝██╔══██╗██╔══██╗         ██║██╔══██╗██║   ██║██╔══██╗\n" +
                        "██║     ███████╗   ██║   ███████║██║  ██║         ██║███████║██║   ██║███████║\n" +
                        "██║     ╚════██║   ██║   ██╔══██║██║  ██║    ██   ██║██╔══██║╚██╗ ██╔╝██╔══██║\n" +
                        "╚██████╗███████║   ██║   ██║  ██║██████╔╝    ╚█████╔╝██║  ██║ ╚████╔╝ ██║  ██║\n" +
                        " ╚═════╝╚══════╝   ╚═╝   ╚═╝  ╚═╝╚═════╝      ╚════╝ ╚═╝  ╚═╝  ╚═══╝  ╚═╝  ╚═╝\n");
                Scanner input = new Scanner(System.in);
        int option;
//        List<Student> studentList = new ArrayList<>() {{
//            add(new Student(1001, "james", "male", "java"));
//            add(new Student(1002, "Bona", "male", "web"));
//            add(new Student(1003, "Chan", "male", "java"));
//            add(new Student(1004, "Chhunhy", "female", "web"));
//        }};

        List<Product> productList = new ArrayList<>() {{
//            add(new Product(1, "Coca", 10, 100));
//            add(new Product(2, "Fanta", 12, 50));
//            add(new Product(3, "Sprite", 14, 40));
//            add(new Product(4, "Pepsi", 15, 20));
        }};


        List<String> welcomeMenu = new ArrayList<>(List.of("Display ","Write ","Search ", "Update ", "Delete ","First","Previous ","Goto ","Set row ", "Help ","Exit "));

//        Student student = new Student();
//        Product product = new Product();

        do {
            RenderTable.renderMenu(welcomeMenu);
            System.out.println(">>> Choose your option : ");
            option = input.nextInt();

            switch (option) {
                case 1:
                    RenderTable.renderProducts(productList);

                    break;
                case 2:
                    productList.add(new Product().input(input));
                    break;
                case 3:
//                    not working
                    System.out.println("Search A Product");

                    System.out.println("Enter Product Name to search:");
                    String nameToSearch = input.nextLine();
                    input.nextInt();
                    for (Product product : productList){
                        if (product.getName().equalsIgnoreCase(nameToSearch)){

                            System.out.println("Item Found:");
                            System.out.println("ID: " + product.getId() +
                                    ", Name: " + product.getName() +
                                    ", UnitPrice: $" + product.getUnitPrice() +
                                    ", Qty: " + product.getQty());
                        }
                        System.out.println("Product not found");
                    }
                    break;
                case 4:
                    System.out.println("Updating");

                    boolean idIsExist = false;
                    System.out.println("Enter Product ID to updating:");
                    int editByID = input.nextInt();
                    for (Product product : productList){
                        if(product.getId() == editByID){
                            idIsExist = true;
                            System.out.println("---------------Enter new account information-----------");
                            System.out.print("Input new Product Name : ");
                            input.nextLine();
                            product.setName(input.nextLine()) ;
                            System.out.print("Input new Product UnitPrice : ");
                            product.setUnitPrice(input.nextDouble()); ;
                            System.out.print("Input new Product Qty : ");
                            product.setQty(input.nextInt());
                            System.out.println("Product with ID : " + editByID + " has updated successfully.");
                        }
                    }if(!idIsExist) {
                    System.out.println("Wrong ID, Please input ID again.");
                }
                    break;
                case 5:
                    System.out.println("Deleting");
                        System.out.println("Enter Product ID to delete: ");
                        int idToDelete = input.nextInt();
                            for (Product product : productList){
                                if (product.getId() == idToDelete){
                                    productList.remove(new Product());
                                    System.out.println("Product "+ idToDelete + " deleted");
                                    return;
                                }
                                System.out.println("Product not found");
                            }
                    break;

                case 6:
                    System.out.println("First");
                    break;
                case 7:
                    System.out.println("Previous");
                    break;
                case 8:
                    System.out.println("Goto");
                    break;
                case 9:
                    System.out.println("Set row ");
                    break;


                case 10:
                    RenderTable.renderHelp();
                    break;
                case 11:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Choice!!! Choose again from 1 - 11");
                    break;

            }
            pressEnterKey();

        } while (option != 11);
    }
}

