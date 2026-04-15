package b7;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1766c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1767d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1768e;

    public /* synthetic */ f(b0.w1 w1Var, AtomicBoolean atomicBoolean, h hVar, AtomicBoolean atomicBoolean2) {
        this.f1764a = 0;
        this.f1765b = w1Var;
        this.f1766c = atomicBoolean;
        this.f1768e = hVar;
        this.f1767d = atomicBoolean2;
    }

    private final void a() {
        b0.w1 w1Var = (b0.w1) this.f1765b;
        AtomicBoolean atomicBoolean = (AtomicBoolean) this.f1766c;
        h hVar = (h) this.f1768e;
        AtomicBoolean atomicBoolean2 = (AtomicBoolean) this.f1767d;
        synchronized (w1Var.f1394b) {
            try {
                if (atomicBoolean.get()) {
                    atomicBoolean2.set(true);
                } else {
                    w1Var.E(hVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x02a3  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 720
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b7.f.run():void");
    }

    public /* synthetic */ f(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f1764a = i10;
        this.f1765b = obj;
        this.f1766c = obj2;
        this.f1767d = obj3;
        this.f1768e = obj4;
    }
}
