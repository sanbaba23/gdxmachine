package com.disgraded.gdxmachine.core

import com.disgraded.gdxmachine.core.Context

interface EntryPoint {
    fun initialize(context: Context)
    fun destroy()
}