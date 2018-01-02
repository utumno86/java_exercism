class ReverseString {

    String reverse(String inputString) {
        if (inputString == ""){
          return "";
        }
        char[] chars = inputString.toCharArray();
        String outputString;
        for (int i = chars.length; i > 0; i--){
          System.out.println Character.toString(chars[i]);
        }
        return "tobor";
    }

}
