
public class FirstBadVersion {
	
	public int firstBadVersion(int n) {
        int low = 0;
        int high = n;
        int bad = -1;
        while(low<=high) {
            int mid = low + (high-low)/2;
            boolean result = isBadVersion(mid);
            if(result) {
                bad = mid;
                high = mid-1;
            } else {
                low = mid+1;
            }
        }
        return bad;
    }

//	stub
	private boolean isBadVersion(int mid) {
		// TODO Auto-generated method stub
		return false;
	}

}
