/*
import java.util.*;

public class Subset {
    public static void main(String[] args) {
        int[] nums={0,1,0,2,1,0,1,3,2,1,2,1};
      //  trap(nums);
    }
        public static int trap(int[] height) {
            int trap(vector<int>& height) {
            int n = height.size();
            int leftMax = INT_MIN;
            int rightMax = INT_MIN;
            int left = 0;
            int right = n-1;
            int ans = 0;
            while(left<=right){
                if(height[left]<=height[right]){
                    leftMax = max(height[left], leftMax);
                    ans+= (leftMax - height[left]);
                    left++;
                }else{
                    rightMax = max(height[right], rightMax);
                    ans+= (rightMax - height[right]);
                    right--;
                }
            }
            return ans;
   }
            }
            return water;
        }
    }

*/
