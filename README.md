# Python Documentation

# Python Weather Script

This repository contains a simple Python script that uses the Open Weather API to fetch and display the current weather information for a specified city.

## Script Description

The script prompts the user to enter a city name, then it fetches and displays the current weather information for that city. The displayed information includes the city name, weather description, temperature, humidity, and wind speed.

## Libraries Used

- `requests`: This library is used for making HTTP requests. In this script, it is used to send a GET request to the Open Weather API.

- `json`: This library is used for parsing JSON data. In this script, it is used to parse the JSON response received from the Open Weather API.

## Functions

- `get_weather(api_key, city)`: This function sends a GET request to the Open Weather API and returns the JSON response. It takes two parameters: the API key and the city name.

- `print_weather(data)`: This function prints the weather information. It takes one parameter: the JSON data received from the Open Weather API.

- `main()`: This is the main function. It prompts the user to enter a city name, fetches the weather information for that city, and then prints the information.

## Usage

To use this script, you need to replace "your_api_key_here" with your actual Open Weather API key. Then, you can run the script. It will prompt you to enter a city name, and then it will display the current weather information for that city.

## Note

Please ensure that you have the necessary Python libraries installed. You can install them using pip:

```
pip install requests
```

---

# C# Documentation

# CSharp Weather Data Fetcher

This script is a simple console application written in C# that fetches and displays the current temperature of a specified city. It uses the OpenWeatherMap API to get the weather data.

## Libraries Used

- `System`: This is a fundamental library in C# that provides base functionalities such as Console for input/output operations.

- `System.Net.Http`: This library provides a modern HTTP client API for communicating with servers via HTTP protocol. It is used in this script to send a GET request to the OpenWeatherMap API.

- `System.Threading.Tasks`: This library provides types that simplify the work of writing concurrent and asynchronous code. The main types are Task which represents an asynchronous operation that can be waited on and can provide a result, and Task<T>, which is a task that can provide a result.

- `Newtonsoft.Json.Linq`: This library is used for parsing the JSON response from the OpenWeatherMap API. It provides LINQ to JSON, which allows querying JSON objects using LINQ syntax.

## How It Works

The script takes a city name as a command-line argument and uses it to send a GET request to the OpenWeatherMap API. The API key for OpenWeatherMap is hardcoded into the script.

The `GetWeatherData` function sends the GET request and returns the response as a string. This string is a JSON object that contains the weather data for the specified city.

The JSON response is then parsed into a JObject using the `JObject.Parse` method from the `Newtonsoft.Json.Linq` library. The temperature is extracted from this JObject and displayed on the console.

## Usage

To use this script, you need to replace "Your_OpenWeatherMap_API_Key" with your actual OpenWeatherMap API Key. Then, you can run the script from the command line with the city name as an argument. For example:

```
dotnet run London
```

This will display the current temperature in London.

---

# Java Documentation

# Java Open Weather API Console Application

This is a simple Java console application that fetches and displays weather data for a specified city using the Open Weather API.

## Script Description

The script prompts the user to enter a city name, then it fetches and displays the weather data for that city from the Open Weather API. The weather data is displayed in the console.

## Libraries Used

The following libraries are used in this script:

- `java.io.BufferedReader`: This class reads text from a character-input stream, buffering characters so as to provide for the efficient reading of characters, arrays, and lines.

- `java.io.InputStreamReader`: This class is a bridge from byte streams to character streams. It reads bytes and decodes them into characters using a specified charset.

- `java.net.HttpURLConnection`: This class is used to make a single HTTP request. It is used to send a GET request to the Open Weather API and receive the response.

- `java.net.URL`: This class represents a Uniform Resource Locator, a pointer to a "resource" on the World Wide Web.

## Usage

To use this script, you need to replace "YOUR_API_KEY" with your actual Open Weather API key. You can get an API key by signing up on the Open Weather API website.

Once you have replaced the API key, you can run the script. It will prompt you to enter a city name. After you enter a city name, it will fetch and display the weather data for that city.

## Example

Here is an example of how to use the script:

```
Enter city name: London
Weather Data: {"coord":{"lon":-0.1257,"lat":51.5085},"weather":[{"id":804,"main":"Clouds","description":"overcast clouds","icon":"04d"}],"base":"stations","main":{"temp":282.15,"feels_like":280.4,"temp_min":281.09,"temp_max":283.06,"pressure":1012,"humidity":76},"visibility":10000,"wind":{"speed":1.79,"deg":360},"clouds":{"all":90},"dt":1643654896,"sys":{"type":2,"id":2019646,"country":"GB","sunrise":1643599440,"sunset":1643634587},"timezone":0,"id":2643743,"name":"London","cod":200}
```

This output represents the weather data for London. It includes information such as the temperature, humidity, wind speed, and more.

---
