
/**
 * Write a description of class WeatherConditionals here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WeatherConditionals
{
    public static void getWeatherAdvice(int temperature, String description)
    {
         /*boolean windy = false;
         boolean snow = true;
         temperature = 107;
         
         if (description.equals ("snow") && temperature > 100) System.out.println("How can this be?!");
         if (description.equals ("windy")) System.out.println(description);
         return "true";*/
         
         /*if (description != "windy" && temperature > 30) {
            return "It's safe to go outside, " + temperature + " degrees and " + description + ".";
         }
          else{
              return "Too windy or cold! Enjoy watching the weather through the window.";
         }*/
         
    }
    public static void getHikingAdvice(int temperature, int windchill,
    int humidity, String description)
    {
        boolean fair= true;
        if (description == "fair" || description == "Fair" || description == "FAIR") System.out.println("You're in Santa Fe.");
        
        if (temperature>=65)  
            System.out.println("You're in San Jose.");

        if (windchill == 10)  
        System.out.println("Don’t go out!");
    
        if (humidity == 15)  
        System.out.println("It’s raining.");

        if (temperature >= 100)  
        System.out.println("It’s hot");
     
    }
}