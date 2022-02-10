package models

import java.io.Serializable

class ChildUser:Serializable {
    var id:String? = null

    var video:String? = null
    var childCourseNumber:String? = null
    var childCourseNumberInfo:String? = null

    constructor(video: String?, childCourseNumber: String?, childCourseNumberInfo: String?) {
        this.video = video
        this.childCourseNumber = childCourseNumber
        this.childCourseNumberInfo = childCourseNumberInfo
    }
}