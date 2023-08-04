package com.sanskar.viewslideanimate

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.sanskar.viewslideanimate.databinding.ActivityAnimateViewBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAnimateViewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(ActivityAnimateViewBinding.inflate(layoutInflater).apply {
            binding = this
        }.root)

        binding.btnResetToOriginalPosition.setOnClickListener {
            binding.mySlidingView.resetPosition()
        }
    }

}