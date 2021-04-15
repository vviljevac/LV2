package com.example.lv2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.lv2.OnPersonSelectedListener.OnPersonSelectedListener
import com.example.lv2.databinding.ItemPersonBinding
import com.squareup.picasso.Picasso

class PersonAdapter(persons: MutableList<InspiringPerson>,
                    private val listener: OnPersonSelectedListener
) :
    RecyclerView.Adapter<InspiringPersonHolder>() {

    private val persons: MutableList<InspiringPerson> = mutableListOf()

    init {
        refreshData(persons)
    }

    fun refreshData(books: MutableList<InspiringPerson>) {
        this.persons.clear()
        this.persons.addAll(books)
        this.notifyDataSetChanged()
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): InspiringPersonHolder {

        val personView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_person,parent,false)
        return InspiringPersonHolder(personView as RecyclerView)
    }

    override fun getItemCount(): Int = persons.size
    override fun onBindViewHolder(holder: InspiringPersonHolder, position: Int) {
        val note = persons[position]
        holder.bind(note)
        }
}

class InspiringPersonHolder(personView: View)
    : RecyclerView.ViewHolder(personView) {
    fun bind(person: InspiringPerson) {
        val personBinding = ItemPersonBinding.bind(itemView)
        personBinding.tvName.text = person.name
        personBinding.tvBorn.text = person.toString()
        Picasso.get()
            .load(person.picture)
            .fit()
            .placeholder(R.drawable.ic_launcher_background)
            .error(android.R.drawable.stat_notify_error)
            .into(personBinding.ivPicture)
    }

}
