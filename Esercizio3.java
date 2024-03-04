public class Esercizio3 {


    public static void main(String[] args) {

        double result = perimetroRettangolo(2.5, 7.8);
        System.out.println("Il prodotto è: " + result);

        int numero = 10;
        System.out.println("Il numero " + numero + " è pari? " + pariDispari(numero));

        double lato1 = 3.0;
        double lato2 = 4.0;
        double lato3 = 5.0;

        double area = areaTriangolo(lato1, lato2, lato3);
        System.out.println("L'area del triangolo è: " + area);

    }

    public static double perimetroRettangolo(double base, double height) {
        return base * height;

    }

    public static int pariDispari(int numero) {
        if (numero % 2 == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static double areaTriangolo(double lato1, double lato2, double lato3) {
        double semiperimetro = (lato1 + lato2 + lato3) / 2;


        double area = Math.sqrt(semiperimetro * (semiperimetro - lato1) * (semiperimetro - lato2) * (semiperimetro - lato3));

        return area;
    }
}

