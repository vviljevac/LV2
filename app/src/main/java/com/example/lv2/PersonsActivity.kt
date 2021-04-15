package com.example.lv2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.lv2.databinding.ItemPersonBinding

class PersonsActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_persons)
        setUpUi()
    }
    private fun setUpUi() {

        displayData()
    }
    private fun displayData() {
       // personsDisplay.adapter = PersonAdapter(PeopleRepository.persons)
    }
}
