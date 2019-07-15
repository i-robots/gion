package com.example.gion

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import androidx.databinding.DataBindingUtil
import com.example.gion.ViewModel.ItemViewModel
import com.example.gion.databinding.FragmentItemsListBinding
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.findNavController

class ItemsListFragment : Fragment() {

    private lateinit var itemViewModel: ItemViewModel
    private lateinit var binding : FragmentItemsListBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        itemViewModel = ViewModelProviders.of(this).get(ItemViewModel::class.java)
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_items_list,container,false)
        val adapter = ItemLIstAdapter(this.requireContext(),itemViewModel.allItems)
        binding.itemListRecyclerId.adapter = adapter

        binding.itemListRecyclerId.onItemClickListener =
        AdapterView.OnItemClickListener { parent, view, position, id ->
            val selectedItem = parent.getItemAtPosition(position).toString()
            findNavController().navigate(R.id.itemDetail_dest)
        }
        return binding.root
    }


}
