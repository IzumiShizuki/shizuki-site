package c4;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import n7.b0;
import q.t0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class t implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f3399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s3.d f3400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final pe.d f3401c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f3402d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Handler f3403e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ThreadPoolExecutor f3404f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ThreadPoolExecutor f3405g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public android.support.v4.media.session.b f3406h;

    public t(Context context, s3.d dVar) {
        b0.g(context, "Context cannot be null");
        this.f3399a = context.getApplicationContext();
        this.f3400b = dVar;
        this.f3401c = u.f3407d;
    }

    @Override // c4.j
    public final void a(android.support.v4.media.session.b bVar) {
        synchronized (this.f3402d) {
            this.f3406h = bVar;
        }
        c();
    }

    public final void b() {
        synchronized (this.f3402d) {
            try {
                this.f3406h = null;
                Handler handler = this.f3403e;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f3403e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f3405g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f3404f = null;
                this.f3405g = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c() {
        synchronized (this.f3402d) {
            try {
                if (this.f3406h == null) {
                    return;
                }
                if (this.f3404f == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new a(0, "emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f3405g = threadPoolExecutor;
                    this.f3404f = threadPoolExecutor;
                }
                this.f3404f.execute(new a9.m(9, this));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final s3.f d() {
        try {
            pe.d dVar = this.f3401c;
            Context context = this.f3399a;
            s3.d dVar2 = this.f3400b;
            dVar.getClass();
            Object[] objArr = {dVar2};
            ArrayList arrayList = new ArrayList(1);
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            s3.e eVarA = s3.c.a(context, Collections.unmodifiableList(arrayList));
            int i10 = eVarA.f19373a;
            if (i10 != 0) {
                throw new RuntimeException(t0.C(i10, "fetchFonts failed (", ")"));
            }
            s3.f[] fVarArr = (s3.f[]) eVarA.f19374b.get(0);
            if (fVarArr == null || fVarArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return fVarArr[0];
        } catch (PackageManager.NameNotFoundException e10) {
            throw new RuntimeException("provider not found", e10);
        }
    }
}
