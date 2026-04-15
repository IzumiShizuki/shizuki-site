package i6;

import com.tencent.bugly.beta.tinker.TinkerReport;
import j2.h0;
import m4.k0;
import m4.m0;
import m4.q;
import ud.e;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a implements m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9026b;

    public a(String str, String str2) {
        this.f9025a = e.d0(str);
        this.f9026b = str2;
    }

    @Override // m4.m0
    public final /* synthetic */ q a() {
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // m4.m0
    public final void b(k0 k0Var) {
        String str = this.f9025a;
        str.getClass();
        byte b10 = -1;
        switch (str.hashCode()) {
            case -1935137620:
                if (str.equals("TOTALTRACKS")) {
                    b10 = 0;
                }
                break;
            case -215998278:
                if (str.equals("TOTALDISCS")) {
                    b10 = 1;
                }
                break;
            case -113312716:
                if (str.equals("TRACKNUMBER")) {
                    b10 = 2;
                }
                break;
            case 62359119:
                if (str.equals("ALBUM")) {
                    b10 = 3;
                }
                break;
            case 67703139:
                if (str.equals("GENRE")) {
                    b10 = 4;
                }
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    b10 = 5;
                }
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    b10 = 6;
                }
                break;
            case 993300766:
                if (str.equals("DISCNUMBER")) {
                    b10 = 7;
                }
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    b10 = 8;
                }
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    b10 = 9;
                }
                break;
        }
        String str2 = this.f9026b;
        switch (b10) {
            case 0:
                Integer numG0 = g8.a.g0(str2);
                if (numG0 != null) {
                    k0Var.f14332o = numG0;
                }
                break;
            case 1:
                Integer numG02 = g8.a.g0(str2);
                if (numG02 != null) {
                    k0Var.C = numG02;
                }
                break;
            case 2:
                Integer numG03 = g8.a.g0(str2);
                if (numG03 != null) {
                    k0Var.f14331n = numG03;
                }
                break;
            case 3:
                k0Var.f14320c = str2;
                break;
            case 4:
                k0Var.D = str2;
                break;
            case 5:
                k0Var.f14318a = str2;
                break;
            case 6:
                k0Var.f14324g = str2;
                break;
            case 7:
                Integer numG04 = g8.a.g0(str2);
                if (numG04 != null) {
                    k0Var.B = numG04;
                }
                break;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                k0Var.f14321d = str2;
                break;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                k0Var.f14319b = str2;
                break;
        }
    }

    @Override // m4.m0
    public final /* synthetic */ byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f9025a.equals(aVar.f9025a) && this.f9026b.equals(aVar.f9026b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f9026b.hashCode() + h0.e(527, 31, this.f9025a);
    }

    public final String toString() {
        return "VC: " + this.f9025a + "=" + this.f9026b;
    }
}
