package utils;

import model.Product;
import model.Student;
import org.nocrala.tools.texttablefmt.BorderStyle;
import org.nocrala.tools.texttablefmt.CellStyle;
import org.nocrala.tools.texttablefmt.ShownBorders;
import org.nocrala.tools.texttablefmt.Table;

import java.util.ArrayList;
import java.util.List;

public class RenderTable {
    public static void renderMenu(List<String> menu){
        CellStyle cellStyle = new CellStyle(CellStyle.HorizontalAlign.center);
        Table table = new Table(2, BorderStyle.UNICODE_BOX_DOUBLE_BORDER, ShownBorders.SURROUND_HEADER_FOOTER_AND_COLUMNS);

        table.setColumnWidth(0 ,5,6);
        table.setColumnWidth(1,25,45);

        table.addCell("No",cellStyle);
        table.addCell("Operation",cellStyle);

        for(int i = 0; i < menu.size() ; i++){
            table.addCell((i+1)+"",cellStyle);
            table.addCell(menu.get(i),cellStyle);
        }

        System.out.println(table.render());
    }
//    public static void renderStudents(List<Student> studentList){
//        CellStyle cellStyle = new CellStyle(CellStyle.HorizontalAlign.center);
//        Table table = new Table(5, BorderStyle.UNICODE_BOX_DOUBLE_BORDER, ShownBorders.SURROUND_HEADER_FOOTER_AND_COLUMNS);
//
//        // render menu
//        List<String> studentMenu = new ArrayList<>(List.of("" +
//                "ID", "Name","Unit Price","Qty","Imported Date"));
//
//        table.setColumnWidth(1,25,25);
//        table.setColumnWidth(2,20,25);
//        table.setColumnWidth(3,20,25);
//        table.setColumnWidth(4,20,25);
//        for(String menu : studentMenu){
//            table.addCell(menu);
//        }
//
//        for (Student student : studentList){
//            table.addCell(student.getId()+"");
//            table.addCell(student.getName());
//            table.addCell(student.getGender());
//            table.addCell(student.getClassroom());
//        }
//
//        table.addCell("Total record:",3);
//        table.addCell(studentList.size()+" ",2);
//
//        System.out.println(table.render());
//    }
    public static void renderProducts(List<Product> productList){
        CellStyle cellStyle = new CellStyle(CellStyle.HorizontalAlign.center);
        Table table = new Table(5, BorderStyle.UNICODE_BOX_DOUBLE_BORDER, ShownBorders.SURROUND_HEADER_FOOTER_AND_COLUMNS);

        // render menu
        List<String> productMenu = new ArrayList<>(List.of("" +
                "ID", "Name","Unit Price","Qty","Imported Date"));

        table.setColumnWidth(1,25,25);
        table.setColumnWidth(2,20,25);
        table.setColumnWidth(3,20,25);
        table.setColumnWidth(4,20,25);
        for(String menu : productMenu){
            table.addCell(menu);
        }

        for (Product product : productList){
            table.addCell(product.getId()+"");
            table.addCell(product.getName());
            table.addCell(product.getUnitPrice()+"");
            table.addCell(product.getQty()+"");
            table.addCell(product.getDate()+"");
        }

        table.addCell("Total record:",2);
        table.addCell(productList.size()+" ",3);

        System.out.println(table.render());
    }

    public static void showProductFirst(List<Product> productList){
        CellStyle cellStyle = new CellStyle(CellStyle.HorizontalAlign.center);
        Table table = new Table(1, BorderStyle.UNICODE_BOX);

        table.addCell("ID            :"+ new Product().getId());
        table.addCell("ProductName   :"+ new Product().getName());
        table.addCell("Unit Price    :"+ new Product().getUnitPrice());
        table.addCell("Qty           :"+ new Product().getQty());
        table.addCell("Imported Date :"+ new Product().getDate());

        System.out.println(table.render());
    }

    public static void renderHelp(){
        CellStyle cellStyle = new CellStyle(CellStyle.HorizontalAlign.center);
        Table table = new Table(2, BorderStyle.UNICODE_BOX_DOUBLE_BORDER, ShownBorders.SURROUND_HEADER_AND_COLUMNS);

        table.addCell("No. ");
        table.addCell("Commard ");

        table.addCell("1. ");
        table.addCell("(Display) all record of products");
        table.addCell("2. ");
        table.addCell("(Write) Add new product");
        table.addCell("3. ");
        table.addCell("(Search) search product by name");
        table.addCell("4. ");
        table.addCell("(Update) update data");
        table.addCell("5. ");
        table.addCell("(Delete) delete data");
        table.addCell("6. ");
        table.addCell("(First) display first page");
        table.addCell("7. ");
        table.addCell("(Previous) display previous page");
        table.addCell("8. ");
        table.addCell("(Goto) go to page by ");
        table.addCell("9. ");
        table.addCell("(Set row)  set row that want to show");
        table.addCell("10. ");
        table.addCell("(Help)  display Help menu");


        System.out.println(table.render());
    }
}
