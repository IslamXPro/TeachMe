package adapters

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.teachme.databinding.ItemSearchRvBinding
import models.SearchUser

class SearchAdapter (val list: List<SearchUser>, var myClick: MyClick) : RecyclerView.Adapter<SearchAdapter.Vh>() {


    inner class Vh(var itemRv: ItemSearchRvBinding) : RecyclerView.ViewHolder(itemRv.root) {
        @SuppressLint("SetTextI18n")
        fun onBind(searchUser: SearchUser, pos: Int) {
            searchUser.courseImg?.let { itemRv.rvCourseImg.setImageResource(it) }
            itemRv.rvMentorName.text = searchUser.mentorName
            itemRv.rvCourseName.text = searchUser.courseName
            itemRv.rvCourseTimeMin.text = searchUser.courseDuration
            itemRv.rvStudentCount.text = searchUser.courseStudents



            itemRv.root.setOnClickListener {
                myClick.click(searchUser)
            }
        }
    }

    interface MyClick{
        fun click(searchUser: SearchUser)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(ItemSearchRvBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBind(list[position],position)
    }

    override fun getItemCount(): Int = list.size

}