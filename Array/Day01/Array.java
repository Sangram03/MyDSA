import java.util.Scanner;


class Array{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("emter the Input size");
        int size = sc.nextInt();
        int numbers[]=new int[size];

        // input
        System.out.println("Enter the elements");
        for(int i=0;i<size;i++){
            numbers[i]=sc.nextInt();
        }

        //input
        System.out.println("Enter the searching elements :");
        int x = sc.nextInt();

        //output
        for(int i=0;i<size;i++){
            System.out.println(numbers[i]);
        }

    }
}