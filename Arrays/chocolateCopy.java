package MidtermReview.Arrays;

public class chocolateCopy {
   public static void main(String[] args) {
    int [] vanilla = {1,5,3,4,5,5};
    int [] chocolate = new int [vanilla.length];

    System.out.println("Vanilla contents: "); //prins out the contents of the vanilla array
    for(int e:vanilla){
        System.out.print(e+" ");
    }
    System.out.println();

    System.out.println("Before copy chocolate contents: "); //prints out the contents of the chocolate array
    for(int e:chocolate){
        System.out.print(e+" ");
    }
    System.out.println();
    System.out.println("Using for loop chocolate contents: ");
    for(int i = 0; i < vanilla.length; i++){
        chocolate[i] = vanilla[i];
    }
    for(int e:chocolate){
        System.out.print(e+" ");
    }
    System.out.println();
    System.out.println("Using System.arraycopy chocolate contents: ");
    System.arraycopy(vanilla, 0, chocolate, 0, vanilla.length); //Using System.arraycopy
    for(int e:chocolate){
        System.out.print(e+" ");
    }
    System.out.println();
   }
    
}
