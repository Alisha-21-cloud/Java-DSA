public class LEETCODE1 {
    public int[] twoSum(int[] nums, int target) {
        // creating a HashMap to store number and their indices
        Map<Integer, Integer> map = new HashMap<>();

        //Iterating through the array
        for(int i = 0; i < nums.length; i++){
            //Calculating the complement of the current number
            int complement = target - nums[i];

            // Checking if the complement ialready in the map
            if(map.containsKey(complement)) {
                // If found, return the indices of the complement and the current number
                return new int[]{map.get(complement), i};
            }

            // Otherwise,add the current number and its indexx to the map
            map.put(nums[i], i);
        }

        // return the empty array if we don't find one
        return new int[]{};
    }
}