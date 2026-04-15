package nf;

import hf.s0;
import hf.t0;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f15861b = AtomicIntegerFieldUpdater.newUpdater(w.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public s0[] f15862a;

    public final void a(s0 s0Var) {
        s0Var.e((t0) this);
        s0[] s0VarArr = this.f15862a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f15861b;
        if (s0VarArr == null) {
            s0VarArr = new s0[4];
            this.f15862a = s0VarArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= s0VarArr.length) {
            Object[] objArrCopyOf = Arrays.copyOf(s0VarArr, atomicIntegerFieldUpdater.get(this) * 2);
            jc.l.d(objArrCopyOf, "copyOf(...)");
            s0VarArr = (s0[]) objArrCopyOf;
            this.f15862a = s0VarArr;
        }
        int i10 = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i10 + 1);
        s0VarArr[i10] = s0Var;
        s0Var.f8588b = i10;
        d(i10);
    }

    public final void b(s0 s0Var) {
        synchronized (this) {
            if (s0Var.b() != null) {
                c(s0Var.f8588b);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final hf.s0 c(int r9) {
        /*
            r8 = this;
            hf.s0[] r0 = r8.f15862a
            jc.l.b(r0)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = nf.w.f15861b
            int r2 = r1.get(r8)
            r3 = -1
            int r2 = r2 + r3
            r1.set(r8, r2)
            int r2 = r1.get(r8)
            if (r9 >= r2) goto L7a
            int r2 = r1.get(r8)
            r8.e(r9, r2)
            int r2 = r9 + (-1)
            int r2 = r2 / 2
            if (r9 <= 0) goto L3a
            r4 = r0[r9]
            jc.l.b(r4)
            r5 = r0[r2]
            jc.l.b(r5)
            int r4 = r4.compareTo(r5)
            if (r4 >= 0) goto L3a
            r8.e(r9, r2)
            r8.d(r2)
            goto L7a
        L3a:
            int r2 = r9 * 2
            int r4 = r2 + 1
            int r5 = r1.get(r8)
            if (r4 < r5) goto L45
            goto L7a
        L45:
            hf.s0[] r5 = r8.f15862a
            jc.l.b(r5)
            int r2 = r2 + 2
            int r6 = r1.get(r8)
            if (r2 >= r6) goto L63
            r6 = r5[r2]
            jc.l.b(r6)
            r7 = r5[r4]
            jc.l.b(r7)
            int r6 = r6.compareTo(r7)
            if (r6 >= 0) goto L63
            goto L64
        L63:
            r2 = r4
        L64:
            r4 = r5[r9]
            jc.l.b(r4)
            r5 = r5[r2]
            jc.l.b(r5)
            int r4 = r4.compareTo(r5)
            if (r4 > 0) goto L75
            goto L7a
        L75:
            r8.e(r9, r2)
            r9 = r2
            goto L3a
        L7a:
            int r9 = r1.get(r8)
            r9 = r0[r9]
            jc.l.b(r9)
            r2 = 0
            r9.e(r2)
            r9.f8588b = r3
            int r1 = r1.get(r8)
            r0[r1] = r2
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: nf.w.c(int):hf.s0");
    }

    public final void d(int i10) {
        while (i10 > 0) {
            s0[] s0VarArr = this.f15862a;
            jc.l.b(s0VarArr);
            int i11 = (i10 - 1) / 2;
            s0 s0Var = s0VarArr[i11];
            jc.l.b(s0Var);
            s0 s0Var2 = s0VarArr[i10];
            jc.l.b(s0Var2);
            if (s0Var.compareTo(s0Var2) <= 0) {
                return;
            }
            e(i10, i11);
            i10 = i11;
        }
    }

    public final void e(int i10, int i11) {
        s0[] s0VarArr = this.f15862a;
        jc.l.b(s0VarArr);
        s0 s0Var = s0VarArr[i11];
        jc.l.b(s0Var);
        s0 s0Var2 = s0VarArr[i10];
        jc.l.b(s0Var2);
        s0VarArr[i10] = s0Var;
        s0VarArr[i11] = s0Var2;
        s0Var.f8588b = i10;
        s0Var2.f8588b = i11;
    }
}
