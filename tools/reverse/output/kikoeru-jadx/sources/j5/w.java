package j5;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class w extends s {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object f10458h = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f10459f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f10460g;

    public w(m4.i1 i1Var, Object obj, Object obj2) {
        super(i1Var);
        this.f10459f = obj;
        this.f10460g = obj2;
    }

    @Override // j5.s, m4.i1
    public final int b(Object obj) {
        Object obj2;
        if (f10458h.equals(obj) && (obj2 = this.f10460g) != null) {
            obj = obj2;
        }
        return this.f10410e.b(obj);
    }

    @Override // j5.s, m4.i1
    public final m4.f1 f(int i10, m4.f1 f1Var, boolean z10) {
        this.f10410e.f(i10, f1Var, z10);
        Object obj = f1Var.f14202b;
        int i11 = p4.c0.f16548a;
        if (Objects.equals(obj, this.f10460g) && z10) {
            f1Var.f14202b = f10458h;
        }
        return f1Var;
    }

    @Override // j5.s, m4.i1
    public final Object l(int i10) {
        Object objL = this.f10410e.l(i10);
        int i11 = p4.c0.f16548a;
        return Objects.equals(objL, this.f10460g) ? f10458h : objL;
    }

    @Override // j5.s, m4.i1
    public final m4.h1 m(int i10, m4.h1 h1Var, long j10) {
        this.f10410e.m(i10, h1Var, j10);
        if (Objects.equals(h1Var.f14262a, this.f10459f)) {
            h1Var.f14262a = m4.h1.f14252q;
        }
        return h1Var;
    }
}
