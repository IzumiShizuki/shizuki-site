package fe;

import gh.g;
import jc.l;
import se.n0;
import se.p0;
import se.w;
import se.x0;
import yc.q0;
import zc.h;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d extends p0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p0 f7054c;

    public /* synthetic */ d(p0 p0Var, int i10) {
        this.f7053b = i10;
        this.f7054c = p0Var;
    }

    @Override // se.p0
    public boolean a() {
        switch (this.f7053b) {
            case 0:
                return this.f7054c.a();
            default:
                return super.a();
        }
    }

    @Override // se.p0
    public boolean b() {
        switch (this.f7053b) {
            case 0:
                return true;
            default:
                return super.b();
        }
    }

    @Override // se.p0
    public final h c(h hVar) {
        switch (this.f7053b) {
            case 0:
                l.e(hVar, "annotations");
                break;
            default:
                l.e(hVar, "annotations");
                break;
        }
        return this.f7054c.c(hVar);
    }

    @Override // se.p0
    public final n0 d(w wVar) {
        switch (this.f7053b) {
            case 0:
                n0 n0VarD = this.f7054c.d(wVar);
                if (n0VarD == null) {
                    return null;
                }
                yc.h hVarH = wVar.t().h();
                return g.p(n0VarD, hVarH instanceof q0 ? (q0) hVarH : null);
            default:
                return this.f7054c.d(wVar);
        }
    }

    @Override // se.p0
    public final boolean e() {
        switch (this.f7053b) {
        }
        return this.f7054c.e();
    }

    @Override // se.p0
    public final w f(w wVar, x0 x0Var) {
        switch (this.f7053b) {
            case 0:
                l.e(wVar, "topLevelType");
                l.e(x0Var, "position");
                break;
            default:
                l.e(wVar, "topLevelType");
                l.e(x0Var, "position");
                break;
        }
        return this.f7054c.f(wVar, x0Var);
    }
}
