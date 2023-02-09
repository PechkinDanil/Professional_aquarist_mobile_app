package com.danilp.professionalaquaristmobileapp.domain.dweller

import kotlinx.coroutines.flow.Flow

interface DwellerDataSource {
    suspend fun insertDweller(dweller: Dweller)
    suspend fun getDwellerById(id: Long): Dweller?
    suspend fun getAllDwellersByAquarium(aquariumId: Long): Flow<List<Dweller>>
    suspend fun deleteDwellerById(id: Long)
}