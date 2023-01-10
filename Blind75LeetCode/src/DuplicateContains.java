import java.util.*;

public class DuplicateContains {

    /*approach 1: sort and see if two adjacent elements are equal
     * TC: O(nlogn) SC: O(1)
     * */
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){// run loop till nums.length-1 otherwise
            // you will get Indexoutofbound while doing nums[i]==nums[i+1] for last index
            if(nums[i]==nums[i+1]){
                return true;
            }
        }
        return false;
    }

    /*approach 2: add elements to the set. if set already contains element then duplicate exists
     * TC: O(n) SC: O(n)
     * */
    public boolean containsDuplicateApproach2(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(!set.add(nums[i])){
                return true;
            }
        }
        return false;
    }

    /*approach 3: add elements to the map. if map frequency is greater then 1 return true
     * TC: O(n) SC: O(n)
     * */
    public boolean containsDuplicateApproach3(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                return true;
            } else{
                map.put(nums[i],1);
            }
        }
        return false;
    }

    /*approach 4: using XOR property A^A=0 and 0^A=A
     * TC: O(n^2) SC: O(1)
     * */
    public boolean containsDuplicateApproach4(int[] nums) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if((nums[i]^nums[j])==0){
                    return true;
                }
            }
        }
        return false;
    }

    /*approach 5: brute force
     * TC: O(n^2) SC: O(1)
     * */
    public boolean containsDuplicateBruteForce(int[] nums) {
        for (int i = 0; i + 1 < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }
    /* using java stream api */
    public boolean containsDuplicateStreamApi(int[] nums) {
        return nums.length != Arrays.stream(nums)
                .distinct()
                .count();
    }


}
