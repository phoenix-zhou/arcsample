package com.z.arc.media.bean;

import android.net.Uri;

/**
 * <p>
 * <p>
 * Created by Blate on 2023/12/4
 */
public class MediaBean {

    public final long id;

    public Uri uri;

    public String data;

    public long bucketId;

    public String mimeType;

    public String title;

    public long dateTaken;

    public long dateModified;

    public MediaBean(long id) {
        this.id = id;
    }

}
