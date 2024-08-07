# Introdução à linguagem de programação Java

Java é uma das linguagens de programação mais populares usadas em aplicações críticas. Pode ser utilizado para desenvolvimento de aplicações desktop, sistemas para web, dispositivos móveis, cartões de crédito, televisões digitais, geladeiras, entre outros. Porém, não é apenas uma linguagem de programação, Java é uma completa plataforma de desenvolvimento e execução, composta por três pilares:

- A máquina virtual Java (JVM)

- Um completo conjunto de APIs (bibliotecas)

- A linguagem Java

Java está presente nos principais sistemas operacionais existentes, entre eles: WIndows, Linux, MacOS e Solaris. É uma tecnologia independente de sistema operacional e hardware. O Java foi desenvolvido por James Gosling da Sun Microsystems em 1995 como uma linguagem orientada a objetos para aplicativos de negócios de uso geral e aplicativos interativos da Internet baseados na Web. O objetivo era fornecer uma alternativa independente de plataforma ao C++. Em outros termos, é arquitetonicamente neutro, o que significa que você pode usar o Java para escrever um programa que será executado em qualquer plataforma ou dispositivo (sistema operacional). O programa Java pode ser executado em uma ampla variedade de computadores porque não executa instruções diretamente no computador. Em vez disso, o Java é executado em uma Java Virtual Machine (JVM).

## O ciclo de vida do programa Java

Java requer que o código fonte do seu programa seja compilado primeiro. Ele é convertido em código específico da máquina ou em um código de bytes que é entendido por algum mecanismo de tempo de execução ou uma máquina virtual Java.

Não apenas o programa será verificado quanto a erros de sintaxe por um compilador Java, mas algumas outras bibliotecas de código Java podem ser adicionadas (vinculadas) ao seu programa após a conclusão da compilação (estágio de implantação)

![img 01](./assets/cs01-01.png)

**Etapa 1:** Crie um documento de origem usando qualquer editor e salve o arquivo com a extensão .java (por exemplo, abc.java).

**Etapa 2:** Compile o arquivo abc.java usando o comando `javac` ou sua IDE.

**Etapa 3:** O código de bytes (abc.class) será gerado no disco.

**Etapa 4:** Esse código de bytes pode ser executado em qualquer plataforma ou dispositivo com JVM (java.exe converte o código de bytes em linguagem de máquina).

## Terminologias usadas por programadores Java

- **JDK (Java Development Kit):** O JDK contém o JRE, juntamente com várias ferramentas de desenvolvimento, como bibliotecas Java, compiladores, depuradores, ferramentas de empacotamento e implementação.

- **JRE (Java Runtime Environment):** Faz parte do JDK, mas pode ser usado independentemente para executar qualquer código de bytes (programa Java compilado). Pode ser chamado como implementação da JVM.

- **JVM (Java Virtual Machine):** A JVM é um software que pode ser portado para várias plataformas de hardware. A JVM se tornará uma instância do JRE no tempo de execução do programa Java. Os códigos de bytes são o idioma da máquina para a JVM. Como uma máquina de computação real, a JVM possui um conjunto de instruções que manipula várias áreas da memória em tempo de execução. ASsim, para diferentes plataformas de hardware, corresponde à implementação da JVM disponível como JREs fornecidos pelo fornecedor.

- **API Java (Application Programming Interface):** Conjunto de classes escritas usando a linguagem de programação Java que é executada na JVM. Essas classes ajudarão os programadores, fornecendo métodos padrão, como ler no console, gravar no console, salvar objetos em uma estrutura de dados, etc...

## Vantagens da linguagem de programação Java

- Suporte interno para multithreading, comunicação via socket e gerenciamento de memória (garbage collector).

- Orientada a objetos (POO).

- Oferece suporte a aplicativos baseados na Web (Applet, Servlet e JSP), aplicativos distribuídos (sockets, RMI, EJB, etc...) e protocolos de rede (HTTP, JRMP, etc...) com a ajuda de extensas APIs padronizadas.

## Estrutura do programa Java

Vamos usar o exemplo do programa Java HelloWorld para entender a estrutura e os recursos da classe. Este programa foi escrito em poucas linhas e sua única tarefa é imprimir "HelloWorld!" na tela.

```java
package br.com.java.aula;

public class HelloWorld {

  public static void main(String[] args) {
    // Comentário. Essa linha não será executada.
    System.out.println("Hello World!");
  }
}
```

**Vamos explicar a seguir cada trecho de código**

