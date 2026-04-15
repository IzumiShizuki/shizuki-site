package oe;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class q implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f16410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ce.b f16411c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f16412d;

    public /* synthetic */ q(t tVar, ce.b bVar, int i10, int i11) {
        this.f16409a = i11;
        this.f16410b = tVar;
        this.f16411c = bVar;
        this.f16412d = i10;
    }

    @Override // ic.a
    public final Object b() {
        switch (this.f16409a) {
            case 0:
                t tVar = this.f16410b;
                k kVar = tVar.f16423a;
                w wVarA = tVar.a(kVar.f16392c);
                List listG0 = wVarA != null ? vb.m.G0(kVar.f16390a.f16368e.o(wVarA, this.f16411c, this.f16412d)) : null;
                if (listG0 == null) {
                }
                break;
            default:
                t tVar2 = this.f16410b;
                k kVar2 = tVar2.f16423a;
                w wVarA2 = tVar2.a(kVar2.f16392c);
                List listS = wVarA2 != null ? kVar2.f16390a.f16368e.s(wVarA2, this.f16411c, this.f16412d) : null;
                if (listS == null) {
                }
                break;
        }
        return vb.r.f22819a;
    }
}
