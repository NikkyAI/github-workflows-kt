#!/usr/bin/env kotlin
@file:Repository("https://s01.oss.sonatype.org/content/repositories/snapshots/")
@file:DependsOn("io.github.typesafegithub:action-binding-generator:1.3.2-20231027.055636-20")

import io.github.typesafegithub.workflows.actionbindinggenerator.NewestForVersion
import io.github.typesafegithub.workflows.actionbindinggenerator.extractUsedActionsFromWorkflow
import io.github.typesafegithub.workflows.actionbindinggenerator.generateBinding
import java.io.File
import kotlin.io.path.Path

val actions = extractUsedActionsFromWorkflow(
    manifest = File(".github/workflows/used-actions.yaml").readText(),
)

actions.forEach { action ->
    Path(".github").resolve("workflows").resolve("generated").resolve(action.owner).resolve("${action.name}.kt").let {
        it.parent.toFile().mkdirs()
        val binding = action.generateBinding(
            metadataRevision = NewestForVersion,
            generateForScript = true,
        )
        it.toFile().writeText(binding.kotlinCode)
    }
}