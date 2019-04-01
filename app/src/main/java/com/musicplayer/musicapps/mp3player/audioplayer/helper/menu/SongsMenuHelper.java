package com.musicplayer.musicapps.mp3player.audioplayer.helper.menu;

import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;

import com.musicplayer.musicapps.mp3player.audioplayer.R;
import com.musicplayer.musicapps.mp3player.audioplayer.dialogs.AddToPlaylistDialog;
import com.musicplayer.musicapps.mp3player.audioplayer.dialogs.DeleteSongsDialog;
import com.musicplayer.musicapps.mp3player.audioplayer.helper.MusicPlayerRemote;
import com.musicplayer.musicapps.mp3player.audioplayer.model.Song;

import java.util.ArrayList;

/**
 * @author Karim Abou Zeid (kabouzeid)
 */
public class SongsMenuHelper {
    public static boolean handleMenuClick(@NonNull FragmentActivity activity, @NonNull ArrayList<Song> songs, int menuItemId) {
        switch (menuItemId) {
            case R.id.action_play_next:
                MusicPlayerRemote.playNext(songs);
                return true;
            case R.id.action_add_to_current_playing:
                MusicPlayerRemote.enqueue(songs);
                return true;
            case R.id.action_add_to_playlist:
                AddToPlaylistDialog.create(songs).show(activity.getSupportFragmentManager(), "ADD_PLAYLIST");
                return true;
            case R.id.action_delete_from_device:
                DeleteSongsDialog.create(songs).show(activity.getSupportFragmentManager(), "DELETE_SONGS");
                return true;
        }
        return false;
    }
}
