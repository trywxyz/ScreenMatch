O projeto **ScreenMatch** é uma aplicação desenvolvida no âmbito do programa **Oracle Next Education (ONE)** da **Alura**, com o objetivo de consolidar conhecimentos em **Java** e práticas de programação orientada a objetos. A aplicação é focada no gerenciamento e análise de informações sobre filmes, séries e episódios, incluindo funcionalidades como cálculo de tempo total, avaliação e recomendações de conteúdo.

### Principais Funcionalidades:

1. **Cadastro de Filmes e Séries**  
   - É possível criar objetos representando filmes e séries, definindo suas características como nome, ano de lançamento, duração e outras propriedades específicas (ex.: número de temporadas, episódios por temporada).

2. **Ficha Técnica e Avaliações**  
   - Cada filme e série possui métodos para exibir a ficha técnica e coletar avaliações do usuário, permitindo o cálculo da média das avaliações e a contagem total.

3. **Cálculo de Tempo Total**  
   - Utilizando a classe `CalculadoraDeTempo`, é possível somar a duração total de filmes e séries adicionados, considerando o tempo em minutos.

4. **Filtro de Recomendação**  
   - A classe `FiltroRecomendacao` filtra os conteúdos para determinar se eles são recomendados, baseando-se em critérios como avaliações ou popularidade.

5. **Gerenciamento de Episódios**  
   - A classe `Episodeo` permite registrar episódios de séries, associando-os à série correspondente e armazenando dados como número do episódio e total de visualizações.

### Estrutura do Código:
- **Classes Principais**:  
   - `Filme`: Representa filmes com atributos específicos como duração e nome.  
   - `Serie`: Estrutura para séries com propriedades adicionais (temporadas, episódios, etc.).  
   - `Episodeo`: Para gerenciar episódios individuais de séries.  

- **Cálculo e Recomendação**:  
   - `CalculadoraDeTempo`: Soma o tempo total de filmes e séries adicionados.  
   - `FiltroRecomendacao`: Analisa objetos para verificar se são recomendados.

- **Interface do Usuário**:  
   - A classe `Principal` é o ponto de entrada do programa, onde os objetos são instanciados e os métodos são chamados para demonstrar as funcionalidades.

### Exemplos no Código:
- **Criação e Avaliação de Filmes**:  
   ```java
   Filme meuFilme = new Filme();
   meuFilme.setNome("A Orca");
   meuFilme.setAnoDeLancamento(1978);
   meuFilme.setDuracaoEmMinutos(180);
   meuFilme.avaliar(7);
   meuFilme.avaliar(10);
   ```
- **Cálculo de Duração de Séries**:  
   ```java
   Serie minhaSerie = new Serie();
   minhaSerie.setTemporada(10);
   minhaSerie.setEpisodiosPorTemporada(100);
   minhaSerie.setMinutosPorEpisodio(50);
   System.out.println("Duração total: " + minhaSerie.getDuracaoEmMinutos());
   ```

- **Cálculo do Tempo Total de Reprodução**:  
   ```java
   CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
   calculadora.incluir(meuFilme);
   calculadora.incluir(minhaSerie);
   System.out.println("Tempo total: " + calculadora.getTempoTotal());
   ```

### Benefícios Educacionais:
O projeto oferece uma excelente base para aprender conceitos fundamentais de programação, como:
- **Encapsulamento e modularidade**.
- **Herança e Polimorfismo** (se utilizado em classes derivadas).  
- **Boas práticas na organização de código**.  
- **Manipulação de objetos em Java**.

