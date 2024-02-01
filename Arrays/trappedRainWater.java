package Arrays;

public class trappedRainWater {
    public static int trappedWater(int height[]) {
        int n = height.length;

        // calculate the left max boundary
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }

        // caculate the right max boundary
        int rigthMax[] = new int[n];
        rigthMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rigthMax[i] = Math.max(rigthMax[i + 1], height[i]);
        }

        int trappedW = 0;
        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(rigthMax[i], leftMax[i]);
            trappedW += waterLevel - height[i];
        }
        return trappedW;

    }

    public static void main(String[] args) {
        int height[] = { 2, 1, 5, 8, 3, 14, 7, 12 };
        System.out.println(trappedWater(height));
    }

}
