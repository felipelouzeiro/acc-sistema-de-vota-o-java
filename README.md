# Sistema de Votação


Por conta de seus conhecimentos em Java, você recebeu uma demanda para desenvolver um sistema de votação eletrônico. A ideia é que esse sistema permita o cadastro das pessoas candidatas, o cadastro das pessoas eleitoras, a realização do processo de votação e a consulta do resultado tanto parcial quanto final da votação.

O fluxo do sistema é definido seguindo três etapas principais que devem ser executadas na seguinte ordem:

1. **Cadastrar pessoas candidatas:** nessa etapa, é preciso ter um menu para o cadastro de pessoas candidatas e, ao fim do cadastro de cada nova pessoa, deve-se oferecer a opção de cadastrar outra. Quando não houver mais pessoas candidatas para serem cadastradas, então se passa para a etapa de cadastro de pessoas eleitoras;

2. **Cadastrar pessoas eleitoras:** aqui é preciso ter um menu que possibilite o cadastro de pessoas eleitoras, similar ao menu do cadastro de pessoas candidatas. Finalizado o cadastro, deve-se voltar ao estado inicial do menu de cadastro de pessoas eleitoras para oferecer a oportunidade de cadastrar uma nova pessoa. Quando não houver mais pessoas eleitoras para serem cadastradas, o sistema deve seguir para a etapa de votação;

3. **Iniciar processo votação:** nessa etapa é iniciado o processo de votação, em que foi solicitado, na demanda, um menu que ofereça as opções de `votar`, `ver resultado parcial` e `finalizar a votação`. A seguir o detalhamento de cada caminho:
- Quando escolhida a opção `votar`, solicita-se o identificador da pessoa eleitora (por exemplo, o CPF) e o número da pessoa candidata em quem se deseja votar. Depois do voto, o menu deve voltar ao estado inicial, oferecendo as opções `votar`, `ver resultado parcial` e `finalizar a votação`.
- A opção `ver resultado parcial` deve listar todos os nomes das pessoas candidatas, mostrando a quantidade de votos absolutos recebida por cada pessoa candidata e o percentual de votos entre elas. Depois de ver o resultado parcial, o menu deve voltar ao estado inicial, oferecendo as opções `votar`, `ver resultado parcial` e `finalizar a votação`.
- A opção `finalizar a votação` deve mostrar o resultado da votação listando as pessoas candidatas, o número absoluto de votos por pessoa candidata e também o percentual dos votos totais que cada pessoa candidata recebeu. Com o fechamento do processo de votação, o programa deve ser finalizado.

A imagem a seguir representa o fluxo do sistema de forma gráfica.

![SistemaVotacaoFluxograma](img/sistema_votacao.png)

   - O menu do primeiro laço tem o formato:
   
```
        Cadastrar pessoa candidata?
        1 - Sim
        2 - Não
        Entre com o número correspondente à opção desejada:
```

   Se a pessoa usuária entrar com o valor 1 (que indica que ela quer cadastrar uma pessoa candidata), a mensagem `Entre com o nome da pessoa candidata:` deverá ser impressa no console. Em seguida, depois de inserir o nome da pessoa candidata e pressionar enter, aparecerá a mensagem `Entre com o número da pessoa candidata:` no console. Depois que a pessoa usuária inserir o número da pessoa candidata, o sistema deverá retornar ao estado inicial do menu. Supondo que o nome da primeira pessoa candidata seja "Maria" e o seu número para votar seja "1", então um exemplo do conteúdo do console depois de cadastrar a primeira pessoa candidata será:
   
