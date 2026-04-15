package m6;

import j5.x0;
import java.util.Arrays;
import m0.w;
import m4.o0;
import m4.p;
import m4.q;
import p4.s;
import r5.t;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c extends i {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public t f14779n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public x0 f14780o;

    @Override // m6.i
    public final long b(s sVar) {
        byte[] bArr = sVar.f16611a;
        if (bArr[0] != -1) {
            return -1L;
        }
        int i10 = (bArr[2] & 255) >> 4;
        if (i10 == 6 || i10 == 7) {
            sVar.H(4);
            sVar.B();
        }
        int iS = r5.b.s(i10, sVar);
        sVar.G(0);
        return iS;
    }

    @Override // m6.i
    public final boolean c(s sVar, long j10, w wVar) {
        byte[] bArr = sVar.f16611a;
        t tVar = this.f14779n;
        if (tVar == null) {
            t tVar2 = new t(bArr, 17);
            this.f14779n = tVar2;
            p pVarA = tVar2.c(Arrays.copyOfRange(bArr, 9, sVar.f16613c), null).a();
            pVarA.f14487l = o0.p("audio/ogg");
            wVar.f13782b = new q(pVarA);
            return true;
        }
        byte b10 = bArr[0];
        if ((b10 & 127) != 3) {
            if (b10 != -1) {
                return true;
            }
            x0 x0Var = this.f14780o;
            if (x0Var != null) {
                x0Var.f10474a = j10;
                wVar.f13783c = x0Var;
            }
            ((q) wVar.f13782b).getClass();
            return false;
        }
        w wVarT = r5.b.t(sVar);
        t tVar3 = new t(tVar.f18864a, tVar.f18865b, tVar.f18866c, tVar.f18867d, tVar.f18868e, tVar.f18870g, tVar.f18871h, tVar.f18873j, wVarT, tVar.f18875l);
        this.f14779n = tVar3;
        x0 x0Var2 = new x0();
        x0Var2.f10476c = tVar3;
        x0Var2.f10477d = wVarT;
        x0Var2.f10474a = -1L;
        x0Var2.f10475b = -1L;
        this.f14780o = x0Var2;
        return true;
    }

    @Override // m6.i
    public final void d(boolean z10) {
        super.d(z10);
        if (z10) {
            this.f14779n = null;
            this.f14780o = null;
        }
    }
}
