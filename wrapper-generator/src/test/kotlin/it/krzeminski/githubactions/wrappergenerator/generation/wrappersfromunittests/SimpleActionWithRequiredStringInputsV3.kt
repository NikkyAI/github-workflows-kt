// This file was generated using 'wrapper-generator' module. Don't change it by hand, your changes will
// be overwritten with the next wrapper code regeneration. Instead, consider introducing changes to the
// generator itself.
package it.krzeminski.githubactions.actions.johnsmith

import it.krzeminski.githubactions.actions.Action
import kotlin.String
import kotlin.Suppress

/**
 * Action: Do something cool
 *
 * This is a test description that should be put in the KDoc comment for a class
 *
 * https://github.com/john-smith/simple-action-with-required-string-inputs
 */
public class SimpleActionWithRequiredStringInputsV3(
    /**
     * Short description
     */
    public val fooBar: String,
    /**
     * Just another input
     */
    public val bazGoo: String
) : Action("john-smith", "simple-action-with-required-string-inputs", "v3") {
    @Suppress("SpreadOperator")
    public override fun toYamlArguments() = linkedMapOf(
        *listOfNotNull(
            "foo-bar" to fooBar,
            "baz-goo" to bazGoo,
        ).toTypedArray()
    )
}