```
        Cadastrar pessoa candidata?
        1 - Sim
        2 - Não
        Entre com o número correspondente à opção desejada:
        1
        Entre com o nome da pessoa candidata:
        Maria
        Entre com o número da pessoa candidata:
        1
        Cadastrar pessoa candidata?
        1 - Sim
        2 - Não
        Entre com o número correspondente à opção desejada:
```
        
   Esse ciclo se repete até não haver mais pessoas candidatas para serem cadastradas. Quando isso acontencer, a pessoa usuária entrará com a opção 2 do menu, o que vai parar o primeiro laço. O segundo laço, que representa a etapa de cadastro de pessoas eleitoras, deve ser iniciado logo na sequência.

   ⚠️🔴**IMPORTANTE: para facilitar o uso da classe Scanner do Java, cadastra-se apenas o primeiro nome da pessoa candidata — ou seja, Maria, e não Maria Silva ou Maria Clara.** 🔴⚠️

   - O menu do segundo laço deve ter o formato:
   ```
        Cadastrar pessoa eleitora?
        1 - Sim
        2 - Não
        Entre com o número correspondente à opção desejada:
   ```
        
   Se a pessoa usuária entrar com o valor 1 (que indica que ela quer cadastrar uma pessoa eleitora), então a mensagem `Entre com o nome da pessoa eleitora:` será impressa no console. Em seguida, depois de inserir o nome da pessoa eleitora e pressionar enter, aparecerá no console a mensagem `Entre com o cpf da pessoa eleitora:`. Depois que a pessoa usuária inserir o CPF da pessoa eleitora, o sistema deve retornar ao estado inicial do menu. Supondo que o nome da primeira pessoa eleitora seja Joao, portador do CPF 978.413.510-89, um exemplo do conteúdo do console depois de cadastrá-la será:
   
```
        Cadastrar pessoa eleitora?
        1 - Sim
        2 - Não
        Entre com o número correspondente à opção desejada:
        1
        Entre com o nome da pessoa eleitora:
        João
        Entre com o cpf da pessoa eleitora:
        978.413.510-89
        Cadastrar pessoa eleitora?
        1 - Sim
        2 - Não
        Entre com o número correspondente à opção desejada:
 ```
        
   Esse ciclo se repete até o esgotamento das pessoas eleitoras a serem cadastradas. Ao final desse cadastro, a pessoa usuária entrará com a opção 2 do menu, o que vai parar o segundo laço e iniciar o terceiro, marcando o início da votação.

   ⚠️🔴**IMPORTANTE: para facilitar o uso da classe Scanner do Java, cadastra-se apenas o primeiro nome da pessoa candidata — ou seja, João, e não João Silva ou João Carlos.** 🔴⚠️

   - O menu do terceiro laço deve ter o seguinte formato:
   
```
     Entre com o número correspondente à opção desejada:
     1 - Votar
     2 - Resultado Parcial
     3 - Finalizar Votação
```
        
   Se a pessoa usuária entrar com o valor 1 (que indica que ela quer computar um voto), a mensagem `Entre com o cpf da pessoa eleitora:` deverá ser impressa no console. Em seguida, depois de inserir o CPF da pessoa eleitora e pressionar enter, aparecerá a mensagem `Entre com o número da pessoa candidata:` no console. Feito isso, o voto deve ser computado, e o sistema retorna ao estado inicial do menu. Supondo que o CPF da primeira pessoa eleitora seja 978.413.510-89, e o número da pessoa candidata seja 1, então um exemplo do conteúdo do console depois de realizar um voto será:
   
```
     Entre com o número correspondente à opção desejada:
     1 - Votar
     2 - Resultado Parcial
     3 - Finalizar Votação
     1
     Entre com o cpf da pessoa eleitora:
     978.413.510-89
     Entre com o número da pessoa candidata:
     1
     Entre com o número correspondente à opção desejada:
     1 - Votar
     2 - Resultado Parcial
     3 - Finalizar Votação
```

  Por outro lado, se a pessoa usuária entrar com o valor 2 (que indica que ela quer visualizar o resultado parcial), deve ser impresso no console o resultado parcial. Supondo que temos apenas a pessoa candidata Maria e a pessoa eleitora João, e que João votou em Maria, um exemplo do conteúdo do console depois de escolher a opção 2 (Resultado Parcial) será:
        
```
     Entre com o número correspondente à opção desejada:
     1 - Votar
     2 - Resultado Parcial
     3 - Finalizar Votação
     2
     Nome: Maria - 1 votos ( 100.0% )
     Total de votos: 1
     Entre com o número correspondente à opção desejada:
     1 - Votar
     2 - Resultado Parcial
     3 - Finalizar Votação
```       
        
  Esse ciclo se repete até que a pessoa usuária escolha a opção 3 (Finalizar Votação). Quando a opção 3 for escolhida, o terceiro laço deve ser terminado, imprimindo o resultado da votação, de forma similar ao resultado parcial, seguida da finalização do programa.
        
  Supondo que temos apenas a pessoa candidata Maria e a pessoa eleitora João, e que João votou em Maria, um exemplo do conteúdo do console depois de selecionada a opção 3 (Finalizar Votação) será:
        
