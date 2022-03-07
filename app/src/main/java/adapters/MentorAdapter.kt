package adapters

import android.annotation.SuppressLint
import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.islamxpro.teachme.R
import com.islamxpro.teachme.databinding.ItemRvMentorBinding
import models.MentorUser

class MentorAdapter (val list: List<MentorUser>, var myClick: MyClick) : RecyclerView.Adapter<MentorAdapter.Vh>() {

    var isClick = false

    inner class Vh(var itemRv: ItemRvMentorBinding) : RecyclerView.ViewHolder(itemRv.root) {
        @SuppressLint("SetTextI18n", "ResourceAsColor")
        fun onBind(mentorUser: MentorUser, pos: Int) {
            mentorUser.mentorImg?.let { itemRv.rvMentorImg.setImageResource(it) }
            itemRv.rvMentorName.text = mentorUser.mentorName
            itemRv.rvMentorFollower.text = mentorUser.mentorFollowers
            itemRv.rvFollowBtn.setOnClickListener {
                if (isClick){
                    itemRv.rvFollowBtn.setBackgroundResource(R.drawable.follow_back)
                    itemRv.rvFollowBtn.text = "Followed"
                    itemRv.rvFollowBtn.setTextColor(Color.parseColor("#39C538"))
                    isClick = false
                }else{
                    itemRv.rvFollowBtn.setBackgroundResource(R.drawable.follow_back_full)
                    itemRv.rvFollowBtn.text = "Follow"
                    itemRv.rvFollowBtn.setTextColor(Color.parseColor("#FFFFFF"))
                    isClick = true
                }
            }

            itemRv.root.setOnClickListener {
                myClick.click(mentorUser)
            }
        }
    }

    interface MyClick{
        fun click(mentorUser: MentorUser)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(ItemRvMentorBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBind(list[position],position)
    }

    override fun getItemCount(): Int = list.size

}