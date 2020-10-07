import com.company.MathOperations;
import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {


        System.out.println("The result is " + calcul(-5, 8, 6));
        System.out.println("The result is " + calcula(55, 9, 9));
        System.out.println("The result is " + calculb(20, 3, 5, 8));
        System.out.println("The result is " + calculc(5, 15, 3, 2, 8, 3));
        //System.out.println("The sum is " + sum(7, 10));
        //System.out.println("The result is " + divide(7, 10));
        System.out.println("Restul impartirii este " + rest(13, 7));
        System.out.println("Temperatura in grade Celsius este " + celsius(5, 9, 32, 32));
        System.out.println("Lungimea in metri este " + inchtometers(200, 0.0254));
        System.out.println("Viteza in mps  este " + V(1, 30, 24,4000));
        System.out.println("Viteza in km pe ora este " + V1(1, 30, 24, 4000));

        // write your code here
        System.out.println("Hello world");
        int x = 2;
        x++;
        System.out.println("number " + x);
        System.out.println("Hello\n" + "Liviu");
        int y = 2;
        int z = 7;
        System.out.println(y + z);
        double a = 13;
        double b = 7;
        System.out.println(a / b);
        int m = -5;
        int n = 8;
        int o = 6;
        System.out.println(m + n * o);
        int s = 55;
        int d = 9;
        System.out.println((s + d) % d);
        double q = 20;
        double w = -3;
        double e = 5;
        double r = 8;
        System.out.println(q + w * e / r);
        double t = 5;
        double u = 15;
        double i = 3;
        double f = 2;
        System.out.println(t + u / i * f - r % i);
    }




    static double calcul(double a, double b, double c) {
        double result = a + b * c;
        return result;
    }

    static double calcula(double a, double b, double c) {
        double result = (a + b) % c;
        return result;
    }

    static double calculb(double a, double b, double c, double d) {
        double result = a - b * c / d;
        return result;
    }

    static double calculc(double a, double b, double c, double d, double e, double f) {
        double result = a + b / c * d - e % f;
        return result;
    }

    public static void printMyName() {
        System.out.println("     J   A   V     V  A    ");
        System.out.println("     J  A A   V   V  A A   ");
        System.out.println("J    J AAAAA   V V  AAAAA  ");
        System.out.println("  JJ  A     A   V  A     A ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" +'''''+");
        System.out.println("[| o o |]");
        System.out.println(" |  !  |");
        System.out.println(" | '_' |");
        System.out.println(" +_____+");


    }

    static int rest(int a, int b) {
        int result = a % b;
        return result;
    }

    static double celsius(double a, double b, double F, double c) {
        double result = a / b * (F - c);
        return result;
    }

    static double inchtometers(double inch, double a) {
        double result = inch * a;
        return result;
    }

    static float V(float H, float m, float s, float d){
        float result = d/(H * 3600 + m * 60 + s);
        return result;

    }
    static float V1(float H, float m, float s, float d){
        float result = d/1000/(H + m / 60 + s / 3600);
        return result;
    }


    }













