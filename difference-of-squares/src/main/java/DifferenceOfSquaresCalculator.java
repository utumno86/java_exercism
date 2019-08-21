class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {

        return square((input * (input + 1))/2);
    }

    int computeSumOfSquaresTo(int input) {
        return ((input * (input + 1) * ((2 * input) + 1)) / 6) ;
    }

    int computeDifferenceOfSquares(int input) {
       return this.computeSquareOfSumTo(input) - this.computeSumOfSquaresTo(input);
    }

    int square(int i) {
        return i * i;
    }

}
