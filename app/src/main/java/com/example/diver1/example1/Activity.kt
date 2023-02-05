package com.example.diver1.example1

import javax.inject.Inject

class Activity {

    lateinit var computer: Computer

    init {
        Component().inject(this)
    }

}