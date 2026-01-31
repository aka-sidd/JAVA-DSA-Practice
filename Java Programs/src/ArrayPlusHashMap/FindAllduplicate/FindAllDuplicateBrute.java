package ArrayPlusHashMap.FindAllduplicate;

public class FindAllDuplicateBrute {
    public static void main(String[] args) {
        int[]arr = {1,2,2,3,4,5,4,3};
        for(int i=0;i<arr.length;i++){
            boolean alreadyPrinted = false; // this line tells this element found first tym...print kr skte hai
            //check whether this value is already printed earlier
            for(int k=0;k<i;k++){
                if(arr[k]==arr[i]){
                    alreadyPrinted = true; // ye element pehle aa chuka hai dobara print nhi krna hai..
                    break;
                }
            }
            if(alreadyPrinted) continue; // Agr element pehle print ho chuka hai to is baar ignore kro,next element pr chlo
            int count = 1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]==arr[i]){
                    count++;
                }
            }
            if(count>1){
                System.out.println(arr[i]+" -> " + count + "times");
            }

        }
    }
}
