package login;

public class Login {
    private String usuarioRegistrado="Alejandra";
    private String clave="0123456";
    public String validarCredenciales(String username, String password){

        if (username!=usuarioRegistrado || password!=clave){
            return "Alguna de las credenciales es incorrecta";

        }else {
            return "login exitoso";
        }

    }

    public void setUsuarioRegistrado(String usuarioRegistrado) {
        this.usuarioRegistrado = usuarioRegistrado;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
}
