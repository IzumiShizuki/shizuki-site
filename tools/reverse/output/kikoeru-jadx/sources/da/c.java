package da;

import java.io.UnsupportedEncodingException;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5651a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m0 f5652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ bg.o0 f5653c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b f5654d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f5655e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e7.a0 f5656f;

    public /* synthetic */ c(bg.o0 o0Var, m0 m0Var, b bVar, int i10, e7.a0 a0Var) {
        this.f5653c = o0Var;
        this.f5652b = m0Var;
        this.f5654d = bVar;
        this.f5655e = i10;
        this.f5656f = a0Var;
    }

    @Override // ic.a
    public final Object b() throws UnsupportedEncodingException {
        switch (this.f5651a) {
            case 0:
                Boolean bool = Boolean.TRUE;
                boolean zBooleanValue = ((Boolean) a0.c.F(Boolean.TYPE, gg.c.a(), "enableLongClickItemCopy", bool)).booleanValue();
                bg.o0 o0Var = this.f5653c;
                if (zBooleanValue) {
                    na.q.f(o0Var.a());
                } else {
                    b bVar = this.f5654d;
                    this.f5652b.W(o0Var, (b) bVar.f5640e.get(this.f5655e), bVar, this.f5656f);
                }
                break;
            default:
                b bVar2 = this.f5654d;
                this.f5652b.W(this.f5653c, (b) bVar2.f5640e.get(this.f5655e), bVar2, this.f5656f);
                break;
        }
        return ub.a0.f21526a;
    }

    public /* synthetic */ c(m0 m0Var, bg.o0 o0Var, b bVar, int i10, e7.a0 a0Var) {
        this.f5652b = m0Var;
        this.f5653c = o0Var;
        this.f5654d = bVar;
        this.f5655e = i10;
        this.f5656f = a0Var;
    }
}
