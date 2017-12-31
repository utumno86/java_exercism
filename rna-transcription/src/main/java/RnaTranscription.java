public class RnaTranscription {
    public String ofDna(String dnaStrand) {
      if(dnaStrand == null)  return null;
      StringBuilder rnaStrand = new StringBuilder(dnaStrand.length());
      for(int i = 0; i < dnaStrand.length(); i++){
        char nucleotide = dnaStrand.charAt(i);
        rnaStrand.append(rnaToDnaTranscription(nucleotide));
      }
      return rnaStrand.toString();
  }

  private static String rnaToDnaTranscription(Character nucleotide){
    switch (nucleotide) {
      case 'A':
        return "U";
      case 'G':
        return "C";
      case 'C':
        return "G";
      case 'T':
        return "A";
      default:
        return "";
      }
  }
}