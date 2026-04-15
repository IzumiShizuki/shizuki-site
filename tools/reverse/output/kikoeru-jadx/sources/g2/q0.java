package g2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class q0 extends f1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f7276c;

    public /* synthetic */ q0(int i10, Object obj) {
        this.f7275b = i10;
        this.f7276c = obj;
    }

    @Override // f3.c
    public final float M() {
        switch (this.f7275b) {
            case 0:
                return ((i2.q0) this.f7276c).M();
            default:
                return ((j2.v) this.f7276c).getDensity().M();
        }
    }

    @Override // f3.c
    public final float a() {
        switch (this.f7275b) {
            case 0:
                return ((i2.q0) this.f7276c).a();
            default:
                return ((j2.v) this.f7276c).getDensity().a();
        }
    }

    @Override // g2.f1
    public float c(v vVar) {
        float fIntBitsToFloat;
        int iA0;
        switch (this.f7275b) {
            case 0:
                ic.n nVar = vVar.f7291a;
                if (nVar != null) {
                    return ((Number) nVar.q(this, Float.valueOf(Float.NaN))).floatValue();
                }
                i2.q0 q0Var = (i2.q0) this.f7276c;
                if (q0Var.f8824k) {
                    return Float.NaN;
                }
                i2.q0 q0Var2 = q0Var;
                while (true) {
                    h7.i iVar = q0Var2.f8826m;
                    float f10 = (iVar == null || (iA0 = vb.l.A0(vVar, (v[]) iVar.f8188b)) < 0) ? Float.NaN : ((float[]) iVar.f8189c)[iA0];
                    if (!Float.isNaN(f10)) {
                        q0Var2.l0(q0Var.t0(), vVar);
                        c0 c0VarR0 = q0Var2.r0();
                        c0 c0VarR02 = q0Var.r0();
                        switch (vVar.f7292b) {
                            case 0:
                                fIntBitsToFloat = Float.intBitsToFloat((int) (c0VarR02.o(c0VarR0, (((long) Float.floatToRawIntBits(f10)) & 4294967295L) | (((long) Float.floatToRawIntBits(((int) (c0VarR0.k() >> 32)) / 2.0f)) << 32)) & 4294967295L));
                                break;
                            default:
                                fIntBitsToFloat = Float.intBitsToFloat((int) (c0VarR02.o(c0VarR0, (((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(((int) (c0VarR0.k() & 4294967295L)) / 2.0f)) & 4294967295L)) >> 32));
                                break;
                        }
                        return fIntBitsToFloat;
                    }
                    i2.q0 q0VarV0 = q0Var2.v0();
                    if (q0VarV0 == null) {
                        q0Var2.l0(q0Var.t0(), vVar);
                        return Float.NaN;
                    }
                    q0Var2 = q0VarV0;
                }
                break;
            default:
                return super.c(vVar);
        }
    }

    @Override // g2.f1
    public final c0 d() {
        switch (this.f7275b) {
            case 0:
                i2.q0 q0Var = (i2.q0) this.f7276c;
                c0 c0VarR0 = q0Var.f8824k ? null : q0Var.r0();
                if (c0VarR0 == null) {
                    q0Var.t0().G.b();
                }
                return c0VarR0;
            default:
                return ((j2.v) this.f7276c).getRoot().F.f8665d;
        }
    }

    @Override // g2.f1
    public final f3.m f() {
        switch (this.f7275b) {
            case 0:
                return ((i2.q0) this.f7276c).getLayoutDirection();
            default:
                return ((j2.v) this.f7276c).getLayoutDirection();
        }
    }

    @Override // g2.f1
    public final int g() {
        switch (this.f7275b) {
            case 0:
                return ((i2.q0) this.f7276c).W();
            default:
                return ((j2.v) this.f7276c).getRoot().G.f8805p.f7180a;
        }
    }
}
