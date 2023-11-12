package org.fasttrackit.won14.curs7.Homework7.extramile12;

public class ExtraMile {
    public static void main(String[] args) {
        Integer[] myArray = {8, 7, 2, 5, 3, 1};
        Integer target = 10;

        for (int i = 0; i < myArray.length - 1; i++) {
            for (int k = i + 1; k < myArray.length; k++) {
                if ((myArray[i] + myArray[k]) == target) {
                    System.out.print(myArray[i] + " ");
                    System.out.println(myArray[k]);
                }
            }
        }

        for (int i = 0; i < myArray.length - 2; i++) {
            for (int j = i+1; j < myArray.length-1; j++) {
                for (int k = j + 1; k < myArray.length; k++) {
                    if ((myArray[i] + myArray[j] + myArray[k]) == target) {
                        System.out.print(myArray[i] + " ");
                        System.out.print(myArray[j] + " ");
                        System.out.println(myArray[k]);
                    }
                }
            }
        }


    }
}
