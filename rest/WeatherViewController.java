package weather;
import java.io.IOException;
import java.net.MalformedURLException;
import net.aksingh.owmjapis.CurrentWeather;
import net.aksingh.owmjapis.OpenWeatherMap;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@RestController
public class WeatherViewController {

    @RequestMapping("/weather")
    public String index() throws JSONException, IOException {
        OpenWeatherMap owm = new OpenWeatherMap("f67f2c7179ceeeb26f81456d02db4c91");

        // getting current weather data for the "London" city
        CurrentWeather cwd = owm.currentWeatherByCityName("London");

        //printing city name from the retrieved data
        
        // printing the max./min. temperature
        //return("City: " + cwd.getCityName()+"\n"+"Temperature: " + cwd.getMainInstance().getMaxTemperature()
         //                   + "/" + cwd.getMainInstance().getMinTemperature() + "\'F");
       // return(cwd.getRawResponse());
       // JSONObject json = new JSONObject(); // Convert text to object
        //Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return cwd.getRawResponse();
        //return(json.toString(4));
    }

}