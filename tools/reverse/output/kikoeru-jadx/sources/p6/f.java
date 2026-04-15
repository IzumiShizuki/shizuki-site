package p6;

import android.text.SpannableStringBuilder;
import bd.f0;
import com.tencent.bugly.beta.tinker.TinkerReport;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import p4.r;
import p4.s;
import q.t0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f extends h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final s f16829h = new s();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final r f16830i = new r();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f16831j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f16832k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e[] f16833l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public e f16834m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public List f16835n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public List f16836o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public r f16837p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f16838q;

    public f(int i10, List list) {
        this.f16832k = i10 == -1 ? 1 : i10;
        if (list != null) {
            byte[] bArr = p4.d.f16565a;
            if (list.size() == 1 && ((byte[]) list.get(0)).length == 1) {
                byte b10 = ((byte[]) list.get(0))[0];
            }
        }
        this.f16833l = new e[8];
        for (int i11 = 0; i11 < 8; i11++) {
            this.f16833l[i11] = new e();
        }
        this.f16834m = this.f16833l[0];
    }

    @Override // p6.h, u4.c
    public final void flush() {
        super.flush();
        this.f16835n = null;
        this.f16836o = null;
        this.f16838q = 0;
        this.f16834m = this.f16833l[0];
        m();
        this.f16837p = null;
    }

    @Override // p6.h
    public final f0 g() {
        List list = this.f16835n;
        this.f16836o = list;
        list.getClass();
        return new f0(list);
    }

    @Override // p6.h
    public final void h(g gVar) {
        ByteBuffer byteBuffer = gVar.f21382e;
        byteBuffer.getClass();
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        s sVar = this.f16829h;
        sVar.E(bArrArray, iLimit);
        while (sVar.a() >= 3) {
            int iU = sVar.u();
            int i10 = iU & 3;
            boolean z10 = (iU & 4) == 4;
            byte bU = (byte) sVar.u();
            byte bU2 = (byte) sVar.u();
            if (i10 == 2 || i10 == 3) {
                if (z10) {
                    if (i10 == 3) {
                        k();
                        int i11 = (bU & 192) >> 6;
                        int i12 = this.f16831j;
                        if (i12 != -1 && i11 != (i12 + 1) % 4) {
                            m();
                            p4.c.B("Cea708Decoder", "Sequence number discontinuity. previous=" + this.f16831j + " current=" + i11);
                        }
                        this.f16831j = i11;
                        int i13 = bU & 63;
                        if (i13 == 0) {
                            i13 = 64;
                        }
                        r rVar = new r(i11, i13);
                        this.f16837p = rVar;
                        byte[] bArr = rVar.f16606d;
                        rVar.f16607e = 1;
                        bArr[0] = bU2;
                    } else {
                        p4.c.c(i10 == 2);
                        r rVar2 = this.f16837p;
                        if (rVar2 == null) {
                            p4.c.n("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = rVar2.f16606d;
                            int i14 = rVar2.f16607e;
                            int i15 = i14 + 1;
                            rVar2.f16607e = i15;
                            bArr2[i14] = bU;
                            rVar2.f16607e = i14 + 2;
                            bArr2[i15] = bU2;
                        }
                    }
                    r rVar3 = this.f16837p;
                    if (rVar3.f16607e == (rVar3.f16605c * 2) - 1) {
                        k();
                    }
                }
            }
        }
    }

    @Override // p6.h
    public final boolean j() {
        return this.f16835n != this.f16836o;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void k() {
        r rVar = this.f16837p;
        if (rVar == null) {
            return;
        }
        int i10 = 2;
        if (rVar.f16607e != (rVar.f16605c * 2) - 1) {
            p4.c.l("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.f16837p.f16605c * 2) - 1) + ", but current index is " + this.f16837p.f16607e + " (sequence number " + this.f16837p.f16604b + ");");
        }
        r rVar2 = this.f16837p;
        byte[] bArr = rVar2.f16606d;
        int i11 = rVar2.f16607e;
        r rVar3 = this.f16830i;
        rVar3.p(bArr, i11);
        boolean z10 = false;
        while (true) {
            if (rVar3.b() > 0) {
                int i12 = 3;
                int i13 = rVar3.i(3);
                int i14 = rVar3.i(5);
                if (i13 == 7) {
                    rVar3.t(i10);
                    i13 = rVar3.i(6);
                    if (i13 < 7) {
                        t0.J(i13, "Invalid extended service number: ", "Cea708Decoder");
                    }
                }
                if (i14 == 0) {
                    if (i13 != 0) {
                        p4.c.B("Cea708Decoder", "serviceNumber is non-zero (" + i13 + ") when blockSize is 0");
                    }
                } else if (i13 != this.f16832k) {
                    rVar3.u(i14);
                } else {
                    int iG = (i14 * 8) + rVar3.g();
                    while (rVar3.g() < iG) {
                        int i15 = rVar3.i(8);
                        if (i15 == 16) {
                            int i16 = rVar3.i(8);
                            if (i16 <= 31) {
                                if (i16 > 7) {
                                    if (i16 <= 15) {
                                        rVar3.t(8);
                                    } else if (i16 <= 23) {
                                        rVar3.t(16);
                                    } else if (i16 <= 31) {
                                        rVar3.t(24);
                                    }
                                }
                            } else if (i16 <= 127) {
                                if (i16 == 32) {
                                    this.f16834m.a(' ');
                                } else if (i16 == 33) {
                                    this.f16834m.a((char) 160);
                                } else if (i16 == 37) {
                                    this.f16834m.a((char) 8230);
                                } else if (i16 == 42) {
                                    this.f16834m.a((char) 352);
                                } else if (i16 == 44) {
                                    this.f16834m.a((char) 338);
                                } else if (i16 == 63) {
                                    this.f16834m.a((char) 376);
                                } else if (i16 == 57) {
                                    this.f16834m.a((char) 8482);
                                } else if (i16 == 58) {
                                    this.f16834m.a((char) 353);
                                } else if (i16 == 60) {
                                    this.f16834m.a((char) 339);
                                } else if (i16 != 61) {
                                    switch (i16) {
                                        case 48:
                                            this.f16834m.a((char) 9608);
                                            break;
                                        case 49:
                                            this.f16834m.a((char) 8216);
                                            break;
                                        case 50:
                                            this.f16834m.a((char) 8217);
                                            break;
                                        case 51:
                                            this.f16834m.a((char) 8220);
                                            break;
                                        case 52:
                                            this.f16834m.a((char) 8221);
                                            break;
                                        case 53:
                                            this.f16834m.a((char) 8226);
                                            break;
                                        default:
                                            switch (i16) {
                                                case 118:
                                                    this.f16834m.a((char) 8539);
                                                    break;
                                                case 119:
                                                    this.f16834m.a((char) 8540);
                                                    break;
                                                case TinkerReport.KEY_APPLIED_EXCEPTION /* 120 */:
                                                    this.f16834m.a((char) 8541);
                                                    break;
                                                case TinkerReport.KEY_APPLIED_DEXOPT_OTHER /* 121 */:
                                                    this.f16834m.a((char) 8542);
                                                    break;
                                                case TinkerReport.KEY_APPLIED_DEXOPT_EXIST /* 122 */:
                                                    this.f16834m.a((char) 9474);
                                                    break;
                                                case TinkerReport.KEY_APPLIED_DEXOPT_FORMAT /* 123 */:
                                                    this.f16834m.a((char) 9488);
                                                    break;
                                                case TinkerReport.KEY_APPLIED_INFO_CORRUPTED /* 124 */:
                                                    this.f16834m.a((char) 9492);
                                                    break;
                                                case 125:
                                                    this.f16834m.a((char) 9472);
                                                    break;
                                                case 126:
                                                    this.f16834m.a((char) 9496);
                                                    break;
                                                case 127:
                                                    this.f16834m.a((char) 9484);
                                                    break;
                                                default:
                                                    t0.J(i16, "Invalid G2 character: ", "Cea708Decoder");
                                                    break;
                                            }
                                            break;
                                    }
                                } else {
                                    this.f16834m.a((char) 8480);
                                }
                                z10 = true;
                            } else if (i16 <= 159) {
                                if (i16 <= 135) {
                                    rVar3.t(32);
                                } else if (i16 <= 143) {
                                    rVar3.t(40);
                                } else if (i16 <= 159) {
                                    rVar3.t(2);
                                    rVar3.t(rVar3.i(6) * 8);
                                }
                            } else if (i16 <= 255) {
                                if (i16 == 160) {
                                    this.f16834m.a((char) 13252);
                                } else {
                                    t0.J(i16, "Invalid G3 character: ", "Cea708Decoder");
                                    this.f16834m.a('_');
                                }
                                z10 = true;
                            } else {
                                t0.J(i16, "Invalid extended command: ", "Cea708Decoder");
                            }
                        } else if (i15 <= 31) {
                            if (i15 != 0) {
                                if (i15 == i12) {
                                    this.f16835n = l();
                                } else if (i15 != 8) {
                                    switch (i15) {
                                        case 12:
                                            m();
                                            break;
                                        case 13:
                                            this.f16834m.a('\n');
                                            break;
                                        case 14:
                                            break;
                                        default:
                                            if (i15 >= 17 && i15 <= 23) {
                                                p4.c.B("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + i15);
                                                rVar3.t(8);
                                            } else if (i15 < 24 || i15 > 31) {
                                                t0.J(i15, "Invalid C0 command: ", "Cea708Decoder");
                                            } else {
                                                p4.c.B("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + i15);
                                                rVar3.t(16);
                                            }
                                            break;
                                    }
                                } else {
                                    SpannableStringBuilder spannableStringBuilder = this.f16834m.f16809b;
                                    int length = spannableStringBuilder.length();
                                    if (length > 0) {
                                        spannableStringBuilder.delete(length - 1, length);
                                    }
                                }
                            }
                        } else if (i15 <= 127) {
                            if (i15 == 127) {
                                this.f16834m.a((char) 9835);
                            } else {
                                this.f16834m.a((char) (i15 & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK));
                            }
                            z10 = true;
                        } else {
                            if (i15 <= 159) {
                                e[] eVarArr = this.f16833l;
                                switch (i15) {
                                    case 128:
                                    case 129:
                                    case 130:
                                    case 131:
                                    case 132:
                                    case 133:
                                    case 134:
                                    case 135:
                                        int i17 = i15 - 128;
                                        if (this.f16838q != i17) {
                                            this.f16838q = i17;
                                            this.f16834m = eVarArr[i17];
                                        }
                                        break;
                                    case 136:
                                        for (int i18 = 1; i18 <= 8; i18++) {
                                            if (rVar3.h()) {
                                                e eVar = eVarArr[8 - i18];
                                                eVar.f16808a.clear();
                                                eVar.f16809b.clear();
                                                eVar.f16822o = -1;
                                                eVar.f16823p = -1;
                                                eVar.f16824q = -1;
                                                eVar.f16826s = -1;
                                                eVar.f16828u = 0;
                                            }
                                        }
                                        break;
                                    case 137:
                                        for (int i19 = 1; i19 <= 8; i19++) {
                                            if (rVar3.h()) {
                                                eVarArr[8 - i19].f16811d = true;
                                            }
                                        }
                                        break;
                                    case 138:
                                        for (int i20 = 1; i20 <= 8; i20++) {
                                            if (rVar3.h()) {
                                                eVarArr[8 - i20].f16811d = false;
                                            }
                                        }
                                        break;
                                    case 139:
                                        for (int i21 = 1; i21 <= 8; i21++) {
                                            if (rVar3.h()) {
                                                eVarArr[8 - i21].f16811d = !r1.f16811d;
                                            }
                                        }
                                        break;
                                    case 140:
                                        for (int i22 = 1; i22 <= 8; i22++) {
                                            if (rVar3.h()) {
                                                eVarArr[8 - i22].d();
                                            }
                                        }
                                        break;
                                    case 141:
                                        rVar3.t(8);
                                        break;
                                    case 142:
                                        break;
                                    case 143:
                                        m();
                                        break;
                                    case 144:
                                        if (this.f16834m.f16810c) {
                                            rVar3.i(4);
                                            rVar3.i(2);
                                            rVar3.i(2);
                                            boolean zH = rVar3.h();
                                            boolean zH2 = rVar3.h();
                                            i12 = 3;
                                            rVar3.i(3);
                                            rVar3.i(3);
                                            this.f16834m.e(zH, zH2);
                                        } else {
                                            rVar3.t(16);
                                            i12 = 3;
                                        }
                                        break;
                                    case 145:
                                        if (this.f16834m.f16810c) {
                                            int iC = e.c(rVar3.i(2), rVar3.i(2), rVar3.i(2), rVar3.i(2));
                                            int iC2 = e.c(rVar3.i(2), rVar3.i(2), rVar3.i(2), rVar3.i(2));
                                            rVar3.t(2);
                                            e.c(rVar3.i(2), rVar3.i(2), rVar3.i(2), 0);
                                            this.f16834m.f(iC, iC2);
                                        } else {
                                            rVar3.t(24);
                                        }
                                        i12 = 3;
                                        break;
                                    case 146:
                                        if (this.f16834m.f16810c) {
                                            rVar3.t(4);
                                            int i23 = rVar3.i(4);
                                            rVar3.t(2);
                                            rVar3.i(6);
                                            e eVar2 = this.f16834m;
                                            if (eVar2.f16828u != i23) {
                                                eVar2.a('\n');
                                            }
                                            eVar2.f16828u = i23;
                                        } else {
                                            rVar3.t(16);
                                        }
                                        i12 = 3;
                                        break;
                                    case 147:
                                    case 148:
                                    case 149:
                                    case TinkerReport.KEY_APPLIED_PACKAGE_CHECK_SIGNATURE /* 150 */:
                                    default:
                                        t0.J(i15, "Invalid C1 command: ", "Cea708Decoder");
                                        break;
                                    case TinkerReport.KEY_APPLIED_PACKAGE_CHECK_DEX_META /* 151 */:
                                        if (this.f16834m.f16810c) {
                                            int iC3 = e.c(rVar3.i(2), rVar3.i(2), rVar3.i(2), rVar3.i(2));
                                            rVar3.i(2);
                                            e.c(rVar3.i(2), rVar3.i(2), rVar3.i(2), 0);
                                            rVar3.h();
                                            rVar3.h();
                                            rVar3.i(2);
                                            rVar3.i(2);
                                            int i24 = rVar3.i(2);
                                            rVar3.t(8);
                                            e eVar3 = this.f16834m;
                                            eVar3.f16821n = iC3;
                                            eVar3.f16818k = i24;
                                        } else {
                                            rVar3.t(32);
                                        }
                                        i12 = 3;
                                        break;
                                    case TinkerReport.KEY_APPLIED_PACKAGE_CHECK_LIB_META /* 152 */:
                                    case TinkerReport.KEY_APPLIED_PACKAGE_CHECK_APK_TINKER_ID_NOT_FOUND /* 153 */:
                                    case TinkerReport.KEY_APPLIED_PACKAGE_CHECK_PATCH_TINKER_ID_NOT_FOUND /* 154 */:
                                    case TinkerReport.KEY_APPLIED_PACKAGE_CHECK_META_NOT_FOUND /* 155 */:
                                    case TinkerReport.KEY_APPLIED_PACKAGE_CHECK_TINKER_ID_NOT_EQUAL /* 156 */:
                                    case TinkerReport.KEY_APPLIED_PACKAGE_CHECK_RES_META /* 157 */:
                                    case TinkerReport.KEY_APPLIED_PACKAGE_CHECK_TINKERFLAG_NOT_SUPPORT /* 158 */:
                                    case 159:
                                        int i25 = i15 - 152;
                                        e eVar4 = eVarArr[i25];
                                        rVar3.t(i10);
                                        boolean zH3 = rVar3.h();
                                        rVar3.t(i10);
                                        int i26 = rVar3.i(i12);
                                        boolean zH4 = rVar3.h();
                                        int i27 = rVar3.i(7);
                                        int i28 = rVar3.i(8);
                                        int i29 = rVar3.i(4);
                                        int i30 = rVar3.i(4);
                                        rVar3.t(i10);
                                        rVar3.t(6);
                                        rVar3.t(i10);
                                        int i31 = rVar3.i(3);
                                        int i32 = rVar3.i(3);
                                        ArrayList arrayList = eVar4.f16808a;
                                        eVar4.f16810c = true;
                                        eVar4.f16811d = zH3;
                                        eVar4.f16812e = i26;
                                        eVar4.f16813f = zH4;
                                        eVar4.f16814g = i27;
                                        eVar4.f16815h = i28;
                                        eVar4.f16816i = i29;
                                        int i33 = i30 + 1;
                                        if (eVar4.f16817j != i33) {
                                            eVar4.f16817j = i33;
                                            while (true) {
                                                if (arrayList.size() >= eVar4.f16817j || arrayList.size() >= 15) {
                                                    arrayList.remove(0);
                                                }
                                            }
                                        }
                                        if (i31 != 0 && eVar4.f16819l != i31) {
                                            eVar4.f16819l = i31;
                                            int i34 = i31 - 1;
                                            int i35 = e.B[i34];
                                            boolean z11 = e.A[i34];
                                            int i36 = e.f16806y[i34];
                                            int i37 = e.f16807z[i34];
                                            int i38 = e.f16805x[i34];
                                            eVar4.f16821n = i35;
                                            eVar4.f16818k = i38;
                                        }
                                        if (i32 != 0 && eVar4.f16820m != i32) {
                                            eVar4.f16820m = i32;
                                            int i39 = i32 - 1;
                                            int i40 = e.D[i39];
                                            int i41 = e.C[i39];
                                            eVar4.e(false, false);
                                            eVar4.f(e.f16803v, e.E[i39]);
                                        }
                                        if (this.f16838q != i25) {
                                            this.f16838q = i25;
                                            this.f16834m = eVarArr[i25];
                                        }
                                        i12 = 3;
                                        break;
                                }
                            } else if (i15 <= 255) {
                                this.f16834m.a((char) (i15 & TinkerReport.KEY_LOADED_EXCEPTION_RESOURCE_CHECK));
                            } else {
                                t0.J(i15, "Invalid base command: ", "Cea708Decoder");
                            }
                            z10 = true;
                        }
                        i10 = 2;
                    }
                }
            }
        }
        if (z10) {
            this.f16835n = l();
        }
        this.f16837p = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List l() {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p6.f.l():java.util.List");
    }

    public final void m() {
        for (int i10 = 0; i10 < 8; i10++) {
            this.f16833l[i10].d();
        }
    }
}
