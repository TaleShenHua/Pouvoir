package com.skillw.pouvoir.internal.engine.groovy

import com.skillw.pouvoir.api.able.Registrable
import com.skillw.pouvoir.api.script.PouCompiledScript
import com.skillw.pouvoir.internal.manager.ScriptEngineManagerImpl.globalVariables
import java.io.File
import javax.script.CompiledScript
import javax.script.Invocable
import javax.script.SimpleScriptContext

class PouGroovyScript(file: File, val md5: String, val script: CompiledScript) :
    Registrable<String>, PouCompiledScript(file, PouGroovyScriptEngine) {

    override fun invoke(function: String, variables: Map<String, Any>, vararg arguments: Any?): Any? {
        val engine = script.engine
        globalVariables.forEach { (key, value) ->
            engine.put(key, value)
        }
        variables.forEach { (key, value) ->
            engine.put(key, value)
        }
        script.eval(engine.context)
        val result = (engine as Invocable).invokeFunction(function)
        engine.context = SimpleScriptContext()
        return result
    }
}