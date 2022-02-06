package com.skillw.pouvoir.api.manager.sub.script

import com.skillw.pouvoir.api.manager.Manager
import com.skillw.pouvoir.api.map.LowerKeyMap
import com.skillw.pouvoir.api.script.annotation.ScriptAnnotation

abstract class ScriptAnnotationManager : Manager, LowerKeyMap<ScriptAnnotation>() {
    
}