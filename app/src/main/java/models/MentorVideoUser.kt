package models

class MentorVideoUser {
    var id:String? = null
    var mentorVideo:String? = null
    var mentorName:String? = null
    var mentorImg:Int? = null

    constructor(mentorVideo: String?, mentorName: String?, mentorImg: Int?) {
        this.mentorVideo = mentorVideo
        this.mentorName = mentorName
        this.mentorImg = mentorImg
    }

    constructor()
}