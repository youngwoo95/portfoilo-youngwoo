package com.youngwoo.portfolio.presentation.dto

import com.youngwoo.portfolio.domain.entity.Introduction

data class IntroductionDTO (
    val content: String
){
    constructor(introduction: Introduction) : this(
        content = introduction.content
    )
}