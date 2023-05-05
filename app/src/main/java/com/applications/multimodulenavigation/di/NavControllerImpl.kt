package com.applications.multimodulenavigation.di

import android.content.Context
import android.content.Intent
import android.content.Intent.FLAG_ACTIVITY_NEW_TASK
import com.applications.common.NavController
import com.applications.feature1.Feature1Activity
import com.applications.feature2.Feature2Activity
import com.applications.multimodulenavigation.MainActivity
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

class NavControllerImpl @Inject constructor(
    @ApplicationContext val context: Context
): NavController {

    override fun navigateToFeature1() {
        context.startActivity(
            Intent(
                context, Feature1Activity::class.java
            ).addFlags(FLAG_ACTIVITY_NEW_TASK)
        )
    }

    override fun navigateToFeature2() {
        context.startActivity(
            Intent(
                context, Feature2Activity::class.java
            ).addFlags(FLAG_ACTIVITY_NEW_TASK)
        )
    }

    override fun navigateToMainFeature() {
        context.startActivity(
            Intent(
                context, MainActivity::class.java
            ).addFlags(FLAG_ACTIVITY_NEW_TASK)
        )
    }
}