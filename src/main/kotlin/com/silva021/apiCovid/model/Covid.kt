package com.silva021.apiCovid.model

import javax.persistence.*


@Entity()
@Table(name = "t_Covid")
class Covid {
    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    var id: Long = 0

    @Column(name = "data", nullable = false)
    var date: String = ""
    @Column(name = "cidade", nullable = false)
    var city: String = ""

    @Column(name = "estado", nullable = false)
    var state: String = ""

    @Column(name = "tipo", nullable = false)
    var type: Int = 0

    @Column(name = "casos", nullable = false)
    var cases: Int = 0

    @Column(name = "mortes", nullable = false)
    var deaths: Int = 0

}