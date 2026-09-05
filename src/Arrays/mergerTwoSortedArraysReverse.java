package Arrays;

public class mergerTwoSortedArraysReverse {
    static void main(String[] args) {
        int[] a = {10,20,40,45,50,90};
        int[] b = {21,25,31,42,51,55,61,75};

        int[] c = new int[a.length + b.length];
        print(c);

        merge(c,a,b);
        print(c);

    }

    public static  void merge (int[] c, int[] a, int[] b){
        int n1 = a.length;
        int n2 = b.length;
        int n3 = c.length;
        int i = n1-1; int j = n2-1; int k = n3-1;

        while(i >= 0 && j >= 0){
            if(a[i] > b[j]){
                c[k] = a[i];
                i--;
            } else { // a[i] < b[j]
                c[k] = b[j];
                j--;
            }
            k--;
        }

        if(i < 0){ // a khatam hua ---> to b ko le lo
            while(j >= 0){
                c[k--] = b[j--];
            }
        }
        if(j < 0){ // b khatam hua ---> to a ko le lo
            while(i >= 0){
                c[k--] = a[i--];
            }
        }
    }


    public static  void print (int[] arr){
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}
