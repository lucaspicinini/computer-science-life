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

  // Função principal que ordena o array arr[l..r] usando o MergeSort
  public static void mergeSort(int[] arr, int left, int right) {
    if (left < right) {
      // Encontra o meio do array
      int middle = (left + right) / 2;

      // Ordena a primeira e a segunda metade
      mergeSort(arr, left, middle);
      mergeSort(arr, middle + 1, right);

      // Junta as metades ordenadas
      merge(arr, left, middle, right);
    }
  }

  // Função que junta dois subarrays de arr[]
  // O primeiro subarray é arr[l..m]
  // O segundo subarray é arr[m+1..r]
  public static void merge(int[] arr, int left, int middle, int right) {
    // Tamanho dos subarrays a serem mesclados
    int n1 = middle - left + 1;
    int n2 = right - middle;

    // Arrays temporários
    int[] leftArray = new int[n1];
    int[] rightArray = new int[n2];

    // Copia os dados para os arrays temporários
    for (int i = 0; i < n1; i++)
      leftArray[i] = arr[left + i];
    for (int j = 0; j < n2; j++)
      rightArray[j] = arr[middle + 1 + j];

    // Índices iniciais dos subarrays e do array mesclado
    int i = 0, j = 0;

    // Índice inicial do array mesclado
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

    // Copia os elementos restantes de leftArray[], se houver
    while (i < n1) {
      arr[k] = leftArray[i];
      i++;
      k++;
    }

    // Copia os elementos restantes de rightArray[], se houver
    while (j < n2) {
      arr[k] = rightArray[j];
      j++;
      k++;
    }
  }
}
