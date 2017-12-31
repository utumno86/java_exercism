public class Hamming {
  private final int hammingDistance;

  public Hamming(String string1, String string2) {
    hammingDistance = compute(string1, string2);
  }

    public int getHammingDistance() {
        return hammingDistance;
    }

    private int compute(String string1, String string2) {
      if(string1.length() != string2.length()) {
            throw new IllegalArgumentException("The two DNA input strings are not of equal length.");
        }
      int counter = 0;
      for ( int i = 0; i < string1.length(); i++){
        counter += iterateDistance(i, string1, string2);
      }
      return counter;
    }

    private int iterateDistance(int i, String string1, String string2){
      return string1.charAt(i) != string2.charAt(i) ? 1 : 0;
    }

}