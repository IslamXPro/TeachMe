package adapters

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.teachme.R
import com.example.teachme.databinding.ItemRvBinding
import models.CourseUser

class MainRecycleAdapter2 (val list: List<CourseUser>, var myClick: MyClick) : RecyclerView.Adapter<MainRecycleAdapter2.Vh>() {

    var isClick = false

    inner class Vh(var itemRv: ItemRvBinding) : RecyclerView.ViewHolder(itemRv.root) {
        @SuppressLint("SetTextI18n")
        fun onBind(courseUser: CourseUser, pos: Int) {
            courseUser.courseImg?.let { itemRv.rvCourseImg.setImageResource(it) }
            courseUser.mentorImg?.let { itemRv.rvMentorImg.setImageResource(it) }
            itemRv.rvMentorName.text = courseUser.mentorName
            itemRv.rvMentorJob.text = courseUser.mentorJob
            itemRv.rvCourseName.text = courseUser.courseName
            itemRv.rvCourseDuration.text = courseUser.courseDuration

            itemRv.saveBtn.setOnClickListener {
                if (isClick){
                    itemRv.saveBtn.setImageResource(R.drawable.save_ic)
                    isClick = false
                }else{
                    itemRv.saveBtn.setImageResource(R.drawable.save_ic_click)
                    isClick = true
                }
            }

            itemRv.root.setOnClickListener {
                myClick.click(courseUser)
            }
        }
    }

    interface MyClick{
        fun click(courseUser: CourseUser)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(ItemRvBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBind(list[position],position)
    }

    override fun getItemCount(): Int = list.size

}