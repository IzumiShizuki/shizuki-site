package s8;

import android.graphics.Bitmap;
import hf.l0;
import hf.u;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f19567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f19568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u f19569c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u f19570d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final w8.c f19571e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t8.d f19572f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Bitmap.Config f19573g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f19574h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b f19575i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b f19576j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b f19577k;

    public c() {
        pf.e eVar = l0.f8566a;
        jf.d dVar = nf.n.f15850a.f10872f;
        pf.d dVar2 = pf.d.f17138c;
        Bitmap.Config config = x8.d.f24839b;
        this.f19567a = dVar;
        this.f19568b = dVar2;
        this.f19569c = dVar2;
        this.f19570d = dVar2;
        this.f19571e = w8.e.f23440a;
        this.f19572f = t8.d.f20557c;
        this.f19573g = config;
        this.f19574h = true;
        b bVar = b.ENABLED;
        this.f19575i = bVar;
        this.f19576j = bVar;
        this.f19577k = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return jc.l.a(this.f19567a, cVar.f19567a) && jc.l.a(this.f19568b, cVar.f19568b) && jc.l.a(this.f19569c, cVar.f19569c) && jc.l.a(this.f19570d, cVar.f19570d) && jc.l.a(this.f19571e, cVar.f19571e) && this.f19572f == cVar.f19572f && this.f19573g == cVar.f19573g && this.f19574h == cVar.f19574h && this.f19575i == cVar.f19575i && this.f19576j == cVar.f19576j && this.f19577k == cVar.f19577k;
    }

    public final int hashCode() {
        int iHashCode = (this.f19570d.hashCode() + ((this.f19569c.hashCode() + ((this.f19568b.hashCode() + (this.f19567a.hashCode() * 31)) * 31)) * 31)) * 31;
        this.f19571e.getClass();
        return this.f19577k.hashCode() + ((this.f19576j.hashCode() + ((this.f19575i.hashCode() + ((((((this.f19573g.hashCode() + ((this.f19572f.hashCode() + ((w8.c.class.hashCode() + iHashCode) * 31)) * 31)) * 31) + (this.f19574h ? 1231 : 1237)) * 31) + 1237) * 923521)) * 31)) * 31);
    }
}
