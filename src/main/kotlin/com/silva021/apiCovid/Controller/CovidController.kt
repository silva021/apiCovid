package com.silva021.apiCovid.Controller

import com.silva021.apiCovid.model.Covid
import com.silva021.apiCovid.repository.CovidRepository
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/covid")
class CovidController (private val mRepository: CovidRepository) {

    @GetMapping("/{id}")
    fun getCovidDateForId(@PathVariable id : Long) : ResponseEntity<Covid> =
        mRepository.findById(id).map {
            ResponseEntity.ok(it)
        }.orElse(ResponseEntity.notFound().build())

}