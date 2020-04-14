package com.disgraded.gdxmachine.framework.scenes

import com.disgraded.gdxmachine.framework.core.Core
import com.disgraded.gdxmachine.framework.core.graphics.Layer
import com.disgraded.gdxmachine.framework.renderers.Renderer2D
import kotlin.reflect.KClass

abstract class Scene {

    protected val core = Core
    private val sceneManager = SceneManager.getInstance()

    protected lateinit var mainLayer: Layer

    fun prepare() {
        mainLayer = core.graphics.createLayer()
        mainLayer.setRenderer(Renderer2D())
    }

    abstract fun initialize()

    abstract fun update(deltaTime: Float)

    abstract fun destroy()

    protected fun setScene(sceneClass: KClass<Scene>) = sceneManager.set(sceneClass)

}