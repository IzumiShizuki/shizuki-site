package w8;

import ce.j0;
import i8.m;
import s8.j;
import s8.o;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f23435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f23436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f23437c;

    public b(m mVar, j jVar, int i10) {
        this.f23435a = mVar;
        this.f23436b = jVar;
        this.f23437c = i10;
        if (i10 <= 0) {
            throw new IllegalArgumentException("durationMillis must be > 0.");
        }
    }

    @Override // w8.f
    public final void a() {
        this.f23435a.getClass();
        j jVar = this.f23436b;
        boolean z10 = jVar instanceof o;
        new l8.a(jVar.a(), jVar.b().f19636w, this.f23437c, (z10 && ((o) jVar).f19664g) ? false : true);
        if (!z10 && !(jVar instanceof s8.e)) {
            throw new j0();
        }
    }
}
