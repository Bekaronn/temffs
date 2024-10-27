package com.example.lab1

fun getVacancies(): List<Vacancy> {
    return listOf(
        Vacancy(
            "Android Developer",
            "Google",
            "150,000 USD",
            "Mountain View",
            "Google is an internet search engine. It uses a proprietary algorithm that's designed " +
                    "to retrieve and order search results to provide the most relevant and dependable sources" +
                    " of data possible",
            "Опыт разработки на Android не менее 3 лет.\n" +
                    "Знание Kotlin и Java.\n" +
                    "Опыт работы с RESTful API и JSON.\n" +
                    "Понимание принципов архитектуры приложений (MVP, MVVM).\n" +
                    "Опыт работы с Git и системой контроля версий.",
            "Отправьте свое резюме и портфолио проектов на адрес careers@google.com с " +
                    "темой \"Android Developer Application\"."
        ),
        Vacancy(
            "Golang Developer",
            "Halyk Bank",
            "60,000 USD",
            "Almaty",
            "Halyk Bank is Kazakhstan's leading financial services group, operating across a variety of segments," +
                    " including retail, SME & corporate banking, insurance, leasing, brokerage and assets management.",
            "Опыт программирования на Go не менее 2 лет.\n" +
                    "Знание принципов ООП и структурного программирования.\n" +
                    "Опыт работы с SQL и NoSQL базами данных.\n" +
                    "Опыт работы с Docker и Kubernetes будет преимуществом.\n" +
                    "Умение работать в команде и готовность к обучению",
            "Пожалуйста, отправьте ваше резюме на адрес hr@halykbank.kz, указав в теме письма \"Golang Developer Application\"."
        ),
        Vacancy(
            "iOS Developer",
            "Apple",
            "140,000 USD",
            "Cupertino",
            "Apple Inc. designs, manufactures and markets smartphones, personal computers, tablets," +
                    " wearables and accessories, and sells a variety of related services. Its product categories " +
                    "include iPhone, Mac, iPad, and Wearables, Home and Accessories.",
            "Опыт разработки приложений для iOS не менее 3 лет.\n" +
                    "Знание Swift и Objective-C.\n" +
                    "Опыт работы с UIKit и SwiftUI.\n" +
                    "Опыт в разработке пользовательских интерфейсов и взаимодействия с REST API.\n" +
                    "Понимание принципов Agile разработки.",
            "Отправьте свое резюме и ссылку на ваш профиль GitHub или портфолио на адрес " +
                    "jobs@apple.com с темой \"iOS Developer Application\"."
        ),
        Vacancy(
            "Java Developer",
            "Jusan Bank",
            "80,000 USD",
            "Astana",
            "Jýsan Bank предлагает своим клиентам - физическим и юридическим лицам полный спектр " +
                    "банковских услуг, включая открытие и обслуживание текущих счетов, международных пластиковых" +
                    " карт, кредитование, мобильный банкинг, депозиты и денежные переводы по Казахстану и миру.",
            "Опыт работы с Java не менее 3 лет.\n" +
                    "Знание Spring Framework и Hibernate.\n" +
                    "Опыт работы с SQL и знание реляционных баз данных.\n" +
                    "Понимание принципов разработки многопоточных приложений.\n" +
                    "Умение работать в команде и навыки эффективного общения.",
            "Пожалуйста, отправьте ваше резюме и сопроводительное письмо на адрес " +
                    "careers@jusanbank.kz, указав в теме \"Java Developer Application\"."
        )
    )
}
