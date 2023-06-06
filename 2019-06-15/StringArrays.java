class StringArrays {
    public static void main(String[] args) {
        String[] names = { "John", "Jane", "Joanne" };
        int[] ages = { 10, 15, 13 };
        int min = 0;

        for (int i = 1; i < ages.length - 1; i++) {
            if (ages[min] > ages[i]) {
                min = i;
            }
        }
        System.out.println(names[min]);
    }
}