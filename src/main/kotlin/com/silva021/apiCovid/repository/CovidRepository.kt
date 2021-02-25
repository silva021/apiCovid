package com.silva021.apiCovid.repository

import com.silva021.apiCovid.model.Covid
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface CovidRepository : JpaRepository<Covid, Long> {

    @Query(
        value = "select id, data, cidade, estado, tipo, casos, mortes from t_covid where data = :date order by data, estado, cidade",
        nativeQuery = true
    )
    fun getCovidDataDate(@Param("date") date: String): Optional<List<Covid>>

    @Query(
        value = "select id, data, cidade, estado, tipo, casos, mortes from t_covid where estado = :uf order by estado, cidade",
        nativeQuery = true
    )
    fun getCovidDataUF(@Param("uf") state : String) : Optional<List<Covid>>

    @Query(
        value = "select id, data, cidade, estado, tipo, casos, mortes from t_covid where estado = :uf and data = :date order by estado, cidade",
        nativeQuery = true
    )
    fun getCovidDataUFDate(@Param("uf") state : String, @Param("date") date : String) : Optional<List<Covid>>


    @Query(
        value = "select id, data, cidade, estado, tipo, casos, mortes from t_covid where cidade like CONCAT('%',:city, '%') order by estado, cidade",
        nativeQuery = true
    )
    fun getCovidDataCity(@Param("city") state : String) : Optional<List<Covid>>

    @Query(
        value = "select id, data, cidade, estado, tipo, casos, mortes from t_covid where data = :date and  cidade like CONCAT('%',:city, '%') order by estado, cidade",
        nativeQuery = true
    )
    fun getCovidDataCityDate(@Param("city") state : String, @Param("date") date : String) : Optional<List<Covid>>
}