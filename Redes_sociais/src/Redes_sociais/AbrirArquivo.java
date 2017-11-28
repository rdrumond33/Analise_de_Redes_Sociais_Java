package Redes_sociais;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Rodrigo Drumond de Paula
 */
public class AbrirArquivo {

    private String EnderecoArquivo;
    private String[] VetorString;
    private Integer n_line;
    private ArrayList<String> LinhaDoArquivo;//crio um array para guardar as linha do arquivo Grafo
    private String[][] MatrizGrafo;//crio uma matriz para receber os dados do arquivo grafo ja tratados para ter mais facilidade na comparação

    public AbrirArquivo(String nomeArquivo) {//faço o construtor ja passando o caminho do arquivo para  
        this.n_line = 0;
        this.EnderecoArquivo = nomeArquivo;
        this.MatrizGrafo = new String[428][428];//crio minha Matrix 428 por 428
        LinhaDoArquivo = new ArrayList<>();
    }

    public void AbrirArquivoGrafo() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(EnderecoArquivo));
        while (br.ready()) {
            LinhaDoArquivo.add(br.readLine());//Ler cada linha do Arquivo e Adicionar em um ArrayList

        }
        br.close();//Fecha o arquivo

        for (String S : this.LinhaDoArquivo) {// faco um for para pecorre o ArrayList
            this.VetorString = S.split(";");// faço um Split para parar onde tem ; e pegao os dados e adicionando na Matrix 
            for (int i = 0; i < VetorString.length; i++) {
                MatrizGrafo[n_line][i] = VetorString[i];//Tranferendo oque esta no arquivo e pacando para matrix 
            }
            n_line++;

        }

    }

    public String[][] getMatrizGrafo() throws IOException {
        return MatrizGrafo;
    }

}
