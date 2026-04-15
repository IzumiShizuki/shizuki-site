package hd;

import i7.j1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class v0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ pc.u[] f8471l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w0 f8473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w0 f8474c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f8475d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f8476e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f8477f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f8478g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f8479h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f8480i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f8481j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f8482k;

    static {
        jc.o oVar = new jc.o(v0.class, "_hasSetter", "get_hasSetter()Z", 0);
        jc.a0 a0Var = jc.z.f10839a;
        f8471l = new pc.u[]{a0Var.e(oVar), q.t0.G(v0.class, "_hasGetter", "get_hasGetter()Z", 0, a0Var)};
    }

    public v0(int i10, int i11, int i12, String str) {
        jc.l.e(str, "name");
        this.f8472a = i10;
        yd.b bVar = yd.d.A;
        jc.l.d(bVar, "HAS_SETTER");
        j1 j1Var = new j1(bVar);
        int i13 = j1Var.f9176a;
        int i14 = j1Var.f9178c;
        id.e eVar = id.e.f9501h;
        int i15 = j1Var.f9177b;
        if (i15 != 1 || i14 != 1) {
            throw new IllegalArgumentException(a0.c.J("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", j1Var, " was passed").toString());
        }
        yd.b bVar2 = yd.d.f26196z;
        jc.l.d(bVar2, "HAS_GETTER");
        j1 j1Var2 = new j1(bVar2);
        if (j1Var2.f9177b != 1 || j1Var2.f9178c != 1) {
            throw new IllegalArgumentException(a0.c.J("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", j1Var2, " was passed").toString());
        }
        int i16 = 1 << j1Var2.f9176a;
        w0 w0Var = new w0(i11);
        pc.u[] uVarArr = f8471l;
        jc.l.e(uVarArr[1], "property");
        this.f8472a = i16 | this.f8472a;
        this.f8473b = w0Var;
        jc.l.e(uVarArr[0], "property");
        this.f8474c = ((((Number) eVar.get(this)).intValue() >>> i13) & ((1 << i15) - 1)) == i14 ? new w0(i12) : null;
        this.f8475d = new ArrayList(0);
        this.f8476e = new ArrayList(0);
        new ArrayList(0);
        this.f8477f = new ArrayList();
        this.f8478g = new ArrayList(0);
        this.f8479h = new ArrayList(0);
        this.f8480i = new ArrayList(0);
        this.f8481j = new ArrayList(0);
        jd.k.f10844a.getClass();
        List listA = jd.j.a();
        ArrayList arrayList = new ArrayList(vb.n.K(listA, 10));
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            ((kd.d) ((jd.k) it.next())).getClass();
            arrayList.add(new kd.e());
        }
        this.f8482k = arrayList;
    }
}
