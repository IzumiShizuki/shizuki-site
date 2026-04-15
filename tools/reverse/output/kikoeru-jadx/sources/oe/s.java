package oe;

import wd.b1;

/* JADX INFO: loaded from: classes.dex */
public final class s implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f16417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w f16418c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ce.b f16419d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f16420e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f16421f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b1 f16422g;

    public /* synthetic */ s(t tVar, w wVar, ce.b bVar, int i10, int i11, b1 b1Var, int i12) {
        this.f16416a = i12;
        this.f16417b = tVar;
        this.f16418c = wVar;
        this.f16419d = bVar;
        this.f16420e = i10;
        this.f16421f = i11;
        this.f16422g = b1Var;
    }

    @Override // ic.a
    public final Object b() {
        switch (this.f16416a) {
            case 0:
                return vb.m.G0(this.f16417b.f16423a.f16390a.f16368e.h(this.f16418c, this.f16419d, this.f16420e, this.f16421f, this.f16422g));
            default:
                return vb.m.G0(this.f16417b.f16423a.f16390a.f16368e.g(this.f16418c, this.f16419d, this.f16420e, this.f16421f, this.f16422g));
        }
    }
}
