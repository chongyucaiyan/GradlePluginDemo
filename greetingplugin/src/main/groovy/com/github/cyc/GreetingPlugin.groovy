package com.github.cyc

import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * Created by cyc on 2017/9/9.
 */
class GreetingPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        // 创建 greetingExtension 扩展对象
        project.extensions.create('greetingExtension', GreetingPluginExtension)
        // 创建 hello 任务
        project.task('hello', type: GreetingTask) {
            greeting = 'hello from GreetingPlugin'
            doLast {
                println "${project.greetingExtension.message} from ${project.greetingExtension.greeter}"
            }
        }
    }
}

class GreetingPluginExtension {
    String message
    String greeter
}
