package src;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        ConsultaCep consultaCep = new ConsultaCep();
        System.out.println("Digite seu cep: ");
        var cep = entrada.nextLine();
        try {
            Endereco novoEndereco = consultaCep.BuscaCep(cep);
            System.out.println(novoEndereco);
            GerandoArquivo gerador = new GerandoArquivo();
            gerador.ArquivoJson(novoEndereco);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            System.out.println("Finalizando a aplicação");
        }
    }
}
