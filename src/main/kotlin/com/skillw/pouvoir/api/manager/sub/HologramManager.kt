package com.skillw.pouvoir.api.manager.sub

import com.skillw.pouvoir.api.feature.hologram.IHologram
import com.skillw.pouvoir.api.manager.Manager
import org.bukkit.Location
import org.bukkit.entity.Player

/**
 * HologramManager
 *
 * @constructor Create empty Listener manager
 */
abstract class HologramManager : Manager {
    /**
     * Create hologram
     *
     * @param location
     * @param content
     * @return
     */
    abstract fun createHologram(location: Location, content: List<String>, players: Set<Player>): IHologram
}