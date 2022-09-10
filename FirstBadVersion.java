public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int mid= n/2;
        int start =1;
        int end = n;
        int res=n;
        
        while(mid<=end&&mid>=start){
            if(isBadVersion(mid)){
                res=mid;
                end=mid-1;
                mid=end - (end-start)/2;
            }
            else{
                start=mid+1;
                mid=start + (end-start)/2;
                
            }
        }
        return res;
    }
}
