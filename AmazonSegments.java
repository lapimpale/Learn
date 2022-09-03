
class AmazonSegments{
    public static void main(String[] args) {
        int k = 3; 
        int[] weights = {1, 3, 6};
        int count = 0;
        countSegments(weights, weights.length-1, weights.length-1, k, count);
        System.out.println(count);
    }

    public static void countSegments(int arr[], int i,int j, int k, int count){
        
        if(i<=0||j<=0){
            System.out.println(arr[i]+ " " + arr[j]);
        return;
        }

        System.out.println(arr[i]+ " " + arr[j]);
        for(int l =arr.length-1; l>=0;l--){
            countSegments(arr, l, j-1, k, count);
        }
        
    }
}