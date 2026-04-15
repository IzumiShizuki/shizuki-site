package i5;

import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import com.cnl.kikoeru.MusicDownloadService;
import p4.c0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b implements g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f9007d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ComponentName f9009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final JobScheduler f9010c;

    static {
        f9007d = (c0.f16548a >= 26 ? 16 : 0) | 15;
    }

    public b(MusicDownloadService musicDownloadService) {
        Context applicationContext = musicDownloadService.getApplicationContext();
        this.f9008a = 1;
        this.f9009b = new ComponentName(applicationContext, (Class<?>) a.class);
        JobScheduler jobScheduler = (JobScheduler) applicationContext.getSystemService("jobscheduler");
        jobScheduler.getClass();
        this.f9010c = jobScheduler;
    }
}
