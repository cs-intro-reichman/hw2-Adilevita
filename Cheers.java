//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
            String word = args[0];
            int times = Integer.parseInt(args[1]);
    
            // אותיות שלפי ההגייה מקבלות "an"
            String anSet = "AEFHILMNORSX";
    
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                char upper = Character.toUpperCase(c);
    
                String article = (anSet.indexOf(upper) >= 0) ? "an" : "a";
                String pad = article.equals("a") ? "  " : " "; // a -> שני רווחים, an -> רווח אחד
    
                System.out.println("Give me " + article + pad + upper + ": " + upper + "!");
            }
    
            System.out.println("What does that spell?");
            String shout = word.toUpperCase();
            for (int i = 0; i < times; i++) {
                System.out.println(shout + "!!!");
            }
        }
    }
    