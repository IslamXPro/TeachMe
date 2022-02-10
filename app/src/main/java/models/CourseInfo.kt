package models

import java.io.Serializable

class CourseInfo:Serializable {
    var id:String? = null

    var courseImg:Int? = null
    var mentorImg:Int? = null
    var mentorName:String? = null
    var courseName:String? = null
    var courseNote:String? = null
    var courseCost:String? = null
    var courseSoldCount:String? = null

    var save:Boolean? = null



    constructor(
        courseImg: Int?,
        mentorImg: Int?,
        mentorName: String?,
        courseName: String?,
        courseNote: String?,
        courseCost: String?,
        courseSoldCount: String?
    ) {
        this.courseImg = courseImg
        this.mentorImg = mentorImg
        this.mentorName = mentorName
        this.courseName = courseName
        this.courseNote = courseNote
        this.courseCost = courseCost
        this.courseSoldCount = courseSoldCount
    }

    constructor(
        id: String?,
        courseImg: Int?,
        mentorImg: Int?,
        mentorName: String?,
        courseName: String?,
        courseNote: String?,
        courseCost: String?,
        courseSoldCount: String?,
        save: Boolean?
    ) {
        this.id = id
        this.courseImg = courseImg
        this.mentorImg = mentorImg
        this.mentorName = mentorName
        this.courseName = courseName
        this.courseNote = courseNote
        this.courseCost = courseCost
        this.courseSoldCount = courseSoldCount
        this.save = save
    }

    constructor(
        courseImg: Int?,
        mentorImg: Int?,
        mentorName: String?,
        courseName: String?,
        courseNote: String?,
        courseCost: String?,
        courseSoldCount: String?,
        save: Boolean?
    ) {
        this.courseImg = courseImg
        this.mentorImg = mentorImg
        this.mentorName = mentorName
        this.courseName = courseName
        this.courseNote = courseNote
        this.courseCost = courseCost
        this.courseSoldCount = courseSoldCount
        this.save = save
    }

    override fun toString(): String {
        return "CourseInfo(id=$id, courseImg=$courseImg, mentorImg=$mentorImg, mentorName=$mentorName, courseName=$courseName, courseNote=$courseNote, courseCost=$courseCost, courseSoldCount=$courseSoldCount, save=$save)"
    }
}