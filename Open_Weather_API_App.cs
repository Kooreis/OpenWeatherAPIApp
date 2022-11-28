```CSharp
using System;
using System.Net.Http;
using System.Threading.Tasks;
using Newtonsoft.Json.Linq;

class Program
{
    static readonly HttpClient client = new HttpClient();
    static async Task Main(string[] args)
    {
        string city = args[0];
        string apiKey = "Your_OpenWeatherMap_API_Key";
        string apiResponse = await GetWeatherData(city, apiKey);
        JObject weatherData = JObject.Parse(apiResponse);
        Console.WriteLine($"Temperature in {city}: {weatherData["main"]["temp"]}°C");
    }

    static async Task<string> GetWeatherData(string city, string apiKey)
    {
        HttpResponseMessage response = await client.GetAsync($"http://api.openweathermap.org/data/2.5/weather?q={city}&appid={apiKey}&units=metric");
        response.EnsureSuccessStatusCode();
        string responseBody = await response.Content.ReadAsStringAsync();
        return responseBody;
    }
}
```
Please replace "Your_OpenWeatherMap_API_Key" with your actual OpenWeatherMap API Key.