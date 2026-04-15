package b9;

import ac.i;
import hf.y;
import ic.n;
import java.io.File;
import java.util.ArrayList;
import u.a2;
import u.c2;
import ub.a0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c extends i implements n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2270e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f2271f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f2272g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(long j10, yb.c cVar, int i10) {
        super(2, cVar);
        this.f2270e = i10;
        this.f2272g = j10;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        switch (this.f2270e) {
            case 0:
                c cVar2 = new c(this.f2272g, cVar, 0);
                cVar2.f2271f = obj;
                return cVar2;
            default:
                c cVar3 = new c(this.f2272g, cVar, 1);
                cVar3.f2271f = obj;
                return cVar3;
        }
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        switch (this.f2270e) {
            case 0:
                return ((c) o((y) obj, (yb.c) obj2)).u(a0.f21526a);
            default:
                c cVar = (c) o((a2) obj, (yb.c) obj2);
                a0 a0Var = a0.f21526a;
                cVar.u(a0Var);
                return a0Var;
        }
    }

    @Override // ac.a
    public final Object u(Object obj) {
        switch (this.f2270e) {
            case 0:
                y yVar = (y) this.f2271f;
                ub.a.f(obj);
                File fileA = d.a();
                StringBuilder sb = new StringBuilder("RJ");
                long j10 = this.f2272g;
                sb.append(j10);
                sb.append(".work");
                File file = new File(fileA, sb.toString());
                ArrayList arrayList = new ArrayList();
                if (!file.exists()) {
                    arrayList.add(hf.a0.y(yVar, null, null, new a(j10, file, (yb.c) null), 3));
                }
                File file2 = new File(d.a(), "RJ" + j10 + ".tree");
                if (!file2.exists()) {
                    arrayList.add(hf.a0.y(yVar, null, null, new b(j10, file2, null), 3));
                }
                return arrayList;
            default:
                ub.a.f(obj);
                c2 c2Var = ((a2) this.f2271f).f20805a;
                c2.a(c2Var, c2Var.f20853j, this.f2272g, 1);
                return a0.f21526a;
        }
    }
}
