public class ScoreCalculator {

    // Imperativer Stil: zählt alle Zeichen außer 'a'
    public static int calculateScore(String word) {
        int score = 0;
        for (char c : word.toCharArray()) {
            if (c != 'a') {
                score++;
            }
        }
        return score;
    }

    // Deklarativer Stil: zählt alle Zeichen außer 'a' mit Streams
    public static int wordScore(String word) {
        return (int) word.chars()
                         .filter(c -> c != 'a')
                         .count();
    }

    public static void main(String[] args) {
        System.out.println("calculateScore(\"imperative\") = " + calculateScore("imperative"));   // 9
        System.out.println("calculateScore(\"no\") = " + calculateScore("no"));                   // 2
        System.out.println("wordScore(\"declarative\") = " + wordScore("declarative"));           // 9
        System.out.println("wordScore(\"yes\") = " + wordScore("yes"));                           // 3
    }
}
