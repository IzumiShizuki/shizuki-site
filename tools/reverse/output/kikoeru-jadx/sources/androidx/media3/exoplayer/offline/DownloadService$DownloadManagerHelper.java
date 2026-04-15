package androidx.media3.exoplayer.offline;

import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PersistableBundle;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import p4.c0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
final class DownloadService$DownloadManagerHelper implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f863c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i5.g f864d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Class f865e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public r f866f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public i5.c f867g;

    public DownloadService$DownloadManagerHelper(Context context, m mVar, boolean z10, i5.b bVar, Class cls) {
        this.f861a = context;
        this.f862b = mVar;
        this.f863c = z10;
        this.f864d = bVar;
        this.f865e = cls;
        mVar.b(this);
        j();
    }

    @Override // androidx.media3.exoplayer.offline.k
    public final void a(m mVar, boolean z10) {
        if (z10 || mVar.f938h) {
            return;
        }
        r rVar = this.f866f;
        if (rVar == null || rVar.f966h) {
            List list = mVar.f941k;
            for (int i10 = 0; i10 < list.size(); i10++) {
                if (((d) list.get(i10)).f893b == 0) {
                    i();
                    return;
                }
            }
        }
    }

    @Override // androidx.media3.exoplayer.offline.k
    public final void b(m mVar, i5.c cVar, int i10) {
        j();
    }

    @Override // androidx.media3.exoplayer.offline.k
    public final void c(m mVar, d dVar) {
        q qVar;
        r rVar = this.f866f;
        if (rVar == null || (qVar = rVar.f959a) == null || !qVar.f956c) {
            return;
        }
        qVar.a();
    }

    @Override // androidx.media3.exoplayer.offline.k
    public final void d(m mVar) {
        r rVar = this.f866f;
        if (rVar != null) {
            HashMap map = r.f958i;
            rVar.b();
        }
    }

    @Override // androidx.media3.exoplayer.offline.k
    public final void e(m mVar, d dVar, Exception exc) {
        q qVar;
        r rVar = this.f866f;
        if (rVar != null && (qVar = rVar.f959a) != null) {
            int i10 = dVar.f893b;
            if (i10 == 2 || i10 == 5 || i10 == 7) {
                qVar.f955b = true;
                qVar.a();
            } else if (qVar.f956c) {
                qVar.a();
            }
        }
        r rVar2 = this.f866f;
        if (rVar2 == null || rVar2.f966h) {
            int i11 = dVar.f893b;
            HashMap map = r.f958i;
            if (i11 == 2 || i11 == 5 || i11 == 7) {
                p4.c.B("DownloadService", "DownloadService wasn't running. Restarting.");
                i();
            }
        }
    }

    @Override // androidx.media3.exoplayer.offline.k
    public final void g(m mVar) {
        r rVar = this.f866f;
        if (rVar != null) {
            r.a(rVar, mVar.f941k);
        }
    }

    public final void h() {
        i5.c cVar = new i5.c(0);
        i5.c cVar2 = this.f867g;
        int i10 = c0.f16548a;
        if (Objects.equals(cVar2, cVar)) {
            return;
        }
        i5.b bVar = (i5.b) this.f864d;
        bVar.f9010c.cancel(bVar.f9008a);
        this.f867g = cVar;
    }

    public final void i() {
        boolean z10 = this.f863c;
        Class cls = this.f865e;
        Context context = this.f861a;
        if (!z10) {
            try {
                HashMap map = r.f958i;
                context.startService(new Intent(context, (Class<?>) cls).setAction("androidx.media3.exoplayer.downloadService.action.INIT"));
                return;
            } catch (IllegalStateException unused) {
                p4.c.B("DownloadService", "Failed to restart (process is idle)");
                return;
            }
        }
        try {
            HashMap map2 = r.f958i;
            Intent action = new Intent(context, (Class<?>) cls).setAction("androidx.media3.exoplayer.downloadService.action.RESTART");
            if (c0.f16548a >= 26) {
                context.startForegroundService(action);
            } else {
                context.startService(action);
            }
        } catch (IllegalStateException unused2) {
            p4.c.B("DownloadService", "Failed to restart (foreground launch restriction)");
        }
    }

    public final boolean j() {
        m mVar = this.f862b;
        boolean z10 = mVar.f940j;
        i5.g gVar = this.f864d;
        if (gVar == null) {
            return !z10;
        }
        if (!z10) {
            h();
            return true;
        }
        i5.c cVar = (i5.c) mVar.f942l.f9021e;
        i5.b bVar = (i5.b) gVar;
        int i10 = i5.b.f9007d;
        int i11 = cVar.f9011a;
        int i12 = cVar.f9011a;
        int i13 = i11 & i10;
        if (!(i13 == i11 ? cVar : new i5.c(i13)).equals(cVar)) {
            h();
            return false;
        }
        i5.c cVar2 = this.f867g;
        int i14 = c0.f16548a;
        if (Objects.equals(cVar2, cVar)) {
            return true;
        }
        String packageName = this.f861a.getPackageName();
        int i15 = bVar.f9008a;
        ComponentName componentName = bVar.f9009b;
        int i16 = i10 & i12;
        i5.c cVar3 = i16 == i12 ? cVar : new i5.c(i16);
        if (!cVar3.equals(cVar)) {
            p4.c.B("PlatformScheduler", "Ignoring unsupported requirements: " + (cVar3.f9011a ^ i12));
        }
        JobInfo.Builder builder = new JobInfo.Builder(i15, componentName);
        if ((i12 & 2) != 0) {
            builder.setRequiredNetworkType(2);
        } else if ((i12 & 1) != 0) {
            builder.setRequiredNetworkType(1);
        }
        builder.setRequiresDeviceIdle((i12 & 4) != 0);
        builder.setRequiresCharging((i12 & 8) != 0);
        if (c0.f16548a >= 26 && (i12 & 16) != 0) {
            builder.setRequiresStorageNotLow(true);
        }
        builder.setPersisted(true);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("service_action", "androidx.media3.exoplayer.downloadService.action.RESTART");
        persistableBundle.putString("service_package", packageName);
        persistableBundle.putInt("requirements", i12);
        builder.setExtras(persistableBundle);
        if (bVar.f9010c.schedule(builder.build()) == 1) {
            this.f867g = cVar;
            return true;
        }
        p4.c.B("DownloadService", "Failed to schedule restart");
        h();
        return false;
    }

    @Override // androidx.media3.exoplayer.offline.k
    public final /* synthetic */ void f(m mVar, boolean z10) {
    }
}
