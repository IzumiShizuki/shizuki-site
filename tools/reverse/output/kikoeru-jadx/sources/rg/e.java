package rg;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e extends b {
    public int F;
    public byte[] G;
    public long H;

    @Override // rg.b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        e eVar = (e) obj;
        i iVar = this.A;
        long j10 = iVar != null ? iVar.f19061q : this.H;
        i iVar2 = eVar.A;
        return j10 == (iVar2 != null ? iVar2.f19061q : eVar.H);
    }

    public final int hashCode() {
        String str = this.f19044v;
        i iVar = this.A;
        return Objects.hash(str, Long.valueOf(iVar != null ? iVar.f19061q : this.H));
    }

    public final String toString() {
        return this.f19044v;
    }
}
