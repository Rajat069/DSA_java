class Solution {
   public int equalPairs(int[][] grid) {
        HashMap<ArrayWrapper, Integer> hm = new HashMap<>();
        int sol = 0;
        for (int j = 0; j < grid.length; j++) {
            ArrayWrapper wrapper = new ArrayWrapper(grid[j]);
            hm.put(wrapper, hm.getOrDefault(wrapper, 0) + 1);
        }
        for (int i = 0; i < grid[0].length; i++) {
            int[] temp = new int[grid.length];
            for (int j = 0; j < grid.length; j++) {
                temp[j] = grid[j][i];
            }
            ArrayWrapper wrapper = new ArrayWrapper(temp);
            if (hm.containsKey(wrapper)) {
                sol+=hm.get(wrapper);
            }
        }
        return sol;
     }
     private static class ArrayWrapper {
        private final int[] array;

        public ArrayWrapper(int[] array) {
            this.array = array;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            ArrayWrapper that = (ArrayWrapper) o;
            if (array.length != that.array.length) return false;
            for (int i = 0; i < array.length; i++) {
                if (array[i] != that.array[i]) return false;
            }
            return true;
        }

        @Override
        public int hashCode() {
            int result = 1;
            for (int element : array) {
                result = 31 * result + element;
            }
            return result;
        }
    }
}