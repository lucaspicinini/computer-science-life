# Entendendo a Recursão II

A recursão é bastante poderosa, pois permite que uma função ou um procedimento possa chamar a execução dentro dele mesmo. Uma vez que a função ou procedimento forem definidos, é possível executar a mesma função ou procedimento várias vezes.

## Algoritmos de Recursão sem Cauda

A recursão sem cauda acontece quando, durante a execução da recursão, ele não deixa um rastro na memória, isto é, naõ tem uma cauda.

A recursão sem cauda, normalmente, acontece quando a sua recursão é um procedimento e não retorna um valor.

### Recursão sem cauda em Java

A linguagem de programação que estamos utilizando é a linguagem Java.

Lembre-se de que você deve deixar seu programa bem alinhado e identado para que, posteriormente, consiga entender e dar suporte para o programa.

A documentação é uma parte importante quando se desenvolve um programa. Faça sempre comentários no seu código.

Para exemplificar a aplicação da recursão sem cauda com a linguagem de programação Java, vamos desenvolver um exercício simples.

Uma delas é o desenvolvimento de um algoritmo, em Java, que calcula o número fatorial de um número natural. Neste caso, vamos utilizar o método procedimento e recursão sem cauda:

```java
import javax.swing.*;

public class Fatorial {
  public static void fat(int n, int x, int f) {
    if (x == 0 || x == 1) {
      System.out.println("O fatorial de " + n + " é " + f);
    } else {
      fat(n, x - 1, f * x);
    }
  }
}
```

Segue o método main que realiza a chamada do método procedimento recursivo do cálculo do fatorial:

```java
public static void main(String[] args) {
  int nro;
  nro = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para calcular o fatorial:"));

  if (nro < 0) {
    System.out.println("Valor inválido! O número precisa ser maior ou igual a zero.");
    System.exit(0);
  } else {
    fat(nro, nro, 1);
  }

  System.exit(0);
}
```

## Algoritmos de Recursão com Cauda

A recursão com cauda acontece quando, durante a execução da recursão, ele deixa um rastro na memória, o que chamamos de cauda.

A recursão com cauda, normalmente, acontece quando a sua recursão é uma função e retorna um valor.

### Recursão com cauda em Java

A linguagem de programação que estamos utilizando é a linguagem Java.

Lembre-se de que você deve deixar seu programa bem alinhado e identado para que, posteriormente, consiga entender e dar suporte para o programa.

A documentação é uma parte importante quando se desenvolve um programa. Faça sempre comentários no seu código.

Para exemplificar a aplicação da recursão com cauda com a linguagem de programação Java, vamos desenvolver um exercício simples. Neste caso, vamos utilizar o método função e a recursão com cauda:

```java
import javax.swing.*;

public class Fatorial {
  public static int fat(int n) {
    if (n == 0) {
      return 1;
    } else {
      return n * fat(n - 1);
    }
  }
}
```

Segue o método main que realiza a chamada do método função recursivo do cálculo do fatorial:

```java
public static void main(String[] args) {
  int f, nro;
  nro = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para calcular o fatorial:"));

  if (nro < 0) {
    System.out.println("Valor inválido! O número precisa ser maior ou igual a zero.");
    System.exit(0);
  } else {
    f = fat(nro);
    System.out.println("O fatorial de " + nro + " é " + f);
  }
}
```
