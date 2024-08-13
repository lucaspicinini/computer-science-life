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

  // Função principal que implementa o QuickSort
  public static void quickSort(int[] array, int low, int high) {
    if (low < high) {
      // Índice do pivô, o array está agora dividido em duas partes
      int pi = partition(array, low, high);

      // Ordena recursivamente as sublistas
      quickSort(array, low, pi - 1);
      quickSort(array, pi + 1, high);
    }
  }

  // Função para realizar a partição do array
  public static int partition(int[] array, int low, int high) {
    int pivot = array[high]; // Escolhe o último elemento como pivô
    int i = (low - 1); // Índice do menor elemento

    for (int j = low; j < high; j++) {
      // Se o elemento atual é menor ou igual ao pivô
      if (array[j] <= pivot) {
        i++;
        // Troca array[i] e array[j]
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
      }
    }

    // Troca array[i + 1] e array[high] (ou pivô)
    int temp = array[i + 1];
    array[i + 1] = array[high];
    array[high] = temp;

    return i + 1; // Retorna o índice do pivô
  }
}
