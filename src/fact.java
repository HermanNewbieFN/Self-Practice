public class fact {
    public static void main(String[] args) {
        int number;
        number=6;
        int result = factorial(number);
        System.out.println(result);
    }

    public static int factorial(int valueToCalculateFrom){
        int result = 1;
        for (int i=1; i<=valueToCalculateFrom; i++){
            result *= i;
        }
        return result;
    }
}
