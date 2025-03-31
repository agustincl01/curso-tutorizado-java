public class Nombre {
    public static void main(String[] args) {
        String nombre1 = "Juan";
        String nombre2 = "Juan";
        String nombre3 = "Pedro";
        String nombre4 = "Marcos";
        int tamaño1 = nombre1.length();
        int tamaño2 = nombre2.length();
        int tamaño3 = nombre3.length();
        int tamaño4 = nombre4.length();
        System.out.println("el nombre mas largo es "+nombre4+" y tiene "+tamaño4+" letras");
        for (int i = 0; i < nombre1.length(); i++) {
            System.out.println("la letra "+i+" de "+nombre1+" es "+nombre1.charAt(i));
        }
    }
}
