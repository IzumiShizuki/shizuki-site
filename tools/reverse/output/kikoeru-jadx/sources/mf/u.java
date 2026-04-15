package mf;

import lf.o0;
import lf.z0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class u extends o0 implements z0 {
    @Override // lf.z0
    public final Object getValue() {
        Integer numValueOf;
        synchronized (this) {
            Object[] objArr = this.f12465h;
            jc.l.b(objArr);
            numValueOf = Integer.valueOf(((Number) objArr[(objArr.length - 1) & ((int) ((this.f12466i + ((long) ((int) ((r() + ((long) this.f12468k)) - this.f12466i)))) - 1))]).intValue());
        }
        return numValueOf;
    }

    public final void y(int i10) {
        synchronized (this) {
            Object[] objArr = this.f12465h;
            jc.l.b(objArr);
            j(Integer.valueOf(((Number) objArr[(objArr.length - 1) & ((int) ((this.f12466i + ((long) ((int) ((r() + ((long) this.f12468k)) - this.f12466i)))) - 1))]).intValue() + i10));
        }
    }
}
