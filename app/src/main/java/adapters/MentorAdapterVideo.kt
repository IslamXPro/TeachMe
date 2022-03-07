package adapters

import android.annotation.SuppressLint
import android.net.Uri
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.islamxpro.teachme.databinding.ItemRvVideoBinding
import models.MentorVisitUser

class MentorAdapterVideo (val list: List<MentorVisitUser>, var myClick: MyClick) : RecyclerView.Adapter<MentorAdapterVideo.Vh>() {

    var isClick = false

    inner class Vh(var itemRv: ItemRvVideoBinding) : RecyclerView.ViewHolder(itemRv.root) {
        @SuppressLint("SetTextI18n")
        fun onBind(mentorUser: MentorVisitUser, pos: Int) {
            itemRv.rvVideo.setVideoURI(Uri.parse(mentorUser.mentorVideo))
            itemRv.root.setOnClickListener {
                myClick.click(mentorUser)
            }
        }
    }

    interface MyClick{
        fun click(mentorUser: MentorVisitUser)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(ItemRvVideoBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBind(list[position],position)
    }

    override fun getItemCount(): Int = list.size

}