package com.example.lab1

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import com.example.lab1.databinding.ActivityVacancyDetailBinding

class VacancyDetailActivity : ComponentActivity() {
    private lateinit var binding: ActivityVacancyDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityVacancyDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val vacancy = intent.getSerializableExtra("vacancy") as? Vacancy
        displayVacancyDetails(vacancy)
        binding.backButton.setOnClickListener { finish() }
    }

    private fun displayVacancyDetails(vacancy: Vacancy?) {
        if (vacancy != null) {
            binding.vacancyDetailTitle.text = vacancy.title
            binding.vacancyDetailCompany.text = vacancy.company
            binding.vacancyDetailSalary.text = vacancy.salary
            binding.vacancyDetailLocation.text = vacancy.location
            binding.vacancyDetailDescription.text = vacancy.description
            binding.vacancyDetailRequirements.text = vacancy.requirements
            binding.vacancyDetailApplication.text = vacancy.applicationInstructions
        } else {
            Toast.makeText(this, "Вакансия не найдена", Toast.LENGTH_SHORT).show()
            finish()
        }
    }
}
