package com.theoplayer.demo.simpleott.datamodel

class SimpleOTTConfiguration {
    var config: Config? = null

    class Config {
        var live: Live? = null
        var onDemand: OnDemand? = null
        var offline: Offline? = null
    }

    class Live {
        var channels: Array<AssetItem>
    }

    class OnDemand {
        var vods: Array<AssetItem>
    }

    class Offline {
        var vods: Array<AssetItem>
    }
}