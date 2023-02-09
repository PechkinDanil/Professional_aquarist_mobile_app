package com.danilp.professionalaquaristmobileapp.data.aquarium

import com.danilp.professionalaquaristmobileapp.domain.aquarium.Aquarium
import database.AquariumEntitiy

fun AquariumEntitiy.toAquarium(): Aquarium =
    Aquarium(
        id = id,
        imageUrl = imageUrl,
        name = name,
        description = description,
        currentTags = currentTags?.split(" "),
        requiredTags = requiredTags?.split(" "),
        liters = liters,
        minIllumination = minIllumination,
        currentIllumination = currentIllumination,
        currentCO2 = currentCO2,
        minCO2 = minCO2,
        currentTemperature = currentTemperature,
        minTemperature = minTemperature,
        maxTemperature = maxTemperature,
        currentPh = currentPh,
        minPh = minPh,
        maxPh = maxPh,
        currentGh = currentGh,
        minGh = minGh,
        maxGh = maxGh,
        currentKh = currentKh,
        minKh = minKh,
        maxKh = maxKh,
        currentK = currentK,
        minK = minK,
        maxK = maxK,
        currentNO3 = currentNO3,
        minNO3 = minNO3,
        maxNO3 = maxNO3,
        currentFe = currentFe,
        minFe = minFe,
        maxFe = maxFe,
        currentCa = currentCa,
        minCa = minCa,
        maxCa = maxCa,
        currentMg = currentMg,
        minMg = minMg,
        maxMg = maxMg,
        currentPO4 = currentPO4,
        minPO4 = minPO4,
        maxPO4 = maxPO4,
        currentAmmonia = currentAmmonia,
        minAmmonia = minAmmonia,
        maxAmmonia = maxAmmonia
    )