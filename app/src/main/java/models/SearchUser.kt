package models

import java.io.Serializable

class SearchUser:Serializable {
    var id:String? = null

    var courseImg:Int? = null
    var mentorName:String? = null
    var courseName:String? = null
    var courseDuration:String? = null
    var courseStudents:String? = null
    constructor()
    constructor(
        id: String?,
        courseImg: Int?,
        mentorName: String?,
        courseName: String?,
        courseDuration: String?,
        courseStudents: String?
    ) {
        this.id = id
        this.courseImg = courseImg
        this.mentorName = mentorName
        this.courseName = courseName
        this.courseDuration = courseDuration
        this.courseStudents = courseStudents
    }

    constructor(
        courseImg: Int?,
        mentorName: String?,
        courseName: String?,
        courseDuration: String?,
        courseStudents: String?
    ) {
        this.courseImg = courseImg
        this.mentorName = mentorName
        this.courseName = courseName
        this.courseDuration = courseDuration
        this.courseStudents = courseStudents
    }


}