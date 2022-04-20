package br.unis.edu.appfilmes.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.unis.edu.appfilmes.databinding.FilmeItemBinding
import br.unis.edu.appfilmes.model.Filme


class AdapterFilmes(private val context: Context, private  val listaFilmes: MutableList<Filme>):
    RecyclerView.Adapter<AdapterFilmes.FilmeViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilmeViewHolder {
        val itemLista = FilmeItemBinding.inflate(LayoutInflater.from(context),parent,false)
        return FilmeViewHolder(itemLista)
    }

    override fun onBindViewHolder(holder: FilmeViewHolder, position: Int) {
        holder.txtTituloFilme.text = listaFilmes[position].titulo
    }

    override fun getItemCount() = listaFilmes.size

    inner class FilmeViewHolder(binding: FilmeItemBinding): RecyclerView.ViewHolder(binding.root) {
        val txtTituloFilme = binding.txtTituloFilme

    }
}