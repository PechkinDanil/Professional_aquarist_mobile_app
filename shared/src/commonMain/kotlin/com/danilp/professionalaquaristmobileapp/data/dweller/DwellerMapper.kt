package com.danilp.professionalaquaristmobileapp.data.dweller

import com.danilp.professionalaquaristmobileapp.domain.dweller.Dweller
import database.DwellerEntity

fun DwellerEntity.toDweller(): Dweller =
    Dweller(
        id = id,
        aquariumId = aquariumId,
        imageUrl = imageUrl,
        name = name,
        genus = genus,
        amount = amount,
        description = description,
        tags = tags?.split(" "),
        liters = liters,
        minTemperature = minTemperature,
        maxTemperature = maxTemperature,
        minPh = minPh,
        maxPh = maxPh,
        minGh = minGh,
        maxGh = maxGh,
        minKh = minKh,
        maxKh = maxKh,
        status = status,
        statusTags = statusTags?.split(" ")
    )