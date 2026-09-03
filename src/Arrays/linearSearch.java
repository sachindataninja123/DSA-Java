package Arrays;

import java.util.Scanner;

public class linearSearch {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements");
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter array Target: ");
        int tar = sc.nextInt();

        print(arr);

        int found = -1; // target is not in array || not accessible in array
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == tar) {
                found = i; // if tar found then it's return index
                break;
            }
        }
        if(found != -1) System.out.println("Target exists in array : "+ found);
        else System.out.println("Target not exists in array");

    }

    public static void print(int[] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    }

