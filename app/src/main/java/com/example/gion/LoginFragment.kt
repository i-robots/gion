package com.example.gion


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.Navigation

class LoginFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.btn_login)?.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.account_action, null)
        )

        view.findViewById<TextView>(R.id.login_signUp_tv)?.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.signup_action, null)
        )
    }


}
