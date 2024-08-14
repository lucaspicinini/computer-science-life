# Entendendo a Recursão I

Ao desenvolver um programa ou algoritmo é comum repetir um pedaço do código algumas vezes. Para isso, na maioria dos casos, utilizamos as estruturas de repetição. Porém, os códigos podem ficar muito complexos utilizando essas estruturas. Por isso, temos a possibilidade de substituir as estruturas de repetição pela estrutura recursiva ou Recursão.

A recursão é bastante poderosa pois permite que uma função ou um procedimento possa ser definido dentro dele mesmo. Uma vez definidos, você pode executá-los várias vezes. Isso acontece, pois, a chamada do módulo ou da função acontece dentro deles mesmos.

## Definição da Recursão

A recursão faz a chamada de uma função ou procedimento como parte de sua própria definição. A chave do funcionamento dela é garantir que existe uma condição que faça eles pararem.

Neste caso, acontece a execução de uma ação que não é recursiva pela mesma função ou procedimento, ou seja, na ação da parada, não se chama a função ou o procedimento recursivo novamente.

De forma direta ou indireta, há controle de fluxo do algoritmo, de forma que uma função ou procedimento chama a si mesmo.

Se uma função ou procedimento faz a própria chamada, a execução também chama a si mesmo e assim por diante, de forma contínua e sem fim. Esse acontecimento denomina-se recursão infinita, que é parecida com os erros quando se usa a estrutura de repetição, que deixam o programa rodar infinitamente.

Para que você não tenha recursão infinita em seus algoritmos, ela precisa ser criada de forma que você garanta que, em algum momento do programa, seja finalizada sem se chamar novamente.

Exemplo para cálculo do fatorial de um número:

```java
public static int fat(int n) {
  if (n == 0) {
    return 1;
  } else {
    return n * fat(n - 1);
  }
}
```

## Regras da Recursão

Ao desenvolver uma recursão, você precisa garantir a aplicação das três regras a seguir:

1. Saber quando parar.

2. Decidir como fazer a próxima ação.

3. Quebrar uma jornada recursiva em uma jornada recursiva menor a cada passo.

A primeira regra é a checagem para garantir que a recursão chegou ao fim, antes de tomar a decisão de ir para a outra jornada recursiva.

Na função do fatorial, se n = 0, então a recursão é encerrada, devolvendo o valor 1 de fat(0).

A segunda regra é uma forma de garantir que o problema seja quebrado em partes menores e mais fáceis de resolver.

Na função fatorial, se n > 0, então a recursão vai devolver n \* fat(n - 1), a chamada recursiva se chama, porém, passando como parâmetro um número menor.

A terceira regra permite que a recursão se chame novamente, com um problema menor.

## Recursão com e sem cauda

A recursão com cauda acontece quando, durante a execução da recursão, ele deixa um rastro na memória, o que chamamos de cauda. Normalmente, acontece quando a sua recursão é uma função e retorna um valor. Exemplo do cálculo fatorial na recursão com cauda:

```java
public static int fat(int n) {
  if (n == 0) {
    return 1;
  } else {
    return n * fat(n - 1);
  }
}
```

Vamos ver um exemplo da execução do algoritmo fatorial escrito em recursão com cauda e veja o rastro que ele deixa quando está executando:

fat(5)
5 _fat(4)
5_ 4 _fat(3)
5_ 4 _3_ fat(2)
5 _4_ 3 _2_ fat(1)
5 _4_ 3 _2_ 1 _fat(0)
5_ 4 _3_ 2 _1_ 1
5 _4_ 3 _2_ 1
5 _4_ 3*2
5* 4 _6
5_ 24

**120 = resultado do fatorial de 5.**

A recursão sem cauda acontece quando, durante a execução da recursão, não é deixado um rastro na memória. Ou quando sua recursão é um procedimento e não retorna um valor. Exemplo do cálculo fatorial na recursão sem cauda.

```java
public static int fat(int n, int f) {
  if (n > 1) {
    fat(n - 1, f * n);
  } else {
    System.out.println("O fatorial é " + f);
  }
}
```

Vamos ver um exemplo da execução do algoritmo do fatorial escrito em recursão sem cauda e veja que não fica rastro na memória durante sua execução:

fat(5, 1)
fat(4, 5)
fat(3, 20)
fat(2, 60)
fat(1, 120)

**O fatorial é 120**

## Aplicando Recursões

Vamos exemplificar a aplicação de recursão com duas funções bastante conhecidas. Uma delas é o cálculo do fatorial de um número e o outro é o cálculo do enésimo termo da série de Fibonacci.

Sabemos que o fatorial de um número é o produto da multiplicação deste pelo seu antecessor e, assim sucessivamente, até chegar no número 1, com exceção do 0, cujo fatorial é 1.

Escrevendo a definição da função fatorial na forma de função matemática, podemos representá-la como segue, considerante que n é um número natural:

`se n = 0, então, o fatorial(n) é 1`

`caso contrário, fatorial(n) = n * fatorial(n - 1), para n > 0`

Sabemos que o enésimo termo da série de Fibonacci é definido pela soma dos seus dois antecessores consecutivos, com exceção do Fibonacci do primeiro e do segundo termo que é igual a 1.

Escrevendo a definição da função Fibonacci na forma de função matemática, podemos representá-la como segue, considerante que n é um número natural:

`se n = 1, então, fibonacci(n) = 1`

`se n = 2, então, fibonacci(n) = 1`

`caso contrário, fibonacci(n) = fibonacci(n - 1) + fibonacci(n - 2), para n > 2`

Quando desenvolvemos algoritmos recursivos, conseguimos listar algumas vantagens que podem ser observadas:

- têm menos linhas de comandos de programação

- são muito mais fáceis de entender e compreender

- são mais legíveis e claros

- os seus programas são mais fáceis de serem implementados

Quando desenvolvemos algoritmos recursivos, também conseguimos listar algumas desvantagens que podem ser observadas:

- utilização de muita memória para armazenar os dados que ficam na recursão

- utilização de pilhas de memórias com alocação e liberação destas memórias

- são mais lentos quando comparados aos seus programas iterativos

- menos eficientes do que os programas iterativos

Quando desenvolvemos algoritmos recursivos, conseguimos listar algumas aplicações que podem ser observadas:

- um algoritmo recursivo nem sempre é o melhor algoritmo para resolver o problema proposto

- algoritmos recursivos são aplicados nas manipulações de estruturas de dados de árvores

- nos compiladores para os analisadores léxicos

- problemas que consideram tentativa e erro

Vamos exemplificar construindo um algoritmo recursivo para o seguinte problema: queremos calcular o fatorial de um número inteiro. Podemos dividir o problema em dois casos especiais:

- `se n = 0, então o valor de n! é 1`

- `caso contrário, n! = 1*2*3*...*(n - 2)*(n - 1) = (n - 1)! * n`

Podemos calcular o valor de n! calculando o valor de (n-1)! e então multiplicando esse valor pelo valor de n.

Matematicamente, essa definição pode ser escrita da seguinte forma:

`fat(n) = 1 se n = 0`

`fat(n) = n * fat(n - 1), caso contrário`
