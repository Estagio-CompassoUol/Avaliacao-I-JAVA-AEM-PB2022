package Quiz;

import java.util.ArrayList;
import java.util.List;

public class PerguntasQuizCuriosidades {

    private List<PergundasRespostas> perguntasCurios = new ArrayList<>();


    public PerguntasQuizCuriosidades() {
        PergundasRespostas pergundasRespostas1 = new PergundasRespostas();
        pergundasRespostas1.setPerguntas("Qual o maior oceano do mundo?") ;
        pergundasRespostas1.setResposta("Pacifico");

        PergundasRespostas pergundasRespostas2 = new PergundasRespostas();
        pergundasRespostas2.setPerguntas("Qual o maior continente do mundo?");
        pergundasRespostas2.setResposta("Asia");

        PergundasRespostas pergundasRespostas3 = new PergundasRespostas();
        pergundasRespostas3.setPerguntas("Onde encontramos o Tigre-de-bengala?");
        pergundasRespostas3.setResposta("India");

        PergundasRespostas pergundasRespostas4 = new PergundasRespostas();
        pergundasRespostas4.setPerguntas("quantos planetas existem no sistema solar?");
        pergundasRespostas4.setResposta("8");

        this.perguntasCurios.add(pergundasRespostas1);
        this.perguntasCurios.add(pergundasRespostas2);
        this.perguntasCurios.add(pergundasRespostas3);
        this.perguntasCurios.add(pergundasRespostas4);

        this.perguntasCurios = perguntasCurios;
    }

    public List<PergundasRespostas> getPerguntasCurios() {
        return perguntasCurios;
    }


}


