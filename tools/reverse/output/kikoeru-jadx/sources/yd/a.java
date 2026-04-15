package yd;

import j2.h0;
import java.util.ArrayList;
import java.util.List;
import jc.l;
import vb.k;
import vb.m;
import vb.r;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f26165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f26166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f26167c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f26168d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f26169e;

    public a(int... iArr) {
        List listG0;
        l.e(iArr, "numbers");
        this.f26165a = iArr;
        Integer numY0 = vb.l.y0(iArr, 0);
        this.f26166b = numY0 != null ? numY0.intValue() : -1;
        Integer numY02 = vb.l.y0(iArr, 1);
        this.f26167c = numY02 != null ? numY02.intValue() : -1;
        Integer numY03 = vb.l.y0(iArr, 2);
        this.f26168d = numY03 != null ? numY03.intValue() : -1;
        if (iArr.length <= 3) {
            listG0 = r.f22819a;
        } else {
            if (iArr.length > 1024) {
                throw new IllegalArgumentException(h0.m(new StringBuilder("BinaryVersion with length more than 1024 are not supported. Provided length "), iArr.length, '.'));
            }
            listG0 = m.G0(new vb.c(new k(iArr), 3, iArr.length));
        }
        this.f26169e = listG0;
    }

    public final boolean a(int i10, int i11, int i12) {
        int i13 = this.f26166b;
        if (i13 > i10) {
            return true;
        }
        if (i13 < i10) {
            return false;
        }
        int i14 = this.f26167c;
        if (i14 > i11) {
            return true;
        }
        return i14 >= i11 && this.f26168d >= i12;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        a aVar = (a) obj;
        return this.f26166b == aVar.f26166b && this.f26167c == aVar.f26167c && this.f26168d == aVar.f26168d && l.a(this.f26169e, aVar.f26169e);
    }

    public final int hashCode() {
        int i10 = this.f26166b;
        int i11 = (i10 * 31) + this.f26167c + i10;
        int i12 = (i11 * 31) + this.f26168d + i11;
        return this.f26169e.hashCode() + (i12 * 31) + i12;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        for (int i10 : this.f26165a) {
            if (i10 == -1) {
                break;
            }
            arrayList.add(Integer.valueOf(i10));
        }
        return arrayList.isEmpty() ? "unknown" : m.f0(arrayList, ".", null, null, null, 62);
    }
}
