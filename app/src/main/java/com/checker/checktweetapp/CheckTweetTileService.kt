package com.checker.checktweetapp

import android.content.Intent
import android.content.Intent.FLAG_ACTIVITY_NEW_TASK
import android.service.quicksettings.TileService

class CheckTweetTileService : TileService() {
    override fun onClick() {
        super.onClick()
        val intent = Intent(this, CheckTweetActivity::class.java)
        intent.flags = FLAG_ACTIVITY_NEW_TASK
        startActivityAndCollapse(intent)
    }
}