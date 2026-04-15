package ae;

import df.o;
import j2.h0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import jc.l;
import vb.m;
import vb.n;
import vb.t;
import vb.u;
import vb.w;
import zd.h;
import zd.i;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f implements yd.f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final List f320d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String[] f321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f323c;

    static {
        String strF0 = m.f0(ud.b.x('k', 'o', 't', 'l', 'i', 'n'), "", null, null, null, 62);
        List listX = ud.b.x(h0.j(strF0, "/Any"), h0.j(strF0, "/Nothing"), h0.j(strF0, "/Unit"), h0.j(strF0, "/Throwable"), h0.j(strF0, "/Number"), h0.j(strF0, "/Byte"), h0.j(strF0, "/Double"), h0.j(strF0, "/Float"), h0.j(strF0, "/Int"), h0.j(strF0, "/Long"), h0.j(strF0, "/Short"), h0.j(strF0, "/Boolean"), h0.j(strF0, "/Char"), h0.j(strF0, "/CharSequence"), h0.j(strF0, "/String"), h0.j(strF0, "/Comparable"), h0.j(strF0, "/Enum"), h0.j(strF0, "/Array"), h0.j(strF0, "/ByteArray"), h0.j(strF0, "/DoubleArray"), h0.j(strF0, "/FloatArray"), h0.j(strF0, "/IntArray"), h0.j(strF0, "/LongArray"), h0.j(strF0, "/ShortArray"), h0.j(strF0, "/BooleanArray"), h0.j(strF0, "/CharArray"), h0.j(strF0, "/Cloneable"), h0.j(strF0, "/Annotation"), h0.j(strF0, "/collections/Iterable"), h0.j(strF0, "/collections/MutableIterable"), h0.j(strF0, "/collections/Collection"), h0.j(strF0, "/collections/MutableCollection"), h0.j(strF0, "/collections/List"), h0.j(strF0, "/collections/MutableList"), h0.j(strF0, "/collections/Set"), h0.j(strF0, "/collections/MutableSet"), h0.j(strF0, "/collections/Map"), h0.j(strF0, "/collections/MutableMap"), h0.j(strF0, "/collections/Map.Entry"), h0.j(strF0, "/collections/MutableMap.MutableEntry"), h0.j(strF0, "/collections/Iterator"), h0.j(strF0, "/collections/MutableIterator"), h0.j(strF0, "/collections/ListIterator"), h0.j(strF0, "/collections/MutableListIterator"));
        f320d = listX;
        o oVarL0 = m.L0(listX);
        int iT = w.t(n.K(oVarL0, 10));
        if (iT < 16) {
            iT = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iT);
        Iterator it = oVarL0.iterator();
        while (true) {
            df.b bVar = (df.b) it;
            if (!bVar.f5974b.hasNext()) {
                return;
            }
            u uVar = (u) bVar.next();
            linkedHashMap.put((String) uVar.f22823b, Integer.valueOf(uVar.f22822a));
        }
    }

    public f(i iVar, String[] strArr) {
        l.e(strArr, "strings");
        List list = iVar.f26799c;
        Set setK0 = list.isEmpty() ? t.f22821a : m.K0(list);
        List<h> list2 = iVar.f26798b;
        l.d(list2, "getRecordList(...)");
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(list2.size());
        for (h hVar : list2) {
            int i10 = hVar.f26785c;
            for (int i11 = 0; i11 < i10; i11++) {
                arrayList.add(hVar);
            }
        }
        arrayList.trimToSize();
        this.f321a = strArr;
        this.f322b = setK0;
        this.f323c = arrayList;
    }

    @Override // yd.f
    public final String a(int i10) {
        return getString(i10);
    }

    @Override // yd.f
    public final boolean b(int i10) {
        return this.f322b.contains(Integer.valueOf(i10));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    @Override // yd.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String getString(int r10) {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ae.f.getString(int):java.lang.String");
    }
}
