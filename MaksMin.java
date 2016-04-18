package maksmin;

import java.util.Scanner;

public class MaksMin {
    
    public static void main(String[] args) {
        int N, bil, i, nilaiMin = 1000, jml = 1;
        char pil;
        MaksMin maksmin = new MaksMin();
        Scanner input = new Scanner(System.in);
        
        N = input.nextInt();
        pil = input.next().charAt(0);
        String A;
        
        if (pil == 'A') {
            
        }
        for (i = 0; i < N; i++) {
            bil = input.nextInt();
            if (bil <= nilaiMin) {
                if (bil == nilaiMin) {
                    jml++;
                }
                nilaiMin = bil;
            }
            System.out.println("nilaiMin");
    }
        
        N = input.nextInt();
        pil = input.next().charAt(0);
        String B;
        
        } else if (pil == 'B') {
      
        }
        for (i = 0; i > N; i++) {
            bil = input.nextInt();
            if (bil >= nilaiMaks) {
                if (bil == nilaiMaks) {
                jml++;
            }
            nilaiMaks = bil;
        }
        System.out.println("nilaiMaks");
}
        
}