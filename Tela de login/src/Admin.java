import java.util.Scanner;

public class Admin extends Usuario {

    Scanner admin = new Scanner(System.in);

    public boolean log_Admin() {
        return "admin".equals(this.getUsuario()) && "admin123".equals(this.getSenha());
    }

    public void menuAdmin (Funcionarios funcionario, Sistemalogin sistema){
        int escolha = 0;

        while (escolha != 4) {

            System.out.println("1: Novo romaneio");
            System.out.println("2: Novo usuario");
            System.out.println("3: Exibir Cadastros");
            System.out.println("4: Sair");

            escolha = admin.nextInt();

            switch (escolha) {
                case 1: System.out.println("novo romaneio...");break;

                case 2: funcionario.novo_Usuario();break;

                case 3:funcionario.exibir_Funcionario();break;

                case 4: sistema.logar(this);break;

            }
        }
    }
}