public class pruebaFor {

    static int age= 33;
    char init;


    static String name="alejandra ramirez";

    public static void main(String[] args) {
        /*String age2=String.valueOf(age);
        String name2=name.toUpperCase();
        System.out.println(name2);*/

    /*    if (age>=18){
            System.out.println("pruede ingresar al establecimiento");

        }else {
            System.out.println("No pruede ingresar al establecimiento");
        }*/



        for (int i=0;i<=6;i++) {

        }
        double nota = 5.4;

        if (nota>=3 && nota<=3.5) {
            System.out.println("ha aprobado el curso con nota minima");

        }else if (nota<3)
            {
                System.out.println("No paso el curso");
            }else if (nota>3.5 && nota<=4.5)
        {
            System.out.println("Aprueba con nota sobresaliente");

        }else if (nota>4.5 && nota<=5)
        {
            System.out.println("Aprueba con nota excelente");
            }
        else if (nota>5)
        {
            System.out.println("nota no corresponde");
        }

        }

    }
