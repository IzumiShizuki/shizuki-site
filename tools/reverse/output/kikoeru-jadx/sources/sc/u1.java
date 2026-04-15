package sc;

import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes.dex */
public final class u1 implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v1 f19885b;

    public /* synthetic */ u1(v1 v1Var, int i10) {
        this.f19884a = i10;
        this.f19885b = v1Var;
    }

    @Override // ic.a
    public final Object b() {
        switch (this.f19884a) {
            case 0:
                v1 v1Var = this.f19885b;
                return v1Var.d(v1Var.f19892a);
            default:
                z1 z1Var = this.f19885b.f19894c;
                Type type = z1Var != null ? (Type) z1Var.b() : null;
                jc.l.b(type);
                return ed.d.c(type);
        }
    }
}
