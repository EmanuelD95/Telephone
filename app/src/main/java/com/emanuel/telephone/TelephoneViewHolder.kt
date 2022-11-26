package com.emanuel.telephone

import android.annotation.SuppressLint
import android.graphics.Color
import android.view.View
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.emanuel.telephone.databinding.ItemContactBinding
import java.util.*

class TelephoneViewHolder (view: View):RecyclerView.ViewHolder(view){

    val binding = ItemContactBinding.bind(view)

    @SuppressLint("SetTextI18n")
    fun render(telephoneModel: Telephone) {
        /* Para generalizar con binding
        with(binding) {
            tvInitialLetter.text = telephoneModel.name.get(0).toString()
        }*/
        binding.tvInitialLetter.text = telephoneModel.name.get(0).toString()
        binding.tvName.text  = telephoneModel.name
        binding.tvTimestamp.text = "Móvil hace ${telephoneModel.timestamp}"

        // Asignar drawable segun tipo de llamada
        if (telephoneModel.typeCall == 1)
            binding.ivCall.setBackgroundResource(R.drawable.ic_call_made)
        else if (telephoneModel.typeCall == 2)
            binding.ivCall.setBackgroundResource(R.drawable.ic_call_received)

        // Generar un color al azar
        val random = Random()
        val color: Int =
            Color.argb(255, random.nextInt(256), random.nextInt(256), random.nextInt(256))

        // Cambiar color a un drawable
        binding.ivCircle.setColorFilter(
            color,
            //ContextCompat.getColor(binding.ivCircle.context, R.color.black),  // Asignar un color guardado en colors.xml
            android.graphics.PorterDuff.Mode.SRC_IN)
    }
}