```
        Entre com o número correspondente à opção desejada:
        1 - Votar
        2 - Resultado Parcial
        3 - Finalizar Votação
        3
        Nome: Maria - 1 votos ( 100.0% )
        Total de votos: 1
```
        
A figura a seguir evidencia os laços de repetição:
        
![SistemaVotacaoFluxogramaDica](img/sistema_votacao_dica.png)

## Restrições

- Pessoa candidata só pode ser cadastrada uma vez.
- Pessoa eleitora só pode ser cadastrada uma vez.
- Nome da pessoa candidata e eleitora só pode ser o primeiro nome para facilitar o uso da classe `Scanner` do Java.
- Pessoa eleitora só pode votar uma vez.

## Exemplo

Aqui tempos um exemplo do funcionamento desse sistema, considerando a saída completa do console. Nesse exemplo, temos duas pessoas candidatas, Maria e José, e três pessoas eleitoras, João, Rute e Raquel. Supondo que João e Rute votaram em Maria e que Raquel votou em José, teremos a seguinte saída:

```
----------- Bem-vindo ao Sistema de Votação -----------

Cadastrar pessoa candidata?
1 - Sim
2 - Não
Entre com o número correspondente à opção desejada:
1
Entre com o nome da pessoa candidata:
Maria
Entre com o número da pessoa candidata:
1
Cadastrar pessoa candidata?
1 - Sim
2 - Não
Entre com o número correspondente à opção desejada:
1
Entre com o nome da pessoa candidata:
José
Entre com o número da pessoa candidata:
2
Cadastrar pessoa candidata?
1 - Sim
2 - Não
Entre com o número correspondente à opção desejada:
2


----------- Cadastre as pessoas eleitoras -----------

Cadastrar pessoa eleitora?
1 - Sim
2 - Não
Entre com o número correspondente à opção desejada:
1
Entre com o nome da pessoa eleitora:
João
Entre com o cpf da pessoa eleitora:
154.118.560-94
Cadastrar pessoa eleitora?
1 - Sim
2 - Não
Entre com o número correspondente à opção desejada:
1
Entre com o nome da pessoa eleitora:
Rute
Entre com o cpf da pessoa eleitora:
589.292.640-00
Cadastrar pessoa eleitora?
1 - Sim
2 - Não
Entre com o número correspondente à opção desejada:
1
Entre com o nome da pessoa eleitora:
Raquel
Entre com o cpf da pessoa eleitora:
023.476.580-18
Cadastrar pessoa eleitora?
1 - Sim
2 - Não
Entre com o número correspondente à opção desejada:
2


----------- Votação iniciada! -----------

Entre com o número correspondente à opção desejada:
1 - Votar
2 - Resultado Parcial
3 - Finalizar Votação
1
Entre com o cpf da pessoa eleitora:
154.118.560-94
Entre com o número da pessoa candidata:
1
Entre com o número correspondente à opção desejada:
1 - Votar
2 - Resultado Parcial
3 - Finalizar Votação
1
Entre com o cpf da pessoa eleitora:
589.292.640-00
Entre com o número da pessoa candidata:
1
Entre com o número correspondente à opção desejada:
1 - Votar
2 - Resultado Parcial
3 - Finalizar Votação
1
Entre com o cpf da pessoa eleitora:
023.476.580-18
Entre com o número da pessoa candidata:
2
Entre com o número correspondente à opção desejada:
1 - Votar
2 - Resultado Parcial
3 - Finalizar Votação
3
Nome: Maria - 2 votos ( 67.0% )
Nome: José - 1 votos ( 33.0% )
Total de votos: 3
```
---

## Para executar o projeto na sua máquina:

1. Clone o repositório
  * Entre no diretório do repositório que você acabou de clonar:

2. Instale as dependências:
    * `mvn install`

3. Execute a classe Principal.java:

---
