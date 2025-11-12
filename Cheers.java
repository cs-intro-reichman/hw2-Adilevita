//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
                String word = args[0];
                int number = Integer.parseInt(args[1]);
                String anLetter = "A, E, F, H, I, L, M, N, O, R, S, X a e f h i l m n o r s x";

                for (int i = 0; i < word.length(); i++) {
                        char letter = word.charAt(i);
                        if (anLetter.indexOf(letter)==-1) {
                                System.out.println("Give me a  " + letter + ": " + letter + "!");
                        } else {
                                System.out.println("Give me an " + letter + ": " + letter + "!");
                        }

                       
                }
                System.out.println("What does that spell?");
                for (int j = 0; j<number; j++ ) {
                        System.out.println(word.toUpperCase() + "!!!");
                }
        }
}