package com.example.wordsapp.Utils.FileIO

import android.content.Context
import android.util.Log
import java.io.File
import java.io.FileInputStream
import java.io.FileOutputStream

class FILEIO {

    public fun getPrivateKey(context: Context) : String{

        var path = context?.getFilesDir()

        val keyDirectory = File( path,"KEYS")

        val file = File(keyDirectory, "pk.dat")

        val inputAsString = FileInputStream(file).bufferedReader().use {
            Log.i("FileContent",it.readText())
            return it.readText()
        }
    }

    public fun WritePrivateKey (context: Context, privateKey: String): String{

        var path = context?.getFilesDir()

        val keyDirectory = File( path,"KEYS")
        keyDirectory.mkdirs()

        val file = File(keyDirectory, "pk.dat")

        FileOutputStream(file).use {
            it.write(privateKey.toByteArray())
        }
        return "ok"
    }


    fun fileIOTests(context: Context){
        var path = context?.getFilesDir()

        val letDirectory = File( path,"LET")
        letDirectory.mkdirs()

        val file = File(letDirectory, "Records.txt")

        Log.i("Directory", letDirectory.toString())

        FileOutputStream(file).use {
            it.write("record goes here".toByteArray())
        }

        val inputAsString = FileInputStream(file).bufferedReader().use {
            Log.i("FileContent",it.readText())
        }
    }
}