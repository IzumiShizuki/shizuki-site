package b0;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends j1.p implements i2.p {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public androidx.compose.foundation.lazy.layout.b f1206o;

    @Override // i2.p
    public final void R(i2.l0 l0Var) {
        s1.b bVar = l0Var.f8782a;
        ArrayList arrayList = this.f1206o.f584i;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            a0 a0Var = (a0) arrayList.get(i10);
            t1.b bVar2 = a0Var.f1185n;
            if (bVar2 != null) {
                long j10 = a0Var.f1184m;
                long j11 = bVar2.f20158t;
                float f10 = ((int) (j10 >> 32)) - ((int) (j11 >> 32));
                float f11 = ((int) (j10 & 4294967295L)) - ((int) (j11 & 4294967295L));
                ((r.y1) bVar.f19346b.f3618b).i0(f10, f11);
                try {
                    u3.x0.k(l0Var, bVar2);
                } finally {
                    ((r.y1) bVar.f19346b.f3618b).i0(-f10, -f11);
                }
            }
        }
        l0Var.b();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c0) && jc.l.a(this.f1206o, ((c0) obj).f1206o);
    }

    public final int hashCode() {
        return this.f1206o.hashCode();
    }

    @Override // j1.p
    public final void r0() {
        this.f1206o.f585j = this;
    }

    @Override // j1.p
    public final void t0() {
        androidx.compose.foundation.lazy.layout.b bVar = this.f1206o;
        bVar.e();
        bVar.f577b = null;
        bVar.f578c = -1;
    }

    public final String toString() {
        return "DisplayingDisappearingItemsNode(animator=" + this.f1206o + ')';
    }

    @Override // i2.p
    public final /* synthetic */ void G() {
    }
}
