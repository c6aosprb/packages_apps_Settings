/*
 * Copyright (C) 2015 The CyanogenMod Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.android.settings.candy.qs;

import android.content.Context;

import com.android.internal.util.cm.QSConstants;
import com.android.internal.util.cm.QSUtils;
import com.android.settings.R;

/**
 * This class holds the icon, the name - or the string the user sees,
 * and the value which will be stored
 */
public class QSTileHolder {
    public static final String TILE_ADD_DELETE = "";

    public final String resourceName;
    public final String value;
    public final String name;

    public QSTileHolder(String resourceName, String value, String name) {
        this.resourceName = resourceName;
        this.value = value;
        this.name = name;
    }

    public static QSTileHolder from(Context context, String tileType) {
        String resourceName = null;
        int stringId = -1;

        if (!TILE_ADD_DELETE.equals(tileType) &&
                !QSUtils.getAvailableTiles(context).contains(tileType)) {
            return null;
        }

        switch (tileType) {
            case TILE_ADD_DELETE:
                break;
            case QSConstants.TILE_WIFI:
                resourceName = "ic_qs_wifi_full_4";
                stringId = R.string.qs_tile_wifi;
                break;
            case QSConstants.TILE_BLUETOOTH:
                resourceName = "ic_qs_bluetooth_on";
                stringId = R.string.qs_tile_bluetooth;
                break;
            case QSConstants.TILE_DND:
                resourceName = "ic_qs_dnd_on";
                stringId = R.string.qs_tile_dnd;
                break;
            case QSConstants.TILE_INVERSION:
                resourceName = "ic_invert_colors_disable";
                stringId = R.string.qs_tile_display_inversion;
                break;
            case QSConstants.TILE_CELLULAR:
                resourceName = "ic_qs_signal_full_4";
                stringId = R.string.qs_tile_cellular_data;
                break;
            case QSConstants.TILE_AIRPLANE:
                resourceName = "ic_signal_airplane_disable";
                stringId = R.string.qs_tile_airplane_mode;
                break;
            case QSConstants.TILE_ROTATION:
                resourceName = "ic_portrait_to_auto_rotate";
                stringId = R.string.qs_tile_display_rotation;
                break;
            case QSConstants.TILE_FLASHLIGHT:
                resourceName = "ic_signal_flashlight_disable";
                stringId = R.string.qs_tile_flashlight;
                break;
            case QSConstants.TILE_LOCATION:
                resourceName = "ic_qs_location_on";
                stringId = R.string.qs_tile_location;
                break;
            case QSConstants.TILE_CAST:
                resourceName = "ic_qs_cast_on";
                stringId = R.string.qs_tile_cast_screen;
                break;
            case QSConstants.TILE_HOTSPOT:
                resourceName = "ic_hotspot_disable";
                stringId = R.string.qs_tile_hotspot;
                break;
            case QSConstants.TILE_ADB_NETWORK:
                resourceName = "ic_qs_network_adb_on";
                stringId = R.string.qs_tile_adb_over_network;
                break;
            case QSConstants.TILE_NFC:
                resourceName = "ic_qs_nfc_on";
                stringId = R.string.qs_tile_nfc;
                break;
            case QSConstants.TILE_COMPASS:
                resourceName = "ic_qs_compass_on";
                stringId = R.string.qs_tile_compass;
                break;
            case QSConstants.TILE_SCREEN_TIMEOUT:
                resourceName = "ic_qs_screen_timeout_vector";
                stringId = R.string.qs_tile_screen_timeout;
                break;
            case QSConstants.TILE_SYNC:
                resourceName = "ic_qs_sync_on";
                stringId = R.string.qs_tile_sync;
                break;
            case QSConstants.TILE_BATTERY_SAVER:
                resourceName = "ic_qs_battery_saver_on";
                stringId = R.string.qs_battery_saver_tile;
                break;
            case QSConstants.TILE_BRIGHTNESS:
                resourceName = "ic_qs_brightness_auto_off";
                stringId = R.string.qs_brightness_tile;
                break;
            case QSConstants.TILE_EXPANDED_DESKTOP:
                resourceName = "ic_qs_expanded_desktop";
                stringId = R.string.qs_expanded_desktop_tile;
                break;
            case QSConstants.TILE_SCREEN_OFF:
                resourceName = "ic_qs_power";
                stringId = R.string.qs_screen_off_tile;
                break;
            case QSConstants.TILE_AMBIENT_DISPLAY:
                resourceName = "ic_qs_ambientdisplay_on";
                stringId = R.string.qs_tile_ambient_display;
                break;
            case QSConstants.TILE_SCREENSHOT:
                resourceName = "ic_qs_screenshot";
                stringId = R.string.qs_screenshot_tile;
                break;
            case QSConstants.TILE_KERNEL_ADIUTOR:
                resourceName = "ic_qs_kernel_adiutor";
                stringId = R.string.qs_tile_kernel_adiutor;
                break;
            case QSConstants.TILE_HEADS_UP:
                resourceName = "ic_qs_heads_up_on";
                stringId = R.string.qs_tile_heads_up;
                break;
            case QSConstants.TILE_CANDY:
		resourceName = "ic_qs_candy_on";
		stringId = R.string.qs_tile_candy;
		break;
            case QSConstants.TILE_THEMES:
                resourceName = "ic_qs_themes";
                stringId = R.string.qs_tile_themes;
                break;
            case QSConstants.TILE_PIE:
                resourceName = "ic_qs_pie_on";
                stringId = R.string.qs_tile_pie;
                break;
            default:
                return null;
        }

        String name = stringId != -1 ? context.getString(stringId) : null;
        return new QSTileHolder(resourceName, tileType, name);
    }
}
