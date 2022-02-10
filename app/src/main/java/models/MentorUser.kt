package models

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable
class MentorUser : Serializable {
    var id: Int? = null

    var mentorName: String? = null
    var mentorImg: Int? = null
    var mentorFollowers: String? = null
    var mentorFollowBtn: Boolean? = false

    constructor()
    constructor(
        mentorName: String?,
        mentorImg: Int?,
        mentorFollowers: String?,
        mentorFollowBtn: Boolean?
    ) {
        this.mentorName = mentorName
        this.mentorImg = mentorImg
        this.mentorFollowers = mentorFollowers
        this.mentorFollowBtn = mentorFollowBtn
    }
}