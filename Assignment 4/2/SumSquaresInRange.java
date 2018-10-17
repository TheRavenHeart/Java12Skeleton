class SumSquaresInRange {
   static int sumSquaresInRange(int X){
        if(X == 0)
            return 0;
        else
            return X * X + sumSquaresInRange(X-1); // multiples x by x then adds it to sumsqauresinrange the redoes it until it reaches 0


    }
    
    public static void main(String[] args) {
        System.out.println(sumSquaresInRange(4)); // prints out the sum of all the numbers above
    }
}