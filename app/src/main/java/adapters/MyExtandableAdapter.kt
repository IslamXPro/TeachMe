package adapters

import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseExpandableListAdapter
import com.example.teachme.R
import kotlinx.android.synthetic.main.item_child.view.*
import kotlinx.android.synthetic.main.item_group.view.*
import models.ChildUser
import models.TitleUser

var isClicked = true
class MyExtandableAdapter(val titleList:List<String>,var map:HashMap<String,List<ChildUser>>): BaseExpandableListAdapter(){
    override fun getGroupCount(): Int = titleList.size


    override fun getChildrenCount(groupPosition: Int): Int = map[titleList[groupPosition]]!!.size

    override fun getGroup(groupPosition: Int): String {
     return titleList[groupPosition]
    }

    override fun getChild(groupPosition: Int, childPosition: Int): String {
        return map[titleList[groupPosition]]!!.get(childPosition).toString()
    }

    override fun getGroupId(groupPosition: Int): Long = groupPosition.toLong()

    override fun getChildId(groupPosition: Int, childPosition: Int): Long {
        return childPosition.toLong()
    }

    override fun hasStableIds(): Boolean {
        return true
    }

    override fun getGroupView(
        groupPosition: Int,
        isExpanded: Boolean,
        convertView: View?,
        parent: ViewGroup?,
    ): View {
        val itemGroup:View
        if (convertView == null){
            itemGroup = LayoutInflater.from(parent?.context).inflate(R.layout.item_group,parent,false)
        }else{
            itemGroup = convertView
        }
        itemGroup.group_course_number.text = titleList[groupPosition]
        return itemGroup
    }

    override fun getChildView(
        groupPosition: Int,
        childPosition: Int,
        isLastChild: Boolean,
        convertView: View?,
        parent: ViewGroup?,
    ): View {
        val itemChild:View
        if (convertView == null){
            itemChild = LayoutInflater.from(parent?.context).inflate(R.layout.item_child,parent,false)
        }else{
            itemChild = convertView
        }
        itemChild.child_course_number.text = map[titleList[groupPosition]]?.get(childPosition)?.childCourseNumber
        itemChild.child_course_number_info.text = map[titleList[groupPosition]]?.get(childPosition)?.childCourseNumberInfo
        itemChild.child_video.setVideoURI(Uri.parse((map[titleList[groupPosition]]?.get(childPosition)!!.video)))
        itemChild.child_video.setOnClickListener {
        if (isClicked){
            itemChild.child_video.start()
            isClicked = false
        }else{
            itemChild.child_video.stopPlayback()
            isClicked = true
        }
        }
        return itemChild
    }

    override fun isChildSelectable(groupPosition: Int, childPosition: Int): Boolean {
        return true
    }
}