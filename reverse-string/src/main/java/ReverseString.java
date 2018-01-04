class ReverseString {

    String reverse(String inputString) {
        if (inputString == ""){
          return "";
        }
        char[] chars = inputString.toCharArray();
        StringBuilder reversedString = new StringBuilder(inputString.length());
        for (int i = chars.length - 1; i >= 0; i--){
          reversedString.append(Character.toString(chars[i]));
        }
        return reversedString.toString();
    }
}
