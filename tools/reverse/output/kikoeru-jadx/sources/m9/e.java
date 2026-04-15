package m9;

import android.content.res.Configuration;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.x0;
import com.cnl.kikoeru.R;
import com.tencent.bugly.beta.tinker.TinkerReport;
import g2.v0;
import h0.t0;
import hf.y;
import j1.q;
import j2.h0;
import java.io.IOException;
import m0.a5;
import m0.b1;
import m0.c1;
import m0.d8;
import m0.k1;
import m0.s0;
import m0.x1;
import m0.y5;
import m0.z5;
import m0.z8;
import org.xmlpull.v1.XmlPullParserException;
import q1.n0;
import ub.a0;
import x0.j1;
import x0.o;
import x0.o2;
import x0.p1;
import x0.r0;
import x0.w0;
import x0.z;
import y.e1;
import y.i1;
import y.p;
import y.u;
import y.v;
import y2.f0;
import y2.g0;
import y2.s;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f1.f f14996a = new f1.f(new ka.h(24), -1607571430, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f1.f f14997b = new f1.f(new ka.h(25), -935416351, false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f1.f f14998c = new f1.f(new ka.h(26), 896965859, false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f1.f f14999d = new f1.f(new ka.h(27), 969444023, false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f1.f f15000e = new f1.f(new ka.h(28), -1726374215, false);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final f1.f f15001f = new f1.f(new ka.h(29), 414952864, false);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final f1.f f15002g = new f1.f(new d(0), -401094366, false);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final f1.f f15003h = new f1.f(new la.k(1), 1833687585, false);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final f1.f f15004i = new f1.f(new la.k(2), -301014433, false);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final f1.f f15005j = new f1.f(new la.k(3), -1929069699, false);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final f1.f f15006k = new f1.f(new la.k(4), -1511180997, false);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final f1.f f15007l = new f1.f(new d(1), 2119412791, false);

    public static final void a(w0 w0Var, ic.a aVar, o oVar, int i10) throws XmlPullParserException, IOException {
        int i11;
        oVar.Y(-1815499312);
        if ((i10 & 6) == 0) {
            i11 = (oVar.f(w0Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= oVar.h(aVar) ? 32 : 16;
        }
        if (oVar.N(i11 & 1, (i11 & 19) != 18)) {
            oVar.W(-1875810299);
            z zVar = AndroidCompositionLocals_androidKt.f720a;
            long jE = a2.c.e(((Configuration) oVar.j(zVar)).screenWidthDp, ((Configuration) oVar.j(zVar)).screenHeightDp);
            oVar.p(false);
            int iCompare = Float.compare(f3.h.b(jE), f3.h.a(jE));
            j1.n nVar = j1.n.f9689a;
            if (iCompare < 0) {
                oVar.W(983299694);
                q qVarC = androidx.compose.foundation.layout.c.c(nVar, 1.0f);
                v vVarA = u.a(y.k.f25158c, j1.c.f9674m, oVar, 0);
                int iQ = x0.v.q(oVar);
                j1 j1VarL = oVar.l();
                q qVarC2 = j1.a.c(qVarC, oVar);
                i2.k.f8771g0.getClass();
                i2.i iVar = i2.j.f8733b;
                oVar.a0();
                if (oVar.S) {
                    oVar.k(iVar);
                } else {
                    oVar.k0();
                }
                x0.v.A(i2.j.f8738g, vVarA, oVar);
                x0.v.A(i2.j.f8737f, j1VarL, oVar);
                i2.h hVar = i2.j.f8741j;
                if (oVar.S || !jc.l.a(oVar.K(), Integer.valueOf(iQ))) {
                    h0.s(iQ, oVar, iQ, hVar);
                }
                x0.v.A(i2.j.f8735d, qVarC2, oVar);
                b(null, oVar, 0, 1);
                y.d.d(androidx.compose.foundation.layout.c.d(nVar, 20), oVar);
                e(w0Var, aVar, oVar, i11 & 126);
                oVar.p(true);
                oVar.p(false);
            } else {
                oVar.W(983499272);
                FillElement fillElement = androidx.compose.foundation.layout.c.f556b;
                y.j1 j1VarA = i1.a(y.k.f25156a, j1.c.f9671j, oVar, 0);
                int iQ2 = x0.v.q(oVar);
                j1 j1VarL2 = oVar.l();
                q qVarC3 = j1.a.c(fillElement, oVar);
                i2.k.f8771g0.getClass();
                i2.i iVar2 = i2.j.f8733b;
                oVar.a0();
                if (oVar.S) {
                    oVar.k(iVar2);
                } else {
                    oVar.k0();
                }
                x0.v.A(i2.j.f8738g, j1VarA, oVar);
                x0.v.A(i2.j.f8737f, j1VarL2, oVar);
                i2.h hVar2 = i2.j.f8741j;
                if (oVar.S || !jc.l.a(oVar.K(), Integer.valueOf(iQ2))) {
                    h0.s(iQ2, oVar, iQ2, hVar2);
                }
                x0.v.A(i2.j.f8735d, qVarC3, oVar);
                b(androidx.compose.foundation.layout.c.n(nVar, f3.h.b(jE) / 2), oVar, 0, 0);
                e(w0Var, aVar, oVar, i11 & 126);
                oVar.p(true);
                oVar.p(false);
            }
        } else {
            oVar.Q();
        }
        p1 p1VarR = oVar.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new f(w0Var, aVar, i10, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:170:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x050d  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0527  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x052a  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0530  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0223  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:96:0x025a
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:226)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:196)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:63)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(j1.q r54, x0.o r55, int r56, int r57) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 2096
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m9.e.b(j1.q, x0.o, int, int):void");
    }

    public static final void c(ic.a aVar, o oVar, int i10) throws XmlPullParserException, IOException {
        o oVar2;
        boolean z10;
        o oVar3 = oVar;
        jc.l.e(aVar, "callback");
        oVar3.Y(1749515277);
        int i11 = i10 | (oVar3.h(aVar) ? 4 : 2);
        if (oVar3.N(i11 & 1, (i11 & 3) != 2)) {
            x0 x0VarA = j4.a.a(oVar3);
            if (x0VarA == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            c cVar = (c) g8.a.w(x0VarA, jc.z.f10839a.b(c.class), null, x0VarA instanceof androidx.lifecycle.k ? ((androidx.lifecycle.k) x0VarA).c() : i4.a.f9001b);
            Object objK = oVar3.K();
            r0 r0Var = x0.k.f24334a;
            if (objK == r0Var) {
                objK = x0.v.m(oVar3);
                oVar3.h0(objK);
            }
            y yVar = (y) objK;
            jc.y yVar2 = new jc.y();
            Object objK2 = oVar3.K();
            if (objK2 == r0Var) {
                objK2 = x0.v.v(Boolean.FALSE);
                oVar3.h0(objK2);
            }
            w0 w0Var = (w0) objK2;
            yVar2.f10838a = w0Var;
            if (((Boolean) w0Var.getValue()).booleanValue()) {
                oVar3.W(381732334);
                Object objK3 = oVar3.K();
                if (objK3 == r0Var) {
                    objK3 = new i9.f(10);
                    oVar3.h0(objK3);
                }
                z10 = false;
                a2.c.c((ic.a) objK3, f14996a, null, null, null, null, 0L, 0L, null, oVar3, 54, 508);
                oVar2 = oVar3;
            } else {
                oVar2 = oVar3;
                z10 = false;
                oVar2.W(377783957);
            }
            oVar2.p(z10);
            j1.h hVar = j1.c.f9666e;
            FillElement fillElement = androidx.compose.foundation.layout.c.f557c;
            o2 o2Var = c1.f12773a;
            q qVarJ = androidx.compose.foundation.layout.a.j(androidx.compose.foundation.a.b(fillElement, ((b1) oVar2.j(o2Var)).a(), q1.h0.f17515a), 32);
            v0 v0VarD = p.d(hVar, z10);
            int iQ = x0.v.q(oVar2);
            j1 j1VarL = oVar2.l();
            q qVarC = j1.a.c(qVarJ, oVar2);
            i2.k.f8771g0.getClass();
            i2.i iVar = i2.j.f8733b;
            oVar2.a0();
            if (oVar2.S) {
                oVar2.k(iVar);
            } else {
                oVar2.k0();
            }
            x0.v.A(i2.j.f8738g, v0VarD, oVar2);
            x0.v.A(i2.j.f8737f, j1VarL, oVar2);
            i2.h hVar2 = i2.j.f8741j;
            if (oVar2.S || !jc.l.a(oVar2.K(), Integer.valueOf(iQ))) {
                h0.s(iQ, oVar2, iQ, hVar2);
            }
            x0.v.A(i2.j.f8735d, qVarC, oVar2);
            a((w0) yVar2.f10838a, aVar, oVar2, (i11 << 3) & 112);
            z8.b(n7.e.E(R.string.guest_account, oVar2), androidx.compose.foundation.a.d(y.d.n(androidx.compose.foundation.layout.b.f554a.a(j1.n.f9689a, j1.c.f9668g)), null, new ba.e(yVar, yVar2, cVar, aVar, 1), 7), ((b1) oVar2.j(o2Var)).h(), 0L, null, null, 0L, e3.l.f6083c, null, 0L, 0, false, 0, 0, null, oVar, 100663296, 0, 130808);
            oVar3 = oVar;
            oVar3.p(true);
        } else {
            oVar3.Q();
        }
        p1 p1VarR = oVar3.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new ka.a(aVar, i10, 2);
        }
    }

    public static final void d(final String str, final String str2, final w0 w0Var, final ic.a aVar, o oVar, final int i10) {
        String str3;
        p1 p1VarR;
        ic.n nVar;
        jc.l.e(str, "username");
        jc.l.e(str2, "password");
        jc.l.e(w0Var, "isOpen");
        jc.l.e(aVar, "callback");
        oVar.Y(671270114);
        int i11 = i10 | (oVar.f(str) ? 4 : 2) | (oVar.f(str2) ? 32 : 16) | (oVar.h(aVar) ? 2048 : 1024);
        if (!oVar.N(i11 & 1, (i11 & 1171) != 1170)) {
            str3 = str;
            oVar.Q();
        } else {
            if (!((Boolean) w0Var.getValue()).booleanValue()) {
                p1VarR = oVar.r();
                if (p1VarR != null) {
                    final int i12 = 0;
                    nVar = new ic.n(str, str2, w0Var, aVar, i10, i12) { // from class: m9.n

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final /* synthetic */ int f15045a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ String f15046b;

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        public final /* synthetic */ String f15047c;

                        /* JADX INFO: renamed from: d, reason: collision with root package name */
                        public final /* synthetic */ w0 f15048d;

                        /* JADX INFO: renamed from: e, reason: collision with root package name */
                        public final /* synthetic */ ic.a f15049e;

                        {
                            this.f15045a = i12;
                        }

                        @Override // ic.n
                        public final Object q(Object obj, Object obj2) {
                            switch (this.f15045a) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int iD = x0.v.D(385);
                                    e.d(this.f15046b, this.f15047c, this.f15048d, this.f15049e, (o) obj, iD);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int iD2 = x0.v.D(385);
                                    e.d(this.f15046b, this.f15047c, this.f15048d, this.f15049e, (o) obj, iD2);
                                    break;
                            }
                            return a0.f21526a;
                        }
                    };
                    p1VarR.f24421d = nVar;
                }
                return;
            }
            str3 = str;
            Object objK = oVar.K();
            if (objK == x0.k.f24334a) {
                objK = new aa.f(w0Var, 28);
                oVar.h0(objK);
            }
            a2.c.b((ic.a) objK, f1.g.f(-654903910, new ba.h(w0Var, aVar, 3), oVar), null, f1.g.f(-237015208, new aa.g(w0Var, 8), oVar), f15007l, f1.g.f(180873494, new ea.d(str3, str2), oVar), null, 0L, 0L, null, oVar, 224304, 964);
        }
        p1VarR = oVar.r();
        if (p1VarR != null) {
            final int i13 = 1;
            final String str4 = str3;
            nVar = new ic.n(str4, str2, w0Var, aVar, i10, i13) { // from class: m9.n

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f15045a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ String f15046b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ String f15047c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ w0 f15048d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ ic.a f15049e;

                {
                    this.f15045a = i13;
                }

                @Override // ic.n
                public final Object q(Object obj, Object obj2) {
                    switch (this.f15045a) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int iD = x0.v.D(385);
                            e.d(this.f15046b, this.f15047c, this.f15048d, this.f15049e, (o) obj, iD);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int iD2 = x0.v.D(385);
                            e.d(this.f15046b, this.f15047c, this.f15048d, this.f15049e, (o) obj, iD2);
                            break;
                    }
                    return a0.f21526a;
                }
            };
            p1VarR.f24421d = nVar;
        }
    }

    public static final void e(w0 w0Var, ic.a aVar, o oVar, int i10) {
        int i11;
        o oVar2;
        int i12;
        int i13;
        w0 w0Var2;
        w0 w0Var3;
        String str;
        float f10;
        int i14;
        y yVar;
        c cVar;
        w0 w0Var4;
        w0 w0Var5;
        oVar.Y(600084295);
        if ((i10 & 6) == 0) {
            i11 = i10 | (oVar.f(w0Var) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= oVar.h(aVar) ? 32 : 16;
        }
        if (oVar.N(i11 & 1, (i11 & 19) != 18)) {
            x0 x0VarA = j4.a.a(oVar);
            if (x0VarA == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            c cVar2 = (c) g8.a.w(x0VarA, jc.z.f10839a.b(c.class), null, x0VarA instanceof androidx.lifecycle.k ? ((androidx.lifecycle.k) x0VarA).c() : i4.a.f9001b);
            Object objK = oVar.K();
            r0 r0Var = x0.k.f24334a;
            if (objK == r0Var) {
                objK = x0.v.m(oVar);
                oVar.h0(objK);
            }
            y yVar2 = (y) objK;
            Object objK2 = oVar.K();
            if (objK2 == r0Var) {
                objK2 = x0.v.v((String) cVar2.f14989b.getValue());
                oVar.h0(objK2);
            }
            w0 w0Var6 = (w0) objK2;
            Object objK3 = oVar.K();
            if (objK3 == r0Var) {
                objK3 = x0.v.v((String) cVar2.f14990c.c(c.f14988h[0]));
                oVar.h0(objK3);
            }
            w0 w0Var7 = (w0) objK3;
            Object objK4 = oVar.K();
            if (objK4 == r0Var) {
                objK4 = x0.v.v((String) cVar2.f14991d.c(c.f14988h[1]));
                oVar.h0(objK4);
            }
            w0 w0Var8 = (w0) objK4;
            Object objK5 = oVar.K();
            if (objK5 == r0Var) {
                objK5 = x0.v.v(Boolean.FALSE);
                oVar.h0(objK5);
            }
            w0 w0Var9 = (w0) objK5;
            Object objK6 = oVar.K();
            if (objK6 == r0Var) {
                objK6 = x0.v.v(Boolean.FALSE);
                oVar.h0(objK6);
            }
            w0 w0Var10 = (w0) objK6;
            boolean zH = oVar.h(cVar2);
            Object objK7 = oVar.K();
            if (zH || objK7 == r0Var) {
                objK7 = new j(w0Var6, cVar2, null);
                oVar.h0(objK7);
            }
            x0.v.e((ic.n) objK7, a0.f21526a, oVar);
            j1.n nVar = j1.n.f9689a;
            q qVarC = androidx.compose.foundation.layout.c.c(nVar, 1.0f);
            int i15 = i11;
            v vVarA = u.a(y.k.g(16), j1.c.f9675n, oVar, 54);
            int iQ = x0.v.q(oVar);
            j1 j1VarL = oVar.l();
            q qVarC2 = j1.a.c(qVarC, oVar);
            i2.k.f8771g0.getClass();
            i2.i iVar = i2.j.f8733b;
            oVar.a0();
            if (oVar.S) {
                oVar.k(iVar);
            } else {
                oVar.k0();
            }
            x0.v.A(i2.j.f8738g, vVarA, oVar);
            x0.v.A(i2.j.f8737f, j1VarL, oVar);
            i2.h hVar = i2.j.f8741j;
            if (oVar.S || !jc.l.a(oVar.K(), Integer.valueOf(iQ))) {
                h0.s(iQ, oVar, iQ, hVar);
            }
            x0.v.A(i2.j.f8735d, qVarC2, oVar);
            String str2 = (String) w0Var7.getValue();
            String str3 = (String) w0Var8.getValue();
            int i16 = i15 & 14;
            int i17 = i15 & 112;
            boolean zH2 = oVar.h(yVar2) | (i16 == 4) | oVar.h(cVar2) | (i17 == 32);
            Object objK8 = oVar.K();
            if (zH2 || objK8 == r0Var) {
                i13 = i17;
                w0Var2 = w0Var7;
                w0Var3 = w0Var8;
                str = str2;
                f10 = 1.0f;
                i14 = i16;
                h hVar2 = new h(yVar2, w0Var, cVar2, aVar, w0Var6, w0Var2, w0Var3);
                yVar = yVar2;
                cVar = cVar2;
                w0Var4 = w0Var6;
                oVar.h0(hVar2);
                objK8 = hVar2;
            } else {
                yVar = yVar2;
                cVar = cVar2;
                w0Var4 = w0Var6;
                i13 = i17;
                w0Var2 = w0Var7;
                w0Var3 = w0Var8;
                str = str2;
                f10 = 1.0f;
                i14 = i16;
            }
            d(str, str3, w0Var10, (ic.a) objK8, oVar, 384);
            Object objK9 = oVar.K();
            if (objK9 == r0Var) {
                objK9 = x0.v.v(Boolean.FALSE);
                oVar.h0(objK9);
            }
            w0 w0Var11 = (w0) objK9;
            boolean zBooleanValue = ((Boolean) w0Var11.getValue()).booleanValue();
            Object objK10 = oVar.K();
            if (objK10 == r0Var) {
                objK10 = new aa.d(w0Var11, 14);
                oVar.h0(objK10);
            }
            w0 w0Var12 = w0Var4;
            a2.c.f(zBooleanValue, (ic.k) objK10, null, f1.g.f(371835451, new la.d(cVar, w0Var4, yVar, w0Var11, 1), oVar), oVar, 3120);
            q qVarC3 = androidx.compose.foundation.layout.c.c(nVar, f10);
            String str4 = (String) w0Var2.getValue();
            d8 d8Var = d8.f12873a;
            long j10 = q1.q.f17574g;
            o2 o2Var = c1.f12773a;
            int i18 = i14;
            w0 w0Var13 = w0Var2;
            w0 w0Var14 = w0Var3;
            c cVar3 = cVar;
            y yVar3 = yVar;
            x1 x1VarF = d8.f(((b1) oVar.j(o2Var)).f(), ((b1) oVar.j(o2Var)).f(), j10, j10, j10, j10, oVar, 2096662);
            Object objK11 = oVar.K();
            if (objK11 == r0Var) {
                objK11 = new aa.d(w0Var13, 15);
                oVar.h0(objK11);
            }
            a5.a(str4, (ic.k) objK11, qVarC3, false, false, null, f14999d, null, f15000e, null, false, null, null, null, true, 0, 0, null, x1VarF, oVar, 102236592, 24576, 507576);
            q qVarC4 = androidx.compose.foundation.layout.c.c(nVar, 1.0f);
            String str5 = (String) w0Var14.getValue();
            t0 t0Var = new t0(7, TinkerReport.KEY_APPLIED_DEXOPT_FORMAT);
            g0 sVar = ((Boolean) w0Var9.getValue()).booleanValue() ? f0.f25407a : new s();
            int i19 = 7;
            x1 x1VarF2 = d8.f(((b1) oVar.j(o2Var)).f(), ((b1) oVar.j(o2Var)).f(), j10, j10, j10, j10, oVar, 2096662);
            Object objK12 = oVar.K();
            if (objK12 == r0Var) {
                w0Var5 = w0Var14;
                objK12 = new aa.d(w0Var5, 16);
                oVar.h0(objK12);
            } else {
                w0Var5 = w0Var14;
            }
            w0 w0Var15 = w0Var5;
            a5.a(str5, (ic.k) objK12, qVarC4, false, false, null, f15001f, null, f15002g, f1.g.f(-809117981, new aa.g(w0Var9, i19), oVar), false, sVar, t0Var, null, true, 0, 0, null, x1VarF2, oVar, 907542960, 24960, 500920);
            e1 e1Var = s0.f13582a;
            k1 k1VarA = s0.a(((b1) oVar.j(o2Var)).g(), 0L, 0L, 0L, oVar, 0, 14);
            q qVarC5 = androidx.compose.foundation.layout.c.c(nVar, 1.0f);
            boolean zH3 = oVar.h(yVar3) | (i18 == 4) | oVar.h(cVar3) | (i13 == 32);
            Object objK13 = oVar.K();
            if (zH3 || objK13 == r0Var) {
                h hVar3 = new h(yVar3, w0Var13, w0Var15, w0Var, cVar3, aVar, w0Var12);
                oVar.h0(hVar3);
                objK13 = hVar3;
            }
            android.support.v4.media.session.b.b((ic.a) objK13, qVarC5, false, null, null, null, k1VarA, null, f15003h, oVar, 805306416, 380);
            q qVarC6 = androidx.compose.foundation.layout.c.c(nVar, 1.0f);
            Object objK14 = oVar.K();
            if (objK14 == r0Var) {
                i12 = 0;
                objK14 = new i(w0Var10, w0Var13, w0Var15, 0);
                oVar.h0(objK14);
            } else {
                i12 = 0;
            }
            ic.a aVar2 = (ic.a) objK14;
            g0.f fVar = ((y5) oVar.j(z5.f13997a)).f13961a;
            s.o oVar3 = new s.o(s0.f13585d, new n0(q1.q.b(0.12f, ((b1) oVar.j(o2Var)).e())));
            long jI = ((b1) oVar.j(o2Var)).i();
            long jF = ((b1) oVar.j(o2Var)).f();
            long jE = ((b1) oVar.j(o2Var)).e();
            long j11 = ((q1.q) oVar.j(m0.j1.f13125a)).f17577a;
            if (((b1) oVar.j(o2Var)).j()) {
                q1.h0.r(j11);
            } else {
                q1.h0.r(j11);
            }
            android.support.v4.media.session.b.b(aVar2, qVarC6, true, null, fVar, oVar3, new k1(jI, jF, jI, q1.q.b(0.38f, jE)), s0.f13582a, f15004i, oVar, 805306422, 0);
            oVar2 = oVar;
            oVar2.p(true);
        } else {
            oVar2 = oVar;
            i12 = 0;
            oVar2.Q();
        }
        p1 p1VarR = oVar2.r();
        if (p1VarR != null) {
            p1VarR.f24421d = new f(w0Var, aVar, i10, i12);
        }
    }
}
