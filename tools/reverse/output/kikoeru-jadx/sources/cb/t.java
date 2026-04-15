package cb;

import com.tencent.bugly.proguard.T;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class t implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f3878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f3879c;

    public /* synthetic */ t(int i10, Object obj, Object obj2) {
        this.f3877a = i10;
        this.f3878b = obj;
        this.f3879c = obj2;
    }

    private final void a() {
        ((Runnable) this.f3878b).run();
        synchronized (((T) this.f3879c).f4891j) {
            T.b((T) this.f3879c);
        }
    }

    private final void b() {
        int i10 = 0;
        while (true) {
            try {
                ((Runnable) this.f3878b).run();
            } catch (Throwable th2) {
                hf.a0.t(th2, yb.i.f26088a);
            }
            Runnable runnableI0 = ((nf.h) this.f3879c).i0();
            if (runnableI0 == null) {
                return;
            }
            try {
                this.f3878b = runnableI0;
                i10++;
                if (i10 >= 16) {
                    nf.h hVar = (nf.h) this.f3879c;
                    if (nf.b.j(hVar.f15833d, hVar)) {
                        nf.h hVar2 = (nf.h) this.f3879c;
                        nf.b.i(hVar2.f15833d, hVar2, this);
                        return;
                    }
                }
            } catch (Throwable th3) {
                nf.h hVar3 = (nf.h) this.f3879c;
                synchronized (hVar3.f15836g) {
                    nf.h.f15831h.decrementAndGet(hVar3);
                    throw th3;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0110 A[Catch: Exception -> 0x00a4, TryCatch #4 {Exception -> 0x00a4, blocks: (B:30:0x0070, B:32:0x007c, B:33:0x0092, B:35:0x0098, B:38:0x00a7, B:41:0x00b8, B:46:0x00c6, B:47:0x00cb, B:48:0x00d6, B:51:0x00de, B:80:0x0163, B:82:0x0169, B:84:0x016d, B:62:0x00f3, B:63:0x0100, B:64:0x0110, B:66:0x0116, B:68:0x011c, B:70:0x0122, B:73:0x012a, B:75:0x0138, B:77:0x0146, B:78:0x0156, B:79:0x015d), top: B:123:0x0070 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 534
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cb.t.run():void");
    }

    public String toString() {
        switch (this.f3877a) {
            case 0:
                tc.b0 b0Var = new tc.b0(7, t.class.getSimpleName());
                s sVar = (s) this.f3879c;
                v2.e eVar = new v2.e(11, false);
                ((v2.e) b0Var.f20620d).f22365c = eVar;
                b0Var.f20620d = eVar;
                eVar.f22364b = sVar;
                return b0Var.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ t(int i10, Object obj, Object obj2, boolean z10) {
        this.f3877a = i10;
        this.f3879c = obj;
        this.f3878b = obj2;
    }
}
