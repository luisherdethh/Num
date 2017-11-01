public class Descomponer {
    public static void main(String[] args) {
        int numero = 23;
        int unidades, decenas, centenas, um;

        unidades = numero % 10;
        numero = numero / 10;
        decenas = (numero % 10) * 10;
        numero = numero / 10;
        centenas = numero % 10;
        um = numero / 10;

        System.out.println("Unidades: " + unidades);
        System.out.println("Decenas: " + decenas);
        System.out.println("Centenas: " + centenas);
        System.out.println("UM: " + um);
    }
}
