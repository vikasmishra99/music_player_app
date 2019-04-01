package com.musicplayer.musicapps.mp3player.audioplayer.interfaces;

import android.support.annotation.NonNull;

import com.afollestad.materialcab.MaterialCab;

/**
 * @author Karim Abou Zeid (kabouzeid)
 */
public interface CabHolder {

    @NonNull
    MaterialCab openCab(final int menuRes, final MaterialCab.Callback callback);
}
