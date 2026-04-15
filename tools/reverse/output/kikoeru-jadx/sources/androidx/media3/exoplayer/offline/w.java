package androidx.media3.exoplayer.offline;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import m4.d0;
import m4.i0;
import p4.c0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class w implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s4.m f972b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t4.f f973c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t4.m f974d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public l f975e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile v f976f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f977g;

    public w(i0 i0Var, t4.e eVar, Executor executor) {
        executor.getClass();
        this.f971a = executor;
        d0 d0Var = i0Var.f14286b;
        d0Var.getClass();
        Map map = Collections.EMPTY_MAP;
        Uri uri = d0Var.f14178a;
        String str = d0Var.f14183f;
        p4.c.k(uri, "The uri must be set.");
        s4.m mVar = new s4.m(uri, 0L, 1, null, map, 0L, -1L, str, 4);
        this.f972b = mVar;
        t4.f fVarA = eVar.a();
        this.f973c = fVarA;
        this.f974d = new t4.m(fVarA, mVar, null, new g(1, this));
    }

    @Override // androidx.media3.exoplayer.offline.s
    public final void a(l lVar) {
        this.f975e = lVar;
        try {
            if (!this.f977g) {
                this.f976f = new v(this);
                this.f971a.execute(this.f976f);
                try {
                    this.f976f.get();
                } catch (ExecutionException e10) {
                    Throwable cause = e10.getCause();
                    cause.getClass();
                    if (cause instanceof IOException) {
                        throw ((IOException) cause);
                    }
                    int i10 = c0.f16548a;
                    throw cause;
                }
            }
        } finally {
            v vVar = this.f976f;
            vVar.getClass();
            vVar.b();
        }
    }

    @Override // androidx.media3.exoplayer.offline.s
    public final void cancel() {
        this.f977g = true;
        v vVar = this.f976f;
        if (vVar != null) {
            vVar.cancel(true);
        }
    }

    @Override // androidx.media3.exoplayer.offline.s
    public final void remove() {
        t4.f fVar = this.f973c;
        ((t4.y) fVar.f20424a).m(fVar.f20428e.a(this.f972b));
    }
}
