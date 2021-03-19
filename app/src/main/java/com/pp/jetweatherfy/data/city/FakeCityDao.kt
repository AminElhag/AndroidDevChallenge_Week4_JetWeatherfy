package com.pp.jetweatherfy.data.city

class FakeCityDao : CityDao {

    override suspend fun getCities() = listOf(
        "London",
        "New York",
        "Paris",
        "Moscow",
        "Tokyo",
        "Dubai",
        "Singapore",
        "Barcelona",
        "Los Angeles",
        "San Francisco",
        "Madrid",
        "Rome",
        "Chicago",
        "Toronto",
        "Abu Dhabi",
        "St. Petersburg",
        "Amsterdam",
        "Berlin",
        "Prague",
        "Lisbon",
        "Washington",
        "Istanbul",
        "Las Vegas",
        "Seoul",
        "Sydney",
        "Miami",
        "Munich",
        "Milan",
        "San Diego",
        "Bangkok",
        "Vienna",
        "Dublin",
        "Vancouver",
        "Boston",
        "Zurich",
        "Budapest",
        "Houston",
        "Seattle",
        "Montreal",
        "Hong Kong",
        "Frankfurt",
        "São Paulo",
        "Copenhagen",
        "Atlanta",
        "Buenos Aires"
    )

    override suspend fun getDefaultCity() = "San Francisco"

}