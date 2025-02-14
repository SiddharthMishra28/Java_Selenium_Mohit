package com.java.core.proceduralprogramming;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        // DATA_TYPE[][] VARIABLE_NAME = new DATA_TYPE[rowSize][colSize];
        String[][] employees = new String[3][6];
        employees[0][0] = "id";
        employees[0][1] = "name";
        employees[0][2] = "salary";
        employees[0][3] = "age";
        employees[0][4] = "email";
        employees[0][5] = "phone";

        employees[1][0] = "1";
        // REST OF THE ROWS

        // DATA_TYPE[][] VARIABLE_NAME = new DATA_TYPE[][]{
        // {"id", "name", "salary", "age", "email", "phone"},
        // {"1", "sid", "2000", "20", "sid@test.com", "2321313"},
        // ....
        // }
        String[][] employee_data = new String[][]{
                {"id", "name", "salary", "age", "email", "phone"},
        //        0,0   0,1      0,2       0,3    0,4      0,5
                {"1", "sid", "2000", "20", "sid@test.com", "2321313"},
        //        1,0   1,1      1,2       1,3    1,4       1,5
                {"2", "mohit", "2000", "20", "mohit@test.com", "1332213"}
        //        2,0   2,1      2,2       2,3    2,4       2,5
        };
//        System.out.println(employee_data[2][5]);

        for(int i=0; i<employee_data.length; i++) {
            for(int j=0; j<employee_data[i].length; j++) {
                System.out.print(employee_data[i][j]+" | ");
            }
            System.out.println();
        }
    }
}
