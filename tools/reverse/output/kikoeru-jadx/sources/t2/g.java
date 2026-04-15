package t2;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g implements CharSequence {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f20319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f20321c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f20322d;

    static {
        androidx.media3.exoplayer.offline.u uVar = b0.f20262a;
    }

    public g(List list, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        this.f20319a = list;
        this.f20320b = str;
        int i10 = 0;
        if (list != null) {
            int size = list.size();
            arrayList = null;
            arrayList2 = null;
            for (int i11 = 0; i11 < size; i11++) {
                e eVar = (e) list.get(i11);
                Object obj = eVar.f20309a;
                if (obj instanceof d0) {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    arrayList.add(eVar);
                } else if (obj instanceof s) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    arrayList2.add(eVar);
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        this.f20321c = arrayList;
        this.f20322d = arrayList2;
        List listC0 = arrayList2 != null ? vb.m.C0(arrayList2, new f(i10)) : null;
        List list2 = listC0;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        int i12 = ((e) vb.m.Y(listC0)).f20311c;
        o.x xVar = o.l.f16001a;
        o.x xVar2 = new o.x(1);
        xVar2.a(i12);
        int size2 = listC0.size();
        for (int i13 = 1; i13 < size2; i13++) {
            e eVar2 = (e) listC0.get(i13);
            while (true) {
                if (xVar2.f16071b != 0) {
                    int iD = xVar2.d();
                    int i14 = eVar2.f20310b;
                    int i15 = eVar2.f20311c;
                    if (i14 >= iD) {
                        xVar2.e(xVar2.f16071b - 1);
                    } else if (i15 > iD) {
                        z2.a.a("Paragraph overlap not allowed, end " + i15 + " should be less than or equal to " + iD);
                    }
                }
            }
            xVar2.a(eVar2.f20311c);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00a1  */
    @Override // java.lang.CharSequence
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final t2.g subSequence(int r11, int r12) {
        /*
            r10 = this;
            r0 = 0
            if (r11 > r12) goto L5
            r1 = 1
            goto L6
        L5:
            r1 = 0
        L6:
            r2 = 41
            java.lang.String r3 = "start ("
            if (r1 != 0) goto L26
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            r1.append(r11)
            java.lang.String r4 = ") should be less or equal to end ("
            r1.append(r4)
            r1.append(r12)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            z2.a.a(r1)
        L26:
            java.lang.String r1 = r10.f20320b
            if (r11 != 0) goto L31
            int r4 = r1.length()
            if (r12 != r4) goto L31
            return r10
        L31:
            java.lang.String r1 = r1.substring(r11, r12)
            java.lang.String r4 = "substring(...)"
            jc.l.d(r1, r4)
            t2.g r4 = t2.h.f20325a
            if (r11 > r12) goto L3f
            goto L59
        L3f:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            r4.append(r11)
            java.lang.String r3 = ") should be less than or equal to end ("
            r4.append(r3)
            r4.append(r12)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            z2.a.a(r2)
        L59:
            java.util.List r2 = r10.f20319a
            if (r2 != 0) goto L5e
            goto La1
        L5e:
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = r2.size()
            r3.<init>(r4)
            r4 = r2
            java.util.Collection r4 = (java.util.Collection) r4
            int r4 = r4.size()
        L6e:
            if (r0 >= r4) goto L9b
            java.lang.Object r5 = r2.get(r0)
            t2.e r5 = (t2.e) r5
            int r6 = r5.f20310b
            int r7 = r5.f20311c
            boolean r6 = t2.h.b(r11, r12, r6, r7)
            if (r6 == 0) goto L98
            t2.e r6 = new t2.e
            java.lang.Object r8 = r5.f20309a
            int r9 = r5.f20310b
            int r9 = java.lang.Math.max(r11, r9)
            int r9 = r9 - r11
            int r7 = java.lang.Math.min(r12, r7)
            int r7 = r7 - r11
            java.lang.String r5 = r5.f20312d
            r6.<init>(r8, r9, r7, r5)
            r3.add(r6)
        L98:
            int r0 = r0 + 1
            goto L6e
        L9b:
            boolean r11 = r3.isEmpty()
            if (r11 == 0) goto La2
        La1:
            r3 = 0
        La2:
            t2.g r11 = new t2.g
            r11.<init>(r3, r1)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: t2.g.subSequence(int, int):t2.g");
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i10) {
        return this.f20320b.charAt(i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return jc.l.a(this.f20320b, gVar.f20320b) && jc.l.a(this.f20319a, gVar.f20319a);
    }

    public final int hashCode() {
        int iHashCode = this.f20320b.hashCode() * 31;
        List list = this.f20319a;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f20320b.length();
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f20320b;
    }

    public /* synthetic */ g(String str) {
        this(str, vb.r.f22819a);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public g(String str, List list) {
        List list2 = list;
        this(list2.isEmpty() ? null : list2, str);
    }
}
