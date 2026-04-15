package y6;

import java.util.Collections;
import java.util.List;
import m4.o0;
import m7.k0;
import r5.h0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f25653b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f25654c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f25655d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f25656e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f25657f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f25658g;

    public g(List list) {
        this.f25652a = 0;
        this.f25657f = list;
        this.f25658g = new h0[list.size()];
        this.f25654c = -9223372036854775807L;
    }

    @Override // y6.h
    public final void a() {
        switch (this.f25652a) {
            case 0:
                this.f25653b = false;
                this.f25654c = -9223372036854775807L;
                break;
            default:
                this.f25653b = false;
                this.f25654c = -9223372036854775807L;
                break;
        }
    }

    @Override // y6.h
    public final void b(p4.s sVar) {
        boolean z10;
        boolean z11;
        switch (this.f25652a) {
            case 0:
                if (this.f25653b) {
                    if (this.f25655d == 2) {
                        if (sVar.a() == 0) {
                            z11 = false;
                        } else {
                            if (sVar.u() != 32) {
                                this.f25653b = false;
                            }
                            this.f25655d--;
                            z11 = this.f25653b;
                        }
                        if (!z11) {
                        }
                    }
                    if (this.f25655d == 1) {
                        if (sVar.a() == 0) {
                            z10 = false;
                        } else {
                            if (sVar.u() != 0) {
                                this.f25653b = false;
                            }
                            this.f25655d--;
                            z10 = this.f25653b;
                        }
                        if (!z10) {
                        }
                    }
                    int i10 = sVar.f16612b;
                    int iA = sVar.a();
                    for (h0 h0Var : (h0[]) this.f25658g) {
                        sVar.G(i10);
                        h0Var.e(iA, sVar);
                    }
                    this.f25656e += iA;
                }
                break;
            default:
                p4.s sVar2 = (p4.s) this.f25657f;
                p4.c.j((h0) this.f25658g);
                if (this.f25653b) {
                    int iA2 = sVar.a();
                    int i11 = this.f25656e;
                    if (i11 < 10) {
                        int iMin = Math.min(iA2, 10 - i11);
                        System.arraycopy(sVar.f16611a, sVar.f16612b, sVar2.f16611a, this.f25656e, iMin);
                        if (this.f25656e + iMin == 10) {
                            sVar2.G(0);
                            if (73 == sVar2.u() && 68 == sVar2.u() && 51 == sVar2.u()) {
                                sVar2.H(3);
                                this.f25655d = sVar2.t() + 10;
                            } else {
                                p4.c.B("Id3Reader", "Discarding invalid ID3 tag");
                                this.f25653b = false;
                            }
                        }
                    }
                    int iMin2 = Math.min(iA2, this.f25655d - this.f25656e);
                    ((h0) this.f25658g).e(iMin2, sVar);
                    this.f25656e += iMin2;
                    break;
                }
                break;
        }
    }

    @Override // y6.h
    public final void c(r5.q qVar, k0 k0Var) {
        switch (this.f25652a) {
            case 0:
                h0[] h0VarArr = (h0[]) this.f25658g;
                for (int i10 = 0; i10 < h0VarArr.length; i10++) {
                    e0 e0Var = (e0) ((List) this.f25657f).get(i10);
                    k0Var.b();
                    k0Var.d();
                    h0 h0VarU = qVar.u(k0Var.f14908c, 3);
                    m4.p pVar = new m4.p();
                    k0Var.d();
                    pVar.f14476a = (String) k0Var.f14910e;
                    pVar.f14487l = o0.p("video/mp2t");
                    pVar.f14488m = o0.p("application/dvbsubs");
                    pVar.f14491p = Collections.singletonList(e0Var.f25634b);
                    pVar.f14479d = e0Var.f25633a;
                    a0.c.O(pVar, h0VarU);
                    h0VarArr[i10] = h0VarU;
                }
                break;
            default:
                k0Var.b();
                k0Var.d();
                h0 h0VarU2 = qVar.u(k0Var.f14908c, 5);
                this.f25658g = h0VarU2;
                m4.p pVar2 = new m4.p();
                k0Var.d();
                pVar2.f14476a = (String) k0Var.f14910e;
                pVar2.f14487l = o0.p("video/mp2t");
                pVar2.f14488m = o0.p("application/id3");
                a0.c.O(pVar2, h0VarU2);
                break;
        }
    }

    @Override // y6.h
    public final void d(boolean z10) {
        int i10;
        switch (this.f25652a) {
            case 0:
                if (this.f25653b) {
                    p4.c.i(this.f25654c != -9223372036854775807L);
                    for (h0 h0Var : (h0[]) this.f25658g) {
                        h0Var.a(this.f25654c, 1, this.f25656e, 0, null);
                    }
                    this.f25653b = false;
                }
                break;
            default:
                p4.c.j((h0) this.f25658g);
                if (this.f25653b && (i10 = this.f25655d) != 0 && this.f25656e == i10) {
                    p4.c.i(this.f25654c != -9223372036854775807L);
                    ((h0) this.f25658g).a(this.f25654c, 1, this.f25655d, 0, null);
                    this.f25653b = false;
                    break;
                }
                break;
        }
    }

    @Override // y6.h
    public final void e(int i10, long j10) {
        switch (this.f25652a) {
            case 0:
                if ((i10 & 4) != 0) {
                    this.f25653b = true;
                    this.f25654c = j10;
                    this.f25656e = 0;
                    this.f25655d = 2;
                    break;
                }
                break;
            default:
                if ((i10 & 4) != 0) {
                    this.f25653b = true;
                    this.f25654c = j10;
                    this.f25655d = 0;
                    this.f25656e = 0;
                    break;
                }
                break;
        }
    }

    public g() {
        this.f25652a = 1;
        this.f25657f = new p4.s(10);
        this.f25654c = -9223372036854775807L;
    }
}