1. `package br.com.java.aula;`

É uma declaração de pacote. A instrução `package` define um espaço para nome no qual as classes são armazenadas. O pacote é usado para organizar as classes com base na funcionalidade. Se você omitir a instrução do pacote, os nomes das classes serão colocados no pacote padrão, que não tem nome. A declaração do pacote não pode aparecer em nenhum lugar do programa. Deve ser a primeira linha do seu programa ou você pode omiti-la.

2. `public class HelloWorld`

Esta linha tem vários aspectos da programação Java:

- **public:** Esta é a palavra-chave modificadora de acesso que informa o acesso do compilador à classe. Vários valores de modificadores de acesso podem ser públicos, protegidos, privados ou padrão (sem valor).

- **class:** Esta palavra-chave usada para declarar uma classe. Nome da classe (HelloWorld) seguido por esta palavra-chave.

3. Comentários `//`:

Podemos escrever comentários em Java de duas maneiras:

- **Comentários da linha:** Começa com duas barras `//` e continua até o final da linha atual. Os comentários da linha não requerem um símbolo final.

- **Comentários de bloco:** Os comentários de bloco começam com uma barra e um asterisco `/*` e terminam com um asterisco e uma barra `*/`. Os comentários de bloco podem se estender por quantas linhas forem necessárias.

4. `public static void main(String[] args)`

Seu método (Função) de entrada chamado main com um array de strings como argumento:

- **public:** Modificador de acesso.

- **static:** static é uma palavra-chave reservada, o que significa que um método é acessível e utilizável, mesmo que não exista nenhum objeto da classe.

- **void:** palavra-chave declara que nada seria retornado do método. O método pode retornar qualquer tipo primitivo ou objeto.

- **Conteúdo do método:** O conteúdo do método está dentro das chaves `{}`.

5. `System.out.println("Hello World!")`

- **System:** É o nome da classe de utilitários Java.

- **out:** é um objeto que pertence a classe System.

- **println:** É o nome do método utilitário que é usado para enviar qualquer String para o console.

- **"Hello World!":** É literalmente String definido como argumento para o método println().

## Classes em Java

Java é uma linguagem orientada a objetos, o que significa que possui construções para representar objetos do mundo real. Cada programa Java possui pelo menos uma classe que sabe como fazer certas coisas ou como representar algum tipo de objeto. Por exemplo, a classe mais simples, HelloWorld, sabe como "cumprimentar" o mundo.

As classes em Java podem ter métodos (ou funções) e campos (ou atributos ou propriedades). Vamos dar um exemplo do objeto Carro, que possui várias propriedades, como cor, velocidade máxima, etc... Juntamente com funções como correr e parar. No mundo Java, vamos representá-lo como abaixo:

```java
package br.com.java.aula;

public class Carro {
  private String cor;
  private int velocidadeMax;

  public String infoCarro() {
    return cor + " Velocidade Máxima: " + velocidadeMax;
  }

  // construtor da Classe Carro
  Carro(String corCarro, int limiteVelocidade) {
    this.cor = corCarro;
    this.velocidadeMax = limiteVelocidade;
  }
}
```

Vamos criar uma classe chamada TesteCarro, que instancia o objeto da classe Carro, chama o método infoCarro() e vê a saída.

```java
package br.com.java.aula;

public class TesteCarro {

  public static void main(String[] args) {
    Carro maserati = new Carro("Vermelha", 325);
    Carro ferrari = new Carro("Amarela", 400);

    System.out.println(maserati.infoCarro());
    System.out.println(ferrari.infoCarro());
  }
}
```

Podemos executar o programa Java TesteCarro porque ele possui o método principal. O método principal é o ponto de partida para qualquer execução e programa Java. Executar um programa significa dizer à Java Virtual Machine (JVM) para "carregar a classe e começar a executar o método main(). Em seguida, continuar executando até que todo o código no main seja concluído".

## Diretrizes de programação

Os identificadores Java devem começar com uma letra, um caractere de moeda `$` ou um caractere de conexão, como o sublinhado `_`. Identificadores não podem começar com um número. Após o primeiro caractere, os identificadores podem conter qualquer combinação de letras, caracteres monetários, caracteres de conexão ou números. Por exemplo:

- `int variavel1 = 10; // isso é válido`

- `int 4var = 10; // isso é inválido, o identificador não pode começar com um número`

Identificadores, nomes de métodos e nomes de classes diferenciam maiúsculas de minúsculas; var e Var são dois identificadores diferentes. Você naõ pode usar palavras-chaves Java como identificadores.

