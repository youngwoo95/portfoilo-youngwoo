package com.youngwoo.portfolio.domain.entity

import com.youngwoo.portfolio.domain.constant.SkillType
import jakarta.persistence.*

@Entity

class Skill(
    name: String,
    type: String,
    isActive: Boolean
) : BaseEntity() {

    @Id
    /* PK 임을 명시 */
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "skill_id")
    var id: Long? = null

    var name: String = name

    @Column(name = "skill_type")
    @Enumerated(value = EnumType.STRING)
    var type: SkillType = SkillType.valueOf(type)

    var isActive : Boolean = isActive

}