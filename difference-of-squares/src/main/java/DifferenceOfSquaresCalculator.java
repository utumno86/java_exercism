class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {
        int sum = 0;
        for (int i = 1; i <= input; i++){
            sum = sum + i;
        };
        return (int) (Math.pow(sum, 2));
    }

    int computeSumOfSquaresTo(int input) {
        int sum = 0;
        for (int i = 1; i <= input; i++){
            sum = sum + (int) (Math.pow(i, 2));
        };
        return sum;
    }

    int computeDifferenceOfSquares(int input) {
       return this.computeSquareOfSumTo(input) - this.computeSumOfSquaresTo(input);
    }

}
