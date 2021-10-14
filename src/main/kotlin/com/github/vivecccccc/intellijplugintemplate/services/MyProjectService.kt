package com.github.vivecccccc.intellijplugintemplate.services

import com.intellij.openapi.project.Project
import com.github.vivecccccc.intellijplugintemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
