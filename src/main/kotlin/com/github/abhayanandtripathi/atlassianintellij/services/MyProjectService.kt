package com.github.abhayanandtripathi.atlassianintellij.services

import com.intellij.openapi.project.Project
import com.github.abhayanandtripathi.atlassianintellij.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
