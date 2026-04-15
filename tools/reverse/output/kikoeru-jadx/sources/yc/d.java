package yc;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d implements q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q0 f26101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f26102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f26103c;

    public d(q0 q0Var, i iVar, int i10) {
        this.f26101a = q0Var;
        this.f26102b = iVar;
        this.f26103c = i10;
    }

    @Override // yc.h
    public final se.a0 E() {
        se.a0 a0VarE = this.f26101a.E();
        jc.l.d(a0VarE, "getDefaultType(...)");
        return a0VarE;
    }

    @Override // yc.h
    public final se.k0 Q() {
        se.k0 k0VarQ = this.f26101a.Q();
        jc.l.d(k0VarQ, "getTypeConstructor(...)");
        return k0VarQ;
    }

    @Override // yc.q0
    public final boolean Y() {
        return this.f26101a.Y();
    }

    @Override // yc.h, yc.k, yc.b
    public final h a() {
        return this.f26101a.a();
    }

    @Override // yc.k
    public final Object a0(m mVar, Object obj) {
        return this.f26101a.a0(mVar, obj);
    }

    @Override // yc.q0
    public final se.x0 e0() {
        se.x0 x0VarE0 = this.f26101a.e0();
        jc.l.d(x0VarE0, "getVariance(...)");
        return x0VarE0;
    }

    @Override // zc.a
    public final zc.h getAnnotations() {
        return this.f26101a.getAnnotations();
    }

    @Override // yc.q0
    public final int getIndex() {
        return this.f26101a.getIndex() + this.f26103c;
    }

    @Override // yc.k
    public final be.e getName() {
        be.e name = this.f26101a.getName();
        jc.l.d(name, "getName(...)");
        return name;
    }

    @Override // yc.q0
    public final List getUpperBounds() {
        List upperBounds = this.f26101a.getUpperBounds();
        jc.l.d(upperBounds, "getUpperBounds(...)");
        return upperBounds;
    }

    @Override // yc.l
    public final m0 m() {
        m0 m0VarM = this.f26101a.m();
        jc.l.d(m0VarM, "getSource(...)");
        return m0VarM;
    }

    @Override // yc.q0
    public final re.o t0() {
        re.o oVarT0 = this.f26101a.t0();
        jc.l.d(oVarT0, "getStorageManager(...)");
        return oVarT0;
    }

    public final String toString() {
        return this.f26101a + "[inner-copy]";
    }

    @Override // yc.q0
    public final boolean x0() {
        return true;
    }

    @Override // yc.k
    public final k y() {
        return this.f26102b;
    }

    @Override // yc.k, yc.b
    public final k a() {
        return this.f26101a.a();
    }

    @Override // yc.q0, yc.h, yc.k, yc.b
    public final q0 a() {
        return this.f26101a.a();
    }
}
