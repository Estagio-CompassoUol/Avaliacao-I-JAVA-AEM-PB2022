package Quiz;

import java.util.ArrayList;
import java.util.List;

public class PerguntasQuizCuriosidades {

    private List<PerguntasRespostas> perguntasCurios = new ArrayList<>();


    public PerguntasQuizCuriosidades() {
        PerguntasRespostas pergundasRespostas1 = new PerguntasRespostas();
        pergundasRespostas1.setPerguntas("Qual o maior oceano do mundo?") ;
        pergundasRespostas1.setResposta("Pacifico");

        PerguntasRespostas pergundasRespostas2 = new PerguntasRespostas();
        pergundasRespostas2.setPerguntas("Qual o maior continente do mundo?");
        pergundasRespostas2.setResposta("Asia");

        PerguntasRespostas pergundasRespostas3 = new PerguntasRespostas();
        pergundasRespostas3.setPerguntas("Onde encontramos o Tigre-de-bengala?");
        pergundasRespostas3.setResposta("India");

        PerguntasRespostas pergundasRespostas4 = new PerguntasRespostas();
        pergundasRespostas4.setPerguntas("quantos planetas existem no sistema solar?");
        pergundasRespostas4.setResposta("8");

        this.perguntasCurios.add(pergundasRespostas1);
        this.perguntasCurios.add(pergundasRespostas2);
        this.perguntasCurios.add(pergundasRespostas3);
        this.perguntasCurios.add(pergundasRespostas4);

        this.perguntasCurios = perguntasCurios;
    }

    public List<PerguntasRespostas> getPerguntasCurios() {
        return perguntasCurios;
    }

}


