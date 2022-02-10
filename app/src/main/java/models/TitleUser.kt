package models

import java.io.Serializable

class TitleUser:Serializable {
    var id:String? = null

    var groupCourseNumber:String? = null

    constructor(id: String?, groupCourseNumber: String?) {
        this.id = id
        this.groupCourseNumber = groupCourseNumber
    }

    constructor(groupCourseNumber: String?) {
        this.groupCourseNumber = groupCourseNumber
    }

    constructor()

    override fun toString(): String {
        return "TitleUser(id=$id, groupCourseNumber=$groupCourseNumber)"
    }
}