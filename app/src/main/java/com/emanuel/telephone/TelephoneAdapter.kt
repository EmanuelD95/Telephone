package com.emanuel.telephone

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class TelephoneAdapter (private val telephoneList: List<Telephone>) : RecyclerView.Adapter<TelephoneViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TelephoneViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return TelephoneViewHolder(layoutInflater.inflate(R.layout.item_contact, parent,false))
    }

    // TODO: Te habías confundido, pero ya corregí. Habías intercambiado el código de onCreateViewHolder con onBindViewHolder
    override fun onBindViewHolder(holder: TelephoneViewHolder, position: Int) {
        val item = telephoneList[position]
        holder.render(item)
    }

    override fun getItemCount(): Int = telephoneList.size

}
