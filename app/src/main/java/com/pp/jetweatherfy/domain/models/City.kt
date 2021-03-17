/*
 * Copyright 2021 Paulo Pereira
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.pp.jetweatherfy.domain.models

import com.squareup.moshi.Json

data class City(
    @Json(name = "coord")
    val coordinates: Coordinates? = null,
    @Json(name = "country")
    val country: String? = null,
    @Json(name = "id")
    val id: Int? = null,
    @Json(name = "name")
    val name: String? = null,
    @Json(name = "population")
    val population: Int? = null,
    @Json(name = "sunrise")
    val sunrise: Int? = null,
    @Json(name = "sunset")
    val sunset: Int? = null,
    @Json(name = "timezone")
    val timezone: Int? = null
)