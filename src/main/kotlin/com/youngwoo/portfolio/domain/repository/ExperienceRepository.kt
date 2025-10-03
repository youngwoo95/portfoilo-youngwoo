package com.youngwoo.portfolio.domain.repository

import com.youngwoo.portfolio.domain.entity.Experience
import org.springframework.data.jpa.repository.JpaRepository

interface ExperienceRepository : JpaRepository<Experience, Long> {


}