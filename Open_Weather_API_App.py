Sure, here is a simple Python script that uses the Open Weather API:

```python
import requests
import json

def get_weather(api_key, city):
    base_url = "http://api.openweathermap.org/data/2.5/weather"
    params = {
        'q': city,
        'appid': api_key,
        'units': 'metric'
    }
    response = requests.get(base_url, params=params)
    return response.json()

def print_weather(data):
    print(f"City: {data['name']}")
    print(f"Weather: {data['weather'][0]['description']}")
    print(f"Temperature: {data['main']['temp']}°C")
    print(f"Humidity: {data['main']['humidity']}%")
    print(f"Wind: {data['wind']['speed']} m/s")

def main():
    api_key = "your_api_key_here"
    city = input("Enter city name: ")
    weather_data = get_weather(api_key, city)
    print_weather(weather_data)

if __name__ == "__main__":
    main()
```

Please replace "your_api_key_here" with your actual Open Weather API key. This script will prompt the user to enter a city name, then it will display the current weather information for that city.