package src;



public class Main {
    public static void main(String[] args){
        metods testNull= new metods();
        testNull.lenString(null);

        int [] arr1=new int[6];
        arr1[1]=4;
        arr1[0]=6;
        arr1[2]=4;
        arr1[3]=9;
        arr1[4]=40;
        arr1[5]=43;
        metods.findElemArray(arr1,10);

        metods.mulDivide(4,3,3);

        int [] arr2=new int[6];
        arr2[1]=4;
        arr2[0]=5;
        arr2[2]=4;
        arr2[3]=8;
        arr2[4]=20;
        arr2[5]=43;

        int[] arr3=metods.divideArrays(arr1,arr2);

        for(int i=0; i<arr3.length;i++){
            System.out.println(arr3[i]);
        }




    }
}
