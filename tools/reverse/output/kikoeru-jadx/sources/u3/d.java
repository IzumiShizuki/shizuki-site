package u3;

import android.util.Log;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ViewParent f21277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewParent f21278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RecyclerView f21279c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f21280d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f21281e;

    public d(RecyclerView recyclerView) {
        this.f21279c = recyclerView;
    }

    public final boolean a(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        ViewParent viewParentC;
        int i13;
        int i14;
        int[] iArr3;
        char c3;
        char c10;
        if (!this.f21280d || (viewParentC = c(i12)) == null) {
            return false;
        }
        if (i10 == 0 && i11 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        RecyclerView recyclerView = this.f21279c;
        if (iArr2 != null) {
            recyclerView.getLocationInWindow(iArr2);
            i13 = iArr2[0];
            i14 = iArr2[1];
        } else {
            i13 = 0;
            i14 = 0;
        }
        if (iArr == null) {
            if (this.f21281e == null) {
                this.f21281e = new int[2];
            }
            iArr3 = this.f21281e;
        } else {
            iArr3 = iArr;
        }
        iArr3[0] = 0;
        iArr3[1] = 0;
        if (viewParentC instanceof e) {
            i3.h hVar = (i3.h) ((e) viewParentC);
            if (hVar.f8951b.isNestedScrollingEnabled()) {
                b2.d dVar = hVar.f8950a;
                float f10 = -1;
                c3 = 0;
                c10 = 1;
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(i11 * f10)) & 4294967295L) | (((long) Float.floatToRawIntBits(i10 * f10)) << 32);
                int i15 = i12 == 0 ? 1 : 2;
                b2.g gVar = dVar.f1455a;
                b2.g gVar2 = null;
                if (gVar != null && gVar.f9703n) {
                    gVar2 = (b2.g) i2.f.j(gVar);
                }
                long jF = gVar2 != null ? gVar2.F(i15, jFloatToRawIntBits) : 0L;
                iArr3[0] = j2.l0.r(Float.intBitsToFloat((int) (jF >> 32)));
                iArr3[1] = j2.l0.r(Float.intBitsToFloat((int) (jF & 4294967295L)));
            } else {
                c3 = 0;
                c10 = 1;
            }
        } else {
            c3 = 0;
            c10 = 1;
            if (i12 == 0) {
                try {
                    viewParentC.onNestedPreScroll(recyclerView, i10, i11, iArr3);
                } catch (AbstractMethodError e10) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParentC + " does not implement interface method onNestedPreScroll", e10);
                }
            }
        }
        if (iArr2 != null) {
            recyclerView.getLocationInWindow(iArr2);
            iArr2[c3] = iArr2[c3] - i13;
            iArr2[c10] = iArr2[c10] - i14;
        }
        return (iArr3[c3] == 0 && iArr3[c10] == 0) ? false : true;
    }

    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r21v3 */
    /* JADX WARN: Type inference failed for: r21v4 */
    /* JADX WARN: Type inference failed for: r21v5 */
    /* JADX WARN: Type inference failed for: r21v6 */
    /* JADX WARN: Type inference failed for: r21v7 */
    /* JADX WARN: Type inference failed for: r21v8 */
    public final boolean b(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        ViewParent viewParentC;
        int i15;
        int i16;
        int[] iArr3;
        int i17;
        ?? r21;
        if (!this.f21280d || (viewParentC = c(i14)) == null) {
            return false;
        }
        if (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            if (iArr == null) {
                return false;
            }
            iArr[0] = 0;
            iArr[1] = 0;
            return false;
        }
        RecyclerView recyclerView = this.f21279c;
        if (iArr != null) {
            recyclerView.getLocationInWindow(iArr);
            i15 = iArr[0];
            i16 = iArr[1];
        } else {
            i15 = 0;
            i16 = 0;
        }
        if (iArr2 == null) {
            if (this.f21281e == null) {
                this.f21281e = new int[2];
            }
            iArr3 = this.f21281e;
            iArr3[0] = 0;
            iArr3[1] = 0;
        } else {
            iArr3 = iArr2;
        }
        boolean z10 = viewParentC instanceof e;
        b2.g gVar = null;
        if (z10) {
            i3.h hVar = (i3.h) ((e) viewParentC);
            if (hVar.f8951b.isNestedScrollingEnabled()) {
                b2.d dVar = hVar.f8950a;
                float f10 = -1;
                i17 = i15;
                r21 = 1;
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(i10 * f10)) << 32) | (((long) Float.floatToRawIntBits(i11 * f10)) & 4294967295L);
                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(i12 * f10)) << 32) | (((long) Float.floatToRawIntBits(i13 * f10)) & 4294967295L);
                int i18 = i14 == 0 ? 1 : 2;
                b2.g gVar2 = dVar.f1455a;
                if (gVar2 != null && gVar2.f9703n) {
                    gVar = (b2.g) i2.f.j(gVar2);
                }
                b2.g gVar3 = gVar;
                long jX = gVar3 != null ? gVar3.X(i18, jFloatToRawIntBits, jFloatToRawIntBits2) : 0L;
                iArr3[0] = j2.l0.r(Float.intBitsToFloat((int) (jX >> 32)));
                iArr3[1] = j2.l0.r(Float.intBitsToFloat((int) (jX & 4294967295L)));
            } else {
                i17 = i15;
                r21 = 1;
            }
        } else {
            i17 = i15;
            r21 = 1;
            r21 = 1;
            r21 = 1;
            r21 = 1;
            r21 = 1;
            r21 = 1;
            iArr3[0] = iArr3[0] + i12;
            iArr3[1] = iArr3[1] + i13;
            if (z10) {
                i3.h hVar2 = (i3.h) ((e) viewParentC);
                if (hVar2.f8951b.isNestedScrollingEnabled()) {
                    b2.d dVar2 = hVar2.f8950a;
                    float f11 = -1;
                    long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(i10 * f11)) << 32) | (((long) Float.floatToRawIntBits(i11 * f11)) & 4294967295L);
                    long jFloatToRawIntBits4 = (((long) Float.floatToRawIntBits(i12 * f11)) << 32) | (((long) Float.floatToRawIntBits(i13 * f11)) & 4294967295L);
                    int i19 = i14 == 0 ? 1 : 2;
                    b2.g gVar4 = dVar2.f1455a;
                    if (gVar4 != null && gVar4.f9703n) {
                        gVar = (b2.g) i2.f.j(gVar4);
                    }
                    b2.g gVar5 = gVar;
                    if (gVar5 != null) {
                        gVar5.X(i19, jFloatToRawIntBits3, jFloatToRawIntBits4);
                    }
                }
            } else if (i14 == 0) {
                try {
                    viewParentC.onNestedScroll(recyclerView, i10, i11, i12, i13);
                } catch (AbstractMethodError e10) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParentC + " does not implement interface method onNestedScroll", e10);
                }
            }
        }
        if (iArr != null) {
            recyclerView.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i17;
            iArr[r21] = iArr[r21] - i16;
        }
        return r21;
    }

    public final ViewParent c(int i10) {
        if (i10 == 0) {
            return this.f21277a;
        }
        if (i10 != 1) {
            return null;
        }
        return this.f21278b;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(int r12, int r13) {
        /*
            r11 = this;
            android.view.ViewParent r0 = r11.c(r13)
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            boolean r0 = r11.f21280d
            r2 = 0
            if (r0 == 0) goto L8f
            androidx.recyclerview.widget.RecyclerView r0 = r11.f21279c
            android.view.ViewParent r3 = r0.getParent()
            r4 = r0
        L14:
            if (r3 == 0) goto L8f
            boolean r5 = r3 instanceof u3.e
            java.lang.String r6 = "ViewParent "
            java.lang.String r7 = "ViewParentCompat"
            if (r5 == 0) goto L2e
            r8 = r3
            u3.e r8 = (u3.e) r8
            r8 = r12 & 2
            if (r8 != 0) goto L2c
            r8 = r12 & 1
            if (r8 == 0) goto L2a
            goto L2c
        L2a:
            r8 = 0
            goto L4b
        L2c:
            r8 = 1
            goto L4b
        L2e:
            if (r13 != 0) goto L2a
            boolean r8 = r3.onStartNestedScroll(r4, r0, r12)     // Catch: java.lang.AbstractMethodError -> L35
            goto L4b
        L35:
            r8 = move-exception
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>(r6)
            r9.append(r3)
            java.lang.String r10 = " does not implement interface method onStartNestedScroll"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            android.util.Log.e(r7, r9, r8)
            goto L2a
        L4b:
            if (r8 == 0) goto L83
            if (r13 == 0) goto L55
            if (r13 == r1) goto L52
            goto L57
        L52:
            r11.f21278b = r3
            goto L57
        L55:
            r11.f21277a = r3
        L57:
            if (r5 == 0) goto L67
            u3.e r3 = (u3.e) r3
            i3.h r3 = (i3.h) r3
            e7.c0 r0 = r3.f8972w
            if (r13 != r1) goto L64
            r0.f6309c = r12
            goto L82
        L64:
            r0.f6308b = r12
            goto L82
        L67:
            if (r13 != 0) goto L82
            r3.onNestedScrollAccepted(r4, r0, r12)     // Catch: java.lang.AbstractMethodError -> L6d
            goto L82
        L6d:
            r12 = move-exception
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>(r6)
            r13.append(r3)
            java.lang.String r0 = " does not implement interface method onNestedScrollAccepted"
            r13.append(r0)
            java.lang.String r13 = r13.toString()
            android.util.Log.e(r7, r13, r12)
        L82:
            return r1
        L83:
            boolean r5 = r3 instanceof android.view.View
            if (r5 == 0) goto L8a
            r4 = r3
            android.view.View r4 = (android.view.View) r4
        L8a:
            android.view.ViewParent r3 = r3.getParent()
            goto L14
        L8f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: u3.d.d(int, int):boolean");
    }

    public final void e(int i10) {
        ViewParent viewParentC = c(i10);
        if (viewParentC != null) {
            RecyclerView recyclerView = this.f21279c;
            if (viewParentC instanceof e) {
                e7.c0 c0Var = ((i3.h) ((e) viewParentC)).f8972w;
                if (i10 == 1) {
                    c0Var.f6309c = 0;
                } else {
                    c0Var.f6308b = 0;
                }
            } else if (i10 == 0) {
                try {
                    viewParentC.onStopNestedScroll(recyclerView);
                } catch (AbstractMethodError e10) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParentC + " does not implement interface method onStopNestedScroll", e10);
                }
            }
            if (i10 == 0) {
                this.f21277a = null;
            } else {
                if (i10 != 1) {
                    return;
                }
                this.f21278b = null;
            }
        }
    }
}
