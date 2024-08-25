package src;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;
public class GerandoArquivo {

    public void ArquivoJson(Endereco endereco) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try (FileWriter escrita = new FileWriter(endereco.cep() + "Cep.json");) {
            escrita.write(gson.toJson(endereco));
            System.out.println("O programa finalizou com sucesso!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}