package com.chenenyu.router;

import android.net.Uri;

/**
 * <p>
 * Created by chenenyu on 2016/12/20.
 */
public interface RouteCallback {
    /**
     * Callback
     *
     * @param status  {@link RouteStatus}
     * @param uri     uri
     * @param message notice msg
     */
    void callback(RouteStatus status, Uri uri, String message);
}
