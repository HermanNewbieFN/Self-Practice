public class array {
    public static void main(String[] args) {
        //array1();
        //arrayTMS();
        int[] awesomeArray= {125,121,345,3212};
        int[] sortedArray= bubbleSort(awesomeArray);
        {
            for (int i = 0; i < sortedArray.length; i++)

                System.out.println(sortedArray[i ]);
        }
    }

    public static void arrayTMS() {
        int massiv[];
        massiv = new int[14];
        for (int i = 0; i < massiv.length; i++) {
            massiv[i] = i; /* adding value to array indexes (where [i] the number of index)
                                    -  massiv [1]=1,massiv [2]=2  */
            System.out.println(massiv[i]);
        }
        for (int i = 0; i < massiv.length; i++) {
            if (massiv[i] == 4) {

            }
            System.out.println("massiv[" + i + "] = " + massiv[i]);

        }
    }

    public static void array1() {
        int[] a;
        a = new int[125];
        for (int i = 0; i < a.length; i++) {
            a[i] = i;
            System.out.println(a[i]);
        }
    }

    public static int[] bubbleSort(int[] array){

        boolean sorted = false;
        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sorted = false;
                }
            }
        }

        return array;
    }
}