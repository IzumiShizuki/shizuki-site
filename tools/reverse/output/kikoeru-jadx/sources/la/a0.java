package la;

import bg.a2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a0 implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e7.a0 f11895b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x0.w0 f11896c;

    public /* synthetic */ a0(e7.a0 a0Var, x0.w0 w0Var, int i10) {
        this.f11894a = i10;
        this.f11895b = a0Var;
        this.f11896c = w0Var;
    }

    @Override // ic.a
    public final Object b() {
        switch (this.f11894a) {
            case 0:
                e7.a0.b(this.f11895b, "MusicScreen/" + ((a2) this.f11896c.getValue()).f2823f);
                break;
            default:
                this.f11896c.setValue(Boolean.FALSE);
                ((hg.b) a9.i.f231b.getValue()).d("");
                fg.f fVarD = a9.i.d();
                Boolean bool = Boolean.TRUE;
                fVarD.setValue(bool);
                a9.i.e().setValue(bool);
                e7.a0 a0Var = this.f11895b;
                a0Var.c();
                e7.a0.b(a0Var, "LoginScreen");
                break;
        }
        return ub.a0.f21526a;
    }
}
