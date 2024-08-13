# Entendendo Ordenação

Processos de ordenação de números são muito importantes em computação. Existem vários tipos de algoritmos de ordenação, como, por exemplo: insertionsort, selectionsort, bubblesort, shellsort, heapsort, quicksort, mergesort, radixsort, entre outros.

Usamos uma notação matemática especial para representar o desempenho de algoritmos. A diferença está no tempo de execução. O pior deles leva o tempo O(n²) e o melhor deles leva tempo O(n). Quanto mais rápido cresce a função (n² cresce mais rápido que n) pior ela é, porque requer um maior número de operações para uma entrada de n elementos. Entretanto, os recursos necessários para o desenvolvimento desses algoritmos também mudam. Os algoritmos que de tempo O(n) utilizam menos recursos computacionais em relação aos que levam tempo quadrático O(n²).

Em muitas aplicações, os elementos precisam ser ordenados. E, para ordenar, você precisa rearranjar um conjunto de informações numa disposição que pode ser crescente ou decrescente. O principal objetivo de se ter os dados ordenados é a facilidade posterior de se realizar buscas.

Imagine procurar uma palavra em um dicionário físico, porém de forma que as palavras foram colocadas aleatoriamente. Ficaria muito difícil de encontrar a palavra, concorda? Por isso, no dicionário, as palavras estão ordenadas alfabeticamente. As comparações são poucas e a busca muito rápida, mesmo havendo milhares de palavras de entrada, representadas por n.

## Bubblesort

O bubblesort ou ordenação por bolhas é assim chamado porque tem a ideia de que os números maiores vão flutuando como bolhas até chegar na última posição, ou em suas posições corretas. Na computação, o bubblesort é um dos algoritmos de ordenação mais utilizados, por ser fácil de entender, desenvolver e de se usar.

Você vai comparando elementos dois a dois e quando o primeiro número é maior do que o segundo, acontece a troca dos elementos. Dessa forma, a comparação acontece do primeiro com o segundo elemento, do segundo com o terceiro elemento, do terceiro com o quarto, e assim sucessivamente até o penúltimo com o último elemento. Isso garante que o último elemento será o maior.

O processo continua, porém, agora considera a lista do primeiro até o penúltimo elemento, pois o último já está ordenado. O processo termina quando sobrar apenas um elemento para ordenar. Nesse caso, a lista toda já estará ordenada.

```java
public class Bubblesort {
  public static void main(String[] args) {
    int[] numbers = { 38, 55, 66, 25, 17, 44, 9, 82, 64, 32 };

    int n = numbers.length;
    boolean swapped;

    do {
      swapped = false;

      for (int i = 1; i < n; i++) {

        if (numbers[i - 1] > numbers[i]) {
          int aux = numbers[i - 1];
          numbers[i - 1] = numbers[i];
          numbers[i] = aux;
          swapped = true;
        }

      }

      n--;

    } while (swapped);

    for (int i = 0; i < numbers.length; i++) {
      System.out.println(numbers[i]);
      // 9, 17, 25, 32, 38, 44, 55, 64, 66, 82
    }

  }
}
```

## Quicksort

O Quicksort é o algoritmo de ordenação por troca de partição. O Quicksort usa a ideia de uma ordenação dos elementos por meio de partições.

No Quicksort, a lista é dividida em sublistas. Essas sublistas são as partições. Cada uma das partições é dividida novamente em outras partições até que a divisão não tem mais como acontecer. Nesse caso, a partição vai ter apenas um elemento.

A ideia do Quicksort é dividir o problema em problemas menores e depois conquistar para que possam ser solucionados de forma mais fácil e rápida.

O Pivô é o elemento escolhido de dentro da lista, normalmente, é o primeiro elemento. Ele ajuda a determinar as partições, de forma que s elementos da primeira partição são menores ou iguais ao pivô, depois vem o pivô, e os elementos da segunda lista são maiores do que o pivô.

```java
public class Quicksort {

  public static void main(String[] args) {
    int[] array = { 10, 7, 8, 9, 1, 5 };
    int n = array.length;

    quickSort(array, 0, n - 1);
    System.out.println("Array ordenado:");
    for (int i : array) {
      System.out.print(i + " ");
    }
  }

  public static void quickSort(int[] array, int low, int high) {
    if (low < high) {
      int pi = partition(array, low, high);

      quickSort(array, low, pi - 1);
      quickSort(array, pi + 1, high);
    }
  }

  public static int partition(int[] array, int low, int high) {
    int pivot = array[high];
    int i = (low - 1);

    for (int j = low; j < high; j++) {
      if (array[j] <= pivot) {
        i++;
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
      }
    }

    int temp = array[i + 1];
    array[i + 1] = array[high];
    array[high] = temp;

    return i + 1;
  }
}
```

## Mergesort

O Mergesort é um algoritmo de ordenação por intercalação, porque utiliza a ideia de uma ordenação dos elementos por meio da união de elementos já ordenados.

No Mergesort, a ideia é unir duas metades que já estão ordenadas de duas sublistas de informações, e a partir disso gerar uma lista ordenada de dados. As sublistas de informações precisam estar ordenadas primeiro. Neste caso, essas sublistas foram geradas de outras sublistas de informações que já estavam ordenadas. Essa subdivisão acontece até que a sublista tenha menos do que dois elementos.

Quando você tem uma lista de informações, a primeira sublista estará com a primeira metade da lista de informações e a segunda sublista com a segunda metade da lista de informações.

A ideia do Mergesort é dividir o problema em problemas menores e depois conquistar para que possam ser solucionados de forma mais fácil e rápida.

```java
public class Mergesort {

  public static void main(String[] args) {
    int[] array = { 10, 7, 8, 9, 1, 5 };
    int n = array.length;

    mergeSort(array, 0, n - 1);
    System.out.println("Array ordenado:");
    for (int i : array) {
      System.out.print(i + " ");
    }
  }

  public static void mergeSort(int[] arr, int left, int right) {
    if (left < right) {
      int middle = (left + right) / 2;

      mergeSort(arr, left, middle);
      mergeSort(arr, middle + 1, right);
      merge(arr, left, middle, right);
    }
  }

  public static void merge(int[] arr, int left, int middle, int right) {
    int n1 = middle - left + 1;
    int n2 = right - middle;

    int[] leftArray = new int[n1];
    int[] rightArray = new int[n2];

    for (int i = 0; i < n1; i++) leftArray[i] = arr[left + i];
    for (int j = 0; j < n2; j++) rightArray[j] = arr[middle + 1 + j];

    int i = 0, j = 0;
    int k = left;

    while (i < n1 && j < n2) {

      if (leftArray[i] <= rightArray[j]) {
        arr[k] = leftArray[i];
        i++;
      } else {
        arr[k] = rightArray[j];
        j++;
      }

      k++;
    }

    while (i < n1) {
      arr[k] = leftArray[i];
      i++;
      k++;
    }

    while (j < n2) {
      arr[k] = rightArray[j];
      j++;
      k++;
    }
  }
}
```
