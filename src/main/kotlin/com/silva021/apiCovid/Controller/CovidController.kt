package com.silva021.apiCovid.Controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/covid")
class CovidController {

    @GetMapping("/sum")
    fun sum(n1 : Int , n2 : Int) = n1 + n2

    @GetMapping("/Brasil")
    fun returnDataCovidBrasil() = "mCovidService.returnDataCovidBrasil()"
}