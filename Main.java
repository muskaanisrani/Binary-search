class Main {
  public static int binarysearch(int arr[],int low,int high,int key) {
    int mid=(low+high)/2;

    if (low<=high ) {
      if (arr[mid]==key) {
        return mid;
      } else {
        if (key>arr[mid]) {
          return binarysearch(arr,mid +1,high,key);
        } else { 
          return binarysearch(arr,low,mid-1,key);
        }
      }
    } else {
      return -1;
    }
  }

  public static void main(String[] args) {
    int arr[]={1,2,3,4};
    int key=4;
    int low=0;
    int high=arr.length-1;
    System.out.println("element found at" +binarysearch(arr,low,high,key));
  }
}
