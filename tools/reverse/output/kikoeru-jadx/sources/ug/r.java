package ug;

import hd.q0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class r implements Iterable, kc.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final r f21859b = new r(new String[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String[] f21860a;

    public r(String[] strArr) {
        jc.l.e(strArr, "namesAndValues");
        this.f21860a = strArr;
    }

    public final String a(String str) {
        String[] strArr = this.f21860a;
        jc.l.e(strArr, "namesAndValues");
        int length = strArr.length - 2;
        int iX = gh.g.x(length, 0, -2);
        if (iX > length) {
            return null;
        }
        while (!str.equalsIgnoreCase(strArr[length])) {
            if (length == iX) {
                return null;
            }
            length -= 2;
        }
        return strArr[length + 1];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            return Arrays.equals(this.f21860a, ((r) obj).f21860a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f21860a);
    }

    public final String i(int i10) {
        String str = (String) vb.l.z0(i10 * 2, this.f21860a);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException("name[" + i10 + ']');
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int size = size();
        ub.k[] kVarArr = new ub.k[size];
        for (int i10 = 0; i10 < size; i10++) {
            kVarArr[i10] = new ub.k(i(i10), k(i10));
        }
        return jc.k.a(kVarArr);
    }

    public final q0 j() {
        q0 q0Var = new q0((byte) 0, 5);
        ArrayList arrayList = q0Var.f8447b;
        jc.l.e(arrayList, "<this>");
        String[] strArr = this.f21860a;
        jc.l.e(strArr, "elements");
        arrayList.addAll(vb.l.c0(strArr));
        return q0Var;
    }

    public final String k(int i10) {
        String str = (String) vb.l.z0((i10 * 2) + 1, this.f21860a);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException("value[" + i10 + ']');
    }

    public final List l(String str) {
        jc.l.e(str, "name");
        int size = size();
        List listUnmodifiableList = null;
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            if (str.equalsIgnoreCase(i(i10))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(k(i10));
            }
        }
        if (arrayList != null) {
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
            jc.l.d(listUnmodifiableList, "unmodifiableList(...)");
        }
        return listUnmodifiableList == null ? vb.r.f22819a : listUnmodifiableList;
    }

    public final int size() {
        return this.f21860a.length / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            String strI = i(i10);
            String strK = k(i10);
            sb.append(strI);
            sb.append(": ");
            if (wg.e.l(strI)) {
                strK = "██";
            }
            sb.append(strK);
            sb.append("\n");
        }
        return sb.toString();
    }
}
