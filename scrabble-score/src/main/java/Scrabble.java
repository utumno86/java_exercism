import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

class Scrabble {
    private final int score;

    private int getLetterScore(int letter) {
        switch(letter){
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
            case 'L':
            case 'N':
            case 'R':
            case 'S':
            case 'T':
                return 1;
            case 'D':
            case 'G':
                return 2;
            case 'B':
            case 'C':
            case 'M':
            case 'P':
                return 3;
            case 'F':
            case 'H':
            case 'V':
            case 'W':
            case 'Y':
                return 4;
            case 'K':
                return 5;
            case 'J':
            case 'X':
                return 8;
            case 'Q':
            case 'Z':
                return 10;
            default:
                return 0;
        }
    };

    Scrabble(String word) {
        this.score = calcuateScore(word.toUpperCase());
    }

    int calcuateScore(String word) {
        return word.chars().map(letter -> this.getLetterScore(letter)).sum();
    }

    int getScore(){
        return score;
    }

}
