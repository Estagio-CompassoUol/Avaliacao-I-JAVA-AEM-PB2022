package Quiz;

import java.util.ArrayList;
import java.util.List;

public class PerguntasQuizFilmes {

    private List<PergundasRespostas> perguntasFilmes = new ArrayList<>();


    public PerguntasQuizFilmes() {
        PergundasRespostas pergundasRespostas1 = new PergundasRespostas();
        pergundasRespostas1.setPerguntas("Qual foi o maior vilão dos Filmes Vingadores?") ;
        pergundasRespostas1.setResposta("Thanos");

        PergundasRespostas pergundasRespostas2 = new PergundasRespostas();
        //base no link ("https://www.aficionados.com.br/vingadores-ultimato-todos-os-personagens-que-apareceram-no-longa/")
        pergundasRespostas2.setPerguntas("Quanto personagens  compunha os elencos do filme Vingadores - Guerra Infinita?");
        pergundasRespostas2.setResposta("38");

        PergundasRespostas pergundasRespostas3 = new PergundasRespostas();
        pergundasRespostas3.setPerguntas("Quantos filmes de Harry Portter foram exibidos?");
        pergundasRespostas3.setResposta("8");

        PergundasRespostas pergundasRespostas4 = new PergundasRespostas();
        pergundasRespostas4.setPerguntas("nome do gigando amigo do harry portter");
        pergundasRespostas4.setResposta("Rúbeo Hagrid");

        this.perguntasFilmes.add(pergundasRespostas1);
        this.perguntasFilmes.add(pergundasRespostas2);
        this.perguntasFilmes.add(pergundasRespostas3);
        this.perguntasFilmes.add(pergundasRespostas4);

    }

    public List<PergundasRespostas> getPerguntasFilmes() {
        return perguntasFilmes;
    }


}
