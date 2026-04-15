package x6;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CharSequence f24817c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f24815a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f24816b = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f24818d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f24819e = -3.4028235E38f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f24820f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f24821g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f24822h = -3.4028235E38f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f24823i = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f24824j = 1.0f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f24825k = Integer.MIN_VALUE;

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final o4.a a() {
        /*
            r13 = this;
            float r0 = r13.f24822h
            r1 = 0
            r2 = 1056964608(0x3f000000, float:0.5)
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 5
            r5 = 4
            r6 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r7 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r7 == 0) goto L11
            goto L1e
        L11:
            int r0 = r13.f24818d
            if (r0 == r5) goto L1d
            if (r0 == r4) goto L1a
            r0 = 1056964608(0x3f000000, float:0.5)
            goto L1e
        L1a:
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L1e
        L1d:
            r0 = 0
        L1e:
            int r7 = r13.f24823i
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = 3
            r10 = 2
            r11 = 1
            if (r7 == r8) goto L28
            goto L37
        L28:
            int r7 = r13.f24818d
            if (r7 == r11) goto L36
            if (r7 == r9) goto L34
            if (r7 == r5) goto L36
            if (r7 == r4) goto L34
            r7 = 1
            goto L37
        L34:
            r7 = 2
            goto L37
        L36:
            r7 = 0
        L37:
            o4.a r8 = new o4.a
            r8.<init>()
            int r12 = r13.f24818d
            if (r12 == r11) goto L57
            if (r12 == r10) goto L54
            if (r12 == r9) goto L51
            if (r12 == r5) goto L57
            if (r12 == r4) goto L51
            java.lang.String r4 = "WebvttCueParser"
            java.lang.String r5 = "Unknown textAlignment: "
            q.t0.J(r12, r5, r4)
            r4 = 0
            goto L59
        L51:
            android.text.Layout$Alignment r4 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            goto L59
        L54:
            android.text.Layout$Alignment r4 = android.text.Layout.Alignment.ALIGN_CENTER
            goto L59
        L57:
            android.text.Layout$Alignment r4 = android.text.Layout.Alignment.ALIGN_NORMAL
        L59:
            r8.f16173c = r4
            float r4 = r13.f24819e
            int r5 = r13.f24820f
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 == 0) goto L70
            if (r5 != 0) goto L70
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 < 0) goto L6d
            int r1 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r1 <= 0) goto L70
        L6d:
            r6 = 1065353216(0x3f800000, float:1.0)
            goto L77
        L70:
            if (r9 == 0) goto L74
            r6 = r4
            goto L77
        L74:
            if (r5 != 0) goto L77
            goto L6d
        L77:
            r8.f16175e = r6
            r8.f16176f = r5
            int r1 = r13.f24821g
            r8.f16177g = r1
            r8.f16178h = r0
            r8.f16179i = r7
            float r1 = r13.f24824j
            if (r7 == 0) goto La3
            if (r7 == r11) goto L96
            if (r7 != r10) goto L8c
            goto La5
        L8c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = java.lang.String.valueOf(r7)
            r0.<init>(r1)
            throw r0
        L96:
            r4 = 1073741824(0x40000000, float:2.0)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 > 0) goto L9f
            float r0 = r0 * r4
            goto La5
        L9f:
            float r3 = r3 - r0
            float r0 = r3 * r4
            goto La5
        La3:
            float r0 = r3 - r0
        La5:
            float r0 = java.lang.Math.min(r1, r0)
            r8.f16182l = r0
            int r0 = r13.f24825k
            r8.f16186p = r0
            java.lang.CharSequence r0 = r13.f24817c
            if (r0 == 0) goto Lb5
            r8.f16171a = r0
        Lb5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: x6.g.a():o4.a");
    }
}
