
/**
 * Write a description of class StringTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StringTester
{
    public static void main(String[]args) 
    {
        String weatherCondition = "scattered thunderstorms";
        
        int length = weatherCondition.length ();
        System.out.println("\n");
        System.out.println(weatherCondition.indexOf("thunder"));
        
        System.out.println(WeatherConditionals.getHikingAdvice(32, "windy"));
        
        /*System.out.println(WeatherConditionals.getWeatherAdvice(34, "sunny"));
        System.out.println(WeatherConditionals.getWeatherAdvice(32, "windy"));
        System.out.println(WeatherConditionals.getWeatherAdvice(33, "snow"));
        System.out.println(WeatherConditionals.getWeatherAdvice(30, "snow"));
        System.out.println(WeatherConditionals.getWeatherAdvice(30, "windy"));*/
    }
}