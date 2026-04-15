package d;

import android.os.Build;
import android.view.View;
import android.view.contentcapture.ContentCaptureSession;
import com.tencent.bugly.beta.tinker.TinkerReport;
import i2.d1;
import i7.o0;
import l0.s0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i0 extends jc.j implements ic.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f5213i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i0(int i10, Object obj, Class cls, String str, String str2, int i11, int i12, int i13) {
        super(i10, obj, cls, str, str2, i11, i12);
        this.f5213i = i13;
    }

    @Override // ic.a
    public final Object b() throws Exception {
        ContentCaptureSession contentCaptureSessionA;
        d1 d1Var;
        switch (this.f5213i) {
            case 0:
                ((j0) this.f10819b).e();
                return ub.a0.f21526a;
            case 1:
                ((j0) this.f10819b).e();
                return ub.a0.f21526a;
            case 2:
                ((o0) this.f10819b).f9238d.c1(Boolean.TRUE);
                return ub.a0.f21526a;
            case 3:
                ((o0) this.f10819b).f9238d.c1(Boolean.FALSE);
                return ub.a0.f21526a;
            case 4:
                ((o0) this.f10819b).f9238d.c1(Boolean.FALSE);
                return ub.a0.f21526a;
            case 5:
                View view = (View) this.f10819b;
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 30) {
                    m2.c.f(view);
                }
                if (i10 < 29 || (contentCaptureSessionA = m2.a.a(view)) == null) {
                    return null;
                }
                return new j0.l(contentCaptureSessionA, view);
            case 6:
                s0 s0Var = (s0) this.f10819b;
                s0Var.b();
                s0Var.i();
                return ub.a0.f21526a;
            case 7:
                ((s0) this.f10819b).k();
                return ub.a0.f21526a;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                n7.v vVar = (n7.v) this.f10819b;
                nf.d dVar = vVar.f15575a;
                if (dVar == null) {
                    jc.l.k("coroutineScope");
                    throw null;
                }
                hf.a0.h(dVar, null);
                vVar.f();
                n7.t tVar = vVar.f15579e;
                if (tVar != null) {
                    tVar.f15570f.close();
                    return ub.a0.f21526a;
                }
                jc.l.k("connectionManager");
                throw null;
            default:
                o1.g gVar = (o1.g) this.f10819b;
                o.l0 l0Var = gVar.f16090c;
                o.l0 l0Var2 = gVar.f16091d;
                o1.k kVar = gVar.f16088a;
                o1.v vVar2 = kVar.f16104h;
                o1.u uVar = o1.u.f16130d;
                if (vVar2 == null) {
                    Object[] objArr = l0Var2.f16003b;
                    long[] jArr = l0Var2.f16002a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i11 = 0;
                        while (true) {
                            long j10 = jArr[i11];
                            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i12 = 8 - ((~(i11 - length)) >>> 31);
                                for (int i13 = 0; i13 < i12; i13++) {
                                    if ((j10 & 255) < 128) {
                                        ((o1.e) objArr[(i11 << 3) + i13]).o(uVar);
                                    }
                                    j10 >>= 8;
                                }
                                if (i12 == 8) {
                                }
                            }
                            if (i11 != length) {
                                i11++;
                            }
                        }
                    }
                } else if (vVar2.f9703n) {
                    if (l0Var.c(vVar2)) {
                        vVar2.E0();
                    }
                    o1.u uVarD0 = vVar2.D0();
                    if (!vVar2.f9690a.f9703n) {
                        f2.a.b("visitAncestors called on an unattached node");
                    }
                    j1.p pVar = vVar2.f9690a;
                    i2.j0 j0VarY = i2.f.y(vVar2);
                    int i14 = 0;
                    while (j0VarY != null) {
                        if ((j0VarY.F.f8667f.f9693d & 5120) != 0) {
                            while (pVar != null) {
                                int i15 = pVar.f9692c;
                                if ((i15 & 5120) != 0) {
                                    if ((i15 & 1024) != 0) {
                                        i14++;
                                    }
                                    if ((pVar instanceof o1.e) && l0Var2.c(pVar)) {
                                        if (i14 <= 1) {
                                            ((o1.e) pVar).o(uVarD0);
                                        } else {
                                            ((o1.e) pVar).o(o1.u.f16128b);
                                        }
                                        l0Var2.l(pVar);
                                    }
                                }
                                pVar = pVar.f9694e;
                            }
                        }
                        j0VarY = j0VarY.v();
                        pVar = (j0VarY == null || (d1Var = j0VarY.F) == null) ? null : d1Var.f8666e;
                    }
                    Object[] objArr2 = l0Var2.f16003b;
                    long[] jArr2 = l0Var2.f16002a;
                    int length2 = jArr2.length - 2;
                    if (length2 >= 0) {
                        int i16 = 0;
                        while (true) {
                            long j11 = jArr2[i16];
                            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i17 = 8 - ((~(i16 - length2)) >>> 31);
                                for (int i18 = 0; i18 < i17; i18++) {
                                    if ((j11 & 255) < 128) {
                                        ((o1.e) objArr2[(i16 << 3) + i18]).o(uVar);
                                    }
                                    j11 >>= 8;
                                }
                                if (i17 == 8) {
                                }
                            }
                            if (i16 != length2) {
                                i16++;
                            }
                        }
                    }
                }
                if (kVar.f16104h == null || kVar.f16099c.D0() == uVar) {
                    kVar.c();
                }
                l0Var.b();
                l0Var2.b();
                gVar.f16092e = false;
                return ub.a0.f21526a;
        }
    }
}
