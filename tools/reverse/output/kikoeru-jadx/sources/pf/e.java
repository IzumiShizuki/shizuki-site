package pf;

import hf.u;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e extends h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e f17140d;

    static {
        int i10 = k.f17148c;
        int i11 = k.f17149d;
        long j10 = k.f17150e;
        String str = k.f17146a;
        e eVar = new e();
        eVar.f17142c = new c(j10, str, i10, i11);
        f17140d = eVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // hf.u
    public final u h0(int i10) {
        nf.b.a(i10);
        return i10 >= k.f17148c ? this : super.h0(i10);
    }

    @Override // hf.u
    public final String toString() {
        return "Dispatchers.Default";
    }
}
