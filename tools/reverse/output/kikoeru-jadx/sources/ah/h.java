package ah;

import b5.d0;
import b7.b1;
import java.util.ArrayList;
import jc.l;
import ug.t;
import ug.u;
import zg.n;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f379c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d0 f380d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b1 f381e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f382f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f383g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f384h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f385i;

    public h(n nVar, ArrayList arrayList, int i10, d0 d0Var, b1 b1Var, int i11, int i12, int i13) {
        l.e(b1Var, "request");
        this.f377a = nVar;
        this.f378b = arrayList;
        this.f379c = i10;
        this.f380d = d0Var;
        this.f381e = b1Var;
        this.f382f = i11;
        this.f383g = i12;
        this.f384h = i13;
    }

    public static h a(h hVar, int i10, d0 d0Var, b1 b1Var, int i11) {
        if ((i11 & 1) != 0) {
            i10 = hVar.f379c;
        }
        int i12 = i10;
        if ((i11 & 2) != 0) {
            d0Var = hVar.f380d;
        }
        d0 d0Var2 = d0Var;
        if ((i11 & 4) != 0) {
            b1Var = hVar.f381e;
        }
        b1 b1Var2 = b1Var;
        int i13 = hVar.f382f;
        int i14 = hVar.f383g;
        int i15 = hVar.f384h;
        l.e(b1Var2, "request");
        return new h(hVar.f377a, hVar.f378b, i12, d0Var2, b1Var2, i13, i14, i15);
    }

    public final ug.d0 b(b1 b1Var) {
        l.e(b1Var, "request");
        ArrayList arrayList = this.f378b;
        int size = arrayList.size();
        int i10 = this.f379c;
        if (i10 >= size) {
            throw new IllegalStateException("Check failed.");
        }
        this.f385i++;
        d0 d0Var = this.f380d;
        if (d0Var != null) {
            if (!((zg.h) d0Var.f1522c).f().f((t) b1Var.f1650b)) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i10 - 1) + " must retain the same host and port").toString());
            }
            if (this.f385i != 1) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i10 - 1) + " must call proceed() exactly once").toString());
            }
        }
        int i11 = i10 + 1;
        h hVarA = a(this, i11, null, b1Var, 58);
        u uVar = (u) arrayList.get(i10);
        ug.d0 d0VarA = uVar.a(hVarA);
        if (d0VarA == null) {
            throw new NullPointerException("interceptor " + uVar + " returned null");
        }
        if (d0Var == null || i11 >= arrayList.size() || hVarA.f385i == 1) {
            return d0VarA;
        }
        throw new IllegalStateException(("network interceptor " + uVar + " must call proceed() exactly once").toString());
    }
}
