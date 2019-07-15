package com.example.gion

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.findNavController
import com.example.gion.ViewModel.ProductViewModel
import com.example.gion.databinding.FragmentProductListBinding

class ProductListFragment : Fragment() {

    private lateinit var itemViewModel: ProductViewModel
    private lateinit var binding: FragmentProductListBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        itemViewModel = ViewModelProviders.of(this).get(ProductViewModel::class.java)
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_product_list,container,false)
        val adapter = ItemLIstAdapter(this.requireContext(),itemViewModel.allProducts)
        binding.gridview.adapter = adapter
        binding.gridview.onItemClickListener =
            AdapterView.OnItemClickListener { parent, view, position, id ->
                val selectedItem = parent.getItemAtPosition(position).toString()
                findNavController().navigate(R.id.itemsList_dest)
            }
        return binding.root
    }

//    fun isExternalStorageWritable():Boolean{
//        return Environment.getExternalStorageState() == Environment.MEDIA_MOUNTED
//    }
//
//    fun isExternalStorageReadable():Boolean{
//        return Environment.getExternalStorageState() in setOf(
//            Environment.MEDIA_MOUNTED, Environment.MEDIA_MOUNTED_READ_ONLY)
//    }
//
//    fun getPublicAlbumStorageDir(album:String): File?{
//        var file = File(
//            Environment.getExternalStoragePublicDirectory(
//                Environment.DIRECTORY_PICTURES), album)
//
//        if(!file?.mkdirs()){
//            Log.e("file","Directory not created")
//        }
//        return file
//    }

}


