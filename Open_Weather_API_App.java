Here is a simple Java console application that uses the Open Weather API:

```java
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Main {
    private static final String API_KEY = "YOUR_API_KEY";
    private static final String API_URL = "http://api.openweathermap.org/data/2.5/weather?q=";

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter city name: ");
        String city = reader.readLine();
        String urlRequest = API_URL + city + "&appid=" + API_KEY;
        URL url = new URL(urlRequest);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String inputLine;
        StringBuffer content = new StringBuffer();
        while ((inputLine = in.readLine()) != null) {
            content.append(inputLine);
        }
        in.close();
        connection.disconnect();
        System.out.println("Weather Data: " + content.toString());
    }
}
```

Please replace "YOUR_API_KEY" with your actual Open Weather API key. This application will prompt the user to enter a city name, then it will fetch and display the weather data for that city.