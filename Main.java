public class Main {

    public static void main(String[] args) {

        int result = moltiplica(3, 6);
        System.out.println("Il prodotto è: " + result);


        String esitoStringa = concatena("Il numero estratto è ", 4);
        System.out.println("Le stringhe concatenate sono: " + esitoStringa);

        String[] arrayOriginale = {"uno", "due", "tre", "quattro", "cinque"};
        String nuovaStringa = "nuovoNumero";

        String[] arrayModificato = inserisciInArray(arrayOriginale, nuovaStringa);

        System.out.println("Array originale:");
        stampaArray(arrayOriginale);
        System.out.println("Array modificato:");
        stampaArray(arrayModificato);

    }

    public static int moltiplica(int num1, int num2) {
        return num1 * num2;

    }

    public static String concatena(String stringa, int numero) {

        return "" + (stringa + numero);
    }

    public static String[] inserisciInArray(String[] arrayOriginale, String nuovaStringa) {
        String[] nuovoArray = new String[arrayOriginale.length + 1];

        for (int i = 0; i < 2; i++) {
            nuovoArray[i] = arrayOriginale[i];
        }

        nuovoArray[2] = nuovaStringa;

        for (int i = 2; i < arrayOriginale.length; i++) {
            nuovoArray[i + 1] = arrayOriginale[i];
        }

        return nuovoArray;
    }

    public static void stampaArray(String[] array) {
        for (String elemento : array) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }


}










