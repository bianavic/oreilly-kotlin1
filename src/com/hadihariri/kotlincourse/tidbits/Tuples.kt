package com.hadihariri.kotlincourse.tidbits

import com.hadihariri.kotlincourse.classes.CustomerKotlin

fun capitalsAndPopulation(country: String): Pair<String, Long> {
    return Pair("Madrid", 2300000)
}

fun countryInformation(country: String): Triple<String, String, Long> {
    return Triple("Madrid", "Europe",2300000)
}

fun main(args: Array<String>) {

    val result = capitalsAndPopulation("Madrid")

    // println(result.first)
    // println(result.second)

    val countryInfo = countryInformation("Spain")
    countryInfo.third
    // println(countryInfo.third)

    val (capital, continent, population) = countryInformation("Madrid")
    val (id, name, email) = CustomerKotlin(1, "Fabi", "mail@mail.com")
    val listCapitalsAndCountries = listOf(Pair("Madri", "Spain"), "Paris" to "France")

    for(( capital2, country) in listCapitalsAndCountries) {
        println("$capital2 - $country")
    }
//
//    println(capital)
//    println(continent)
//    println(population)

    // DESCONSTRUCT VALUES

}