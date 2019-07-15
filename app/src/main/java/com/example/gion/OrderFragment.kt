package com.example.gion

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.gion.ViewModel.OrderViewModel
import com.example.gion.databinding.FragmentOrderBinding

class OrderFragment : Fragment() {
    private lateinit var orderViewModel : OrderViewModel
    private lateinit var binding : FragmentOrderBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_order, container, false)
        var adapter = OrderListAdapter(this.requireContext())
        binding.orderRecycler.layoutManager = LinearLayoutManager(this.requireContext())
        binding.orderRecycler.adapter = adapter
        orderViewModel = ViewModelProviders.of(this).get(OrderViewModel::class.java)
        adapter.setOrder(orderViewModel.allOrder)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}
