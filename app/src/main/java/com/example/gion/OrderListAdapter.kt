package com.example.gion

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.gion.databinding.OrderListItemBinding
import com.example.gion.domain.Order

class OrderListAdapter(val context: Context): RecyclerView.Adapter<OrderListAdapter.OrderViewHolder>() {
    private var orders:List<Order> = emptyList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OrderViewHolder {
        val inflater = LayoutInflater.from(context)
        val recyclerViewItem:OrderListItemBinding = DataBindingUtil.inflate(inflater,R.layout.order_list_item,parent,false)
        return OrderViewHolder(recyclerViewItem)
    }

    override fun onBindViewHolder(holder: OrderViewHolder, position: Int) {
        val order = orders[position]
        holder.binding.viewmodel = order
    }

    override fun getItemCount(): Int {
        return orders.size
    }
    fun setOrder(flight:List<Order>){
        orders = flight
        notifyDataSetChanged()
    }

    class OrderViewHolder(itemVIew: OrderListItemBinding): RecyclerView.ViewHolder(itemVIew.root){
        val binding:OrderListItemBinding = itemVIew
    }
}