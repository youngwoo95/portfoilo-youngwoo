package com.youngwoo.portfolio.domain.entity

import jakarta.persistence.*

@Entity

class HttpInterface : BaseEntity() {

    @Id
    /* PK 임을 명시 */
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "http_interface_id")
    var id: Long? = null


}