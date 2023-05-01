package com.example.lab2_3

abstract class Song (val title: String,
                       val singer: String,
                       val imageUrl: String,
                       ){
    val v1 = "qwe"
    val v2: String

    init {
        title
        imageUrl
        singer
        v2 = "rty"
    }
}

class Song1(title:String, singer: String, imageUrl: String)
    : Song(title, singer, imageUrl){
}
class Song2(title:String, singer: String, imageUrl: String)
    : Song(title, singer, imageUrl){
}
class Song3(title:String, singer: String, imageUrl: String)
    : Song(title, singer, imageUrl){
}

