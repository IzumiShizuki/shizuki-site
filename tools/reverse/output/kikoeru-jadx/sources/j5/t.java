package j5;

import android.net.Uri;
import com.tencent.bugly.beta.tinker.TinkerReport;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class t implements s4.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s4.h f10413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q0 f10415c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f10416d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f10417e;

    public t(s4.h hVar, int i10, q0 q0Var) {
        p4.c.c(i10 > 0);
        this.f10413a = hVar;
        this.f10414b = i10;
        this.f10415c = q0Var;
        this.f10416d = new byte[1];
        this.f10417e = i10;
    }

    @Override // s4.h
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override // s4.h
    public final long f(s4.m mVar) {
        throw new UnsupportedOperationException();
    }

    @Override // s4.h
    public final Map p() {
        return this.f10413a.p();
    }

    @Override // m4.i
    public final int read(byte[] bArr, int i10, int i11) {
        int i12 = this.f10417e;
        s4.h hVar = this.f10413a;
        if (i12 == 0) {
            byte[] bArr2 = this.f10416d;
            int i13 = 0;
            if (hVar.read(bArr2, 0, 1) != -1) {
                int i14 = (bArr2[0] & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK) << 4;
                if (i14 != 0) {
                    byte[] bArr3 = new byte[i14];
                    int i15 = i14;
                    while (i15 > 0) {
                        int i16 = hVar.read(bArr3, i13, i15);
                        if (i16 != -1) {
                            i13 += i16;
                            i15 -= i16;
                        }
                    }
                    while (i14 > 0 && bArr3[i14 - 1] == 0) {
                        i14--;
                    }
                    if (i14 > 0) {
                        p4.s sVar = new p4.s(bArr3, i14);
                        q0 q0Var = this.f10415c;
                        long jMax = !q0Var.f10405l ? q0Var.f10402i : Math.max(q0Var.f10406m.y(true), q0Var.f10402i);
                        int iA = sVar.a();
                        r5.h0 h0Var = q0Var.f10404k;
                        h0Var.getClass();
                        h0Var.e(iA, sVar);
                        h0Var.a(jMax, 1, iA, 0, null);
                        q0Var.f10405l = true;
                    }
                }
                this.f10417e = this.f10414b;
            }
            return -1;
        }
        int i17 = hVar.read(bArr, i10, Math.min(this.f10417e, i11));
        if (i17 != -1) {
            this.f10417e -= i17;
        }
        return i17;
    }

    @Override // s4.h
    public final void t(s4.f0 f0Var) {
        f0Var.getClass();
        this.f10413a.t(f0Var);
    }

    @Override // s4.h
    public final Uri w() {
        return this.f10413a.w();
    }
}
