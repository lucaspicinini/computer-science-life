# Entendendo as Aplicações de Pilha

Serão apresentadas a seguir as definições das operações de Pilha, a manipulação das operações, a aplicação das operações e as aplicações no Java.

## Definindo as operações de Pilha

A operação Pilha Vazia é uma função sem parâmetros, que retorna verdadeiro se a Pilha estiver vazia e falso se a pilha não estiver vazia.

```java
public Boolean PilhaVazia() {
  if(topo == -1) {
    return true;
  } else {
    return false;
  }
}
```

A operação Pilha Cheia é uma função sem parâmetros, que retorna verdadeiro se a Pilha estiver cheia e falso se a Pilha não estiver cheia.

```java
public Boolean PilhaCheia() {
  if(topo >= length - 1) {
    return true;
  } else {
    return false;
  }
}
```

A operação Empilhar é um procedimento das operações de Pilha que recebe um elemento como parâmetro. Este é o elemento que será empilhado. A operação empilhar verifica se a pilha não está cheia, antes de empilhar o elemento. O elemento não poderá ser empilhado se a pilha estiver cheia. Além disso, ele mostra uma mensagem para o usuário, caso contrário, há espaço para empilhar e o elemento é empilhado na pilha.

```java
public void Empilhar(Integer n) {
  if(!PilhaCheia()) {
    topo++;
    vetor[topo] = n;
  } else {
    System.out.println("Pilha cheia!");
  }
}
```

A operação Desempilhar é uma função sem parâmetros das operações de pilha e verifica se a pilha não está vazia antes de desempilhar o elemento. O elemento não poderá ser desempilhado se a pilha estiver vazia, pois hão haverá elemento na pilha para ser desempilhado. Caso a pilha não esteja vazia, então o elemento é desempilhado e retornado.

```java
public Integer Desempilhar() {
  Integer desempilhado = null;

  if(PilhaVazia()) {
    System.out.println("Pilha vazia!");
  } else {
    desempilhado = vetor[topo];
    topo--;
  }

  return desempilhado;
}
```

A operação elemento topo é uma operação de manipulação da pilha, que é um procedimento que mosta o elemento do topo da pilha.

```java
public void ElementoTopo() {
  if(topo >= 0) {
    System.out.println("E elemento do topo é: " + vetor[topo]);
  } else {
    System.out.println("Pilha vazia!");
  }
}
```

A operação Mostrar Pilha é uma operação de manipulação da pilha, que é um procedimento que mostra os elementos da pilha para o usuário.

```java
public void MostrarPilha() {
  if(PilhaVazia()) {
    System.out.println("Pilha vazia!");
  } else {
    for(int i = 0; i < vetor.length; i++) {
      System.out.println("Index: " i " - " + vetor[i]);
    }
  }
}
```

Definindo a construção da classe:

```java
public class Pilha {
  private Integer tamanho;
  private Integer topo;
  private Integer vetor[];

  public Pilha(Integer tamanho) {
    this.topo = -1;
    this.tamanho = tamanho;
    this.vetor = new int[tamanho];
  }

  // aqui virão as operações de Pilha descritas ao longo do texto.
}
```
