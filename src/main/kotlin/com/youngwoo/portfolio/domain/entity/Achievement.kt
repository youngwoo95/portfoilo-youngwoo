package com.youngwoo.portfolio.domain.entity

import jakarta.persistence.*
import java.time.LocalDateTime

@Entity

class Achievement (
    title: String,
    description: String,
    achievedDate: LocalDateTime?,
    host: String,
    isActive: Boolean
    ): BaseEntity() {

    @Id
    /* PK 임을 명시 */
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "achievement_id")
    var id: Long? = null

    var title: String = title

    var description: String = description

    var achievedDate: LocalDateTime? = achievedDate

    var host: String = host

    var isActive : Boolean = isActive
}