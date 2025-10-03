package com.youngwoo.portfolio.domain.entity

import jakarta.persistence.*

@Entity

class Link : BaseEntity() {

    @Id
    /* PK 임을 명시 */
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "link_id")
    var id: Long? = null


}