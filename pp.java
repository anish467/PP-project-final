import java.util.*;
public class pp
{
    static void addition(int [][]a,int [][]b)
    {
        int result[][]=new int[3][3];
        int i,j;
        System.out.println("Addition of two matrix is:");
        System.out.println("-----------------------------");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                result[i][j]=a[i][j]+b[i][j];
                System.out.print(result[i][j]+" ");
            }
            System.out.print("\n");
        }
        System.out.println("-----------------------------");

    }
    static void substraction(int [][]a,int [][]b)
    {
        int result[][]=new int[3][3];
        int i,j;
        System.out.println("Substraction of two matrix is:");
        System.out.println("-----------------------------");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                result[i][j]=a[i][j]-b[i][j];
                System.out.print(result[i][j]+" ");
            }
            System.out.print("\n");
        }
        System.out.println("-----------------------------");

    }
    static void multiplication(int [][]a,int [][]b)
    {
        int result[][]=new int[3][3];
        int i,j,k;
        System.out.println("-----------------------------");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                result[i][j]=0;
                for(k=0;k<3;k++)
                {
                    result[i][j]=result[i][j]+a[i][k]*b[k][j];
                }
                System.out.print(result[i][j]+" ");
            }
            System.out.print("\n");
        }
        System.out.println("-----------------------------");

    }
    static void transpose(int [][]a)
    {
        int result[][]=new int[3][3];
        int i,j;
        System.out.println("-----------------------------");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                result[i][j]=a[j][i];
                System.out.print(result[i][j]+" ");
            }
            System.out.print("\n");
        }
        System.out.println("-----------------------------");

    }  
    static void symm(int [][]a)
    {
        int flag=1;
        int i,j;
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                if(a[i][j]!=a[j][i])
                {
                    flag =0;
                    System.out.println("Symmetric - No");
                    return ;
                }
            }
        }
        if(flag==1)
            {
                System.out.println("Symmetric - Yes");
            }

    }
    static void skew(int [][]a)
    {
        int flag=1;
        int i,j;
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                if(a[i][j] != (-1)*a[j][i])
                {
                    flag =0;
                    System.out.println("Skew Symmetric - No");
                    return ;
                }
            }
        }
        if(flag==1)
            {
                System.out.println("Skew Symmetric - Yes");
            }

    }
    static void ortho(int [][]a)
    {
        int result[][]=new int[3][3];
        int i,j,k;
        int flag=1;
        int b[][]=new int[3][3];
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                b[i][j]=a[j][i];
            }
        }
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                result[i][j]=0;
                for(k=0;k<3;k++)
                {
                    result[i][j]=result[i][j]+a[i][k]*b[k][j];
                }
                if(result[i][j]!=1)
                {
                    flag=0;
                    System.out.println("Orthogonal - No");
                    return;
                }
            }
        }
        if(flag==1)
        {
            System.out.println("Orthogonal - Yes");
        }

    }
    
    public static void main(String[] args) {
        System.out.println("Welcome to matrix calculator");
        System.out.println("Enter 1st matrix");
        int i,j;
        Scanner sc = new Scanner(System.in);
        int arr1[][]= new int[3][3];
        int arr2[][]= new int[3][3];
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.println("Enter element at "+(i+1)+","+(j+1));
                arr1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter 2nd matrix");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.println("Enter element at "+(i+1)+","+(j+1));
                arr2[i][j]=sc.nextInt();
            }
        }
        while(true){
               System.out.println("Choose an option");
               System.out.println("1.Addition");
               System.out.println("2.Substraction");
               System.out.println("3.Multiplication");
               System.out.println("4.Transpose of matrix");
               System.out.println("5.Square of a matrix");
               System.out.println("6.Properties of Matrix");
               System.out.println("7.Exit");
               System.out.println("Enter your choice: ");
               int choice=sc.nextInt();
               switch(choice)
               {
                case 1: addition(arr1,arr2);
                break;
                case 2: substraction(arr1, arr2);
                break;
                case 3:System.out.println("Multiplication of 2 matrices is:"); 
                multiplication(arr1, arr2);
                break;
                case 4:System.out.println("Transpose of 1st matrix is:"); 
                transpose(arr1);
                System.out.println("Transpose of 2nd matrix is:"); 
                transpose(arr2);
                break;
                case 5: System.out.println("Square of matrix 1st is:");
                multiplication(arr1, arr1);
                System.out.println("Square of matrix 2nd is:");
                multiplication(arr2, arr2);
                break;
                case 6: System.out.println("Properties of Matrix 1st");
                symm(arr1);
                skew(arr1);
                ortho(arr1);
                System.out.println("Properties of Matrix 2nd: ");
                symm(arr2);
                skew(arr2);
                ortho(arr2);
                break;
                case 7: System.exit(0);
                default:System.out.println("Enter a valid option");
               }
            }

    }
}