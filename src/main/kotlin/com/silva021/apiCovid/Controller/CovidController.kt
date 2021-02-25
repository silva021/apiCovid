package com.silva021.apiCovid.Controller

import com.silva021.apiCovid.model.Covid
import com.silva021.apiCovid.service.CovidService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/covid")
class CovidController (private val mService: CovidService) {

    @GetMapping("/date/{date}")
    fun getCovidDataForDate(@PathVariable date : String) : ResponseEntity<List<Covid>>? =
        mService.getCovidDataDate(date).map {
            ResponseEntity.ok(it)
        }.orElse(ResponseEntity.notFound().build())

    @GetMapping("/uf/{uf}")
    fun getCovidDataUF(@PathVariable uf : String) : ResponseEntity<List<Covid>>? =
        mService.getCovidDataUF(uf).map {
            ResponseEntity.ok(it)
        }.orElse(ResponseEntity.notFound().build())

    @GetMapping("/uf/date/{uf}/{date}")
    fun getCovidDataUFDate(@PathVariable uf : String, @PathVariable date : String) : ResponseEntity<List<Covid>>? =
        mService.getCovidDataUFDate(uf, date).map {
            ResponseEntity.ok(it)
        }.orElse(ResponseEntity.notFound().build())

    @GetMapping("/city/{city}")
    fun getCovidDataCity(@PathVariable city : String) : ResponseEntity<List<Covid>>? =
        mService.getCovidDataCity(city).map {
            ResponseEntity.ok(it)
        }.orElse(ResponseEntity.notFound().build())

    @GetMapping("/city/date/{city}/{date}")
    fun getCovidDataCityDate(@PathVariable city : String, @PathVariable date : String) : ResponseEntity<List<Covid>>? =
        mService.getCovidDataCityDate(city, date).map {
            ResponseEntity.ok(it)
        }.orElse(ResponseEntity.notFound().build())


}