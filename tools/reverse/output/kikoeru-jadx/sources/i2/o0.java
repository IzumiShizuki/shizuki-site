package i2;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class o0 implements f3.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f8811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f8812b = 9223372034707292159L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f8813c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q0 f8814d;

    public o0(q0 q0Var) {
        this.f8814d = q0Var;
    }

    @Override // f3.c
    public final long E(float f10) {
        return a0.c.w(J(f10), this);
    }

    @Override // f3.c
    public final float I(int i10) {
        return i10 / a();
    }

    @Override // f3.c
    public final float J(float f10) {
        return f10 / a();
    }

    @Override // f3.c
    public final float M() {
        return this.f8814d.M();
    }

    @Override // f3.c
    public final float Q(float f10) {
        return a() * f10;
    }

    @Override // f3.c
    public final int U(long j10) {
        throw null;
    }

    @Override // f3.c
    public final float a() {
        return this.f8814d.a();
    }

    @Override // f3.c
    public final /* synthetic */ int a0(float f10) {
        return a0.c.q(f10, this);
    }

    public final void b(g2.v vVar, float f10) {
        q0 q0Var = this.f8814d;
        h7.i iVar = q0Var.f8826m;
        if (iVar == null) {
            iVar = new h7.i();
            q0Var.f8826m = iVar;
        }
        int iA0 = vb.l.A0(vVar, (g2.v[]) iVar.f8188b);
        if (iA0 >= 0) {
            float[] fArr = (float[]) iVar.f8189c;
            if (fArr[iA0] != f10) {
                fArr[iA0] = f10;
                ((byte[]) iVar.f8190d)[iA0] = 1;
                return;
            } else {
                byte[] bArr = (byte[]) iVar.f8190d;
                if (bArr[iA0] == 2) {
                    bArr[iA0] = 0;
                    return;
                }
                return;
            }
        }
        int i10 = iVar.f8187a;
        g2.v[] vVarArr = (g2.v[]) iVar.f8188b;
        if (i10 == vVarArr.length) {
            int i11 = i10 * 2;
            Object[] objArrCopyOf = Arrays.copyOf(vVarArr, i11);
            jc.l.d(objArrCopyOf, "copyOf(...)");
            iVar.f8188b = (g2.v[]) objArrCopyOf;
            float[] fArrCopyOf = Arrays.copyOf((float[]) iVar.f8189c, i11);
            jc.l.d(fArrCopyOf, "copyOf(...)");
            iVar.f8189c = fArrCopyOf;
            byte[] bArrCopyOf = Arrays.copyOf((byte[]) iVar.f8190d, i11);
            jc.l.d(bArrCopyOf, "copyOf(...)");
            iVar.f8190d = bArrCopyOf;
        }
        ((g2.v[]) iVar.f8188b)[i10] = vVar;
        ((byte[]) iVar.f8190d)[i10] = 3;
        ((float[]) iVar.f8189c)[i10] = f10;
        iVar.f8187a++;
    }

    @Override // f3.c
    public final /* synthetic */ long f0(long j10) {
        return a0.c.v(j10, this);
    }

    @Override // f3.c
    public final /* synthetic */ float i0(long j10) {
        return a0.c.u(j10, this);
    }

    @Override // f3.c
    public final /* synthetic */ long n(long j10) {
        return a0.c.t(j10, this);
    }

    @Override // f3.c
    public final /* synthetic */ float r(long j10) {
        return a0.c.s(j10, this);
    }
}
