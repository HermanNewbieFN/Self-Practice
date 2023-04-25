

public class practise1 {
    public static void main(String[] args) {
    double sum;
    sum= simpleMath(974.2, 123.1);
        System.out.println(sum);
        String frmBtolow = lowcase("USING METHODE STRING LOWER CASE");
        System.out.println(frmBtolow);
    }
    public static double simpleMath(double a, double b){
    return a + b;

    }
    public static String lowcase (String l){
        return l.toLowerCase();
    }
}