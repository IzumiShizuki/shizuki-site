package w8;

import android.graphics.drawable.Drawable;
import ce.j0;
import i8.m;
import s8.j;
import s8.o;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f23438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f23439b;

    public d(m mVar, j jVar) {
        this.f23438a = mVar;
        this.f23439b = jVar;
    }

    @Override // w8.f
    public final void a() {
        j jVar = this.f23439b;
        boolean z10 = jVar instanceof o;
        m mVar = this.f23438a;
        if (z10) {
            Drawable drawable = ((o) jVar).f19658a;
            mVar.getClass();
        } else {
            if (!(jVar instanceof s8.e)) {
                throw new j0();
            }
            Drawable drawable2 = ((s8.e) jVar).f19584a;
            mVar.getClass();
        }
    }
}
