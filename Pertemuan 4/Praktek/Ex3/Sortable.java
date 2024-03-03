abstract class Sortable {

  public abstract int compare(Sortable b);

  public static void shell_sort(Sortable[] a) {
    int n = a.length;
    int gap = 1;

    // Calculate initial gap
    while (gap < n / 3) {
      gap = gap * 3 + 1;
    }

    // Start shell sort
    while (gap > 0) {
      // Do a gapped insertion sort for this gap size.
      // The first gap elements a[0..gap-1] are already in gapped order
      // keep adding one more element until the entire array is gap sorted
      for (int i = gap; i < n; i += gap) {
        Sortable temp = a[i];

        // shift earlier gap-sorted elements up until the correct location for 'temp' is found
        int j;
        for (j = i; j >= gap && a[j - gap].compare(temp) > 0; j -= gap) {
          a[j] = a[j - gap];
        }

        // put temp (the original a[i]) in its correct location
        a[j] = temp;
      }

      // reduce the gap for the next iteration
      gap = (gap - 1) / 3;
    }
  }
}
