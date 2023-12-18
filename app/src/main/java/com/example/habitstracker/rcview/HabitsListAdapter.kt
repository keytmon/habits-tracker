package com.example.habitstracker.rcview


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.habitstracker.R
import com.example.habitstracker.databinding.HabitItemBinding


class HabitsListAdapter : RecyclerView.Adapter<HabitsListAdapter.HabitsHolder>(){
    val habitsList = ArrayList<Habit>()

    class HabitsHolder(item: View): ViewHolder(item) {
        val binding = HabitItemBinding.bind(item)
        fun bind(habit: Habit) = with(binding){
            habitIcon.setImageResource(habit.habitIcon)
            habitName.text = habit.habitName
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HabitsHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.habit_item, parent, false)
        return HabitsHolder(view)
    }


    override fun onBindViewHolder(holder: HabitsHolder, position: Int) {
        holder.bind(habitsList[position])
    }

    override fun getItemCount(): Int {
        return habitsList.size
    }

    fun addHabit(habit: Habit){
        habitsList.add(habit)
        notifyDataSetChanged()
    }
}
