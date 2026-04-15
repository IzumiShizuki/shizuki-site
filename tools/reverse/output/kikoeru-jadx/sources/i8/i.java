package i8;

import android.graphics.drawable.Drawable;
import lf.p0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i implements u8.a, t8.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f9420a;

    public /* synthetic */ i(l lVar) {
        this.f9420a = lVar;
    }

    @Override // u8.a
    public void a(Drawable drawable) {
        l lVar = this.f9420a;
        lVar.k(new f(drawable != null ? lVar.j(drawable) : null));
    }

    @Override // t8.i
    public Object h(h8.f fVar) {
        return p0.m(new k(this.f9420a.f9428g, 0), fVar);
    }
}
