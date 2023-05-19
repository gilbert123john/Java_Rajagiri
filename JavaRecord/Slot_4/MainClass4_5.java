import java.io.*;

class Height {
    double foot, inch;

    public void read(double h) {
        inch = h;
        foot = h / 12;
    }

    public void disp() {
        System.out.printf("\nHeight is: %.2f ft or %.2f inches.\n", foot, inch);
    }

    public void add(Height h1, Height h2) {        
        double totalInches = h1.inch + h2.inch;
        double totalFeet = totalInches / 12;        

        System.out.printf("\nSum of heights: %.2f ft or %.2f in", totalFeet, totalInches);
    }
    
    public void multiply(Height h1, Height h2) {
        double inchProduct = h1.inch * h2.inch;
        double footProduct = inchProduct / 12;                
        
        System.out.printf("\nProduct of heights: %.2f ft or %.2f inches", footProduct, inchProduct);
    }
}

class MainClass4_5 {
    public static void main(String[] args) {
        DataInputStream ds = new DataInputStream(System.in);
        Height h = new Height();
        double h1, h2;
        int choice;

        try {
            Height hObj1 = new Height();
            Height hObj2 = new Height();            
            
            System.out.println("Enter first height (in inches): ");
            h1 = Double.parseDouble(ds.readLine());
            hObj1.read(h1);

            System.out.println("Enter second height (in inches): ");
            h2 = Double.parseDouble(ds.readLine());
            hObj2.read(h2);

            do {
                System.out.println("HEIGHT MENU");
                System.out.println("1. Display Heights.");
                System.out.println("2. Add Heights.");
                System.out.println("3. Multiply Heights.");
                System.out.println("4. Exit");
                System.out.println("Enter a choice: ");
                choice = Integer.parseInt(ds.readLine());
    
                switch (choice) {
                    case 1:
                        hObj1.disp();
                        hObj2.disp();
                        break;
    
                    case 2:
                        h.add(hObj1, hObj2);                        
                        break;
    
                    case 3:
                        h.multiply(hObj1, hObj2);                        
                        break;
    
                    case 4:
                        break;
    
                    default:
                        System.out.println("Please enter a valid choice.");
                        break;
                }
                
            } while (choice != 4);

        } catch (IOException e) {
            System.out.println("Error " + e);
        }
    }
}