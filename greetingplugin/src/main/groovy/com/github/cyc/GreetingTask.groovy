package com.github.cyc

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

/**
 * Created by cyc on 2017/9/9.
 */
class GreetingTask extends DefaultTask {
    String greeting = 'hello from GreetingTask'

    @TaskAction
    def greet() {
        println greeting
    }
}
