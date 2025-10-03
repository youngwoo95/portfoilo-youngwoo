package com.youngwoo.portfolio.domain.entity

import jakarta.persistence.*

@Entity

class Experience : BaseEntity() {

    @Id
    /* PK 임을 명시 */
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "experience_id")
    var id: Long? = null


}