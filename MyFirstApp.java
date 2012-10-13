public class MyFirstApp {
    public static void main (String[] args) {

        System.out.println("Beginning stuff ....");
        int x = 7;
        System.out.println("x is " + x);
        x = x * 17;
        System.out.println("x is " + x);

        for (int i = 1; i < 5; i++) {
            x = x * i;
        }
        System.out.println("x is " + x);

        int j = 2;
        while (j > 0) {
            x = x / j;
            j--;
        }
        System.out.println("x is " + x);

        if (x == 10) {
            System.out.println("x is 10.");
        } else if (x == 15) {
            System.out.println("x is 15.");
        } else {
            System.out.println("x is neither 10 nor 15.");
        }
    }
}
