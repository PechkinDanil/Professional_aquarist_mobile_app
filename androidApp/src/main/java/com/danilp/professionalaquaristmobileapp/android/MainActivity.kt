package com.danilp.professionalaquaristmobileapp.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.danilp.professionalaquaristmobileapp.android.ui.theme.ProfessionalAquaristMobileAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProfessionalAquaristMobileAppTheme {

            }
        }
    }
}