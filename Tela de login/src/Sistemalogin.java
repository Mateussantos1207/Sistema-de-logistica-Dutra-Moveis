import java.util.Scanner;

public class Sistemalogin {

    private Usuario usuario;
    private Funcionarios funcionario;

    public Sistemalogin () {
        usuario = new Usuario();
        funcionario = new Funcionarios();
    }

    public void logar(Admin adm) {

        Scanner dados = new Scanner(System.in);
        boolean logado = false;

        while (!logado) {

            System.out.println("\t\tDUTRA MOVEIS");

            System.out.println("Username: ");
            usuario.setUsuario(dados.nextLine());

            System.out.println("\nSenha: ");
            usuario.setSenha(dados.nextLine());

            adm.setUsuario(usuario.getUsuario());
            adm.setSenha(usuario.getSenha());

            if (adm.log_Admin()){
                System.out.println("Administrador logado");
                logado = true;
                adm.menuAdmin(funcionario, this);

            } else if (funcionario.autenticar(usuario.getUsuario(), usuario.getSenha())){
                System.out.println("Funcionario logado");
                logado = true;

            } else {
                System.out.println("Usuario nao encontrado! Tente novamente.\n");
            }
        }
    }
}