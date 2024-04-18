public class PruebaWhile {

    public static void main(String[] args) {
        int indice=0;
        String[] nombres= new String[5];
        nombres[0]="Jorge";
        nombres[1]="Mayra";
        nombres[2]="Feliz";
        nombres[3]="Gina";
        nombres[4]="Andres";

        while (indice<nombres.length){
             System.out.println("el nombre en la posicion "+indice+" es "+nombres[indice]);
            indice++;
        }

    }
}
