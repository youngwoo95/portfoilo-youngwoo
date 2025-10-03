package com.youngwoo.portfolio.domain.entity

import jakarta.persistence.*

@Entity

class Project : BaseEntity() {

    @Id
    /* PK 임을 명시 */
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "project_id")
    var id: Long? = null


}