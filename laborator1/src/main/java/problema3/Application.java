package problema3;

public class Application {
    public static void rectangular(int n, int m)
    {
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                if(i==0 || i==n-1 || j==0 || j==m-1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }

    public static void diagonals(int n)
    {
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(i==j || i+j==n-1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("a)");
        rectangular(4,5);
        System.out.println();

        System.out.println("b)");
        diagonals(5);

    }
}
