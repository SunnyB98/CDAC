class ArrayIntersection {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {3, 4, 5, 6};

        // Find intersection elements and count
        int[] intersection = new int[Math.min(array1.length, array2.length)];
        int count = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    intersection[count++] = array1[i];
                    break;
                }
            }
        }

        // Print intersection elements
        System.out.println("Intersection elements:");
        for (int i = 0; i < count; i++) {
            System.out.print(intersection[i] + " ");
        }
    }
}