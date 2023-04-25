

public class returnPractice {
    public static void main(String[] args) {

    double sum;
    sum= simpleMath(974.2, 123.1);
        System.out.println(sum);

        String frmBtolow = lowcase("USING METHODE STRING LOWER CASE");
        System.out.println(frmBtolow);

        int[] awesomeArray = alotNumb(123,124,125);
        System.out.println(awesomeArray[0] + awesomeArray[2] + awesomeArray[1]);
    }
    public static double simpleMath(double a, double b){
    return a + b;

    }
    public static String lowcase (String l){
        return l.toLowerCase();
    }
    public static int[] alotNumb(int a, int b, int c){
        int[] array=new int[3];
        array [0]=a;
        array [1]=b;
        array [2]=c;
        return array;
    }
}