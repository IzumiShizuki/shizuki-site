package j2;

import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class p3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ViewGroup.LayoutParams f9960a = new ViewGroup.LayoutParams(-2, -2);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final j2.o3 a(j2.a r6, x0.r r7, f1.f r8) {
        /*
            java.util.concurrent.atomic.AtomicBoolean r0 = j2.v1.f10064a
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            r3 = 0
            if (r0 == 0) goto L43
            r0 = 6
            kf.f r0 = g8.a.c(r2, r0, r3)
            ub.p r2 = j2.t0.f9992m
            java.lang.Object r2 = r2.getValue()
            yb.h r2 = (yb.h) r2
            nf.d r2 = hf.a0.b(r2)
            b0.x r4 = new b0.x
            r5 = 14
            r4.<init>(r5, r0, r3)
            r5 = 3
            hf.a0.y(r2, r3, r3, r4, r5)
            a0.f0 r2 = new a0.f0
            r4 = 22
            r2.<init>(r4, r0)
            java.lang.Object r0 = h1.n.f8051c
            monitor-enter(r0)
            java.lang.Object r4 = h1.n.f8057i     // Catch: java.lang.Throwable -> L40
            java.util.Collection r4 = (java.util.Collection) r4     // Catch: java.lang.Throwable -> L40
            java.util.ArrayList r2 = vb.m.r0(r4, r2)     // Catch: java.lang.Throwable -> L40
            h1.n.f8057i = r2     // Catch: java.lang.Throwable -> L40
            monitor-exit(r0)
            h1.n.a()
            goto L43
        L40:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        L43:
            int r0 = r6.getChildCount()
            if (r0 <= 0) goto L56
            android.view.View r0 = r6.getChildAt(r1)
            boolean r1 = r0 instanceof j2.v
            if (r1 == 0) goto L54
            j2.v r0 = (j2.v) r0
            goto L5a
        L54:
            r0 = r3
            goto L5a
        L56:
            r6.removeAllViews()
            goto L54
        L5a:
            if (r0 != 0) goto L72
            j2.v r0 = new j2.v
            android.content.Context r1 = r6.getContext()
            yb.h r2 = r7.i()
            r0.<init>(r1, r2)
            android.view.View r1 = r0.getView()
            android.view.ViewGroup$LayoutParams r2 = j2.p3.f9960a
            r6.addView(r1, r2)
        L72:
            android.view.View r6 = r0.getView()
            r1 = 2131165350(0x7f0700a6, float:1.7944915E38)
            java.lang.Object r6 = r6.getTag(r1)
            boolean r2 = r6 instanceof j2.o3
            if (r2 == 0) goto L84
            r3 = r6
            j2.o3 r3 = (j2.o3) r3
        L84:
            if (r3 != 0) goto La0
            j2.o3 r3 = new j2.o3
            c7.e1 r6 = new c7.e1
            i2.j0 r2 = r0.getRoot()
            r6.<init>(r2)
            x0.u r2 = new x0.u
            r2.<init>(r7, r6)
            r3.<init>(r0, r2)
            android.view.View r6 = r0.getView()
            r6.setTag(r1, r3)
        La0:
            r3.c(r8)
            yb.h r6 = r0.getCoroutineContext()
            yb.h r8 = r7.i()
            boolean r6 = jc.l.a(r6, r8)
            if (r6 != 0) goto Lb8
            yb.h r6 = r7.i()
            r0.setCoroutineContext(r6)
        Lb8:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: j2.p3.a(j2.a, x0.r, f1.f):j2.o3");
    }
}
