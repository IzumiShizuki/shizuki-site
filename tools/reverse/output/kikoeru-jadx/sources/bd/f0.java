package bd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f0 implements o6.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f2567a;

    public /* synthetic */ f0(List list) {
        this.f2567a = list;
    }

    @Override // o6.d
    public int a(long j10) {
        return j10 < 0 ? 0 : -1;
    }

    public wd.t0 b(int i10) {
        return (wd.t0) this.f2567a.get(i10);
    }

    @Override // o6.d
    public long e(int i10) {
        p4.c.c(i10 == 0);
        return 0L;
    }

    @Override // o6.d
    public List f(long j10) {
        return j10 >= 0 ? this.f2567a : Collections.EMPTY_LIST;
    }

    @Override // o6.d
    public int g() {
        return 1;
    }

    public f0(wd.z0 z0Var) {
        jc.l.e(z0Var, "typeTable");
        List list = z0Var.f24071c;
        if ((z0Var.f24070b & 1) == 1) {
            int i10 = z0Var.f24072d;
            jc.l.d(list, "getTypeList(...)");
            List list2 = list;
            ArrayList arrayList = new ArrayList(vb.n.K(list2, 10));
            int i11 = 0;
            for (Object obj : list2) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    ud.b.H();
                    throw null;
                }
                wd.t0 t0VarG = (wd.t0) obj;
                if (i11 >= i10) {
                    t0VarG.getClass();
                    wd.s0 s0VarR = wd.t0.r(t0VarG);
                    s0VarR.f23927d |= 2;
                    s0VarR.f23929f = true;
                    t0VarG = s0VarR.g();
                    if (!t0VarG.b()) {
                        throw new ce.j0();
                    }
                }
                arrayList.add(t0VarG);
                i11 = i12;
            }
            list = arrayList;
        }
        jc.l.d(list, "run(...)");
        this.f2567a = list;
    }
}
