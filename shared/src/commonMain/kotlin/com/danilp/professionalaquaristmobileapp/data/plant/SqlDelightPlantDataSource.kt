package com.danilp.professionalaquaristmobileapp.data.plant

import app.cash.sqldelight.coroutines.asFlow
import app.cash.sqldelight.coroutines.mapToList
import com.danilp.professionalaquaristmobileapp.database.AquariumDatabase
import com.danilp.professionalaquaristmobileapp.domain.plant.Plant
import com.danilp.professionalaquaristmobileapp.domain.plant.PlantDataSource
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class SqlDelightPlantDataSource(db: AquariumDatabase) : PlantDataSource {

    private val queries = db.plantQueries

    override suspend fun insertPlant(plant: Plant) {
        queries.insertPlant(
            id = plant.id,
            aquariumId = plant.aquariumId,
            imageUrl = plant.imageUrl,
            name = plant.name,
            genus = plant.genus,
            description = plant.description,
            tags = plant.tags?.joinToString(" "),
            minTemperature = plant.minTemperature,
            maxTemperature = plant.maxTemperature,
            minPh = plant.minPh,
            maxPh = plant.maxPh,
            minGh = plant.minGh,
            maxGh = plant.maxGh,
            minKh = plant.minKh,
            maxKh = plant.maxKh,
            minCO2 = plant.minCO2,
            minIllumination = plant.minIllumination,
            status = plant.status,
            statusTags = plant.statusTags?.joinToString(" ")
        )
    }

    override suspend fun getPlantById(id: Long): Plant? =
        queries
            .getPlantById(id)
            .executeAsOneOrNull()
            ?.toPlant()

    override suspend fun getAllPlantsByAquarium(aquariumId: Long): Flow<List<Plant>> =
        queries
            .getAllPlantsByAquarium(aquariumId)
            .asFlow()
            .mapToList(Dispatchers.Default)
            .map {
                it.map { plantEntity ->
                    plantEntity.toPlant()
                }
            }


    override suspend fun deletePlantById(id: Long) {
        queries.deletePlantById(id)
    }

}