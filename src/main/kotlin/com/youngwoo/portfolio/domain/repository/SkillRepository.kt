package com.youngwoo.portfolio.domain.repository

import com.youngwoo.portfolio.domain.entity.Skill
import org.springframework.data.jpa.repository.JpaRepository

interface SkillRepository : JpaRepository<Skill, Long> {


}