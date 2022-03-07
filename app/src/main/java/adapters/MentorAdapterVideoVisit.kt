package adapters

import android.annotation.SuppressLint
import android.content.Context
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.islamxpro.teachme.databinding.ItemRvMainVideoBinding
import models.MentorVideoUser

class MentorAdapterVideoVisit (val context: Context,val list: List<MentorVideoUser>, var myClick: MyClick) : RecyclerView.Adapter<MentorAdapterVideoVisit.Vh>() {

    var isClick = false

    inner class Vh(var itemRv: ItemRvMainVideoBinding) : RecyclerView.ViewHolder(itemRv.root) {
        @SuppressLint("SetTextI18n")
        fun onBind(mentorUser: MentorVideoUser, pos: Int) {
            itemRv.rvVideo.setVideoURI(Uri.parse(mentorUser.mentorVideo))
            isClick = true
            mentorUser.mentorImg?.let { itemRv.rvMentorImg.setImageResource(it) }
            itemRv.rvMentorName.text = mentorUser.mentorName
            itemRv.rvVideo.setOnClickListener {
                if (isClick) {
                    itemRv.rvVideo.start()
                    Toast.makeText(context, "Click play", Toast.LENGTH_SHORT).show()
                    itemRv.rvPlayBtn.visibility = View.INVISIBLE
                    isClick = false
                }else{
                    itemRv.rvVideo.pause()
                    Toast.makeText(context, "Click pause", Toast.LENGTH_SHORT).show()
                    itemRv.rvPlayBtn.visibility = View.VISIBLE
                    isClick = true
                }
            }
            itemRv.rvLikeBtn.setOnClickListener {
                Toast.makeText(context, "Clicked Like", Toast.LENGTH_SHORT).show()
            }
            itemRv.rvCommentBtn.setOnClickListener {
                Toast.makeText(context, "Clicked Comment", Toast.LENGTH_SHORT).show()
            }
            itemRv.rvDownloadBtn.setOnClickListener {
                Toast.makeText(context, "Clicked Download", Toast.LENGTH_SHORT).show()
            }
        }
    }

    interface MyClick{
        fun click(mentorUser: MentorVideoUser)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(ItemRvMainVideoBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBind(list[position],position)
    }

    override fun getItemCount(): Int = list.size

}