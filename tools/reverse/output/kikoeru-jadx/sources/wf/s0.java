package wf;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class s0 implements sf.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sf.a f24177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sf.a f24178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f24179c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final uf.h f24180d;

    public s0(sf.a aVar, sf.a aVar2, byte b10) {
        this.f24177a = aVar;
        this.f24178b = aVar2;
    }

    @Override // sf.a
    public final uf.g a() {
        switch (this.f24179c) {
        }
        return this.f24180d;
    }

    @Override // sf.a
    public final Object b(vf.b bVar) {
        Object r0Var;
        Object obj = z0.f24218c;
        uf.g gVarA = a();
        vf.a aVarI = bVar.i(gVarA);
        Object objG = obj;
        Object objG2 = objG;
        while (true) {
            int iB = aVarI.b(a());
            if (iB == -1) {
                if (objG == obj) {
                    throw new sf.h("Element 'key' is missing");
                }
                if (objG2 == obj) {
                    throw new sf.h("Element 'value' is missing");
                }
                switch (this.f24179c) {
                    case 0:
                        r0Var = new r0(objG, objG2);
                        break;
                    default:
                        r0Var = new ub.k(objG, objG2);
                        break;
                }
                aVarI.j(gVarA);
                return r0Var;
            }
            if (iB == 0) {
                objG = aVarI.g(a(), 0, this.f24177a, null);
            } else {
                if (iB != 1) {
                    throw new sf.h(q.t0.B(iB, "Invalid index: "));
                }
                objG2 = aVarI.g(a(), 1, this.f24178b, null);
            }
        }
    }

    @Override // sf.a
    public final void d(yf.t tVar, Object obj) {
        Object key;
        Object value;
        yf.t tVarA = tVar.a(a());
        uf.g gVarA = a();
        sf.a aVar = this.f24177a;
        switch (this.f24179c) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                jc.l.e(entry, "<this>");
                key = entry.getKey();
                break;
            default:
                ub.k kVar = (ub.k) obj;
                jc.l.e(kVar, "<this>");
                key = kVar.f21543a;
                break;
        }
        tVarA.r(gVarA, 0, aVar, key);
        uf.g gVarA2 = a();
        sf.a aVar2 = this.f24178b;
        switch (this.f24179c) {
            case 0:
                Map.Entry entry2 = (Map.Entry) obj;
                jc.l.e(entry2, "<this>");
                value = entry2.getValue();
                break;
            default:
                ub.k kVar2 = (ub.k) obj;
                jc.l.e(kVar2, "<this>");
                value = kVar2.f21544b;
                break;
        }
        tVarA.r(gVarA2, 1, aVar2, value);
        tVarA.w(a());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public s0(final sf.a aVar, final sf.a aVar2, int i10) {
        this(aVar, aVar2, (byte) 0);
        this.f24179c = i10;
        switch (i10) {
            case 1:
                this(aVar, aVar2, (byte) 0);
                final int i11 = 1;
                this.f24180d = ud.e.e("kotlin.Pair", new uf.g[0], new ic.k() { // from class: wf.q0
                    @Override // ic.k
                    public final Object a(Object obj) {
                        uf.a aVar3 = (uf.a) obj;
                        switch (i11) {
                            case 0:
                                jc.l.e(aVar3, "$this$buildSerialDescriptor");
                                uf.a.a(aVar3, "key", aVar.a());
                                uf.a.a(aVar3, "value", aVar2.a());
                                break;
                            default:
                                jc.l.e(aVar3, "$this$buildClassSerialDescriptor");
                                uf.a.a(aVar3, "first", aVar.a());
                                uf.a.a(aVar3, "second", aVar2.a());
                                break;
                        }
                        return ub.a0.f21526a;
                    }
                });
                break;
            default:
                final int i12 = 0;
                this.f24180d = ud.e.f("kotlin.collections.Map.Entry", uf.k.f21707d, new uf.g[0], new ic.k() { // from class: wf.q0
                    @Override // ic.k
                    public final Object a(Object obj) {
                        uf.a aVar3 = (uf.a) obj;
                        switch (i12) {
                            case 0:
                                jc.l.e(aVar3, "$this$buildSerialDescriptor");
                                uf.a.a(aVar3, "key", aVar.a());
                                uf.a.a(aVar3, "value", aVar2.a());
                                break;
                            default:
                                jc.l.e(aVar3, "$this$buildClassSerialDescriptor");
                                uf.a.a(aVar3, "first", aVar.a());
                                uf.a.a(aVar3, "second", aVar2.a());
                                break;
                        }
                        return ub.a0.f21526a;
                    }
                });
                break;
        }
    }
}
