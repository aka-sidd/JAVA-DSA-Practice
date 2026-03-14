package DSAJava.Array.Arr.ImplementArrayList;

public class ImplementOwnArrayList {
    int[]arr;
    int size;
    //constructor
    ImplementOwnArrayList(){
        arr = new int[4]; // initial capacity
        size = 0;
    }
    // add element
    void add(int val){
        if(size==arr.length){
            resize();
        }
        arr[size] = val;
        size++;
    }
    // resize array
    void resize(){
        int[]newArr = new int[arr.length*2];
        for(int i=0;i<arr.length;i++){
            newArr[i] = arr[i];
        }
        arr = newArr;
    }
    //get element
    int get(int index){
        if(index>=size){
            throw new IndexOutOfBoundsException();
        }
        return arr[index];
    }
    //remove element
    void remove(int index){
        if(index>=size){
            throw new IndexOutOfBoundsException();
        }
        for(int i=index;i<size-1;i++){
            arr[i] = arr[i+1];
        }
        size--;
    }
    //print ArrayList
    void print(){
        for(int i = 0;i<size;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
}
     class Main {
         public static void main(String[] args) {
             ImplementOwnArrayList list = new ImplementOwnArrayList();
             list.add(10);
             list.add(20);
             list.add(30);
             list.add(40);
             list.print();
             list.remove(1);
             list.print();
             System.out.println(list.get(2));
         }
    }
