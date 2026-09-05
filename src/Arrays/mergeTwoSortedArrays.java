package Arrays;

public class mergeTwoSortedArrays {
    static void main(String[] args) {
        int[] a = {10,20,40,45,50,90};
        int[] b = {21,25,31,42,51,55,61,75};

        int[] c = new int[a.length + b.length];
        print(c);

        merge(c,a,b);
        print(c);

    }

    public static  void merge (int[] c, int[] a, int[] b){
        int i = 0; int j = 0; int k = 0;

        while(i < a.length && j < b.length){
            if(a[i] < b[j]){
                c[k] = a[i];
                i++;
            } else { // a[i] > b[j]
                c[k] = b[j];
                j++;
            }
            k++;
        }

        if(i == a.length){ // a khatam hua ---> to b ko le lo
            while(j < b.length){
                c[k++] = b[j++];
            }
        }
        if(j == b.length){ // b khatam hua ---> to a ko le lo
            while(i < a.length){
                c[k++] = a[i++];
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



