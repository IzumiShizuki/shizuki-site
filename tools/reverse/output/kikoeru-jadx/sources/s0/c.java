package s0;

import g2.c0;
import ic.k;
import jc.l;
import ub.a0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f19321b;

    public /* synthetic */ c(i iVar, int i10) {
        this.f19320a = i10;
        this.f19321b = iVar;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        switch (this.f19320a) {
            case 0:
                c0 c0VarB = ((c0) obj).B();
                l.b(c0VarB);
                long jK = c0VarB.k();
                long jC = c0VarB.c(0L);
                long jR = (((long) lc.b.R(Float.intBitsToFloat((int) (jC >> 32)))) << 32) | (((long) lc.b.R(Float.intBitsToFloat((int) (jC & 4294967295L)))) & 4294967295L);
                int i10 = (int) (jR >> 32);
                int i11 = (int) (jR & 4294967295L);
                f3.k kVar = new f3.k(i10, i11, ((int) (jK >> 32)) + i10, ((int) (jK & 4294967295L)) + i11);
                i iVar = this.f19321b;
                iVar.f19333o.setValue(kVar);
                iVar.j();
                break;
            default:
                i iVar2 = this.f19321b;
                iVar2.f19334p.setValue((f3.l) obj);
                iVar2.j();
                break;
        }
        return a0.f21526a;
    }
}
