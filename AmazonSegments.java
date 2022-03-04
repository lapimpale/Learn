
class AmazonSegments{
    public static void main(String[] args) {
        int k = 3; 
        int[] weights = {1, 3, 6};
        int count = 0;
        countSegments(weights, 0, weights.length-1, k, count);
        System.out.println(count);
    }

    public static void countSegments(int arr[], int i,int j, int k, int count){
        
        if(i==arr.length-1||j<=0){
            System.out.println(arr[i]+ " " + arr[j]);
        return;
        }

        countSegments(arr,i+1,j,k,count);
        countSegments(arr,i,j-1,k,count);        
        
    }
}