package com.silva021.apiCovid.service

import com.silva021.apiCovid.model.Covid
import com.silva021.apiCovid.repository.CovidRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class CovidServiceImp(private val mRepository: CovidRepository) : CovidService {

    override fun getCovidDataDate(date: String): Optional<List<Covid>> = mRepository.getCovidDataDate(date)
    override fun getCovidDataUF(uf: String): Optional<List<Covid>> = mRepository.getCovidDataUF(uf)
    override fun getCovidDataCity(city: String): Optional<List<Covid>> = mRepository.getCovidDataCity(city)

    override fun getCovidDataCityDate(city: String, date: String): Optional<List<Covid>> =
        mRepository.getCovidDataCityDate(city, date)

    override fun getCovidDataUFDate(city: String, date: String): Optional<List<Covid>> =
        mRepository.getCovidDataUFDate(city, date)

}