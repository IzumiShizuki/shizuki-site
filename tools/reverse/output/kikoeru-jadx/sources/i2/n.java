package i2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class n extends j1.p {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f8788o = h1.e(this);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public j1.p f8789p;

    @Override // j1.p
    public final void A0(g1 g1Var) {
        this.f9697h = g1Var;
        for (j1.p pVar = this.f8789p; pVar != null; pVar = pVar.f9695f) {
            pVar.A0(g1Var);
        }
    }

    public final m B0(m mVar) {
        j1.p pVar = ((j1.p) mVar).f9690a;
        if (pVar != mVar) {
            j1.p pVar2 = mVar instanceof j1.p ? (j1.p) mVar : null;
            j1.p pVar3 = pVar2 != null ? pVar2.f9694e : null;
            if (pVar != this.f9690a || !jc.l.a(pVar3, this)) {
                throw new IllegalStateException("Cannot delegate to an already delegated node");
            }
        } else {
            if (pVar.f9703n) {
                f2.a.b("Cannot delegate to an already attached node");
            }
            pVar.z0(this.f9690a);
            int i10 = this.f9692c;
            int iF = h1.f(pVar);
            pVar.f9692c = iF;
            int i11 = this.f9692c;
            int i12 = iF & 2;
            if (i12 != 0 && (i11 & 2) != 0 && !(this instanceof z)) {
                f2.a.b("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + pVar);
            }
            pVar.f9695f = this.f8789p;
            this.f8789p = pVar;
            pVar.f9694e = this;
            D0(iF | this.f9692c, false);
            if (this.f9703n) {
                if (i12 == 0 || (i10 & 2) != 0) {
                    A0(this.f9697h);
                } else {
                    d1 d1Var = f.y(this).F;
                    this.f9690a.A0(null);
                    d1Var.g();
                }
                pVar.p0();
                pVar.x0();
                if (!pVar.f9703n) {
                    f2.a.b("autoInvalidateInsertedNode called on unattached node");
                }
                h1.a(pVar, -1, 1);
            }
        }
        return mVar;
    }

    public final void C0(m mVar) {
        j1.p pVar = null;
        for (j1.p pVar2 = this.f8789p; pVar2 != null; pVar2 = pVar2.f9695f) {
            if (pVar2 == mVar) {
                boolean z10 = pVar2.f9703n;
                if (z10) {
                    o.f0 f0Var = h1.f8724a;
                    if (!z10) {
                        f2.a.b("autoInvalidateRemovedNode called on unattached node");
                    }
                    h1.a(pVar2, -1, 2);
                    pVar2.y0();
                    pVar2.q0();
                }
                pVar2.z0(pVar2);
                pVar2.f9693d = 0;
                if (pVar == null) {
                    this.f8789p = pVar2.f9695f;
                } else {
                    pVar.f9695f = pVar2.f9695f;
                }
                pVar2.f9695f = null;
                pVar2.f9694e = null;
                int i10 = this.f9692c;
                int iF = h1.f(this);
                D0(iF, true);
                if (this.f9703n && (i10 & 2) != 0 && (iF & 2) == 0) {
                    d1 d1Var = f.y(this).F;
                    this.f9690a.A0(null);
                    d1Var.g();
                    return;
                }
                return;
            }
            pVar = pVar2;
        }
        throw new IllegalStateException(("Could not find delegate: " + mVar).toString());
    }

    public final void D0(int i10, boolean z10) {
        j1.p pVar;
        int i11 = this.f9692c;
        this.f9692c = i10;
        if (i11 != i10) {
            j1.p pVar2 = this.f9690a;
            if (pVar2 == this) {
                this.f9693d = i10;
            }
            if (this.f9703n) {
                j1.p pVar3 = this;
                while (pVar3 != null) {
                    i10 |= pVar3.f9692c;
                    pVar3.f9692c = i10;
                    if (pVar3 == pVar2) {
                        break;
                    } else {
                        pVar3 = pVar3.f9694e;
                    }
                }
                if (z10 && pVar3 == pVar2) {
                    i10 = h1.f(pVar2);
                    pVar2.f9692c = i10;
                }
                int i12 = i10 | ((pVar3 == null || (pVar = pVar3.f9695f) == null) ? 0 : pVar.f9693d);
                while (pVar3 != null) {
                    i12 |= pVar3.f9692c;
                    pVar3.f9693d = i12;
                    pVar3 = pVar3.f9694e;
                }
            }
        }
    }

    @Override // j1.p
    public final void p0() {
        super.p0();
        for (j1.p pVar = this.f8789p; pVar != null; pVar = pVar.f9695f) {
            pVar.A0(this.f9697h);
            if (!pVar.f9703n) {
                pVar.p0();
            }
        }
    }

    @Override // j1.p
    public final void q0() {
        for (j1.p pVar = this.f8789p; pVar != null; pVar = pVar.f9695f) {
            pVar.q0();
        }
        super.q0();
    }

    @Override // j1.p
    public final void w0() {
        super.w0();
        for (j1.p pVar = this.f8789p; pVar != null; pVar = pVar.f9695f) {
            pVar.w0();
        }
    }

    @Override // j1.p
    public final void x0() {
        for (j1.p pVar = this.f8789p; pVar != null; pVar = pVar.f9695f) {
            pVar.x0();
        }
        super.x0();
    }

    @Override // j1.p
    public final void y0() {
        super.y0();
        for (j1.p pVar = this.f8789p; pVar != null; pVar = pVar.f9695f) {
            pVar.y0();
        }
    }

    @Override // j1.p
    public final void z0(j1.p pVar) {
        this.f9690a = pVar;
        for (j1.p pVar2 = this.f8789p; pVar2 != null; pVar2 = pVar2.f9695f) {
            pVar2.z0(pVar);
        }
    }
}
