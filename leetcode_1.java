//public class leetcode_1 {
//
//    public int[] twoSum(int[] arr, int target) {
//        int n = arr.length;
//        int[] ans = new int[2];
//        for (int i = 0; i < n; i++) {
//            for (int j = i + 1; j < n; j++) {
//                if (arr[i] + arr[j] == target) {
//                    ans = i;
//                    ans = j;
//                }
//            }
//        }
//        return ans;
//    }
//
//    public static void main(String[] args) {
//        leetcode_1 sol = new leetcode_1();
//        int[] numbers = {2, 7, 11, 15};
//        int target = 9;
//        int[] result = sol.twoSum(numbers, target);
//        System.out.println("Indexes: [" + result + ", " + result + "]");
//    }
//}
