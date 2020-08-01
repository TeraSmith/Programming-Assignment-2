import java.util.Scanner;

public class Figures {

    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Programming Fundamentals \nNAME: Tera\nProgramming Assignment 2");
        int size = getSize();
        int option = 0;
        while (true) {
            System.out.print("MENU:");
            System.out.println("\n1. Print box\n2. Print diamond\n3. Print X\n4. Quit Program\n");
            System.out.print("Please select an option: ");
            option = s.nextInt();
            switch (option) {
                case 1:
                    printBox(size);
                    break;
                case 2:
                    printDiamond(size);
                    break;
                case 3:
                    printX(size);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
            if (option == 4) break;
        }
        System.out.println("Good Bye!");
    }
    
    private static void printBox(int size) {
        System.out.println();
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                System.out.print("X");
            }
            System.out.println();
        }
    }
    
 private static void printDiamond(int size) {
       
	 System.out.println();
       
	 int i,j,mid;
        size = size+1;
        mid = (size/2);
        //top portion diamond
        for(i = 1; i<= mid; i++) {
        	for(j = 1; j<=(mid-i); j++) {
        		System.out.print(" ");
        } 
        	if(i == 1)  {
        System.out.print("XX");
        } else {
        System.out.print("X");

        for(j = 1; j<=2*i-3; j++)
        {
        System.out.print(" ");
       }
        System.out.print("X");
       }
        System.out.print("\n");
       }
        //bottom of diamond
        for(i = mid+1; i<size; i++) {
        	for(j = 1; j<=i-mid; j++) {
        		System.out.print(" ");
       }
        	
        if(i == size-1) {
        	System.out.print("XX");
        } else {
        	System.out.print("X");

        for(j = 1; j<=2*(size - i)-3; j++) {
        	System.out.print(" ");
       }
        System.out.print("X");
       }
        System.out.print("\n");
        }
      }
 
    private static void printX(int size) {

        System.out.println();
        int spaces = size -2;
        int start = 0;
        for (int top = 1; top <= (size-1) / 2; top++) {
            for (int space = 1; space <= start; space++)
                System.out.print(" ");
            System.out.print("X");
            for (int space = 1; space <= spaces; space++) {
                System.out.print(" ");
            }
            System.out.print("X");
            System.out.println();
            spaces -= 2;

            start += 1;

        }
        // print the middle section
        for (int space = 1; space <= start; space++)
            System.out.print(" ");
        System.out.println("X");
        spaces = 1;

        // build the lower section
        for (int top = 1; top <= (size - 1) / 2; top++) {
            start -= 1;
            for (int space = 1; space <= start; space++)
                System.out.print(" ");
            System.out.print("X");
            for (int space = 1; space <= spaces; space++) {
                System.out.print(" ");
            }
            System.out.print("X");
            System.out.println();
            spaces += 2;
        }
    }
   
    public static int getSize() {
        int size = 0;
        while (true) {
            System.out.print("Enter the size of the figure (odd number): ");
            size = s.nextInt();
            if (size % 2 == 1) return size;
            System.out.println("Size should be an odd number.");
        }
    }
	}
