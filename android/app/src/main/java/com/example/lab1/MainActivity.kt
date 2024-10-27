package com.example.lab1

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.activity.ComponentActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.lab1.databinding.ActivityMainBinding

class MainActivity : ComponentActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var vacancyAdapter: VacancyAdapter
    private val vacancies: List<Vacancy> = getVacancies()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupRecyclerView()
        setupSearchListener()
    }

    private fun setupRecyclerView() {
        binding.vacancyRecyclerView.layoutManager = LinearLayoutManager(this)
        vacancyAdapter = VacancyAdapter(vacancies) { vacancy ->
            openVacancyDetail(vacancy)
        }
        binding.vacancyRecyclerView.adapter = vacancyAdapter
    }

    private fun openVacancyDetail(vacancy: Vacancy) {
        val intent = Intent(this, VacancyDetailActivity::class.java).apply {
            putExtra("vacancy", vacancy)
        }
        startActivity(intent)
    }

    private fun setupSearchListener() {
        binding.searchEditText.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                filterVacancies(s.toString())
            }
            override fun afterTextChanged(s: Editable?) {}
        })
    }

    private fun filterVacancies(query: String) {
        val filteredList = vacancies.filter {
            it.title.contains(query, ignoreCase = true) || it.company.contains(query, ignoreCase = true)
        }
        vacancyAdapter.updateVacancies(filteredList)
    }
}
