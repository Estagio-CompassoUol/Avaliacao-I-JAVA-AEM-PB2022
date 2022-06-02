package Quiz;

import java.util.ArrayList;
import java.util.List;

public class PerguntasQuizFutebool {

    private List<PerguntasRespostas> perguntasFutebool = new ArrayList<>();


    public PerguntasQuizFutebool() {
        PerguntasRespostas pergundasRespostas1 = new PerguntasRespostas();
        pergundasRespostas1.setPerguntas("Quanto tempo dura uma partida de futebol(Min)?");
        pergundasRespostas1.setResposta("90");

        PerguntasRespostas pergundasRespostas2 = new PerguntasRespostas();
        pergundasRespostas2.setPerguntas("Quando foi realizada a ultima Copa do Mundo de futebol? (ano)");
        pergundasRespostas2.setResposta("2018");

        PerguntasRespostas pergundasRespostas3 = new PerguntasRespostas();
        pergundasRespostas3.setPerguntas("Qual time de futebol ganhou mais Copas do Mundo? (pais)");
        pergundasRespostas3.setResposta("Brasil");

        PerguntasRespostas pergundasRespostas4 = new PerguntasRespostas();
        pergundasRespostas4.setPerguntas("Em que cidade está localizado o estádio popularmente conhecido como La Bombonera?");
        pergundasRespostas4.setResposta("Buenos Aires");

        this.perguntasFutebool.add(pergundasRespostas1);
        this.perguntasFutebool.add(pergundasRespostas2);
        this.perguntasFutebool.add(pergundasRespostas3);
        this.perguntasFutebool.add(pergundasRespostas4);
    }

    public List<PerguntasRespostas> getPerguntasFutebool() {
        return perguntasFutebool;
    }


}
