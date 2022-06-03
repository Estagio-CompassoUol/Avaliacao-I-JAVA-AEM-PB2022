package Quiz;

import java.util.ArrayList;
import java.util.List;

public class PerguntasQuizFilmes{

    private List<PerguntasRespostas> perguntasFilmes = new ArrayList<>();


    public PerguntasQuizFilmes() {
        PerguntasRespostas pergundasRespostas1 = new PerguntasRespostas();
        pergundasRespostas1.setPerguntas("Qual foi o maior vilão dos Filmes Vingadores?") ;
        pergundasRespostas1.setResposta("Thanos");

        PerguntasRespostas pergundasRespostas2 = new PerguntasRespostas();
        //base no link ("https://www.aficionados.com.br/vingadores-ultimato-todos-os-personagens-que-apareceram-no-longa/")
        pergundasRespostas2.setPerguntas("Quanto personagens  compunha os elencos do filme Vingadores - Guerra Infinita?");
        pergundasRespostas2.setResposta("38");

        PerguntasRespostas pergundasRespostas3 = new PerguntasRespostas();
        pergundasRespostas3.setPerguntas("Quantos filmes de Harry Portter foram exibidos?");
        pergundasRespostas3.setResposta("8");

        PerguntasRespostas pergundasRespostas4 = new PerguntasRespostas();
        pergundasRespostas4.setPerguntas("nome do gigando amigo do harry portter");
        pergundasRespostas4.setResposta("Hagrid");

        this.perguntasFilmes.add(pergundasRespostas1);
        this.perguntasFilmes.add(pergundasRespostas2);
        this.perguntasFilmes.add(pergundasRespostas3);
        this.perguntasFilmes.add(pergundasRespostas4);

    }

    public List<PerguntasRespostas> getPerguntasFilmes() {
        return perguntasFilmes;
    }


}
