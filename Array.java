public class Array {
    public static int linear_Search(int array[], int key){
        for(int i=0; i<=array.length; i++){
            if(array[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int array[] ={1,2,3,4,5,6,7,8,10};
        int key = 10;
        int index = linear_Search(array, key);
        if(index== -1){
            System.err.println("Key is not found ");
        }else{
            System.err.println("Key is found at index : "+index);
        }
    }
}
