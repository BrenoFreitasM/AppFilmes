package br.unis.edu.appfilmes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import br.unis.edu.appfilmes.adapter.AdapterFilmes
import br.unis.edu.appfilmes.databinding.ActivityMainBinding
import br.unis.edu.appfilmes.model.Filme

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapterFilmes: AdapterFilmes
    private val listaFilmes: MutableList<Filme> = mutableListOf()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val recyclerViewFilmes = binding.recyclerViewFilmes
        recyclerViewFilmes.layoutManager = LinearLayoutManager(this)
        recyclerViewFilmes.setHasFixedSize(true)
        adapterFilmes = AdapterFilmes(this,listaFilmes)
        recyclerViewFilmes.adapter = adapterFilmes
        filmes()
    }

    private fun filmes(){
        val filme1 = Filme("Os vingadores")
        listaFilmes.add(filme1)

        val filme2 = Filme("As Aventureas de Pi")
        listaFilmes.add(filme2)

        val filme3 = Filme("Titanic")
        listaFilmes.add(filme3)

        val filme4 = Filme("A era do gelo")
        listaFilmes.add(filme4)

        val filme5 = Filme("Homem Aranha 2")
        listaFilmes.add(filme5)

        val filme6 = Filme("Homem Aranha 3")
        listaFilmes.add(filme6)

        val filme7 = Filme("MIB 2")
        listaFilmes.add(filme7)

        val filme8 = Filme("A volta dos que não foram")
        listaFilmes.add(filme8)

        val filme9 = Filme("As transas de um careca")
        listaFilmes.add(filme9)

        val filme10 = Filme("Crescer é uma fera")
        listaFilmes.add(filme10)

        val filme11 = Filme("Up uma aventura nas alturas")
        listaFilmes.add(filme11)

        val filme12 = Filme("Mr Bean")
        listaFilmes.add(filme12)

    }
}