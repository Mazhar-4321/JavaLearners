package package05Dec22;

public class Main {
    public static void main(String[] args) {
        create1DArrayExample();
        print1DArrayExample();
        create2DArrayAndPrintExample();
        printReverseOfAnArrayExample();
        printAlternateNumbersOfArrayExample();
    }

    static void printAlternateNumbersOfArrayExample() {
        System.out.println("Printing Alternate Numbers Of An Array");
        int[] arr = {1, 2, 3, 5, 6, 9};
        int i = 0;
        while (i < arr.length) {
            System.out.print(arr[i] + " ");
            i = i + 2;
        }
        System.out.println();
    }

    static void printReverseOfAnArrayExample() {
        System.out.println("Reverse ");
        int[] arr = {4, 5, 2, 1, 3};
        int i = arr.length - 1;
        while (i >= 0) {
            System.out.print(arr[i] + " ");
            i = i - 1;
        }
        System.out.println();
    }

    static void create2DArrayAndPrintExample() {
        System.out.println("2D Array Printing");
        int[][] arr = {{1, 2}, {4, 5}, {6, 7}};
        int noOfColumns = arr[0].length;//arr[0].length
        int noOfRows = arr.length;//arr.length
        System.out.println("No Of Rows=" + noOfRows + ",No Of Columns=" + noOfColumns);
        int i = 0, j = 0;
        while (i < noOfRows) {
            j = 0;
            while (j < noOfColumns) {
                System.out.print(arr[i][j] + " ");
                j = j + 1;
            }
            i = i + 1;
            System.out.println();
        }

    }

    static void print1DArrayExample() {
        System.out.println("Printing 1 D Array Elements");
        int[] arr = {12, 29, 13, 44, 5};
        int i = 0;
        while (i < arr.length) {
            System.out.print(arr[i] + " ");
            i = i + 1;
        }
        System.out.println();
    }

    static void create1DArrayExample() {
        int[] arr = {1, 2, 3, 4, 5};
    }
}
