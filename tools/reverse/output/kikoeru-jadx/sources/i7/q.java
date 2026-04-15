package i7;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vb.j f9261c = new vb.j();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c7.e1 f9262d = new c7.e1(18);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c0 f9263e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f9264f;

    public final void a(k0 k0Var) {
        jc.l.e(k0Var, "event");
        this.f9264f = true;
        boolean z10 = k0Var instanceof i0;
        c7.e1 e1Var = this.f9262d;
        if (!z10) {
            if (k0Var instanceof f0) {
                e1Var.Y(null, a0.f9030c);
                throw null;
            }
            if (k0Var instanceof j0) {
                j0 j0Var = (j0) k0Var;
                e1Var.W(j0Var.f9174a);
                this.f9263e = j0Var.f9175b;
                return;
            }
            return;
        }
        i0 i0Var = (i0) k0Var;
        c0 c0Var = i0Var.f9162e;
        int i10 = i0Var.f9160c;
        int i11 = i0Var.f9161d;
        List list = i0Var.f9159b;
        e1Var.W(c0Var);
        this.f9263e = i0Var.f9163f;
        int iOrdinal = i0Var.f9158a.ordinal();
        vb.j jVar = this.f9261c;
        if (iOrdinal == 0) {
            jVar.clear();
            this.f9260b = i11;
            this.f9259a = i10;
            jVar.addAll(list);
            return;
        }
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                return;
            }
            this.f9260b = i11;
            jVar.addAll(list);
            return;
        }
        this.f9259a = i10;
        int size = list.size() - 1;
        oc.c cVar = new oc.c(size, gh.g.x(size, 0, -1), -1);
        while (cVar.f16312c) {
            jVar.addFirst(list.get(cVar.nextInt()));
        }
    }

    public final List b() {
        if (!this.f9264f) {
            return vb.r.f22819a;
        }
        ArrayList arrayList = new ArrayList();
        c0 c0VarF0 = this.f9262d.f0();
        vb.j jVar = this.f9261c;
        if (jVar.isEmpty()) {
            arrayList.add(new j0(c0VarF0, this.f9263e));
            return arrayList;
        }
        i0 i0Var = i0.f9157g;
        arrayList.add(new i0(d0.f9071a, vb.m.G0(jVar), this.f9259a, this.f9260b, c0VarF0, this.f9263e));
        return arrayList;
    }
}
