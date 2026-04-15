package uh;

import ce.j0;
import r.y1;
import u.e1;
import u3.x0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class n extends jc.m implements ic.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f22023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y f22024c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(y yVar, int i10) {
        super(0);
        this.f22023b = i10;
        this.f22024c = yVar;
    }

    @Override // ic.a
    public final Object b() {
        float fS;
        long jC;
        float f10;
        long j10;
        switch (this.f22023b) {
            case 0:
                return Boolean.valueOf(this.f22024c.f22079j.getValue() != null);
            case 1:
                return this.f22024c.f22070a.a();
            case 2:
                y yVar = this.f22024c;
                x xVarD = yVar.d();
                if (xVarD != null) {
                    y1 y1VarA = yVar.f22070a.a();
                    a0.t tVar = (a0.t) y1VarA.f18634b;
                    int iOrdinal = y1VarA.W().ordinal();
                    if (iOrdinal == 0) {
                        jC = tVar.c() & 4294967295L;
                    } else {
                        if (iOrdinal != 1) {
                            throw new j0();
                        }
                        jC = tVar.c() >> 32;
                    }
                    long jC2 = xVarD.c();
                    fS = (((int) jC) - ua.l.S(x0.b((int) (jC2 >> 32), (int) (4294967295L & jC2)), yVar.f())) - 1.0f;
                } else {
                    fS = 0.0f;
                }
                return Float.valueOf(fS);
            case 3:
                y yVar2 = this.f22024c;
                x xVarD2 = yVar2.d();
                if (xVarD2 != null) {
                    long jC3 = xVarD2.c();
                    float fS2 = ua.l.S(x0.b((int) (jC3 >> 32), (int) (jC3 & 4294967295L)), yVar2.f());
                    long jD = xVarD2.d();
                    e1 e1VarF = yVar2.f();
                    jc.l.e(e1VarF, "orientation");
                    int iOrdinal2 = e1VarF.ordinal();
                    if (iOrdinal2 == 0) {
                        j10 = jD & 4294967295L;
                    } else {
                        if (iOrdinal2 != 1) {
                            throw new j0();
                        }
                        j10 = jD >> 32;
                    }
                    f10 = (fS2 + ((int) j10)) - 1.0f;
                } else {
                    f10 = 0.0f;
                }
                return Float.valueOf(f10);
            default:
                return this.f22024c.f();
        }
    }
}
