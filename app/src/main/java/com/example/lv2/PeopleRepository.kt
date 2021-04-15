package com.example.lv2
import com.example.lv2.InspiringPerson
object PeopleRepository {
     var persons: MutableList<InspiringPerson>

    init{
             persons = retrievePersons()
            }

    private fun retrievePersons(): MutableList<InspiringPerson> {
        return mutableListOf(
            InspiringPerson("Steve Jobs", "1955",  "" +
                    "https://s.france24.com/media/display/87e627b4-0aac-11e9-b1a5-005056a964fe/w:1280/p:1x1/steve-jobs_0.JPG",
                "the co-founder and chief executive of Apple Computer, topped the Computer Weekly 40th anniversary poll due" +
                        " to the devoted following he has generated through his pioneering work in personal computing and product design."),
            InspiringPerson("Tim Berners-Lee", "1955",  "https://upload.wikimedia.org/wikipedia/commons/4/4e/Sir_Tim_Berners-Lee_%28cropped%29.jpg",
                "made the imaginative leap to combine the internet with the hypertext concept, and the worldwide web was born."),
            InspiringPerson("Bill Gates", "1955 ", "http://www.gstatic.com/tv/thumb/persons/614/614_v9_bc.jpg",
                "As joint founder of the world’s biggest software company, Microsoft, Bill Gates’ approach to technology and " +
                        "business was instrumental in making technology available to the masses."),
            InspiringPerson("James Gosling", "1955",  "https://venturebeat.com/wp-content/uploads/2011/08/james-gosling.jpg?fit=400%2C273&strip=all",
                "Gosling completed a PhD in computer science and contributed to software innovation at a technical level."),
            InspiringPerson("Linus Torvalds", "1969",  "https://upload.wikimedia.org/wikipedia/commons/0/01/LinuxCon_Europe_Linus_Torvalds_03_%28cropped%29.jpg",
                "As the creator of the Linux operating system, Linus Torvalds has been a driving force behind the whole open source movement, which represents not only an ever increasing " +
                        "challenge to proprietary software, but is also the inspiration for the industry to move to open standards.")
        )
    }
    fun getNotes(): List<InspiringPerson> = persons
    fun getNote(name: String): InspiringPerson = persons.first { it.name == name }
    fun insert(note: InspiringPerson) = persons.add(note)
    fun delete(note: InspiringPerson) = persons.remove(note)
}