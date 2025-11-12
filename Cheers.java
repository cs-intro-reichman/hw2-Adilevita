//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
            String word = args[0];
            int times = Integer.parseInt(args[1]);
    
            // אותיות שאומרים "an" לפניהן (לפי הגייה)
            String anSet = "AEFHILMNORSX";
    
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);           // שמור על המקרה המקורי
                char upper = Character.toUpperCase(c);
                String article = (anSet.indexOf(upper) >= 0) ? "an" : "a";
                System.out.println("Give me " + article + " " + c + ": " + c + "!");
            }
    
            System.out.println("What does that spell?");
            String shout = word.toUpperCase();
            for (int i = 0; i < times; i++) {
                System.out.println(shout + "!!!");
            }
        }
    }
    