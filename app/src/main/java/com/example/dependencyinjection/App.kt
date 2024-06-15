package com.example.dependencyinjection

import android.app.Application

class App:Application() {
    //Parent class of App to Hold Dependency

    var car = Car(Engine(),Wheel())
}