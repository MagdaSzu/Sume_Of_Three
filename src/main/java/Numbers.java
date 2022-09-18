public class Numbers {

    public boolean findNumbers(int a[], int arraySize, int k) {

        for (int i = 0; i < arraySize - 2; i++) {

            for (int j = 0; j < arraySize - 1; j++) {

                for (int l = 0; l < arraySize; l++) {

                    if (a[i] + a[j] + a[l] == k) {
                        System.out.println("Numbers are: " + a[i] + ", " + a[j] + ", " + a[l]);
                        return true;
                    }
                }
            }
        }
        System.out.println("Numbers not found.");
        return false;
    }
}
