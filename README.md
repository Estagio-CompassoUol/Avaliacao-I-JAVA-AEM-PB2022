
# Exercicio Avaliativo 1 Programa de Bolsas CompassUol

## Foram apresentados 3 problemas para serem resolvidos codificando em java:




### Horario_do_dia

Esse programa imprime um mensagem "bom dia...", "boa tarde...", "boa noite..." e "boa madrugada..." de acordo com o horário atual do Sistema Operacional após o login do usuário;

1. O programa solicita usuário e senha quando iniciado;"\n"
2. Recebe os dados digitado no teclado;
3. Compara com os dados de usuário com o salvo no sistema;
4. Retorna uma mensagem de "bom dia...", "boa tarde...", "boa noite..." e "boa madrugada..." de acordo com o horário atual do Sistema Operacional;
5. Retorna uma mensagem de "Usuário e/ou Senha incorretos." e retorna o loop
solicitando digitar novamente.
6. Então o programa é finalizado quando 
Obs.: Usuário cadastrado no sistema login:"Admin" senha:"bolsaCompassUol";




### Quiz

Esse quiz solicita o tema para o usuário dividido em 3 temas, logo em seguida solicita as respostas de 4 perguntas comparando intantaneamente se acertou ou errou contabilizando em duas variaveis;
após responder todas as perguntas e exibidos os detalhes de quantas questões acertaram, quantas erram, as respostas dadas pelo usuário e as respostas corretas;

1. O programa solicita o nome do usuário quando iniciado;
2. Logo após, solicita qual o tema escolhido entre "Futebool, Filmes ou Curiosidades";
3. Então começa o quiz, onde são apresentados 4 perguntas referente ao tema escolhido;
4. Os dados obitidos pelo teclado pelo usuário são armazenados em uma List;
5. O dados obtidos são comparados com o dados armazenados em uma outra List contendo as respostas corretas;
6. A cada teste é informado se o usuário acertou ou errou e contabilizado em uma variável;
7. Após responder todas as repostas o programa imprime no console quantas questões acertaram, quantas erram, as respostas dadas pelo usuário e as respostas corretas;
8. Então inicia o loop perguntando a seleção do tema novamente;
9. O programa é finalizado se digitado a opção "Sair";



### VerificarDireitoBonificacaoPrintWrite

Esse programa calcula a porcentagem em R$ da bonificação ou desconto de acordo com o valor do salário digitado solicitando o nome do funcionário; 
e assim exibindo no console o nome do usuário, o seu salário, o valor do bonus(somado no salário) ou desconto(subtraido do salário) e o valor liquido total(valor do salário +/- o bonus/desconto). 

1. O programa solicita a quantidade de usuário que será informado;
2. Então começa o loop solicitando o nome de cada do usário e o valor do salário;
3. Quando terminado a quantidade de funcionário informado;
4. Armazena todos os dados digitados sobre o funcionário dentro de um aquivo  texto ("dadosFuncionarios.txt", "UTF-8") utilizando a interface PrintWrite;
5. Então ler os dados desse arquivo através da interface Scanner;
6. Que lê cada linha salva e dividi cada dados em arrays de String através do método .split(); 
7. Calcula o Bonus/Desconto sobre o salário;
8. E retona imprimindo  no o console os dados de saida ("nome do usuário", "o salário", "o valor do bonus ou desconto", "valor liquido total")
9. Finaliza o programa;




### VerificarDireitoBonificacaoSet

Esse programa solicita o nome do funcionário  e calcula a porcentagem em R$ da bonificação ou desconto sobre o salário(desconto do salário acima de R$2000 e 
bonificação de 20% para abaixo de 1000 e 10% para os demais valores) digitado; e assim exibindo no console o nome do usuário, o seu salário, 
o valor do bonus(somado no salário) ou desconto(subtraido do salário) e o valor liquido total(valor do salário +/- o bonus/desconto).

1. O programa solicita a quantidade de usuário que será informado;
2. Então começa o loop solicitando o nome de cada do usário e o valor do salário;
3. Quando terminado de digitar os dados o programa calcula o bonus ou desconto e  aramzenando esse dados em uma Set<>;
4. Quando alcançar a quantidade de funcionários informado o programa exibe no console E retona imprimindo  no o console os dados de saida ("nome do usuário", "o salário", "o valor do bonus ou desconto", "valor liquido total")
5. Finaliza o programa; 
