package com.youngwoo.portfolio.domain.entity

import jakarta.persistence.*

@Entity

class Introduction(
    content: String,
    isActive: Boolean
) : BaseEntity() {

    @Id
    /* PK 임을 명시 */
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "introduction_id")
    var id: Long? = null

    var content: String = content

    var isActive : Boolean = isActive
}