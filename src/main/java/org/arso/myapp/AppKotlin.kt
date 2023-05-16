package org.arso.myapp

class AppKotlin {

    fun hello(){
        println("hello from kotlin")
    }
}

fun main(vararg args:String){
    AppKotlin().hello()
    AppJava().hello()
}