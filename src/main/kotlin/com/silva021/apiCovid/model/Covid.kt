package com.silva021.apiCovid.model

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

//@Entity
//@Table(name = "t_covid")
class Covid {
//    @Column(name = "data", nullable = false)
    val date: String = ""

//    @Column(name = "cidade", nullable = false)
    val city: String = ""

//    @Column(name = "estado", nullable = false)
    val state: String = ""

//    @Column(name = "tipo", nullable = false)
    val type: Int = 0

//    @Column(name = "casosConfirmados", nullable = false)
    val cases: Int = 0

//    @Column(name = "mortes", nullable = false)
    val deaths: Int = 0
}