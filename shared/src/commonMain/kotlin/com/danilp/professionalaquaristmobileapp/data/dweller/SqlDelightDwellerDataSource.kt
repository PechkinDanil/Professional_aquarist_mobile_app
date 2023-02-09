package com.danilp.professionalaquaristmobileapp.data.dweller

import app.cash.sqldelight.coroutines.asFlow
import app.cash.sqldelight.coroutines.mapToList
import com.danilp.professionalaquaristmobileapp.database.AquariumDatabase
import com.danilp.professionalaquaristmobileapp.domain.dweller.Dweller
import com.danilp.professionalaquaristmobileapp.domain.dweller.DwellerDataSource
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class SqlDelightDwellerDataSource(db: AquariumDatabase) : DwellerDataSource {

    private val queries = db.dwellerQueries

    override suspend fun insertDweller(dweller: Dweller) {
        queries.insertDweller(
            id = dweller.id,
            aquariumId = dweller.aquariumId,
            imageUrl = dweller.imageUrl,
            name = dweller.name,
            genus = dweller.genus,
            amount = dweller.amount,
            description = dweller.description,
            tags = dweller.tags?.joinToString(" "),
            liters = dweller.liters,
            minTemperature = dweller.minTemperature,
            maxTemperature = dweller.maxTemperature,
            minPh = dweller.minPh,
            maxPh = dweller.maxPh,
            minGh = dweller.minGh,
            maxGh = dweller.maxGh,
            minKh = dweller.minKh,
            maxKh = dweller.maxKh,
            status = dweller.status,
            statusTags = dweller.statusTags?.joinToString(" ")
        )
    }

    override suspend fun getDwellerById(id: Long): Dweller? =
        queries
            .getDwellerById(id)
            .executeAsOneOrNull()
            ?.toDweller()


    override suspend fun getAllDwellersByAquarium(aquariumId: Long): Flow<List<Dweller>> =
        queries
            .getAllDwellersByAquarium(aquariumId)
            .asFlow()
            .mapToList(Dispatchers.Default)
            .map {
                it.map { dwellerEntity ->
                    dwellerEntity.toDweller()
                }
            }

    override suspend fun deleteDwellerById(id: Long) {
        queries.deleteDwellerById(id)
    }
}