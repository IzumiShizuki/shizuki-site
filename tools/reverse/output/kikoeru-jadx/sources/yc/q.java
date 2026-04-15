package yc;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class q implements ic.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q f26141b = new q(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q f26142c = new q(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final q f26143d = new q(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final q f26144e = new q(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final q f26145f = new q(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26146a;

    public /* synthetic */ q(int i10) {
        this.f26146a = i10;
    }

    @Override // ic.k
    public final Object a(Object obj) {
        switch (this.f26146a) {
            case 0:
                jc.l.e((be.b) obj, "it");
                return 0;
            case 1:
                d0 d0Var = (d0) obj;
                jc.l.e(d0Var, "it");
                return ((bd.j0) d0Var).f2596e;
            case 2:
                k kVar = (k) obj;
                jc.l.e(kVar, "it");
                return Boolean.valueOf(kVar instanceof b);
            case 3:
                jc.l.e((k) obj, "it");
                return Boolean.valueOf(!(r2 instanceof j));
            default:
                k kVar2 = (k) obj;
                jc.l.e(kVar2, "it");
                List typeParameters = ((b) kVar2).getTypeParameters();
                jc.l.d(typeParameters, "getTypeParameters(...)");
                return vb.m.R(typeParameters);
        }
    }
}
