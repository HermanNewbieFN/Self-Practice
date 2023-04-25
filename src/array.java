public class array {
    public static void main(String[] args) {
        array1();
        //arrayTMS();
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
}