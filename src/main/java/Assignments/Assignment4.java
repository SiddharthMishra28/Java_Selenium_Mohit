package Assignments;

public class Assignment4 {
    // SUPERMART
    // CREATE A 2 Dimensional Array of Products with below Data
    // | id | name | price | description | healthIndex |
    // | 1  | kashmir apple | 100/kg | .. .. | High |
    // | 2  | Nagpur Orange | 60/Kg  | ......| Medium|
    // | 3  | Maroon Jam    | 20/Kg  | ......| LOW  |
    // PRINT THE TOTAL AMOUNT ORDERED BY A CUSTOMER
    // For ex - 4Kg Apple + 1KG Orange + 1KG Jam - Print Total
    // Average Price of the Cart.
    // Average Health Index - LOW
    public static void main(String[] args) {
        String[][] products = new String[][] {
                {"id", "name", "price", "weight", "healthIndex"},
                {"1", "apple", "80", "5", "high"},
                {"2", "orange", "100", "3", "medium"},
                {"3", "jam","70", "4", "low"}
        };
        int highestQty;
        int highestQtyRow = 0;
        for(int i=2; i<products.length; i++) {
            int qtyCurrentRow = Integer.parseInt(products[i][3]);
            int qtyPreviousRow = Integer.parseInt(products[i-1][3]);
            if(qtyCurrentRow > qtyPreviousRow) {
                highestQty =   qtyCurrentRow;
                highestQtyRow = i;
            }else {
                highestQty = qtyPreviousRow;
                highestQtyRow = i-1;
            }
        }
        System.out.println("Health Index of Cart : "+products[highestQtyRow][4]);
    }
}
