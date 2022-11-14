package activity_04_b

import java.util.Date

/*
Covered Topic(s) : Classes


Instructions :

1. Use class to represent the Book rather string.

A book has a title, authors, year published, edition, ISBN, publisher.

A book may have a list of chapters.

A book has a number of pages.



2. Add a class for magazines.

A magazine has an editor, a title, a month published, a year published



3. Add a class for newspaper.

A newspaper has a name, day published, month published, year published and headline.



4. Add a class Authors.

Authors have firstName, lastName, middleName, date of birth.



5. Add a class Comics.

A comic has a title, month published, year published, illustrators, publisher.

Create a class illustrator.

Illustrator have firstName, lastName, middleName, date of birth.



6. Add a class Article.

An article has a title, content, author.

A Newspaper, and magazine have articles.



7. Create a search function to search for the title of a magazine, newspaper, comics.



8. Create a function that will list the name of the magazine, newspaper, comics or book, author has written in.



9. Create a class for Audio / Video recording.

The class should show whether the recording has a video or audio or both.

It has a length, date recorded, title, publisher.



10. Create a Publisher class.

A publisher a name, address and date established.*/


val newsPaper= ArrayList<NewsPaper>()
val magazine= ArrayList<Magazine>()
val comics = ArrayList<Comics>()


fun main() {



}


data class Book(
    val title: String,
    val author: String,
    val yearPublish: Int,
    val edition: Int,
    val ISBN: Long,
    val publisher: String,
    val chapters : ArrayList<String>?,
    val numberOfPages : Int
    )


class Magazine(val editor: String, val title: String, val monthPublished: Date, val yearPublished: Date) {

    lateinit var articleTitle: String
    lateinit var articleContent: String
    lateinit var articleEditor: String

    constructor(editor: String, title: String, monthPublished: Date, yearPublished: Date,
                articleTitle: String, articleContent: String, articleEditor: String): this(editor, title, monthPublished, yearPublished) {
        this.articleTitle = articleTitle
        this.articleContent = articleContent
        this.articleEditor = articleEditor
    }

}


class NewsPaper(val name: String, val dayPublished: Date, val monthPublished: Date, val headLine: String) {

    lateinit var articleTitle: String
    lateinit var articleContent: String
    lateinit var articleEditor: String

    constructor(name: String, dayPublished: Date, monthPublished: Date, headLine: String,
                articleTitle: String, articleContent: String, articleEditor: String): this(name, dayPublished, monthPublished, headLine) {
        this.articleTitle = articleTitle
        this.articleContent = articleContent
        this.articleEditor = articleEditor
    }

}


data class Authors(val firstName: String, val lastName: String, val middleName: String, val dateOfBirth: Date)


data class Comics(val title: String, val monthPublished: String, val illustrators: String, val publisher: String)


data class Illustrator(val firstName: String, val lastName: String, val middleName: String, val dateOfBirth: Date)


data class Article(val title: String, val content: String, val author: String)


fun searchTitle(title: String): ArrayList<String> {

    val result = ArrayList<String>()

    for (item in newsPaper) {
        if (item.name.contains(title, true)) {
            result.add(item.name)
        }
    }

    for (item in magazine) {
        if (item.title.contains(title, true)) {
            result.add(item.title)
        }
    }

    for (item in comics) {
        if (item.title.contains(title, true)) {
            result.add(item.title)
        }
    }

    return result

}


fun searchAuthor(author: String): ArrayList<String> {

    val result = ArrayList<String>()

    for (item in magazine) {
        if (item.editor.contains(author, true)) {
            result.add(item.title)
        }
    }

    for (item in newsPaper) {
        if (item.articleEditor.contains(author, true)) {
            result.add(item.name)
        }
    }

    for (item in comics) {
        if (item.illustrators.contains(author, true)) {
            result.add(item.title)
        }
    }

    return result

}

data class AudioAndVideoRecording(val hasVideo: Boolean, val hasAudio: Boolean, val hasVideoAndAudio: Boolean,
                                  val length: Int, val dateRecorded: String, val title: String, val publisher: String)


data class Publisher(val name: String, val address: String, val dateEstablished : Date)
