package com.musicplayer.musicapps.mp3player.audioplayer.ui.fragments.player;

import android.support.annotation.DrawableRes;
import android.support.annotation.StringRes;

import com.musicplayer.musicapps.mp3player.audioplayer.R;

public enum NowPlayingScreen {
    CARD(R.string.card, R.drawable.np_card, 0),
    FLAT(R.string.flat, R.drawable.np_flat, 1);

    @StringRes
    public final int titleRes;
    @DrawableRes
    public final int drawableResId;
    public final int id;

    NowPlayingScreen(@StringRes int titleRes, @DrawableRes int drawableResId, int id) {
        this.titleRes = titleRes;
        this.drawableResId = drawableResId;
        this.id = id;
    }
}
