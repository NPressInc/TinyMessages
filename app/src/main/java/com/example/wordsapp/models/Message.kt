package com.example.wordsapp.models

data class Message(var user:String,
                   var message:String,
                   var time:Long,
                   var conversationId:String
                   )