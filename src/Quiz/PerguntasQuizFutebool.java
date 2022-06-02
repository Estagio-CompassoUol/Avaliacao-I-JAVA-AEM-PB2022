package Quiz;

import java.util.ArrayList;
import java.util.List;

public class PerguntasQuizFutebool {

    private List<PergundasRespostas> perguntasFutebool = new ArrayList<>();


    public PerguntasQuizFutebool() {
        PergundasRespostas pergundasRespostas1 = new PergundasRespostas();
        pergundasRespostas1.setPerguntas("Quanto tempo dura uma partida de futebol(Min)?");
        pergundasRespostas1.setResposta("90");

        PergundasRespostas pergundasRespostas2 = new PergundasRespostas();
        pergundasRespostas2.setPerguntas("Quando foi realizada a ultima Copa do Mundo de futebol? (ano)");
        pergundasRespostas2.setResposta("2018");

        PergundasRespostas pergundasRespostas3 = new PergundasRespostas();
        pergundasRespostas3.setPerguntas("Qual time de futebol ganhou mais Copas do Mundo? (pais)");
        pergundasRespostas3.setResposta("Brasil");

        PergundasRespostas pergundasRespostas4 = new PergundasRespostas();
        pergundasRespostas4.setPerguntas("Em que cidade está localizado o estádio popularmente conhecido como La Bombonera? (Cidade e Pais");
        pergundasRespostas4.setResposta("Buenos Aires Argentina");

        this.perguntasFutebool.add(pergundasRespostas1);
        this.perguntasFutebool.add(pergundasRespostas2);
        this.perguntasFutebool.add(pergundasRespostas3);
        this.perguntasFutebool.add(pergundasRespostas4);
    }

    public List<PergundasRespostas> getPerguntasFutebool() {
        return perguntasFutebool;
    }


}
