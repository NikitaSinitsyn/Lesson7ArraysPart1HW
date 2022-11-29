public class Main {
    public static void main(String[] args) {
        // Exercise 1
        int[] intArray = {1, 2, 3};
        double[] doubleArray = {1.57, 7.654, 9.986};
        String [] stringArray = {"привет", "меня зовут", "Никита"};

        // Exercise 2
        for (int i = 0; i < intArray.length; i++) {
            if(i < intArray.length - 1) {
                System.out.print(intArray[i] + ",");
            } else
                System.out.println(intArray[i]);
        }
        for (int i = 0; i < doubleArray.length; i++) {
            if (i < doubleArray.length - 1) {
                System.out.print(doubleArray[i] + ",");
            } else
                System.out.println(doubleArray[i]);
        }
        for (int i = 0; i < stringArray.length; i++) {
            if (i < stringArray.length - 1) {
                System.out.print(stringArray[i] + ",");
            } else
                System.out.println(stringArray[i]);
        }

        // Exercise 3
        for(int i = intArray.length - 1; i >= 0; i--){
            if( i > 0){
                System.out.print(intArray[i] + ",");
            } else
                System.out.println(intArray[i]);
        }
        for(int i = doubleArray.length - 1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(doubleArray[i] + ",");
            } else
                System.out.println(doubleArray[i]);
        }
        for(int i = stringArray.length - 1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(stringArray[i] + ",");
            } else
                System.out.println(stringArray[i]);
        }

        // Exercise 4
        for (int i = 0; i < intArray.length; i++){
            if(intArray[i] % 2 != 0){
                intArray[i] = intArray[i] + 1;
            }
            if(i < intArray.length - 1) {
                System.out.print(intArray[i] + ",");
            } else
                System.out.println(intArray[i]);
        }

    }
}