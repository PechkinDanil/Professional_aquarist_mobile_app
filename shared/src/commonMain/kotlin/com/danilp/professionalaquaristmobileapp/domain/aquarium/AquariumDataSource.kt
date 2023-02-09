package com.danilp.professionalaquaristmobileapp.domain.aquarium

import kotlinx.coroutines.flow.Flow

interface AquariumDataSource {
    suspend fun insertAquarium(aquarium: Aquarium)
    suspend fun getAquariumById(id: Long): Aquarium?
    suspend fun getAllAquariums(): Flow<List<Aquarium>>
    suspend fun deleteAquariumById(id: Long)
    suspend fun refreshAquariumById(id: Long)
}