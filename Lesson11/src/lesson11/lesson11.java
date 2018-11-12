package lesson11;

public class lesson11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Do Loop Example");
		int i=10;
        do{
             System.out.println(i);
             i--;
        }while(i>1);
        
        System.out.println("\nDo Loop with Arrays");
        int arr[]={2,11,45,9};
        //i starts with 0 as array index starts with 0
        i=0;
        do{
             System.out.println(arr[i]);
             i++;
        }while(i<4);

	}

}
