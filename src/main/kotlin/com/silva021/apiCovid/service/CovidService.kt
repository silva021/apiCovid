package com.silva021.apiCovid.service

import com.silva021.apiCovid.model.Covid
import java.util.*

interface CovidService {
    fun getCovidDataDate(date: String): Optional<List<Covid>>
    fun getCovidDataUF(uf: String): Optional<List<Covid>>
    fun getCovidDataUFDate(uf: String, date: String): Optional<List<Covid>>
    fun getCovidDataCity(city: String): Optional<List<Covid>>
    fun getCovidDataCityDate(city: String, date: String): Optional<List<Covid>>
}
