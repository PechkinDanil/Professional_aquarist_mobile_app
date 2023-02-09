package com.danilp.professionalaquaristmobileapp.data.plant

import com.danilp.professionalaquaristmobileapp.domain.plant.Plant
import database.PlantEntity

fun PlantEntity.toPlant(): Plant =
    Plant(
        id = id,
        aquariumId = aquariumId,
        imageUrl = imageUrl,
        name = name,
        genus = genus,
        minTemperature = minTemperature,
        maxTemperature = maxTemperature,
        minPh = minPh,
        maxPh = maxPh,
        minGh = minGh,
        maxGh = maxGh,
        minKh = minKh,
        maxKh = maxKh,
        minCO2 = minCO2,
        minIllumination = minIllumination,
        description = description,
        tags = tags?.split(" "),
        status = status,
        statusTags = statusTags?.split(" ")
    )