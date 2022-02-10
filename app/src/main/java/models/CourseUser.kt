package models

import java.io.Serializable

class CourseUser:Serializable {
    var id:String? = null

    var courseImg:Int? = null
    var mentorImg:Int? = null
    var mentorName:String? = null
    var mentorJob:String? = null
    var courseName:String? = null
    var courseDuration:String? = null
    var courseSave:Boolean? = false


    constructor(
        courseImg: Int?,
        mentorImg: Int?,
        mentorName: String?,
        mentorJob: String?,
        courseName: String?,
        courseDuration: String?,
        courseSave: Boolean?
    ) {
        this.courseImg = courseImg
        this.mentorImg = mentorImg
        this.mentorName = mentorName
        this.mentorJob = mentorJob
        this.courseName = courseName
        this.courseDuration = courseDuration
        this.courseSave = courseSave
    }

    constructor(
        id: String?,
        courseImg: Int?,
        mentorImg: Int?,
        mentorName: String?,
        mentorJob: String?,
        courseName: String?,
        courseDuration: String?,
        courseSave: Boolean?
    ) {
        this.id = id
        this.courseImg = courseImg
        this.mentorImg = mentorImg
        this.mentorName = mentorName
        this.mentorJob = mentorJob
        this.courseName = courseName
        this.courseDuration = courseDuration
        this.courseSave = courseSave
    }

    constructor()

    override fun toString(): String {
        return "CourseUser(id=$id, courseImg=$courseImg, mentorImg=$mentorImg, mentorName=$mentorName, mentorJob=$mentorJob, courseName=$courseName, courseDuration=$courseDuration, courseSave=$courseSave)"
    }

}