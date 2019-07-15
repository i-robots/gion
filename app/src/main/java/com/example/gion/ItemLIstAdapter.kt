package com.example.gion

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import androidx.databinding.DataBindingUtil
import com.example.gion.databinding.ProductListItemBinding
import com.example.gion.domain.Product

class ItemLIstAdapter(val context: Context,itemsList: List<Product>): BaseAdapter() {
    private var items:List<Product> = itemsList

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var item = this.items[position]
        var inflater = LayoutInflater.from(context)
        var itemView : ProductListItemBinding =
            DataBindingUtil.inflate(inflater,R.layout.product_list_item,parent,false)
        itemView.viewmodel = item
        itemView.imageVeiw.setImageResource(item.photoUrl)
        return itemView.root
    }

    override fun getItem(position: Int): Any {
        return items[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return items.size
    }
}
