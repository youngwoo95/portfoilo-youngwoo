package com.youngwoo.portfolio.domain.repository

import com.youngwoo.portfolio.domain.entity.Achievement
import com.youngwoo.portfolio.domain.entity.Experience
import com.youngwoo.portfolio.domain.entity.Introduction
import com.youngwoo.portfolio.domain.entity.Project
import org.springframework.data.jpa.repository.JpaRepository
import java.util.Optional

interface ExperienceRepository : JpaRepository<Experience, Long> {

    fun findAllByIsActive(isActive: Boolean) : List<Experience>


}