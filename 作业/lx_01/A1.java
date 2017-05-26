public class A1{
    public static void main(String[] args){
         int[] a = {3,5,11,17,21,23,28,30,32,50,64,78,81,95,101}; 
        
         System.out.println(""+binSearch(a,30));    
    }  
    private static int binSearch(int[] a, int key) {
        int i=a.length/2;
        if(key==a[i]){
            return i;
        }
        int s=0;
        int e=a.length-1;
        while(s<=e){
            i=(s+e)/2;
            if(key<a[i]){
                e=i-1;
            }else if(key>a[i]){
                s=i+1;
            }else{
                return i;
            }
        }
        return -1;
    }
}