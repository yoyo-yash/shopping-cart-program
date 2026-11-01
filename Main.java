import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of items: ");
        int numOfItems = scanner.nextInt();
        scanner.nextLine();

        String Items[] = new String[numOfItems];

        for(int i=0; i<numOfItems; i++){
            System.out.print("Enter a item: ");
            Items[i]= scanner.nextLine();
            
        }
        System.out.println("________________");
        System.out.println("your items are: ");

        for(int j=0; j<numOfItems; j++){
            System.out.print(Items[j] + " ");
        }
        scanner.close();

    }
}
