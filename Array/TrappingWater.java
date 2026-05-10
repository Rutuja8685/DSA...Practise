package Array;

public class TrappingWater {
    public static void GetWaterLevel(int[] height){

        

        int trappingWater=0;
         int  n=height.length;
         // left largest array
        int[] LargestLeft=new int[n];
        LargestLeft[0]=height[0];
        for(int i=1; i<n; i++){
            LargestLeft[i]=Math.max(height[i], LargestLeft[i-1]);
        }
        //Right largest array
        int[] LargestRight=new int[n];
        LargestRight[n-1]=height[n-1];
        for(int i=n-2; i>=0; i--){
            LargestRight[i]=Math.max(height[i], LargestRight[i+1]);
        }
        //trapping water
        for(int i=0; i<n; i++){
            int Waterlevel=Math.min(LargestLeft[i], LargestRight[i]);
            trappingWater+=Waterlevel-height[i];
        }
        System.out.println(trappingWater);
        return;
    }
    public static void main(String[] args) {
        int[] height={4,2,0,6,3,2,5};
        GetWaterLevel(height);
    }
}
