package com.youngwoo.portfolio.domain.repository

import com.youngwoo.portfolio.domain.entity.Project
import org.springframework.data.jpa.repository.JpaRepository

interface ProjectRepository : JpaRepository<Project, Long> {


}