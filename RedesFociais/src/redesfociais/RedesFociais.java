package redesfociais;

import java.io.IOException;


/**
 *
 * @author Rodrigo Drumond de Paula
 */
public class RedesFociais {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        AbrirArquivo abrir = new AbrirArquivo("Grafo.csv");
        Grafo grafo = new Grafo();

        String[][] auxMatris = abrir.getMatrixArquivo();//pegando a Matrix criada

        abrir.AbrirArquivoGrafo();//Abrindo o Arquivo

        for (int i = 0; i < 428; i++) {
            grafo.addVertice(Integer.toString(i), 0);//Criando os vertices e seus IDs
        }

        for (int i = 0; i < auxMatris.length; i++) {
            for (int j = 0; j < auxMatris.length; j++) {
                if (auxMatris[i][j].equals("1")) {//Pecrendo o Matrix e comparando Matrix[i][j]=1 se for crio um vertice aux
                    Vertice aux = new Vertice(Integer.toString(j), 0);
                    
                    grafo.getV().get(i).addAdjacentes(aux);// e adciono ele na minha lista de adjacentes

                }

            }
        }

        grafo.Busca();//Acrecento os pesos utilizando o Size no meu Arry
        
        grafo.Ordenar();//faço a ordenaçao decresente usando Collections

        grafo.printGraph();// Impreçao do grafo 

    }
}
