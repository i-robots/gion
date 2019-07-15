package com.example.gion


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_account.view.*


class AccountFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_account,
            container, false)

        val nameEditButton = view.edit_name_button
        val saveNameButton = view.name_save_button
        val discardNameButton = view.name_discard_button

        val phoneEditBUtton = view.edit_phone_button
        val savePhoneButton = view.phone_save_button
        val discardPhoneButton = view.phone_discard_button

        nameEditButton.setOnClickListener {
            setVisiblityON(view.name_display_tv,
                view.edit_name_button,
                view.edit_name_et,
                view.name_save_discard)
        }

        discardNameButton.setOnClickListener {
            setVisiblityOff(view.name_display_tv,
                view.edit_name_button,
                view.edit_name_et,
                view.name_save_discard)
        }

        saveNameButton.setOnClickListener {
            setVisiblityOff(view.name_display_tv,
                view.edit_name_button,
                view.edit_name_et,
                view.name_save_discard)
        }

        phoneEditBUtton.setOnClickListener {
            setVisiblityON(view.display_phone_tv,
                view.edit_phone_button,
                view.edit_phone_et,
                view.phone_save_discard)
        }

        savePhoneButton.setOnClickListener {
            setVisiblityOff(view.display_phone_tv,
                view.edit_phone_button,
                view.edit_phone_et,
                view.phone_save_discard)
        }

        discardPhoneButton.setOnClickListener {
            setVisiblityOff(view.display_phone_tv,
                view.edit_phone_button,
                view.edit_phone_et,
                view.phone_save_discard)
        }

        view.account_button.setOnClickListener {
            findNavController().navigate(R.id.login_dest,null)
        }

        return view
    }

    fun setVisiblityON(disText: LinearLayout,editButton:Button,
                       editEt:LinearLayout,save_discard:LinearLayout){
        disText.visibility = View.INVISIBLE
        editButton.visibility = View.INVISIBLE
        editEt.visibility = View.VISIBLE
        save_discard.visibility = View.VISIBLE
    }

    fun setVisiblityOff(disText: LinearLayout,editButton:Button,
                        editEt:LinearLayout,save_discard:LinearLayout){
        disText.visibility = View.VISIBLE
        editButton.visibility = View.VISIBLE
        editEt.visibility = View.INVISIBLE
        save_discard.visibility = View.INVISIBLE
    }
}
