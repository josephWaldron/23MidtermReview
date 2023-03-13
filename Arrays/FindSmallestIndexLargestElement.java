package MidtermReview.Arrays;

public class FindSmallestIndexLargestElement {
    public static void main(String[] args){
        int[] myList={1,5,3,4,5,5};
        double max = myList[0];
        int indexOfMax = 0;
        for(int i=1;i<myList.length;i++){
            if (myList[i] > max) { 
                max = myList[i]; 
                indexOfMax = i;
            }
        }
            System.out.println("Largest element: "+max+"smallest index of max: "+indexOfMax);
    
                }
            }   

        