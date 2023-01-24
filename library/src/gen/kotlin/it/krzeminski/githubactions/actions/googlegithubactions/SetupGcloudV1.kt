// This file was generated using 'wrapper-generator' module. Don't change it by hand, your changes will
// be overwritten with the next wrapper code regeneration. Instead, consider introducing changes to the
// generator itself.
package it.krzeminski.githubactions.actions.googlegithubactions

import it.krzeminski.githubactions.actions.Action
import java.util.LinkedHashMap
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.collections.toList
import kotlin.collections.toTypedArray

/**
 * Action: Set up gcloud Cloud SDK environment
 *
 * Downloads, installs, and configures a Google Cloud SDK environment.
 * Adds the `gcloud` CLI command to the $PATH.
 *
 * [Action on GitHub](https://github.com/google-github-actions/setup-gcloud)
 */
public data class SetupGcloudV1(
    /**
     * Version of the gcloud SDK to install. If unspecified or set to "latest",
     * the latest available gcloud SDK version for the target platform will be
     * installed. Example: "290.0.1".
     */
    public val version: String? = null,
    /**
     * ID of the Google Cloud project. If provided, this will configure gcloud to
     * use this project ID by default for commands. Individual commands can still
     * override the project using the --project flag which takes precedence.
     */
    public val projectId: String? = null,
    /**
     * List of Cloud SDK components to install
     */
    public val installComponents: List<SetupGcloudV1.Component>? = null,
    /**
     * Type-unsafe map where you can put any inputs that are not yet supported by the wrapper
     */
    public val _customInputs: Map<String, String> = mapOf(),
    /**
     * Allows overriding action's version, for example to use a specific minor version, or a newer
     * version that the wrapper doesn't yet know about
     */
    public val _customVersion: String? = null,
) : Action("google-github-actions", "setup-gcloud", _customVersion ?: "v1") {
    @Suppress("SpreadOperator")
    public override fun toYamlArguments(): LinkedHashMap<String, String> = linkedMapOf(
        *listOfNotNull(
            version?.let { "version" to it },
            projectId?.let { "project_id" to it },
            installComponents?.let { "install_components" to it.joinToString(",") { it.stringValue }
                    },
            *_customInputs.toList().toTypedArray(),
        ).toTypedArray()
    )

    public sealed class Component(
        public val stringValue: String,
    ) {
        public object Alpha : SetupGcloudV1.Component("alpha")

        public object AnthosAuth : SetupGcloudV1.Component("anthos-auth")

        public object Appctl : SetupGcloudV1.Component("appctl")

        public object AppEngineGo : SetupGcloudV1.Component("app-engine-go")

        public object AppEngineJava : SetupGcloudV1.Component("app-engine-java")

        public object AppEnginePython : SetupGcloudV1.Component("app-engine-python")

        public object AppEnginePythonExtras : SetupGcloudV1.Component("app-engine-python-extras")

        public object Beta : SetupGcloudV1.Component("beta")

        public object Bigtable : SetupGcloudV1.Component("bigtable")

        public object Bq : SetupGcloudV1.Component("bq")

        public object BundledPython3Unix : SetupGcloudV1.Component("bundled-python3-unix")

        public object Cbt : SetupGcloudV1.Component("cbt")

        public object CloudBuildLocal : SetupGcloudV1.Component("cloud-build-local")

        public object CloudDatastoreEmulator : SetupGcloudV1.Component("cloud-datastore-emulator")

        public object CloudFirestoreEmulator : SetupGcloudV1.Component("cloud-firestore-emulator")

        public object CloudSpannerEmulator : SetupGcloudV1.Component("cloud-spanner-emulator")

        public object CloudSqlProxy : SetupGcloudV1.Component("cloud_sql_proxy")

        public object ConfigConnector : SetupGcloudV1.Component("config-connector")

        public object Core : SetupGcloudV1.Component("core")

        public object Datalab : SetupGcloudV1.Component("datalab")

        public object DockerCredentialGcr : SetupGcloudV1.Component("docker-credential-gcr")

        public object Gsutil : SetupGcloudV1.Component("gsutil")

        public object Kpt : SetupGcloudV1.Component("kpt")

        public object Kubectl : SetupGcloudV1.Component("kubectl")

        public object KubectlOidc : SetupGcloudV1.Component("kubectl-oidc")

        public object Kustomize : SetupGcloudV1.Component("kustomize")

        public object LocalExtract : SetupGcloudV1.Component("local-extract")

        public object Minikube : SetupGcloudV1.Component("minikube")

        public object Nomos : SetupGcloudV1.Component("nomos")

        public object Pkg : SetupGcloudV1.Component("pkg")

        public object PubsubEmulator : SetupGcloudV1.Component("pubsub-emulator")

        public object Skaffold : SetupGcloudV1.Component("skaffold")

        public class Custom(
            customStringValue: String,
        ) : SetupGcloudV1.Component(customStringValue)
    }
}
