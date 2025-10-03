package com.youngwoo.portfolio.domain.entity

import jakarta.persistence.*

@Entity

class ProjectDetail : BaseEntity() {

    @Id
    /* PK 임을 명시 */
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "project_detail_id")
    var id: Long? = null


}