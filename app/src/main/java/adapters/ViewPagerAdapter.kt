package adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.islamxpro.teachme.*

class ViewPagerAdapter(fragmentManager: FragmentManager): FragmentPagerAdapter(fragmentManager,
    BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
    override fun getCount(): Int = 5

    override fun getItem(position: Int): Fragment {
        return when(position){
            0->{
                HomeFragment()
            }
            1->{
                SearchFragment()
            }
            2->{
                CourseFragment()
            }
            3->{
                MentorsFragment()
            }
            4->{
                ProfileFragment()
            }
            else -> {
                HomeFragment()
            }
        }
    }
}