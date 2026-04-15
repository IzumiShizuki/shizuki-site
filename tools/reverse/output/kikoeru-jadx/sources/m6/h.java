package m6;

import java.util.ArrayList;
import java.util.Arrays;
import m0.w;
import m4.n0;
import m4.o0;
import m4.p;
import m4.q;
import p4.s;
import ya.i0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h extends i {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final byte[] f14796o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final byte[] f14797p = {79, 112, 117, 115, 84, 97, 103, 115};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f14798n;

    public static boolean e(s sVar, byte[] bArr) {
        if (sVar.a() < bArr.length) {
            return false;
        }
        int i10 = sVar.f16612b;
        byte[] bArr2 = new byte[bArr.length];
        sVar.e(bArr2, 0, bArr.length);
        sVar.G(i10);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // m6.i
    public final long b(s sVar) {
        byte[] bArr = sVar.f16611a;
        return (((long) this.f14807i) * r5.b.j(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0)) / 1000000;
    }

    @Override // m6.i
    public final boolean c(s sVar, long j10, w wVar) {
        if (e(sVar, f14796o)) {
            byte[] bArrCopyOf = Arrays.copyOf(sVar.f16611a, sVar.f16613c);
            int i10 = bArrCopyOf[9] & 255;
            ArrayList arrayListA = r5.b.a(bArrCopyOf);
            if (((q) wVar.f13782b) == null) {
                p pVar = new p();
                pVar.f14487l = o0.p("audio/ogg");
                pVar.f14488m = o0.p("audio/opus");
                pVar.C = i10;
                pVar.D = 48000;
                pVar.f14491p = arrayListA;
                wVar.f13782b = new q(pVar);
                return true;
            }
        } else {
            if (!e(sVar, f14797p)) {
                p4.c.j((q) wVar.f13782b);
                return false;
            }
            p4.c.j((q) wVar.f13782b);
            if (!this.f14798n) {
                this.f14798n = true;
                sVar.H(8);
                n0 n0VarQ = r5.b.q(i0.r(r5.b.u(sVar, false, false).f2503a));
                if (n0VarQ != null) {
                    p pVarA = ((q) wVar.f13782b).a();
                    pVarA.f14486k = n0VarQ.b(((q) wVar.f13782b).f14542l);
                    wVar.f13782b = new q(pVarA);
                    return true;
                }
            }
        }
        return true;
    }

    @Override // m6.i
    public final void d(boolean z10) {
        super.d(z10);
        if (z10) {
            this.f14798n = false;
        }
    }
}
