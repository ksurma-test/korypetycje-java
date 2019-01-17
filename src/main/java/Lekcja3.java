public class Lekcja3 {


    public static void main(String[] args) {

        System.out.println(sumDigits(12345));
    }

    public static int sumDigits(int i ) {
        int suma = 0;
        while (i>0){
            suma+=i % 10;
            i /= 10;
        }
        return suma;

    }



}
