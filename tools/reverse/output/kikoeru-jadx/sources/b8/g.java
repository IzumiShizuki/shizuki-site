package b8;

import android.content.Context;
import androidx.lifecycle.n0;
import b7.m;
import jc.l;
import ub.p;
import ub.x;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g implements a8.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f2255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f2257c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p f2258d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f2259e;

    public g(Context context, String str, m mVar) {
        l.e(mVar, "callback");
        this.f2255a = context;
        this.f2256b = str;
        this.f2257c = mVar;
        this.f2258d = ub.a.d(new n0(1, this));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f2258d.f21551b != x.f21562a) {
            ((f) this.f2258d.getValue()).close();
        }
    }

    @Override // a8.b
    public final String getDatabaseName() {
        return this.f2256b;
    }

    @Override // a8.b
    public final a8.a getWritableDatabase() {
        return ((f) this.f2258d.getValue()).b(true);
    }

    @Override // a8.b
    public final void setWriteAheadLoggingEnabled(boolean z10) {
        if (this.f2258d.f21551b != x.f21562a) {
            ((f) this.f2258d.getValue()).setWriteAheadLoggingEnabled(z10);
        }
        this.f2259e = z10;
    }
}
