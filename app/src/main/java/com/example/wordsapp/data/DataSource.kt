/*
* Copyright (C) 2021 The Android Open Source Project.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*     http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
package com.example.wordsapp.data


import  com.example.wordsapp.R
import com.example.wordsapp.models.ConversationPeek
import com.example.wordsapp.models.Message

/**
 * An object to generate a static list of dogs
 */
object DataSource {

    val ConversationsPeeks: List<ConversationPeek> = listOf(
        ConversationPeek(
            R.drawable.ic_baseline_account_circle_24,
            "Tzeitel",
            "7",
            "sunbathing",
            "asdf1"
        ),
        ConversationPeek(
            R.drawable.ic_baseline_account_circle_24,
            "Leroy",
            "4",
            "sleeping in dangerous places",
            "asdf2"
        ),
        ConversationPeek(
            R.drawable.ic_baseline_account_circle_24,
            "Frankie",
            "2",
            "stealing socks",
            "asdf3"
        ),
        ConversationPeek(
            R.drawable.ic_baseline_account_circle_24,
            "Nox",
            "8",
            "meeting new animals",
            "asdf4"
        ),
        ConversationPeek(
            R.drawable.ic_baseline_account_circle_24,
            "Faye",
            "8",
            "Digging in the garden",
            "asdf5"
        ),
        ConversationPeek(
            R.drawable.ic_baseline_account_circle_24,
            "Bella",
            "14",
            "Chasing sea foam",
            "asdf6"
        ),ConversationPeek(
            R.drawable.ic_baseline_account_circle_24,
            "Nox",
            "8",
            "meeting new animals",
            "asdf7"
        ),
        ConversationPeek(
            R.drawable.ic_baseline_account_circle_24,
            "Faye",
            "8",
            "Digging in the garden",
            "asdf8"
        ),ConversationPeek(
            R.drawable.ic_baseline_account_circle_24,
            "Nox",
            "8",
            "meeting new animals",
            "asdf9"
        ),
        ConversationPeek(
            R.drawable.ic_baseline_account_circle_24,
            "Faye",
            "8",
            "Digging in the garden",
            "asdf10"
        ),ConversationPeek(
            R.drawable.ic_baseline_account_circle_24,
            "Nox",
            "8",
            "meeting new animals",
            "asdf11"
        ),
        ConversationPeek(
            R.drawable.ic_baseline_account_circle_24,
            "Faye",
            "8",
            "Digging in the garden",
            "asdf12"
        ),ConversationPeek(
            R.drawable.ic_baseline_account_circle_24,
            "Nox",
            "8",
            "meeting new animals",
            "asdf13"
        ),
        ConversationPeek(
            R.drawable.ic_baseline_account_circle_24,
            "Faye",
            "8",
            "Digging in the garden",
            "asdf14"
        ),ConversationPeek(
            R.drawable.ic_baseline_account_circle_24,
            "Nox",
            "8",
            "meeting new animals",
            "asdf15"
        ),
        ConversationPeek(
            R.drawable.ic_baseline_account_circle_24,
            "Faye",
            "8",
            "Digging in the garden",
            "asdf16"
        ),ConversationPeek(
            R.drawable.ic_baseline_account_circle_24,
            "Nox",
            "8",
            "meeting new animals",
            "asdf17"
        ),
        ConversationPeek(
            R.drawable.ic_baseline_account_circle_24,
            "Faye",
            "8",
            "Digging in the garden",
            "asdf18"
        ),ConversationPeek(
            R.drawable.ic_baseline_account_circle_24,
            "Nox",
            "8",
            "meeting new animals",
            "asdf19"
        ),
        ConversationPeek(
            R.drawable.ic_baseline_account_circle_24,
            "Faye",
            "8",
            "Digging in the garden",
            "asdf20"
        )
    )

    val MessagesDemo: MutableList<Message> = mutableListOf(
        Message(
            "me",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse semper auctor diam, vel posuere nisi pretium at. Donec varius diam massa, sit amet pellentesque nisi tempor quis. Pellentesque consectetur odio ex, ac efficitur enim gravida id. Praesent placerat mollis risus, in porttitor risus condimentum sit amet. Etiam scelerisque, erat vel sollicitudin malesuada, erat ante pulvinar purus, quis placerat quam quam eleifend magna. Quisque sed tempor leo, vel scelerisque ligula. Integer sed euismod libero. Aenean erat justo, blandit at bibendum ac, gravida vitae lectus.",
            1644960919735,
            "1234"

        ),
        Message(
            "dave",
            "Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Phasellus placerat laoreet diam, eget interdum magna interdum at. Praesent vel pulvinar velit. Mauris et posuere nisl. Nulla facilisi. Praesent eu dolor quis quam laoreet ornare quis quis odio. Nullam semper condimentum leo, ut consequat erat pharetra et. Curabitur ut lacus ac erat dapibus interdum id eu ipsum. Cras pharetra urna orci, sed feugiat eros hendrerit non.",
            1644961919735,
            "1234"

        ),
        Message(
            "me",
            "hello3",
            1644962919735,
            "1234"

        ),
        Message(
            "dave",
            "hello4",
            1644963919735,
            "1234"

        ),
        Message(
            "me",
            ":)",
            1644964919735,
            "1234"

        ),
        Message(
            "dave",
            "hello6",
            1644965919735,
            "1234"

        ),
        Message(
            "me",
            "hello7",
            1644966919735,
            "1234"

        ),

    )
}
