import java.util.ArrayList;
import java.util.Scanner;

public class Funcionarios {

    private ArrayList<Usuario> lista = new ArrayList<>();

    void novo_Usuario () {

        Scanner new_user = new Scanner(System.in);
        Usuario novo = new Usuario();

        System.out.println("\tCadastro de usuario");

        System.out.println("Username: ");
        novo.setUsuario(new_user.nextLine());


        System.out.println("Senha: ");
        novo.setSenha(new_user.nextLine());

        lista.add(novo);

        System.out.println("Usuario cadastrado !!");

    }

    void exibir_Funcionario () {

        for ( Usuario u : lista){
            System.out.println("\tLISTA DE USUARIOS\nUsuario: " + u.getUsuario());
        }
    }

    public boolean autenticar (String usuario, String senha){
        for (Usuario u : lista) {
            if(u.getUsuario().equals(usuario) && u.getSenha().equals(senha));{
                return true;
            }
        }
        return false;
    }

    public ArrayList<Usuario> getLista() {
        return lista;
    }
}
