package com.tencent.bugly.beta.tinker;

import android.app.Application;
import android.content.Intent;
import com.tencent.tinker.entry.ApplicationLike;
import com.tencent.tinker.entry.DefaultApplicationLike;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class TinkerApplicationLike extends DefaultApplicationLike {
    public static final String TAG = "Tinker.TinkerApplicationLike";
    private static ApplicationLike tinkerPatchApplicationLike;

    public TinkerApplicationLike(Application application, int i10, boolean z10, long j10, long j11, Intent intent) {
        super(application, i10, z10, j10, j11, intent);
        setTinkerPatchApplicationLike(this);
    }

    public static ApplicationLike getTinkerPatchApplicationLike() {
        return tinkerPatchApplicationLike;
    }

    private static void setTinkerPatchApplicationLike(ApplicationLike applicationLike) {
        tinkerPatchApplicationLike = applicationLike;
    }
}
