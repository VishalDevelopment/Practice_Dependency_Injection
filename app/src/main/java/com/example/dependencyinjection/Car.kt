package com.example.dependencyinjection

import android.util.Log

class Car(val engine: Engine ,val wheel: Wheel)
{
    fun getCar(){
        engine.getEngine()
        wheel.getWheel()
        Log.d("main","car is running...")
    }
}


class Engine
{
    fun getEngine(){
        Log.d("main","Engine is running...")
    }
}


class Wheel
{
    fun getWheel(){
        Log.d("main","Wheel is running...")
    }
}
