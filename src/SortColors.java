public class SortColors {
    public static void main(String[] args){
        int[] colors = {2, 0, 1, 2, 1, 0, 2, 0, 1};
        sortColors(colors);
        System.out.print("Sorted Colors: ");
        for (int color : colors) {
            System.out.print(color + " ");
        }
    }
    public static int[] sortColors(int[] colors){
        int low = 0;
        int i = 0;
        int high = colors.length - 1;
        while(i <= high){
            if(colors[i] == 0) {
                swap(colors, i, low);
                i++;
                low++;
            }
            else if(colors[i] == 2){
                swap(colors, i ,high);
                high --;
            }
            else
                i++;
        }
        return colors;
    }
    public static void swap(int[] colors, int i, int j){
        int temp = colors[i];
        colors[i] = colors[j];
        colors[j] = temp;
    }
}
