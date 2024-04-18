package login;

public class Main {

    public static void main(String[] args) {
        User user = new User("Alejandra","0123456",1);
       /* Login login=new Login();
        login.setUsuarioRegistrado("Alejandra");*/
        Menu menu = new Menu();
        menu.validarIntentos(user.getNickname(), user.getPassword(), user.intento);

       /* String name = user.getNickname();
        System.out.println(name);
        user.setNickname("william");
        String name2=user.getNickname();
        System.out.println(name2);*/

        /*Login login = new Login();
        login.validarCredenciales(user.getNickname(), user.getPassword());*/


    }
}
