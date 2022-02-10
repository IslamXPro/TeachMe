package models

import java.io.Serializable

class MentorVisitUser:Serializable {
    var id:String? = null

    var mentorName:String? = null
    var mentorImg:Int? = null
    var mentorVideo:String? = null
    var mentorFollowers:String? = null
    var mentorFollows:String? = null
    var mentorVideoCount:String? = null

    constructor(
        mentorName: String?,
        mentorImg: Int?,
        mentorVideo: String?,
        mentorFollowers: String?,
        mentorFollows: String?,
        mentorVideoCount: String?
    ) {
        this.mentorName = mentorName
        this.mentorImg = mentorImg
        this.mentorVideo = mentorVideo
        this.mentorFollowers = mentorFollowers
        this.mentorFollows = mentorFollows
        this.mentorVideoCount = mentorVideoCount
    }


    constructor()
    constructor(mentorVideo: String?) {
        this.mentorVideo = mentorVideo
    }
}