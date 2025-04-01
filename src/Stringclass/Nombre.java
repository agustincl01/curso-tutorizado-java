public class Nombre {
    public static void main(String[] args) {
        String nombre1 = "Juan";
        String nombre4 = "Marcos";
        int tamaño4 = nombre4.length();
        System.out.println("el nombre mas largo es "+nombre4+" y tiene "+tamaño4+" letras");
        for (int i = 0; i < nombre1.length(); i++) {
            System.out.println("la letra "+i+" de "+nombre1+" es "+nombre1.charAt(i));
        }
    }
}
