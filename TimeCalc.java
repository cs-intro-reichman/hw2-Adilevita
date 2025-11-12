public class TimeCalc {
    public static void main(String[] args) {
    
        // input: time in hh:mm
        String time = args [0];

        // input: add time in min 
        int minutesToAdd = Integer.parseInt(args[1]);

        // char
        char h1 = time.charAt(0);
        char h2 = time.charAt(1);
        char m1 = time.charAt(3);
        char m2 = time.charAt(4);

        // combine the character 
        String hourString = "" + h1 + h2;
        String minuteString = "" + m1 + m2;


        // covert to integer 
        int hours = Integer.parseInt(hourString);  
        int minutes = Integer.parseInt(minuteString); 

        int totalMinutes = (hours * 60) + minutes + minutesToAdd;
        int newHours = (totalMinutes / 60) % 24;
        int newMinutes = totalMinutes % 60;

        String hoursStr;
        String minutesStr;

        // add leading zeros if needed
        if (newHours < 10) {
       hoursStr = "0" + newHours;
        } else {
        hoursStr = "" + newHours;
        }

        if (newMinutes < 10) {
        minutesStr = "0" + newMinutes;
        } else {
        minutesStr = "" + newMinutes;
        }

        // print the final time
        System.out.println(hoursStr + ":" + minutesStr);
        
        }

    }
