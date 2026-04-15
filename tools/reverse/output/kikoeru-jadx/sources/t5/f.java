package t5;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import m4.o0;
import m4.p;
import p4.c0;
import p4.s;
import q.t0;
import ya.a1;
import ya.g0;
import ya.i0;
import ya.q;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0 f20538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20539b;

    public f(int i10, a1 a1Var) {
        this.f20539b = i10;
        this.f20538a = a1Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static f c(int i10, s sVar) {
        a gVar;
        String str;
        int i11 = 4;
        q.d(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i12 = sVar.f16613c;
        int iA = -2;
        int i13 = 0;
        while (sVar.a() > 8) {
            int i14 = sVar.i();
            int i15 = sVar.f16612b + sVar.i();
            sVar.F(i15);
            if (i14 != 1414744396) {
                d dVar = null;
                switch (i14) {
                    case 1718776947:
                        if (iA != 2) {
                            if (iA == 1) {
                                int iN = sVar.n();
                                String str2 = iN != 1 ? iN != 85 ? iN != 255 ? iN != 8192 ? iN != 8193 ? null : "audio/vnd.dts" : "audio/ac3" : "audio/mp4a-latm" : "audio/mpeg" : "audio/raw";
                                if (str2 != null) {
                                    int iN2 = sVar.n();
                                    int i16 = sVar.i();
                                    sVar.H(6);
                                    int iA2 = c0.A(sVar.n());
                                    int iN3 = sVar.a() > 0 ? sVar.n() : 0;
                                    p pVar = new p();
                                    pVar.f14488m = o0.p(str2);
                                    pVar.C = iN2;
                                    pVar.D = i16;
                                    if (str2.equals("audio/raw") && iA2 != 0) {
                                        pVar.E = iA2;
                                    }
                                    if (str2.equals("audio/mp4a-latm") && iN3 > 0) {
                                        byte[] bArr = new byte[iN3];
                                        sVar.e(bArr, 0, iN3);
                                        pVar.f14491p = i0.u(bArr);
                                    }
                                    gVar = new g(new m4.q(pVar));
                                } else {
                                    t0.J(iN, "Ignoring track with unsupported format tag ", "StreamFormatChunk");
                                }
                            } else {
                                p4.c.B("StreamFormatChunk", "Ignoring strf box for unsupported track type: " + c0.E(iA));
                            }
                            gVar = dVar;
                            break;
                        } else {
                            sVar.H(i11);
                            int i17 = sVar.i();
                            int i18 = sVar.i();
                            sVar.H(i11);
                            int i19 = sVar.i();
                            switch (i19) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str = "video/avc";
                                    break;
                                case 842289229:
                                    str = "video/mp42";
                                    break;
                                case 859066445:
                                    str = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str = "video/mjpeg";
                                    break;
                                default:
                                    str = null;
                                    break;
                            }
                            if (str != null) {
                                p pVar2 = new p();
                                pVar2.f14495t = i17;
                                pVar2.f14496u = i18;
                                pVar2.f14488m = o0.p(str);
                                gVar = new g(new m4.q(pVar2));
                            } else {
                                t0.J(i19, "Ignoring track with unsupported compression ", "StreamFormatChunk");
                                gVar = dVar;
                            }
                        }
                        break;
                    case 1751742049:
                        int i20 = sVar.i();
                        sVar.H(8);
                        int i21 = sVar.i();
                        int i22 = sVar.i();
                        sVar.H(i11);
                        sVar.i();
                        sVar.H(12);
                        gVar = new c(i20, i21, i22);
                        break;
                    case 1752331379:
                        int i23 = sVar.i();
                        sVar.H(12);
                        sVar.i();
                        int i24 = sVar.i();
                        int i25 = sVar.i();
                        sVar.H(i11);
                        int i26 = sVar.i();
                        int i27 = sVar.i();
                        sVar.H(i11);
                        dVar = new d(i23, i24, i25, i26, i27, sVar.i());
                        gVar = dVar;
                        break;
                    case 1852994675:
                        gVar = new h(sVar.s(sVar.a(), StandardCharsets.UTF_8));
                        break;
                    default:
                        gVar = dVar;
                        break;
                }
            } else {
                gVar = c(sVar.i(), sVar);
            }
            if (gVar != null) {
                if (gVar.b() == 1752331379) {
                    iA = ((d) gVar).a();
                }
                int i28 = i13 + 1;
                int iE = ya.c0.e(objArrCopyOf.length, i28);
                if (iE > objArrCopyOf.length) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, iE);
                }
                objArrCopyOf[i13] = gVar;
                i13 = i28;
            }
            sVar.G(i15);
            sVar.F(i12);
            i11 = 4;
        }
        return new f(i10, i0.o(i13, objArrCopyOf));
    }

    public final a a(Class cls) {
        g0 g0VarListIterator = this.f20538a.listIterator(0);
        while (g0VarListIterator.hasNext()) {
            a aVar = (a) g0VarListIterator.next();
            if (aVar.getClass() == cls) {
                return aVar;
            }
        }
        return null;
    }

    @Override // t5.a
    public final int b() {
        return this.f20539b;
    }
}
