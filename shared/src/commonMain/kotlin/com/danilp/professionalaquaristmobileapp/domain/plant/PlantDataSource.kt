package com.danilp.professionalaquaristmobileapp.domain.plant

import kotlinx.coroutines.flow.Flow

interface PlantDataSource {
    suspend fun insertPlant(plant: Plant)
    suspend fun getPlantById(id: Long): Plant?
    suspend fun getAllPlantsByAquarium(aquariumId: Long): Flow<List<Plant>>
    suspend fun deletePlantById(id: Long)
}