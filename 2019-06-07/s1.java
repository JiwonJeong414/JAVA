class s1 {
    public static void main(String[] args) {
        int[] ar = { 4, 3, 2, 1, 5 };

        int max = ar[0];
        int min = ar[0];
        int maxEven = 0;
        int sum = 0;
        int sumEven = 0;
        int sumOdd = 0;
        int oddCount = 0;
        for (int i = 0; i < ar.length; i++) {
            // calculating the sum
            sum += ar[i];

            if (ar[i] % 2 == 0) {
                sumEven += ar[i];
            }
            // calculating the sum of odd and calculating the number of odds in the array
            else {
                sumOdd += ar[i];
                oddCount++;
            }

            if (ar[i] > max) {
                max = ar[i];
            }
            if (ar[i] < min) {
                min = ar[i];
            }
            if (ar[i] % 2 == 0 && ar[i] > maxEven) {
                maxEven = ar[i];
            }
        }
        System.out.println(maxEven);
        System.out.println(max);
        System.out.println(min);
        System.out.println(sum);
        System.out.println(sumEven);
        System.out.println((double) sum / ar.length);
        System.out.println((double) sumOdd / oddCount);
    }
}