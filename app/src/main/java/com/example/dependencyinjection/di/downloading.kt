package com.example.dependencyinjection.di

import android.util.Log

class HttpClient {

}

class Executor {

}

class Request constructor( private  val httpClient: HttpClient,private val executor: Executor) {
    fun getRequest() {
        Log.d("main", "file downloading")
    }
}

class Downloader constructor( val  request: Request){
    fun getDownloader() {
    request.getRequest()
    }
}

object DownloadFactory{
    fun create():Downloader{
        val client = HttpClient()
        val executor = Executor()
        val request = Request(client,executor)
        val downloader = Downloader(request)
        return downloader
    }
}