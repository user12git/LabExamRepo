public class PrintNumbers {

    public static void main(String[] args) {
        int n = 10; 
        int[] f = new int[n];

        if (n > 0) 
		f[0] = 0;
        if (n > 1)
	       	f[1] = 1;

       
        for (int i = 2; i < n; i++) {

            f[i] = f[i - 1] + f[i - 2];
        }

        System.out.println("First " + n + " Fibonacci numbers:");
       
       	for (int i = 0; i < n; i++) {

            System.out.print(f[i] + " ");
        }
    }
}

