package com.arch.allyson.architecturalproposal.core.exception

sealed class Failure {

    object NetworkConnectionError: Failure()

    abstract class FeatureError: Failure()
}