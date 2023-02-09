package com.danilp.professionalaquaristmobileapp.domain.dweller.tags

enum class DwellerTags(val code: String) {
    HERBIVOROUS("Herbivorous"), // травоядные
    CARNIVOROUS("Carnivorous"), // мясоядные
    OMNIVOROUS("Omnivorous"), // всеядные

    PREDATOR("Predator"), // хищник
    PEACEFUL("Peaceful"), // миролюбивый
    TERRITORIAL("Territorial"), // территориальный

    FAST_CURRENT("Fast_current"), // любит быстрое течение

    MEDIUM_CURRENT("Medium_current"), // любит среднее течение
    SLOW_CURRENT("Slow_current"), // любит мягкое течение
    BRIGHT_LIGHT("Bright_light"), // любит яркий свет

    LOW_LIGHT("Low_light"), // любит слабый свет
    LARGE("Large"), // очень большой

    BIG("Big"), // большой
    MEDIUM("Medium"), // средний
    SMALL("Small"), // маленький
    MONOGAMOUS("Monogamous"), // моногамный (пара обязательна)

    POLYGAMOUS("Polygamous"), // полигамный
    LIVEBEARER("Livebearer"), // живородящие

    OVIPAROUS("Oviparous"), // яйцекладущие
    SHOAL("Shoal"), // стайный (стая обязательна)

    FISH("Fish"), // рыба

    SNAIL("Snail"), // улитка
    CRAB("Crab"), // краб
    SHRIMP("Shrimp"), // креветка
    CRAYFISH("Crayfish"), // рак
    BIVALVE("Bivalve"), // двухстворчатое
    PLANT_LOVER("Plant_lover"), // любит растения

    NEEDS_SHELTER("Needs_shelter"), // нуждается в укрытии
    NEEDS_DRIFTWOOD("Needs_driftwood"), // нуждается в древесине
    NEEDS_SMOOTH_SURFACES("Needs_smooth_surfaces"), // нуждается в гладких поверхностях

    BROADLEAF_PLANT("Broadleaf_plant_lover"), // любит широколистные растения
    LONG_STEMMED_PLANT("Long-stemmed_plant_lover"), // любит длинностебельные растения
    FLOATING_PLANT("Floating_plant_lover"), // любит плавающие растения
    MOSS("Moss_lover"), // мох

    CLEANER("Cleaner"), // чистильщик

    PLANT_EATER("Plant_eater") // угроза для растений
}