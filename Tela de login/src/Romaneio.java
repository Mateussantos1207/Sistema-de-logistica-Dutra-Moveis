import java.util.ArrayList;
import java.util.Scanner;

public class Romaneio extends Dados{

    public Romaneio(String nome, String endereco, String bairro, int numero) {
        super(nome, endereco, bairro, numero);
    }

    private  ArrayList<Romaneio> romaneios = new ArrayList<>();

    void cadastroRomaneio () {

        Dados novo = new Dados();
        Scanner sc = new Scanner(System.in);

        System.out.println("CLiente: ");
        novo.setNome(sc.nextLine());

        System.out.println("Endereço: ");
        novo.setEndereco(sc.nextLine());

        System.out.println("Numero da casa: ");
        novo.setNumero(sc.nextInt());

        System.out.println("Bairro: ");
        novo.setBairro(sc.nextLine());

        romaneios.add(Romaneio);

    }
}
