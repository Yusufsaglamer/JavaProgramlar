public class closest {
        static int findClosestSmaller(int[] array, int target) {
            int minValue = Integer.MIN_VALUE;
            for (int number : array) {
                if (number < target && number > minValue) {
                    minValue = number;
                }
            }
            return minValue;
        }

        static  int  findClosestLarger(int[] array, int target) {
            int maxValue = Integer.MAX_VALUE;
            for (int number : array) {
                if (number > target && number < maxValue){
                    maxValue = number;
                }

            }
            return maxValue;
        }
    }

