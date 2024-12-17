class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0; // Posición para los elementos únicos

        for (int num : nums) {
            if (i == 0 || num > nums[i - 1]) { // Compara con el anterior
                nums[i++] = num; // Asigna el valor único y mueve el índice
            }
        }

        return i; // Devuelve el número de elementos únicos
    }
}
