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
    }

  }
}
