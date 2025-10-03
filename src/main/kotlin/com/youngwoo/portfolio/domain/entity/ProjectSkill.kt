package com.youngwoo.portfolio.domain.entity

import jakarta.persistence.*

@Entity

class ProjectSkill : BaseEntity() {

    @Id
    /* PK 임을 명시 */
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "project_skill_id")
    var id: Long? = null


}