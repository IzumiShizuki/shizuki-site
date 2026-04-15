package j2;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class o extends u3.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v f9927d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i2.j0 f9928e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v f9929f;

    public o(v vVar, i2.j0 j0Var, v vVar2) {
        this.f9927d = vVar;
        this.f9928e = j0Var;
        this.f9929f = vVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    @Override // u3.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(android.view.View r8, v3.d r9) {
        /*
            r7 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r9.f22380a
            android.view.View$AccessibilityDelegate r1 = r7.f21269a
            r1.onInitializeAccessibilityNodeInfo(r8, r0)
            j2.v r8 = r7.f9927d
            j2.d0 r1 = r8.f10045s
            boolean r2 = r1.v()
            if (r2 == 0) goto L15
            r2 = 0
            r0.setVisibleToUser(r2)
        L15:
            i2.j0 r2 = r7.f9928e
            i2.j0 r3 = r2.v()
        L1b:
            r4 = 0
            if (r3 == 0) goto L2e
            i2.d1 r5 = r3.F
            r6 = 8
            boolean r5 = r5.d(r6)
            if (r5 == 0) goto L29
            goto L2f
        L29:
            i2.j0 r3 = r3.v()
            goto L1b
        L2e:
            r3 = r4
        L2f:
            if (r3 == 0) goto L37
            int r3 = r3.f8743b
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
        L37:
            r3 = -1
            if (r4 == 0) goto L4a
            q2.q r5 = r8.getSemanticsOwner()
            q2.o r5 = r5.a()
            int r5 = r5.f17642g
            int r6 = r4.intValue()
            if (r6 != r5) goto L4e
        L4a:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
        L4e:
            int r4 = r4.intValue()
            r9.f22381b = r4
            j2.v r9 = r7.f9929f
            r0.setParent(r9, r4)
            int r2 = r2.f8743b
            o.w r4 = r1.E
            int r4 = r4.d(r2)
            r5 = 22
            if (r4 == r3) goto L83
            j2.y0 r6 = r8.getAndroidViewsHandler$ui_release()
            i3.h r6 = j2.l0.F(r6, r4)
            if (r6 == 0) goto L77
            int r4 = android.os.Build.VERSION.SDK_INT
            if (r4 < r5) goto L7e
            c7.x0.d(r0, r6)
            goto L7e
        L77:
            int r6 = android.os.Build.VERSION.SDK_INT
            if (r6 < r5) goto L7e
            c7.x0.e(r0, r9, r4)
        L7e:
            java.lang.String r4 = r1.G
            j2.v.a(r8, r2, r0, r4)
        L83:
            o.w r4 = r1.F
            int r4 = r4.d(r2)
            if (r4 == r3) goto La9
            j2.y0 r3 = r8.getAndroidViewsHandler$ui_release()
            i3.h r3 = j2.l0.F(r3, r4)
            if (r3 == 0) goto L9d
            int r9 = android.os.Build.VERSION.SDK_INT
            if (r9 < r5) goto La4
            c7.x0.f(r0, r3)
            goto La4
        L9d:
            int r3 = android.os.Build.VERSION.SDK_INT
            if (r3 < r5) goto La4
            c7.x0.c(r0, r9, r4)
        La4:
            java.lang.String r9 = r1.H
            j2.v.a(r8, r2, r0, r9)
        La9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j2.o.d(android.view.View, v3.d):void");
    }
}
