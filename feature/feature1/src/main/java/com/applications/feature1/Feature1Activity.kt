package com.applications.feature1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.applications.common.NavController
import com.applications.feature1.ui.theme.MultiModuleNavigationTheme
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class Feature1Activity : ComponentActivity() {

    @Inject
    lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MultiModuleNavigationTheme {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        modifier = Modifier.weight(0.8F),
                        text = "Feature 1 Module",
                        textAlign = TextAlign.Center,
                        fontSize = 28.sp
                    )

                    Button(onClick = {
                        navController.navigateToFeature2()
                    }) {
                        Text(text = "Navigate to Feature 2 Module")
                    }
                }
            }
        }
    }
}