Para classes e interfaces, a primeira letra deve ser maiúscula e, se várias palavras estiverem vinculadas para formar o nome, a primeira letra das palavras internas deverá estar em maiúsculas (um formato que é conhecido como `camelCase`)

Para os métodos a primeira letra deve estar em minúscula e, em seguida, devem ser usadas camelCase. Veja os exemplos de nomes de métodos abaixo:

- getBalance();

- doCalculation();

- setCustomerName();

Para as variáveis o formato camelCase deve ser usado, começando com uma letra minúscula. É recomendado nomes curtos e significativos, o que nos parece bom. Alguns exemplos:

- buttonWidth;

- saldoDaConta;

- empName;

Para definir uma constante é criada uma variável estática e final. As constantes devem ser nomeadas usando letras maiúsculas com caracteres sublinhados como separadores:

- MIN_HEIGHT;

Pontos importantes a serem observados, pode haver apenas uma classe pública por arquivo de código-fonte. Além disso, os comentários podem aparecer no início ou no final de qualquer linha no arquivo de código-fonte; eles são independentes de qualquer uma das regras de posicionamento discutidas aqui. Outro ponto é que se houver uma classe pública em um arquivo, o nome do arquivo deverá corresponder ao nome da classe pública. Por exemplo, uma classe declarada como `public class Cachorro {}` deve estar em um arquivo de código-fonte chamado Cachorro.java.

## Tipos de dados primitivos em Java

Nem tudo em Java é um objeto. Há um grupo especial de tipos de dados (também conhecidos como tipos primitivos) que são utilizados com bastante frequência na programação. Por motivos de desempenho, os desenvolvedores da linguagem Java decidiram incluir esses tipos primitivos. Java determina o tamanho de cada tipo primitivo. Esses tamanhos não mudam de um sistema operacional para outro. Esse é um dos principais recursos da linguagem que torna o Java tão portátil. Java define oito tipos primitivos de dados: **byte, short, int, long, char, floar, double e boolean**. Os tipos primitivos também são comumente referidos como tipos simples, que podem ser colocados em quatro grupos:

- **Inteiros:** esse grupo inclui byte, short, int e long, que são para números assinalados com valor inteiro.

- **Números de ponto flutuante:** esse grupo inclui float e double, que representam números com precisão fracionária.

- **Caracteres:** esse grupo inclui caracteres (char), que representam símbolos em um conjunto de caracteres, como letras e números.

- **Booleano:** este grupo inclui o tipo booleano (boolean), que é um tipo especial para representar valores verdadeiros ou falsos.

É bom escolher o tipo primitivo certo para economizar memória. Porque as variáveis alocam espaço na memória do computador. Por exemplo: armazenar muitos números no intervalo de -128 a 127 na matriz, declare suas variáveis como byte, não int ou long.

- `int` - usa 32 bits de memória

- `long` - usa 64 bits de memória

- `byte` - usa 8 bits de memória

No exemplo acima, armazenamos o número 24 em 3 variáveis com diferentes tipos primitivos. Observe a quantidade de alocação de memória de para os três tipos. Byte é 4 vezes menor que int e 8 vezes menor que long;

Vamos discutir cada um em detalhes:

### byte

O menor tipo inteiro é byte. Tem um valor mínimo de -128 e uma valor máximo de 127 (inclusive). O tipo de dados de bytes pode ser útil para economizar memória em matrizes grandes, onde a economia de memória realmente importa. As variáveis de bytes são declaradas pelo uso da palavra-chave `byte`. Por exemplo, o seguinte declara e inicializa uma variável de bytes chamada b:

`byte b = 100;`

### short

O tipo de dados short é um inteiro de complemento de dois de 16 bits e assinado. Tem um valor mínimo de -32.768 e um valor máximo de 32767 (inclusive). Assim como no byte, as mesmas diretrizes se aplicam: você pode usar um short para economizar memória em matrizes grandes, em situações em que a economia de memória realmente importa. O exemplo a seguir declara e inicializa uma variável do tipo short chamada s:

`short s = 168;`

### int

O tipo inteiro mais utilizado é o int. É um tipo assinado de 32 bits que tem um intervalo de –2.147.483.648 a 2.147.483.647 (inclusive). Além de outros usos, variáveis do tipo int são comumente empregadas para controlar loops e indexar matrizes. Esse tipo de dados provavelmente será grande o suficiente para os números que seu programa usará, mas se você precisar de um intervalo maior de valores, use long.

