package com.youngwoo.portfolio.domain.entity

import jakarta.persistence.*

@Entity

class ExperienceDetail(
    content: String,
    isActive: Boolean
) : BaseEntity() {

    @Id
    /* PK 임을 명시 */
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "experience_detail_id")
    var id: Long? = null

    var content: String = content

    var isActive : Boolean = isActive

    fun update(content: String, isActive: Boolean)
    {
        this.content = content
        this.isActive = isActive
    }

}