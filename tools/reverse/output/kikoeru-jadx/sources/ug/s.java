package ug;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f21861a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f21864d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f21867g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f21868h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f21862b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f21863c = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f21865e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f21866f = ud.b.A("");

    public static ArrayList e(String str) {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (i10 <= str.length()) {
            int iV0 = ef.n.v0(str, '&', i10, 4);
            if (iV0 == -1) {
                iV0 = str.length();
            }
            int iV02 = ef.n.v0(str, '=', i10, 4);
            if (iV02 == -1 || iV02 > iV0) {
                String strSubstring = str.substring(i10, iV0);
                jc.l.d(strSubstring, "substring(...)");
                arrayList.add(strSubstring);
                arrayList.add(null);
            } else {
                String strSubstring2 = str.substring(i10, iV02);
                jc.l.d(strSubstring2, "substring(...)");
                arrayList.add(strSubstring2);
                String strSubstring3 = str.substring(iV02 + 1, iV0);
                jc.l.d(strSubstring3, "substring(...)");
                arrayList.add(strSubstring3);
            }
            i10 = iV0 + 1;
        }
        return arrayList;
    }

    public final void a(String str, String str2) {
        if (this.f21867g == null) {
            this.f21867g = new ArrayList();
        }
        ArrayList arrayList = this.f21867g;
        jc.l.b(arrayList);
        arrayList.add(kh.a.a(str, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", 91));
        ArrayList arrayList2 = this.f21867g;
        jc.l.b(arrayList2);
        arrayList2.add(str2 != null ? kh.a.a(str2, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", 91) : null);
    }

    public final t b() {
        ArrayList arrayList;
        String str = this.f21861a;
        if (str == null) {
            throw new IllegalStateException("scheme == null");
        }
        String strC = kh.a.c(0, 0, 7, this.f21862b);
        String strC2 = kh.a.c(0, 0, 7, this.f21863c);
        String str2 = this.f21864d;
        if (str2 == null) {
            throw new IllegalStateException("host == null");
        }
        int iC = c();
        ArrayList arrayList2 = this.f21866f;
        ArrayList arrayList3 = new ArrayList(vb.n.K(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(kh.a.c(0, 0, 7, (String) it.next()));
        }
        ArrayList<String> arrayList4 = this.f21867g;
        if (arrayList4 != null) {
            arrayList = new ArrayList(vb.n.K(arrayList4, 10));
            for (String str3 : arrayList4) {
                arrayList.add(str3 != null ? kh.a.c(0, 0, 3, str3) : null);
            }
        } else {
            arrayList = null;
        }
        String str4 = this.f21868h;
        return new t(str, strC, strC2, str2, iC, arrayList, str4 != null ? kh.a.c(0, 0, 7, str4) : null, toString());
    }

    public final int c() {
        int i10 = this.f21865e;
        if (i10 != -1) {
            return i10;
        }
        String str = this.f21861a;
        jc.l.b(str);
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(ug.t r18, java.lang.String r19) {
        /*
            Method dump skipped, instruction units count: 923
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ug.s.d(ug.t, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ug.s.toString():java.lang.String");
    }
}
