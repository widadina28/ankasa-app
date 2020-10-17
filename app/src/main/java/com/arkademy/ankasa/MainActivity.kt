package com.arkademy.ankasa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.arkademy.ankasa.dashboard.booking.BookingAdapter
import com.arkademy.ankasa.dashboard.booking.BookingModel
import kotlinx.android.synthetic.main.fragment_booking.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}