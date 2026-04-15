package j9;

import j2.h0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f10689c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d0 f10690d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c0 f10691e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f10692f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ic.k f10693g;

    public f(int i10, String str, String str2, d0 d0Var, c0 c0Var, ArrayList arrayList, ic.k kVar, int i11) {
        c0Var = (i11 & 64) != 0 ? c0.f10663b : c0Var;
        arrayList = (i11 & 128) != 0 ? null : arrayList;
        kVar = (i11 & 256) != 0 ? null : kVar;
        jc.l.e(str, "name");
        jc.l.e(c0Var, "format");
        this.f10687a = i10;
        this.f10688b = str;
        this.f10689c = str2;
        this.f10690d = d0Var;
        this.f10691e = c0Var;
        this.f10692f = arrayList;
        this.f10693g = kVar;
        if (str2 == null && kVar == null && arrayList == null) {
            throw new IllegalStateException("Check failed.");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(ac.c r18) {
        /*
            Method dump skipped, instruction units count: 583
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j9.f.a(ac.c):java.lang.Object");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f10687a == fVar.f10687a && jc.l.a(this.f10688b, fVar.f10688b) && jc.l.a(this.f10689c, fVar.f10689c) && this.f10690d == fVar.f10690d && this.f10691e == fVar.f10691e && jc.l.a(this.f10692f, fVar.f10692f) && jc.l.a(this.f10693g, fVar.f10693g);
    }

    public final int hashCode() {
        int iE = h0.e(this.f10687a * 31, 31, this.f10688b);
        String str = this.f10689c;
        int iHashCode = (this.f10691e.hashCode() + ((this.f10690d.hashCode() + ((iE + (str == null ? 0 : str.hashCode())) * 31)) * 29791)) * 31;
        List list = this.f10692f;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        ic.k kVar = this.f10693g;
        return iHashCode2 + (kVar != null ? kVar.hashCode() : 0);
    }

    public final String toString() {
        return "LRC(priority=" + this.f10687a + ", name=" + this.f10688b + ", lrc=" + this.f10689c + ", type=" + this.f10690d + ", doc=null, zip=null, format=" + this.f10691e + ", decodedLrc=" + this.f10692f + ", lazyLrc=" + this.f10693g + ")";
    }
}
