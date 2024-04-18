public class PruebaArreglo {

    public static void main(String[] args) {
        String[] nombres= new String[5];
        nombres[0]="Jorge";
        nombres[1]="Mayra";
        nombres[2]="Feliz";
        nombres[3]="Gina";
        nombres[4]="Andres";

        for (int indice=0;indice< nombres.length;indice++){
            /*System.out.println("el nombre en la posicion "+indice+" es "+nombres[indice]);*/
            if(nombres[indice].equals("Gina")){
                System.out.println("el indice es: "+indice);
            }
        }


    }
}
