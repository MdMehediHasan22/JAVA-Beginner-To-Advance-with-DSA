public class mergshort {
    public static void conquer(int arr[],int l,int mid,int r){
    
    int merged[]=new int[r-l+1];
    int i=l;
    int j=mid+1;
    int k=0;
    
    while(i<=mid && j<=r){
        if(arr[i]<=arr[j]){
            merged[k]=arr[i];
            k++;
            i++;
        }else{
            merged[k]=arr[j];
            k++;
            j++;
        }
    }  
    if(i>mid){
        while(j<=r){
            merged[k]=arr[j];
            k++;
            j++;
        }
    }else{
    
        while(i<=mid){
            merged[k]=arr[i];
            k++;
            i++;
        }
    }
    
     
    for(int m=0,n=l;m<merged.length;m++,n++){
        arr[n]=merged[m];
    }

    
    }
    public static void divide(int arr[],int l,int r){
        if(l<r){
            int mid = (l+r)/2;
            divide(arr, l, mid);
            divide(arr, mid+1, r);
            conquer(arr,l,mid,r);
        }
    }
    public static void main(String[] args) {
        int arr[]={6,3,9,5,2,8};
        int n = arr.length;

        divide(arr, 0, n-1);
        //print
        for(int i =0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
