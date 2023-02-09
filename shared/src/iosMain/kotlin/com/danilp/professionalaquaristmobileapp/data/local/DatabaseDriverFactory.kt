package com.danilp.professionalaquaristmobileapp.data.local

import app.cash.sqldelight.db.SqlDriver
import app.cash.sqldelight.driver.native.NativeSqliteDriver
import com.danilp.professionalaquaristmobileapp.database.AquariumDatabase

actual class DatabaseDriverFactory {
    actual fun createDriver(): SqlDriver =
        NativeSqliteDriver(AquariumDatabase.Schema, "aquarium.db")
}