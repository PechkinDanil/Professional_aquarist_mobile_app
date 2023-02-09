package com.danilp.professionalaquaristmobileapp.data.local

import android.content.Context
import app.cash.sqldelight.db.SqlDriver
import app.cash.sqldelight.driver.android.AndroidSqliteDriver
import com.danilp.professionalaquaristmobileapp.database.AquariumDatabase

actual class DatabaseDriverFactory(private val context: Context) {
    actual fun createDriver(): SqlDriver =
        AndroidSqliteDriver(AquariumDatabase.Schema, context, "aquarium.db")
}