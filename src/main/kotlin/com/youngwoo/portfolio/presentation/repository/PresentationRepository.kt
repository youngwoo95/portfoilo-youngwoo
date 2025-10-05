package com.youngwoo.portfolio.presentation.repository

import com.youngwoo.portfolio.domain.entity.Achievement
import com.youngwoo.portfolio.domain.entity.Experience
import com.youngwoo.portfolio.domain.entity.Introduction
import com.youngwoo.portfolio.domain.entity.Link
import com.youngwoo.portfolio.domain.entity.Project
import com.youngwoo.portfolio.domain.entity.Skill
import com.youngwoo.portfolio.domain.repository.AchievementRepository
import com.youngwoo.portfolio.domain.repository.ExperienceRepository
import com.youngwoo.portfolio.domain.repository.IntroductionRepository
import com.youngwoo.portfolio.domain.repository.LinkRepository
import com.youngwoo.portfolio.domain.repository.ProjectRepository
import com.youngwoo.portfolio.domain.repository.SkillRepository
import org.springframework.stereotype.Repository

@Repository
class PresentationRepository(
    private val achievementRepository: AchievementRepository,
    private val experienceRepository: ExperienceRepository,
    private val introductionRepository: IntroductionRepository,
    private val linkRepository: LinkRepository,
    private val skillRepository: SkillRepository,
    private val projectRepository: ProjectRepository
) {

    fun getActiveAchievements():List<Achievement>{
        return achievementRepository.findAllByIsActive(true)
    }

    fun getActiveExperiences():List<Experience>{
        return experienceRepository.findAllByIsActive(true)
    }
    fun getActiveIntroductions():List<Introduction>{
        return introductionRepository.findAllByIsActive(true)
    }
    fun getActiveLinks():List<Link>{
        return linkRepository.findAllByIsActive(true)
    }
    fun getActiveSkills():List<Skill>{
        return skillRepository.findAllByIsActive(true)
    }
    fun getActiveProjects():List<Project> {
        return projectRepository.findAllByIsActive(true)
    }

}