class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i=0;i<m-1;i++){
            for(int j=i+1;j<m;j++){
                if(nums1[i]>nums1[j]){
                    int t=nums1[i];
                    nums1[i]=nums1[j];
                    nums1[j]=t;
                }
            }
        }
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(nums2[i]>nums2[j]){
                    int t=nums2[i];
                    nums2[i]=nums2[j];
                    nums2[j]=t;
                }
            }
        }


        int k=0,l=0,g=0;
        int[] a=new int[n+m];

        while(l<m&&k<n){
            if(nums1[l]>nums2[k]){
                a[g++]=nums2[k++];
            }
            else{
                a[g++]=nums1[l++];
            }
        }
        while(l<m){
            a[g++]=nums1[l++];
        }
        while(k<n){
            a[g++]=nums2[k++];
        }
        for(int i=0;i<m+n;i++){
    nums1[i]=a[i];
}

    }
}
