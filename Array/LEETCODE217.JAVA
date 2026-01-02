public class LEETCODE217 {
    public boolean containsDuplicate(int[] nums) {
        //create a hash set to store elements from the array
        HashSet<Integer> seenNumbers = new HashSet<>();

        for(int num : nums){
            //check if the element is already in the hashset
            if(seenNumbers.contains(num)) {
                return true; // duplicate found
            }

            //Add the element to the hashset
            seenNumbers.add(num);
        }

        return false; // No duplicates found
    }
}