class ArrayDemo {
    public static void main(String[] args) {

        int[] ar1 = { -20, 19, 1, 5, -1, 27, 19, 5 };

        ArrayOps operate = new ArrayOps(); // create an ArrayOps object
        int biggest = operate.FindMax(ar1); // call the findMax () method with the array
        System.out.println("The maximum is: " + biggest);
        int lowest = operate.FindLowest(ar1);
        System.out.println("The lowest is: " + lowest);
        int Sum = operate.SumArray(ar1);
        System.out.println("The Sum is: " + Sum);
        
        System.out.println("The array backwards is: " );
        operate.PrintBackwards(ar1);
        System.out.println("");
        System.out.println("The even numbers are: " );
        operate.PrintEvenElements(ar1);
        System.out.println("");
        System.out.println("The odd numbers are: " );
        operate.PrintOddElements(ar1);
        System.out.println("");
        
        System.out.println("The array as zeros is: " );
        operate.ZeroOut(ar1);
    }
}

class ArrayOps {

    int FindMax(int[] x) {
        int max = x[0];

        for (int index = 0; index < x.length; index++) {
            if (x[index] > max) {
                max = x[index];
            }
        }

        return max;
    }

    int FindLowest(int[] x) {
        int low = x[0];// you can do the rest from here just < instead of > from findMax comparisons.

        for (int index = 0; index < x.length; index++)
            if (x[index] < low)
                low = x[index];

        return low;
    }

    void Print(int[] x) {

        for (int j = 0; j < x.length; j++) {
            System.out.print(x[j] + " ");
        }

        System.out.println();
    }

    int SumArray(int[] x) {
        int sum = 0;
        for (int i = 0; i < x.length; i++) {
            sum = sum + x[i];
        }
        return sum;
    }

    void PrintBackwards(int[] x) {
        for (int i = x.length - 1; i >= 0; i--) {
            System.out.print(x[i] + " ");
        }
    }

    void PrintOddElements(int[] x) {
        for(int i = 0; i < x.length; i += 1)
        System.out.print(x[i] + " ");
    }

    void PrintEvenElements(int[] x) {
        for(int i = 0; i < x.length; i +=2){
            System.out.print(x[i] + " ");
        }
    }

    void ZeroOut(int[] x) {
        for (int i = 0; i < x.length; i++) {
            
            System.out.print((x[i] - x[i] )+ " ");

        }
    }
}
