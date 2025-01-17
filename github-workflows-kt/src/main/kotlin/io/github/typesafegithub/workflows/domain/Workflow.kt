package io.github.typesafegithub.workflows.domain

import io.github.typesafegithub.workflows.domain.triggers.Trigger
import io.github.typesafegithub.workflows.dsl.HasCustomArguments
import io.github.typesafegithub.workflows.dsl.JobBuilder
import kotlinx.serialization.Contextual
import java.nio.file.Path

public data class Workflow(
    val name: String,
    val on: List<Trigger>,
    val env: LinkedHashMap<String, String>,
    val sourceFile: Path?,
    val targetFileName: String?,
    val concurrency: Concurrency? = null,
    val permissions: Map<Permission, Mode>? = null,
    val yamlConsistencyJobCondition: String? = null,
    val yamlConsistencyJobEnv: LinkedHashMap<String, String> = linkedMapOf(),
    val yamlConsistencyJobAdditionalSteps: (JobBuilder<JobOutputs.EMPTY>.() -> Unit)? = null,
    val jobs: List<Job<*>>,
    override val _customArguments: Map<String, @Contextual Any?> = mapOf(),
) : HasCustomArguments

/**
 * @see <a href="https://docs.github.com/en/actions/using-workflows/workflow-syntax-for-github-actions#permissions">GitHub</a>
 */
@Suppress("MaxLineLength")
public enum class Permission(public val value: String) {
    Actions("actions"),
    Checks("checks"),
    Contents("contents"),
    Deployments("deployments"),
    Discussions("discussions"),
    IdToken("id-token"),
    Issues("issues"),
    Packages("packages"),
    Pages("pages"),
    PullRequests("pull-requests"),
    RepositoryProjects("repository-projects"),
    SecurityEvents("security-events"),
    Statuses("statuses"),
}

/**
 * @see <a href="https://docs.github.com/en/actions/using-workflows/workflow-syntax-for-github-actions#permissions">GitHub</a>
 */
@Suppress("MaxLineLength")
public enum class Mode(public val value: String) {
    Read("read"),
    Write("write"),
    None("none"),
}
