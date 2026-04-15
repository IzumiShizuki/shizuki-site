package j8;

import java.io.Closeable;
import lh.b0;
import lh.y;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class m extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f10629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lh.l f10630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f10631c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Closeable f10632d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f10633e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b0 f10634f;

    public m(y yVar, lh.l lVar, String str, Closeable closeable) {
        this.f10629a = yVar;
        this.f10630b = lVar;
        this.f10631c = str;
        this.f10632d = closeable;
    }

    @Override // j8.n
    public final lc.b b() {
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            this.f10633e = true;
            b0 b0Var = this.f10634f;
            if (b0Var != null) {
                x8.d.a(b0Var);
            }
            Closeable closeable = this.f10632d;
            if (closeable != null) {
                x8.d.a(closeable);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // j8.n
    public final synchronized lh.h g() {
        if (this.f10633e) {
            throw new IllegalStateException("closed");
        }
        b0 b0Var = this.f10634f;
        if (b0Var != null) {
            return b0Var;
        }
        b0 b0VarL = g8.a.l(this.f10630b.L(this.f10629a));
        this.f10634f = b0VarL;
        return b0VarL;
    }
}
