# Entendendo Vetores e Matrizes

## Definição, Declaração e Atribuição

Vetor é considerado uma estrutura de dados homogênea, pois é capaz de armazenar vários dados, desde que todos sejam do mesmo tipo. Ou seja, declarando um único vetor com um nome, é possível manipular uma lista com vários dados de um mesmo tipo.

Um vetor, enquanto estrutura de dados homogênea, é quase considerado como outra variável, pois pode, inclusive, ser manipulado dentro de outras estruturas. Por exemplo, a de decisão - simples, composta ou aninhada - ou dentro de uma estrutura de múltipla escolha, mesmo nas de repetição.

O vetor é uma matriz unidimensional, tem este nome porque é uma matriz com uma única linha. Na hora de declarar um vetor, você precisa saber o tipo de dados que será armazenado e a quantidade de elementos. Além disso, também é necessário definir um nome para o vetor. Por exemplo:

`notas[5] real;`

Nesse exemplo, foi declarado um vetor chamado notas com 5 elementos do tipo real. Para atribuir valores no vetor, você faz do mesmo modo como se fosse para qualquer outra variável, mas é preciso indicar a posição:

- notas[0] = 9,5; // a posição zero (inicial) do vetor recebe 9,5
- notas[1] = 8,0;
- notas[2] = 9,0;
- notas[3] = 8,5;
- notas[4] = 9,5;

Assim como o Vetor, a Matriz é considerada uma estrutura de dados homogênea, possuindo as mesmas especificidades, porém, é composta por linhas e colunas. Entretanto, uma matriz unidimensional é chamada de vetor porque possui uma única linha.

Na hora de se declarar uma matriz, você precisa saber o tipo do dado que será armazenado e a quantidade de elementos da linha e da coluna. Você precisa também definir um nome para a matriz. Por exemplo:

`notas[3][2] real;`

Nesse exemplo, foi declarada uma matriz chamada notas com 3x2=6 elementos do tipo real. Para atribuir valores na matriz, você faz do mesmo modo com se fosse para qualquer outra variável, apenas precisa indicar a posição da linha e da coluna:

- notas[0][0] = 9,5;
- notas[0][1] = 8,0;
- notas[1][0] = 9,0;
- notas[1][1] = 8,5;
- notas[2][0] = 9,5;
- notas[2][1] = 9,0;

## Algoritmos com vetores e matrizes

Para exemplificar algoritmos com vetores, vamos mostrar um algoritmo que apresenta os valores que estão armazenados no vetor.

```java
public class MostrarVetor {
  public static void main(String[] args) {
    int vet = new int[25];
    Scanner input = new Scanner();

    for (int i = 0; i < 25; i++) {
      System.out.println("Digite um valor inteiro: ");
      vet[i] = input.nextInt();
    }

    for (int i = 0; i < 25; i++) {
      System.out.println(vet[i]);
    }
  }
}
```

Quando os valores de um vetor são apresentados, você precisa saber qual o tipo de dado está armazenado nele e quantos elementos têm nesse vetor. Os dados são apresentados para cada posição do vetor e a forma em que os elementos são mostrados para o usuário são iguais quando você apresenta o valor de uma variável.

Para exemplificar algoritmos com matriz, vamos mostrar um algoritmo que apresenta os valores que estão armazenados na matriz.

```java
public class MostrarMatriz {
  public static void main(String[] args) {
    int[][] mat = new int[5][5];
    Scanner input = new Scanner(System.in);

    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 5; j++) {
      System.out.println("Digite um valor inteiro: ");
      mat[i][j] = input.nextInt();
    }

    input.close();

    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 5; i++) {
      System.out.println(mat[i][j]);
    }
  }
}
```

Quando os valores de uma matriz são apresentados, você precisa saber o tipo de dado que está armazenado e também quantos elementos têm nela. Os dados são apresentados para cada posição, linha e coluna, e a forma em que os elementos são mostrados para o usuário são iguais quando você apresenta o valor de uma variável.

## Aplicando com vetores e matrizes

Vamos exemplificar por meio de uma tabela com a média das notas de estudantes de uma disciplina educacional que possui quatro turmas, A, B, C e D, para as disciplinas de Matemática, Português, História e Geografia.

Para construir a tabela, vamos colocar o nome das disciplinas nas colunas e das turmas em cada linha. Vamos chamar a tabela, ou matriz, por Notas, como podemos observar a seguir:

| Notas      | Matemática[0] | Português[1] | História[2] | Geografia[3] |
| ---------- | ------------- | ------------ | ----------- | ------------ |
| Turma A[0] | 8             | 9            | 8           | 9            |
| Turma B[1] | 7             | 5            | 6           | 6            |
| Turma C[2] | 8             | 7            | 7           | 7            |
| Turma D[3] | 7             | 8            | 8           | 9            |

Desta forma, temos, por exemplo:

- notas[0][0] = 8; // linha 1, coluna 1
- notas[0][2] = 8; // linha 1, coluna 3
- notas[1][1] = 5; // linha 2, coluna 2
- notas[1][3] = 6;
- notas[2][2] = 7;
- notas[3][1] = 8;

A matriz notas possui 4 linhas e 4 colunas, somando um total de 4x4 elementos, que são as notas.

As matrizes são vastamente utilizadas, inclusive em disciplinas como a Matemática Aplicada à Computação. Também podemos desenvolver algoritmos e programas para diversos campos do conhecimento, como Economia, Engenharias, a própria Matemática com a Álgebra e a Geometria, além de diversas aplicações em Física, Computação, entre outros.

## Exercitando com vetores e matrizes

Desenvolva um algoritmo que receba 100 valores numéricos inteiros e mostre a soma desses números.

Quando a gente resolve exercícios que são para o desenvolvimento de algoritmos, precisamos ficar atentos a todos os detalhes do enunciado, bem como à entrada, ao processamento e à saída.

A entrada neste algoritmo são 100 números inteiros.

O processamento neste algoritmo é somar os 100 números inteiros.

A saída neste algoritmo é apresentar a soma dos 100 números inteiros.

```java
import java.util.Scanner;

public class Somar {
  public static void main(String[] args) {
    int[] numbers = new int[100];
    int soma = 0;
    Scanner input = new Scanner(System.in);

    for (int i = 0; i < 100; i++) {
      System.out.println("Digite um número inteiro: ");
      numbers[i] = input.nextInt();
      soma += numbers[i];
    }

    input.close();
    System.out.println(soma);
  }
}
```

Desenvolva um algoritmo que receba 120 valores numéricos inteiros, numa matriz 10x12 e mostre a soma destes 120 números.

A entrada neste algoritmo são 120 números inteiros.

O processamento neste algoritmo é somar os 120 números.

A saída neste algoritmo é apresentar a soma dos 120 números.

```java
import java.util.Scanner;

public class Somar {
  public static void main(String[] args) {
    int[][] numbers = new int[10][12];
    int soma = 0;
    Scanner input = new Scanner(System.in);

    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 12; j++) {
        System.out.println("Digite um número inteiro: ");
        numbers[i][j] = input.nextInt();
        soma += numbers[i][j];

      }
    }

    input.close();
    System.out.println(soma);
  }
}
```
