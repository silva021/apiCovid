package com.silva021.apiCovid.repository

import com.silva021.apiCovid.model.Covid
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.CrudRepository

interface CovidRepository : JpaRepository<Covid, Long>{
}