package androidx.media3.exoplayer.offline;

import android.net.Uri;
import p4.c0;
import s4.d0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class x extends p4.t {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ t4.f f978h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ s4.m f979i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ b0 f980j;

    public x(b0 b0Var, t4.f fVar, s4.m mVar) {
        this.f980j = b0Var;
        this.f978h = fVar;
        this.f979i = mVar;
    }

    @Override // p4.t
    public final Object d() {
        n5.q qVar = this.f980j.f880b;
        t4.f fVar = this.f978h;
        d0 d0Var = new d0(fVar);
        j5.u.f10444b.getAndIncrement();
        d0Var.f19398b = 0L;
        s4.k kVar = new s4.k(d0Var, this.f979i);
        try {
            kVar.b();
            Uri uri = fVar.f20432i;
            uri.getClass();
            Object objF0 = qVar.F0(uri, kVar);
            c0.g(kVar);
            objF0.getClass();
            return (t) objF0;
        } catch (Throwable th2) {
            c0.g(kVar);
            throw th2;
        }
    }
}
