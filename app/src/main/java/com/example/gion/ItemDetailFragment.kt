package com.example.gion


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.gion.databinding.FragmentItemDetailBinding

class ItemDetailFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding : FragmentItemDetailBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_item_detail,container,false)
        binding.minusImage.setOnClickListener {

        }

        binding.plusImage.setOnClickListener {

        }
        return binding.root
    }


}
