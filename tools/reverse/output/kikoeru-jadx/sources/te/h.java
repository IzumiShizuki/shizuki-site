package te;

import java.util.List;
import se.a0;
import se.h0;
import se.k0;
import se.n0;
import se.w0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h extends a0 implements ve.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ve.b f20729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f20730c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w0 f20731d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h0 f20732e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f20733f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f20734g;

    public h(ve.b bVar, i iVar, w0 w0Var, h0 h0Var, boolean z10, boolean z11) {
        jc.l.e(bVar, "captureStatus");
        jc.l.e(iVar, "constructor");
        jc.l.e(h0Var, "attributes");
        this.f20729b = bVar;
        this.f20730c = iVar;
        this.f20731d = w0Var;
        this.f20732e = h0Var;
        this.f20733f = z10;
        this.f20734g = z11;
    }

    @Override // se.a0
    /* JADX INFO: renamed from: D */
    public final a0 z(boolean z10) {
        return new h(this.f20729b, this.f20730c, this.f20731d, this.f20732e, z10, 32);
    }

    @Override // se.a0
    /* JADX INFO: renamed from: F */
    public final a0 C(h0 h0Var) {
        jc.l.e(h0Var, "newAttributes");
        return new h(this.f20729b, this.f20730c, this.f20731d, h0Var, this.f20733f, this.f20734g);
    }

    @Override // se.w
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final h v(f fVar) {
        jc.l.e(fVar, "kotlinTypeRefiner");
        i iVar = this.f20730c;
        iVar.getClass();
        n0 n0VarD = iVar.f20735a.d(fVar);
        bd.i iVar2 = iVar.f20736b != null ? new bd.i(18, iVar, fVar, false) : null;
        i iVar3 = iVar.f20737c;
        if (iVar3 == null) {
            iVar3 = iVar;
        }
        i iVar4 = new i(n0VarD, iVar2, iVar3, iVar.f20738d);
        w0 w0Var = this.f20731d;
        return new h(this.f20729b, iVar4, w0Var != null ? w0Var : null, this.f20732e, this.f20733f, 32);
    }

    @Override // se.w
    public final le.o n0() {
        return ue.l.a(ue.h.f21621b, true, new String[0]);
    }

    @Override // se.w
    public final List q() {
        return vb.r.f22819a;
    }

    @Override // se.w
    public final h0 r() {
        return this.f20732e;
    }

    @Override // se.w
    public final k0 t() {
        return this.f20730c;
    }

    @Override // se.w
    public final boolean u() {
        return this.f20733f;
    }

    @Override // se.a0, se.w0
    public final w0 z(boolean z10) {
        return new h(this.f20729b, this.f20730c, this.f20731d, this.f20732e, z10, 32);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public h(ve.b bVar, i iVar, w0 w0Var, h0 h0Var, boolean z10, int i10) {
        if ((i10 & 8) != 0) {
            h0.f19950b.getClass();
            h0Var = h0.f19951c;
        }
        this(bVar, iVar, w0Var, h0Var, (i10 & 16) != 0 ? false : z10, false);
    }
}
