package y6;

import m7.k0;
import r5.h0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p4.r f25556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p4.s f25557c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f25558d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f25559e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f25560f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f25561g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public h0 f25562h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f25563i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f25564j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f25565k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f25566l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public m4.q f25567m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f25568n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f25569o;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(String str) {
        this(null, 0, 0, str);
        this.f25555a = 0;
    }

    @Override // y6.h
    public final void a() {
        switch (this.f25555a) {
            case 0:
                this.f25563i = 0;
                this.f25564j = 0;
                this.f25565k = false;
                this.f25569o = -9223372036854775807L;
                break;
            default:
                this.f25563i = 0;
                this.f25564j = 0;
                this.f25565k = false;
                this.f25569o = -9223372036854775807L;
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:180:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x03bf A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:228:0x03c7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:232:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x03ee  */
    @Override // y6.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(p4.s r23) {
        /*
            Method dump skipped, instruction units count: 1278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y6.b.b(p4.s):void");
    }

    @Override // y6.h
    public final void c(r5.q qVar, k0 k0Var) {
        switch (this.f25555a) {
            case 0:
                k0Var.b();
                k0Var.d();
                this.f25561g = (String) k0Var.f14910e;
                k0Var.d();
                this.f25562h = qVar.u(k0Var.f14908c, 1);
                break;
            default:
                k0Var.b();
                k0Var.d();
                this.f25561g = (String) k0Var.f14910e;
                k0Var.d();
                this.f25562h = qVar.u(k0Var.f14908c, 1);
                break;
        }
    }

    @Override // y6.h
    public final void d(boolean z10) {
        int i10 = this.f25555a;
    }

    @Override // y6.h
    public final void e(int i10, long j10) {
        switch (this.f25555a) {
            case 0:
                this.f25569o = j10;
                break;
            default:
                this.f25569o = j10;
                break;
        }
    }

    public b(String str, int i10, int i11, String str2) {
        this.f25555a = i11;
        switch (i11) {
            case 1:
                p4.r rVar = new p4.r(new byte[16], 16);
                this.f25556b = rVar;
                this.f25557c = new p4.s(rVar.f16606d);
                this.f25563i = 0;
                this.f25564j = 0;
                this.f25565k = false;
                this.f25569o = -9223372036854775807L;
                this.f25558d = str;
                this.f25559e = i10;
                this.f25560f = str2;
                break;
            default:
                p4.r rVar2 = new p4.r(new byte[128], 128);
                this.f25556b = rVar2;
                this.f25557c = new p4.s(rVar2.f16606d);
                this.f25563i = 0;
                this.f25569o = -9223372036854775807L;
                this.f25558d = str;
                this.f25559e = i10;
                this.f25560f = str2;
                break;
        }
    }

    private final void f(boolean z10) {
    }

    private final void g(boolean z10) {
    }
}
