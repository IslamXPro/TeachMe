package adapters

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.teachme.R
import com.example.teachme.databinding.ItemRvBinding
import com.example.teachme.databinding.ItemRvMycourseBinding
import com.example.teachme.databinding.ItemSearchRvBinding
import models.CourseInfo
import models.SearchUser

class CourseAdapter (val context: Context, val list: List<CourseInfo>, var myClick: MyClick) : RecyclerView.Adapter<CourseAdapter.Vh>() {


    inner class Vh(var itemRv: ItemRvMycourseBinding) : RecyclerView.ViewHolder(itemRv.root) {
        @SuppressLint("SetTextI18n")
        fun onBind(courseInfo: CourseInfo, pos: Int) {
            courseInfo.mentorImg?.let { itemRv.rvMentorImg.setImageResource(it) }
            courseInfo.courseImg?.let { itemRv.rvMentorCourseImg.setImageResource(it) }
            itemRv.rvMentorName.text = courseInfo.mentorName
            itemRv.rvMentorName2.text = courseInfo.mentorName
            itemRv.rvCourseName.text = courseInfo.courseName
            itemRv.rvCourseNote.text = courseInfo.courseNote
            itemRv.rvCourseCost.text = courseInfo.courseCost
            itemRv.rvCourseSoldCount.text = courseInfo.courseSoldCount
            itemRv.rvBtnBuy.setOnClickListener {
                Toast.makeText(context, "Buy clicked", Toast.LENGTH_SHORT).show()
            }
            itemRv.root.setOnClickListener {
                myClick.click(courseInfo)
            }
        }
    }

    interface MyClick{
        fun click(courseInfo: CourseInfo)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(ItemRvMycourseBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBind(list[position],position)
    }

    override fun getItemCount(): Int = list.size

}