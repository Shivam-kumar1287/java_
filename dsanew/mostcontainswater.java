public class mostcontainswater {
    public static void main(String[] args) {
        int[] height={1,8,6,2,5,4,8,3,7};
        int l=0;
        int r=height.length-1;
        int maxarea=0;
        while(l<r){
            int h=Math.min(height[l],height[r]);
            int w=r-l;
            int area=h*w;
            maxarea=Math.max(maxarea,area);
            if(height[l]<height[r]){
                l++;
            }
            else{
                r--;
            }
        }
        System.out.println("The maximum area is: "+maxarea);
    }
}
