package m9;

import b0.i0;
import c2.x;
import cg.d0;
import hf.y;
import java.io.Serializable;
import u.f0;
import u.k0;
import ub.a0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a extends ac.i implements ic.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f14975e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f14976f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f14977g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ic.a f14978h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f14979i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f14980j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f14981k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Serializable f14982l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Serializable f14983m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ic.a f14984n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(String str, c cVar, String str2, String str3, ic.a aVar, yb.c cVar2, int i10) {
        super(2, cVar2);
        this.f14975e = i10;
        this.f14980j = str;
        this.f14981k = cVar;
        this.f14982l = str2;
        this.f14983m = str3;
        this.f14984n = aVar;
    }

    @Override // ac.a
    public final yb.c o(Object obj, yb.c cVar) {
        switch (this.f14975e) {
            case 0:
                return new a((String) this.f14980j, (c) this.f14981k, (String) this.f14982l, (String) this.f14983m, this.f14984n, cVar, 0);
            case 1:
                return new a((String) this.f14980j, (c) this.f14981k, (String) this.f14982l, (String) this.f14983m, this.f14984n, cVar, 1);
            default:
                a aVar = new a((k0) this.f14976f, (x) this.f14980j, (d0) this.f14982l, (cg.b) this.f14983m, (f0) this.f14978h, (f0) this.f14984n, (i0) this.f14981k, cVar);
                aVar.f14977g = obj;
                return aVar;
        }
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        y yVar = (y) obj;
        yb.c cVar = (yb.c) obj2;
        switch (this.f14975e) {
        }
        return ((a) o(yVar, cVar)).u(a0.f21526a);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009e  */
    @Override // ac.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(java.lang.Object r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 638
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m9.a.u(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(k0 k0Var, x xVar, d0 d0Var, cg.b bVar, f0 f0Var, f0 f0Var2, i0 i0Var, yb.c cVar) {
        super(2, cVar);
        this.f14975e = 2;
        this.f14976f = k0Var;
        this.f14980j = xVar;
        this.f14982l = d0Var;
        this.f14983m = bVar;
        this.f14978h = f0Var;
        this.f14984n = f0Var2;
        this.f14981k = i0Var;
    }
}
