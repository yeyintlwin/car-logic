package com.yeyintlwin.buyacar

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.CompoundButton
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), CompoundButton.OnCheckedChangeListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        switch_good.setOnCheckedChangeListener(this)
        switch_cheap.setOnCheckedChangeListener(this)
        switch_fast.setOnCheckedChangeListener(this)
    }

    override fun onCheckedChanged(buttonView: CompoundButton, isChecked: Boolean) {
        when (buttonView) {
            switch_good -> if (isChecked && switch_cheap.isChecked && switch_fast.isChecked)
                switch_fast.isChecked = false
            switch_cheap -> if (isChecked && switch_good.isChecked && switch_fast.isChecked)
                switch_good.isChecked = false
            switch_fast -> if (isChecked && switch_cheap.isChecked && switch_good.isChecked)
                switch_cheap.isChecked = false
        }
    }
}
