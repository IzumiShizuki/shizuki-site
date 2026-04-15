package i8;

import java.util.Arrays;
import q.t0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s8.i f9444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f9445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h8.h f9446c;

    public o(s8.i iVar, u uVar, h8.h hVar) {
        this.f9444a = iVar;
        this.f9445b = uVar;
        this.f9446c = hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        s8.i iVar = oVar.f9444a;
        this.f9445b.getClass();
        s8.i iVar2 = this.f9444a;
        return (iVar2 == iVar || (jc.l.a(iVar2.f19614a, iVar.f19614a) && iVar2.f19615b.equals(iVar.f19615b) && iVar2.f19617d == iVar.f19617d && jc.l.a(iVar2.f19619f, iVar.f19619f) && jc.l.a(iVar2.f19621h, iVar.f19621h) && iVar2.f19623j == iVar.f19623j && iVar2.f19624k == iVar.f19624k && iVar2.f19625l == iVar.f19625l && iVar2.f19626m == iVar.f19626m && iVar2.f19627n == iVar.f19627n && iVar2.f19628o == iVar.f19628o && iVar2.f19629p == iVar.f19629p && iVar2.f19635v.equals(iVar.f19635v) && iVar2.f19636w == iVar.f19636w && iVar2.f19618e == iVar.f19618e && iVar2.f19637x.equals(iVar.f19637x))) && jc.l.a(this.f9446c, oVar.f9446c);
    }

    public final int hashCode() {
        this.f9445b.getClass();
        s8.i iVar = this.f9444a;
        return this.f9446c.hashCode() + ((iVar.f19637x.f19657a.hashCode() + ((iVar.f19618e.hashCode() + ((iVar.f19636w.hashCode() + ((iVar.f19635v.hashCode() + ((iVar.f19629p.hashCode() + ((iVar.f19628o.hashCode() + ((iVar.f19627n.hashCode() + ((((((((((t0.z((iVar.f19617d.hashCode() + ((iVar.f19615b.hashCode() + (iVar.f19614a.hashCode() * 31)) * 923521)) * 961, 31, iVar.f19619f) + Arrays.hashCode(iVar.f19621h.f21860a)) * 31) + (iVar.f19623j ? 1231 : 1237)) * 31) + (iVar.f19624k ? 1231 : 1237)) * 31) + (iVar.f19625l ? 1231 : 1237)) * 31) + (iVar.f19626m ? 1231 : 1237)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }
}
