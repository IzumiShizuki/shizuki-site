package ef;

import com.tencent.bugly.beta.tinker.TinkerReport;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class o extends a.a {
    public static String Y(String str) {
        jc.l.e(str, "<this>");
        return df.m.c0(df.m.e0(new df.n(2, str), new a9.j(4, "    ")), "\n");
    }

    public static String Z(String str) throws IOException {
        List listW;
        int length;
        Comparable comparable;
        jc.l.e(str, "<this>");
        g gVar = new g(str);
        if (gVar.hasNext()) {
            Object next = gVar.next();
            if (gVar.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (gVar.hasNext()) {
                    arrayList.add(gVar.next());
                }
                listW = arrayList;
            } else {
                listW = ud.b.w(next);
            }
        } else {
            listW = vb.r.f22819a;
        }
        List list = listW;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (!n.y0((String) obj)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(vb.n.K(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (true) {
            length = 0;
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            int length2 = str2.length();
            while (true) {
                if (length >= length2) {
                    length = -1;
                    break;
                }
                if (!gh.g.E(str2.charAt(length))) {
                    break;
                }
                length++;
            }
            if (length == -1) {
                length = str2.length();
            }
            arrayList3.add(Integer.valueOf(length));
        }
        Iterator it2 = arrayList3.iterator();
        if (it2.hasNext()) {
            comparable = (Comparable) it2.next();
            while (it2.hasNext()) {
                Comparable comparable2 = (Comparable) it2.next();
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                }
            }
        } else {
            comparable = null;
        }
        Integer num = (Integer) comparable;
        int iIntValue = num != null ? num.intValue() : 0;
        int length3 = str.length();
        listW.size();
        int iR = ud.b.r(listW);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : list) {
            int i10 = length + 1;
            if (length < 0) {
                ud.b.H();
                throw null;
            }
            String str3 = (String) obj2;
            String strP0 = ((length == 0 || length == iR) && n.y0(str3)) ? null : n.p0(iIntValue, str3);
            if (strP0 != null) {
                arrayList4.add(strP0);
            }
            length = i10;
        }
        StringBuilder sb = new StringBuilder(length3);
        vb.m.e0(arrayList4, sb, "\n", null, null, null, TinkerReport.KEY_APPLIED_INFO_CORRUPTED);
        return sb.toString();
    }

    public static String a0(String str) throws IOException {
        List listW;
        jc.l.e(str, "<this>");
        if (n.y0("|")) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        g gVar = new g(str);
        if (gVar.hasNext()) {
            Object next = gVar.next();
            if (gVar.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (gVar.hasNext()) {
                    arrayList.add(gVar.next());
                }
                listW = arrayList;
            } else {
                listW = ud.b.w(next);
            }
        } else {
            listW = vb.r.f22819a;
        }
        int length = str.length();
        listW.size();
        int iR = ud.b.r(listW);
        ArrayList arrayList2 = new ArrayList();
        int i10 = 0;
        for (Object obj : listW) {
            int i11 = i10 + 1;
            String strSubstring = null;
            if (i10 < 0) {
                ud.b.H();
                throw null;
            }
            String str2 = (String) obj;
            if ((i10 != 0 && i10 != iR) || !n.y0(str2)) {
                int length2 = str2.length();
                int i12 = 0;
                while (true) {
                    if (i12 >= length2) {
                        i12 = -1;
                        break;
                    }
                    if (!gh.g.E(str2.charAt(i12))) {
                        break;
                    }
                    i12++;
                }
                if (i12 != -1 && u.j0(str2, i12, "|", false)) {
                    strSubstring = str2.substring("|".length() + i12);
                    jc.l.d(strSubstring, "substring(...)");
                }
                if (strSubstring == null) {
                    strSubstring = str2;
                }
            }
            if (strSubstring != null) {
                arrayList2.add(strSubstring);
            }
            i10 = i11;
        }
        StringBuilder sb = new StringBuilder(length);
        vb.m.e0(arrayList2, sb, "\n", null, null, null, TinkerReport.KEY_APPLIED_INFO_CORRUPTED);
        return sb.toString();
    }
}
