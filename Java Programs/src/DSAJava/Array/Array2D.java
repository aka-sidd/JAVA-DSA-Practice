package DSAJava.Array;
class twoDArray {
    void multiArrays()
    {
        int[][] arr_1 = new int[5][3];
        int[][] arr = {{40,30,20},{50,60,70},{80,90,100}};
        System.out.println(arr[0][0]);
        System.out.println(arr[0][1]);
        System.out.println(arr[0][2]);

        System.out.println(arr[1][0]);
        System.out.println(arr[1][1]);
        System.out.println(arr[1][2]);

        System.out.println(arr[2][0]);
        System.out.println(arr[2][1]);
        System.out.println(arr[2][2]);


    }
}
class Demo
{
    public static void main(String[] args) {
        twoDArray obj = new twoDArray();
        obj.multiArrays();
    }
}

