# Entendendo as Estruturas de Dados

Estruturas de Dados é uma disciplina que apresenta como organizar e manipular dados, sendo parte essencial na composição de programas e algoritmos.

Partes de um dado ou um dado inteiro, normalmente, é referenciado por uma variável. Por exemplo, o dados `idade` das pessoas em um programa pode estar associado a uma variável inteira, denominada idade. Em outras palavras, a idade é uma variável do tipo número inteiro.

A forma como os dados são organizados, manipulados e armazenados, além da forma como são processados, afetam o desempenho de um programa ou algoritmo.

## Definição

O estudo das Estruturas de Dados é muito importante quando falamos de programação e de qualquer curso na área da Tecnologia da Informação e das Engenharias.

Niklaus Wirth, o criador da linguagem Pascal, dizia que qualquer programa é o resultado da junção entre algoritmos e estruturas de dados.

Assim como os números podem ser representados em diferentes sistemas de numeração, os dados também podem ser armazenados em diferentes estruturas de dados.

Um desenvolvedor pode fazer uso de diferentes formas para armazenar os dados na memória de computador, nos discos e na nuvem para então serem processados.

Há diferentes tipos de estruturas de dados e cada tipo pode afetar o desempenho do algoritmo. O consumo de memória e o tempo de execução são parâmetros importantes na escolha da estrutura de dados adequada.

Por isso, o estudo das estruturas de dados tem por objetivo analisar diferentes formas de armazenamento de dados, verificando o desempenho de cada tipo de estrutura e a escolha do melhor algoritmo que se adequa ao problema a ser resolvido.

Vamos supor que você tenha um conjunto de dados com um determinado tamanho N que precisa ser processado. Saber escolher entre uma estrutura de dados A ou B para o armazenamento deste conjunto pode fazer com que o programa gaste mais ou menos memória.

Isso também pode acontecer em relação ao tempo de execução, que poderá variar de acordo com a estrutura escolhida.

Por isso, a escolha adequada da estrutura de dados deve ser feita considerando a complexidade do problema a ser resolvido, com a mesma quantidade de memória disponível, levando em conta, ainda, o tempo que se pode gastar para resolver determinado problema.

É muito importante determinar qual a melhor estrutura de dados a ser utilizada de acordo com cada tipo de problema a ser resolvido.

Para a representação das estruturas de dados, inicialmente, vamos desconsiderar as declarações específicas das linguagens de programação, procurando definições abstratas, de modo a não se preocupar com detalhes de implementação. É bom lembrar que certas estruturas de dados variam na forma como são declaradas de uma linguagem para outra.

Neste estudo, vamos utilizar o conceitos das estruturas de dados independentemente das implementações específicas de cada linguagem de programação.

## Tipos

Em nossos estudos, consideramos a definição de cada estrutura e o desenvolvimento dos algoritmos e métodos para se operar com cada estrutura de dados.

Essas estruturas podem ser divididas em dois tipos de blocos, em relação à sua disposição na memória:

- estruturas de alocação dinâmica
- estruturas de alocação estática

Os algoritmos que definem estas estruturas de dados podem ser desenvolvidos de duas formas:

- iterativa
- recursiva

O armazenamento dos dados nas estruturas de dados podem ser ainda:

- heterogêneo
- homogêneo

Pode-se utilizar os registros como uma estrutura de dados heterogênea que tem a capacidade de armazenar vários dados de diferentes tipos. Cada registro possui campos e cada campo pode ser definido por tipos diferentes de dados.

Por exemplo, podemos ter um registro chamado estudante e, neste registro, os campos nome, numero de registro do estudante, média, entre outros. Perceba que o nome é um tipo alfanumérico, número de registro é do tipo inteiro e média é do tipo real(não inteiro).

Assim, por ser capaz de armazenar diferentes tipos, o registro é uma estrutura de dados heterogênea.

## Aplicações

Quando utilizamos estruturas de dados no desenvolvimento de programas para resolver um problema, existem algumas operações básicas que são feitas com os dados, tais como:

- inclusão de um novo dado
- busca por um dado
- exclusão de um dado
- alteração de um dado já existente

Em algumas situações, para que estas operações sejam realizadas, é necessário a ordenação dos dados ou o armazenamento de dados em estruturas auxiliares para que possam ser utilizadas posteriormente.

Para um desenvolvedor de uma aplicação, pode ser indiferente o armazenamento dos dados em uma estrutura de dados do tipo árvore binária ou em um vetor, porém, para o desempenho na hora da execução do programa e na utilização otimizada dos recursos computacionais, isso é muito importante.

Uma mesma aplicação feita por programadores diferentes pode ter implementações distintas com a mesma chamada. Por exemplo, se um programa A utiliza as estruturas de listas ligadas e um programa B utiliza a estrutura de árvores, as chamadas dos módulos podem ser, para ambos os casos, Incluir (dado). Excluir (dado), Pesquisar (dado), Modificar (dado).

O que muda é a implementação específica de cada biblioteca de módulos, mantendo ainda a interface e os programas que as utilizam.

#### Indicação de leitura

**Estrutura de Dados: algoritmos, análise da complexidade e implementações em Java e C/C++**, de Ana Fernanda Gomes Ascencio e Graziela Santos de Araújo, capítulo 1.
