package l6;

import com.tencent.bugly.beta.tinker.TinkerReport;
import m4.o0;
import p4.c0;
import r5.h0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f11750a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public t f11753d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public f f11754e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f11755f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f11756g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f11757h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f11758i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f11759j;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f11762m;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f11751b = new s();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p4.s f11752c = new p4.s();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p4.s f11760k = new p4.s(1);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p4.s f11761l = new p4.s();

    public i(h0 h0Var, t tVar, f fVar, String str) {
        this.f11750a = h0Var;
        this.f11753d = tVar;
        this.f11754e = fVar;
        this.f11759j = str;
        e(tVar, fVar);
    }

    public final int a() {
        int i10 = !this.f11762m ? this.f11753d.f11871g[this.f11755f] : this.f11751b.f11857j[this.f11755f] ? 1 : 0;
        return b() != null ? i10 | 1073741824 : i10;
    }

    public final r b() {
        if (!this.f11762m) {
            return null;
        }
        s sVar = this.f11751b;
        f fVar = sVar.f11848a;
        int i10 = c0.f16548a;
        int i11 = fVar.f11742a;
        r rVar = sVar.f11860m;
        if (rVar == null) {
            rVar = this.f11753d.f11865a.f11842l[i11];
        }
        if (rVar == null || !rVar.f11843a) {
            return null;
        }
        return rVar;
    }

    public final boolean c() {
        this.f11755f++;
        if (!this.f11762m) {
            return false;
        }
        int i10 = this.f11756g + 1;
        this.f11756g = i10;
        int[] iArr = this.f11751b.f11854g;
        int i11 = this.f11757h;
        if (i10 != iArr[i11]) {
            return true;
        }
        this.f11757h = i11 + 1;
        this.f11756g = 0;
        return false;
    }

    public final int d(int i10, int i11) {
        p4.s sVar;
        r rVarB = b();
        if (rVarB == null) {
            return 0;
        }
        int length = rVarB.f11846d;
        s sVar2 = this.f11751b;
        if (length != 0) {
            sVar = sVar2.f11861n;
        } else {
            byte[] bArr = rVarB.f11847e;
            int i12 = c0.f16548a;
            int length2 = bArr.length;
            p4.s sVar3 = this.f11761l;
            sVar3.E(bArr, length2);
            length = bArr.length;
            sVar = sVar3;
        }
        boolean z10 = sVar2.f11858k && sVar2.f11859l[this.f11755f];
        boolean z11 = z10 || i11 != 0;
        p4.s sVar4 = this.f11760k;
        sVar4.f16611a[0] = (byte) ((z11 ? 128 : 0) | length);
        sVar4.G(0);
        h0 h0Var = this.f11750a;
        h0Var.f(sVar4, 1, 1);
        h0Var.f(sVar, length, 1);
        if (!z11) {
            return length + 1;
        }
        p4.s sVar5 = this.f11752c;
        if (!z10) {
            sVar5.D(8);
            byte[] bArr2 = sVar5.f16611a;
            bArr2[0] = 0;
            bArr2[1] = 1;
            bArr2[2] = (byte) 0;
            bArr2[3] = (byte) (i11 & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK);
            bArr2[4] = (byte) ((i10 >> 24) & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK);
            bArr2[5] = (byte) ((i10 >> 16) & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK);
            bArr2[6] = (byte) ((i10 >> 8) & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK);
            bArr2[7] = (byte) (i10 & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK);
            h0Var.f(sVar5, 8, 1);
            return length + 9;
        }
        p4.s sVar6 = sVar2.f11861n;
        int iA = sVar6.A();
        sVar6.H(-2);
        int i13 = (iA * 6) + 2;
        if (i11 != 0) {
            sVar5.D(i13);
            byte[] bArr3 = sVar5.f16611a;
            sVar6.e(bArr3, 0, i13);
            int i14 = (((bArr3[2] & 255) << 8) | (bArr3[3] & 255)) + i11;
            bArr3[2] = (byte) ((i14 >> 8) & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK);
            bArr3[3] = (byte) (i14 & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK);
        } else {
            sVar5 = sVar6;
        }
        h0Var.f(sVar5, i13, 1);
        return length + 1 + i13;
    }

    public final void e(t tVar, f fVar) {
        this.f11753d = tVar;
        this.f11754e = fVar;
        m4.p pVarA = tVar.f11865a.f11837g.a();
        pVarA.f14487l = o0.p(this.f11759j);
        this.f11750a.b(new m4.q(pVarA));
        f();
    }

    public final void f() {
        s sVar = this.f11751b;
        sVar.f11851d = 0;
        sVar.f11863p = 0L;
        sVar.f11864q = false;
        sVar.f11858k = false;
        sVar.f11862o = false;
        sVar.f11860m = null;
        this.f11755f = 0;
        this.f11757h = 0;
        this.f11756g = 0;
        this.f11758i = 0;
        this.f11762m = false;
    }
}
