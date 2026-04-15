package lh;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c0 f12563a = new c0(new byte[0], 0, 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f12564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicReference[] f12565c;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f12564b = iHighestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i10 = 0; i10 < iHighestOneBit; i10++) {
            atomicReferenceArr[i10] = new AtomicReference();
        }
        f12565c = atomicReferenceArr;
    }

    public static final void a(c0 c0Var) {
        jc.l.e(c0Var, "segment");
        if (c0Var.f12561f != null || c0Var.f12562g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (c0Var.f12559d) {
            return;
        }
        AtomicReference atomicReference = f12565c[(int) (Thread.currentThread().getId() & (((long) f12564b) - 1))];
        c0 c0Var2 = f12563a;
        c0 c0Var3 = (c0) atomicReference.getAndSet(c0Var2);
        if (c0Var3 == c0Var2) {
            return;
        }
        int i10 = c0Var3 != null ? c0Var3.f12558c : 0;
        if (i10 >= 65536) {
            atomicReference.set(c0Var3);
            return;
        }
        c0Var.f12561f = c0Var3;
        c0Var.f12557b = 0;
        c0Var.f12558c = i10 + 8192;
        atomicReference.set(c0Var);
    }

    public static final c0 b() {
        AtomicReference atomicReference = f12565c[(int) (Thread.currentThread().getId() & (((long) f12564b) - 1))];
        c0 c0Var = f12563a;
        c0 c0Var2 = (c0) atomicReference.getAndSet(c0Var);
        if (c0Var2 == c0Var) {
            return new c0();
        }
        if (c0Var2 == null) {
            atomicReference.set(null);
            return new c0();
        }
        atomicReference.set(c0Var2.f12561f);
        c0Var2.f12561f = null;
        c0Var2.f12558c = 0;
        return c0Var2;
    }
}
