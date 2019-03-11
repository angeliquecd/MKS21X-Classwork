import java.util.Random;
public class Partition{
  /*Modify the array such that:
 *1. Only the indices from start to end inclusive
 are considered in range
 *2. A random index from start to end inclusive
 is chosen, the corresponding
 *   element is designated the pivot element.
 *3. all elements in range that are smaller
 than the pivot element are placed before t
 he pivot element.
 *4. all elements in range that are larger than
 the pivot element are placed after the pivot element.
 *@return the index of the final position of
 the pivot element.
 */
  public static int partition(int[] data,int start,int end){
    Random rng = new Random();
    int index=start+(Math.abs(rng.nextInt()%(end-start+1)));//picks random index
    int pivot = data[index];
    System.out.println(pivot);
    int stored=0;
    data[index]=data[start];
    data[start]=pivot;
    int endy=end;
    for (int inc=0;start+1+inc<=end;inc++){
      if (data[start+1+inc]>pivot){
        stored=data[start+1+inc];
        data[inc+start+1]=data[end];
        data[end]=stored;
        inc--;
        end--;
      }
      printarray(data);}
      System.out.println("done parsing");
    for (int i=start+1;i<=endy;i++){
      if (data[i]>pivot){
        System.out.println("in it");
        data[start]=data[i-1];
        data[i-1]=pivot;
        System.out.println(i-1);
        return i-1;
      }
    }
    printarray(data);
    return 4;
  }
  public static void printarray(int[] array){
    for (int a: array){
      System.out.print(""+a+" ");
    }
    System.out.println("");
  }
  public static void main (String[] args){
    int[] test = {0,3,6,7,9,4,5};
    partition(test,0,6);
  }
}
