class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {
        int sum = 0;
        for (int i = 1; i <= input; i++){
            sum = sum + i;
        };
        return square(sum);
    }

    int computeSumOfSquaresTo(int input) {
        int sum = 0;
        for (int i = 1; i <= input; i++){
            sum = sum + square(i);
        };
        return sum;
    }

    int computeDifferenceOfSquares(int input) {
       return this.computeSquareOfSumTo(input) - this.computeSumOfSquaresTo(input);
    }

    int square(int i) {
        return i * i;
    }

}
