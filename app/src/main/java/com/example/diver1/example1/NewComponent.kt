package com.example.diver1.example1

import dagger.Component

@Component
interface NewComponent {

    fun inject(activity: Activity)

}