package day_07;

public class M8 {

    public static void main(String[] args) {

        int[][] arr = new int[2][2];
        arr[0][0]=1;
        arr[0][1]=2;
        arr[1][0]=3;
        arr[1][1]=4;

        System.out.println( arr[0][0]+" "+arr[0][1]+" "+arr[1][0]+" "+arr[1][1]);

        for(int i=0;i<2;i++){
            for (int j=0; j<2; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("*************");

        int arr2 [] [] = {
                {1,2,3},
                {5,6,7},
                {1,5,8}
        };

        for(int i=0;i< arr2.length;i++){
            for(int j=0; j<arr2.length;j++){
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("****************");

        int arr3 [] [] = {
                {1,2,3,4},
                {5,6,7,8},
                {1,5,8,9}
        };

        for(int i=0;i<3;i++){
            for(int j=0; j<4;j++){
                System.out.print(arr3[i][j]+" ");
            }
            System.out.println();
        }

    }
}
