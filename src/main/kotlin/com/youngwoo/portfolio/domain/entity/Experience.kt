package com.youngwoo.portfolio.domain.entity

import jakarta.persistence.*
import org.springframework.data.annotation.CreatedDate

@Entity

class Experience(
    title: String,
    description: String,
    startYear: Int,
    startMonth: Int,
    endYear: Int?,
    endMonth: Int?,
    isActive: Boolean
) : BaseEntity() {

    @Id
    /* PK 임을 명시 */
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "experience_id")
    var id: Long? = null

    var title: String = title

    var description: String = description

    var startYear: Int = startYear

    var startMonth: Int = startMonth

    var endYear: Int? = endYear

    var endMonth: Int? = endMonth

    var isActive: Boolean = isActive

    // 1:N 관계
    @OneToMany(targetEntity = ExperienceDetail::class,
        fetch = FetchType.EAGER,
        cascade = [CascadeType.ALL])
    @JoinColumn(name = "experience_id")
    var details: MutableList<ExperienceDetail> = mutableListOf() // 빈 리스트 넣는다.

    fun getEndYearMonth(): String
    {
        if(endYear == null || endMonth == null)
        {
            return "Present"
        }
        return "${endYear}.${endMonth}"
    }

    fun update(
        title: String, description: String, startYear: Int,
        startMonth: Int, endYear: Int?, endMonth: Int?, isActive: Boolean
    ){
        this.title = title
        this.description = description
        this.startYear = startYear
        this.startMonth = startMonth
        this.endYear = endYear
        this.endMonth = endMonth
        this.isActive = isActive
    }

    fun addDetails(details: MutableList<ExperienceDetail>?){
        if(details != null)
        {
            this.details.addAll(details)
        }
    }

}