`int v = 64827;`

### long

Long é um tipo assinado de 64 bits e é útil para aquelas ocasiês em que um tipo int não é grande o suficiente para armazenar o valor desejado. Possui um valor mínimo de -9.223.372.036.854.775.808 e um valor máximo de 9.223.372.036.854.775.807 (inclusive). O uso desse tipo de dados pode estar no aplicativo bancário quando uma quantidade grande deve ser calculada e armazenada.

`long bigNumber = 1234567891L;`

### float

Os números de ponto flutuante, também conhecidos como números reais, são usados ao avaliar expressões que requerem precisão fracionária. Por exemplo, cálculo de taxa de jutos ou cálculo da raiz quadrada. O tipo de dados flutuante é um ponto flutuante IEEE 754 de 32 bits e precisão única. Como nas recomendações para byte e short, use um ponto flutuante (ao invés de double) se precisar economizar memória em grandes matrizes de números de ponto flutuante. O tipo float especifica um valor de precisão único que usa 32 bits de armazenamento. A precisão única é mais rápida em alguns processadores e ocupa metade do espaço da precisão dupla.

`float taxaJuros = 12.25f;`

### double

A precisão dupla, como indicado pela palavra-chave double, usa 64 bits para armazenar um valor. A precisão dupla é realmente mais rápida do que a precisão única em alguns processadores modernos que foram otimizados para cálculos matemáticos de alta velocidade. Todas as funções matemáticas transcendentais, como sin(), cos() e sqrt(), retornam valores duplos. Sintaxe da declaração e inicialização para variáveis duplas em Java:

`double duplo = 12345.234d;`

### boolean

O tipo de dados booleano possui apenas dois valores possíveis: verdadeiro e falso. Use esse tipo de dados para sinalizadores simples que rastreiam condições verdadeiras / falsas. Este é o tipo retornado por todos os operadores relacionais, como no caso de a < b. Booleano também é o tipo exigido pelas expressões condicionais que governam as instruções de controle, como if ou while.

`boolean b = false;`

### char

Em Java, o tipo de dados usado para armazenar caracteres é char. O tipo de dados char é um único caractere Unicode de 16 bits. Ele tem um valor mínimo de ‘\ u0000’ (ou 0) e um valor máximo de ‘\ uffff’ (ou 65.535 inclusive). Não há caracteres negativos.

`char ch1 = 88; // código para a letra X`
`char ch2 = "Y";`

## Variáveis primitivas

### Variável de nível de classe (instância)

Não é obrigatório inicializar a variável de nível de classe (instância). Se não inicializamos, o compilador de variáveis de instância atribui o valor padrão a ele. De um modo geral, esse padrão será `0` ou `null`, dependendo do tipo de dado. Contudo, confiar nesses valores padrões é geralmente considerado uma prática ruim de codificação.

### Variável local do método

As variáveis locais do método precisam ser inicializadas antes de usá-lo. O compilador nunca atribui um valor padrão a uma variável local não inicializada. Se você não conseguir inicializar sua variável local onde ela é declarada, certifique-se de atribuir um valor a ela antes de tentar usá-la. O acesso a uma variável local não inicializada resultará em um erro em tempo de compilação. Vamos ver um programa Java simples que declara, inicializa e imprime todos os tipos primitivos.

```java
package primitivo;

public class DemoPrimitivo {

  public static void main(String[] args) {
    byte b = 100;
    short s = 135;
    int v = 123543;
    int calc = -9876345;
    long quant = 1234567891L;
    float taxaJuros = 12.25f;
    double sineVal = 12345.234d;
    boolean flag = true;
    boolean val = false;
    char ch1 = 88; // código para a letra X
    char ch2 = "Y";

    System.out.println("Valor do byte: " + b);
    System.out.println("Valor do short: " + s);
    System.out.println("Valor do int positivo: " + v);
    System.out.println("Valor do int negativo: " + calc);
    System.out.println("Valor do long: " + quant);
    System.out.println("Valor do float: " + taxaJuros);
    System.out.println("Valor do double: " + sineVal);
    System.out.println("Valor do boolean flag: " + flag);
    System.out.println("Valor do boolean val: " + val);
    System.out.println("Valor do char inicializado com o código: " + ch1);
    System.out.println("Valor do char inicializado com o caractere: " + ch2);
  }
}
```

Saída da classe DemoPrimitivo:

![img 02](./assets/cs01-02.png)

Resumo dos tipos de dados:

![img 03](./assets/cs01-03.png)
