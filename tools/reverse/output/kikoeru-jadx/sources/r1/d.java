package r1;

import m4.d1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float[] f18653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float[] f18654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r f18655c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final r f18656d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final q f18657e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final q f18658f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final q f18659g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final q f18660h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final q f18661i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final q f18662j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final q f18663k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final q f18664l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final q f18665m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final q f18666n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final q f18667o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final q f18668p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final q f18669q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final q f18670r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final k f18671s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final k f18672t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final q f18673u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final q f18674v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final q f18675w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final l f18676x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final c[] f18677y;

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        f18653a = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        f18654b = fArr2;
        float[] fArr3 = {0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f};
        r rVar = new r(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        r rVar2 = new r(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        r rVar3 = new r(-3.0d, 2.0d, 2.0d, 5.591816309728916d, 0.28466892d, 0.55991073d, -0.685490157d);
        f18655c = rVar3;
        r rVar4 = new r(-2.0d, -1.555223d, 1.860454d, 0.012683313515655966d, 18.8515625d, -18.6875d, 6.277394636015326d);
        f18656d = rVar4;
        s sVar = j.f18689d;
        q qVar = new q("sRGB IEC61966-2.1", fArr, sVar, rVar, 0);
        f18657e = qVar;
        q qVar2 = new q("sRGB IEC61966-2.1 (Linear)", fArr, sVar, 1.0d, 0.0f, 1.0f, 1);
        f18658f = qVar2;
        q qVar3 = new q("scRGB-nl IEC 61966-2-2:2003", fArr, sVar, null, new d1(8), new d1(9), -0.799f, 2.399f, rVar, 2);
        f18659g = qVar3;
        q qVar4 = new q("scRGB IEC 61966-2-2:2003", fArr, sVar, 1.0d, -0.5f, 7.499f, 3);
        f18660h = qVar4;
        q qVar5 = new q("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, sVar, new r(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 4);
        f18661i = qVar5;
        q qVar6 = new q("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, sVar, new r(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d), 5);
        f18662j = qVar6;
        q qVar7 = new q("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new s(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        f18663k = qVar7;
        q qVar8 = new q("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, sVar, rVar, 7);
        f18664l = qVar8;
        q qVar9 = new q("NTSC (1953)", fArr2, j.f18686a, new r(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 8);
        f18665m = qVar9;
        q qVar10 = new q("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, sVar, new r(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 9);
        f18666n = qVar10;
        q qVar11 = new q("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, sVar, 2.2d, 0.0f, 1.0f, 10);
        f18667o = qVar11;
        q qVar12 = new q("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, j.f18687b, new r(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d), 11);
        f18668p = qVar12;
        s sVar2 = j.f18688c;
        q qVar13 = new q("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, sVar2, 1.0d, -65504.0f, 65504.0f, 12);
        f18669q = qVar13;
        q qVar14 = new q("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, sVar2, 1.0d, -65504.0f, 65504.0f, 13);
        f18670r = qVar14;
        k kVar = new k(b.f18646b, "Generic XYZ", 14, 1);
        f18671s = kVar;
        long j10 = b.f18647c;
        k kVar2 = new k(j10, "Generic L*a*b*", 15, 0);
        f18672t = kVar2;
        q qVar15 = new q("None", fArr, sVar, rVar2, 16);
        f18673u = qVar15;
        q qVar16 = new q("Hybrid Log Gamma encoding", fArr3, sVar, null, new d1(10), new d1(11), 0.0f, 1.0f, rVar3, 17);
        f18674v = qVar16;
        q qVar17 = new q("Perceptual Quantizer encoding", fArr3, sVar, null, new d1(12), new d1(13), 0.0f, 1.0f, rVar4, 18);
        f18675w = qVar17;
        l lVar = new l(j10, "Oklab", 19);
        f18676x = lVar;
        f18677y = new c[]{qVar, qVar2, qVar3, qVar4, qVar5, qVar6, qVar7, qVar8, qVar9, qVar10, qVar11, qVar12, qVar13, qVar14, kVar, kVar2, qVar15, qVar16, qVar17, lVar};
    }

    public static double a(r rVar, double d10) {
        double d11 = d10 < 0.0d ? -1.0d : 1.0d;
        double d12 = d10 * d11;
        double d13 = rVar.f18720b;
        double d14 = rVar.f18721c;
        double d15 = rVar.f18722d;
        double d16 = rVar.f18723e;
        double d17 = rVar.f18724f;
        double d18 = d11;
        double d19 = d13 * d12;
        return (rVar.f18725g + 1.0d) * d18 * (d19 <= 1.0d ? Math.pow(d19, d14) : Math.exp((d12 - d17) * d15) + d16);
    }

    public static double b(r rVar, double d10) {
        double d11 = d10 < 0.0d ? -1.0d : 1.0d;
        double d12 = 1.0d / rVar.f18720b;
        double d13 = 1.0d / rVar.f18721c;
        double d14 = 1.0d / rVar.f18722d;
        double d15 = rVar.f18723e;
        double d16 = rVar.f18724f;
        double d17 = d11;
        double d18 = (d10 * d11) / (rVar.f18725g + 1.0d);
        return d17 * (d18 <= 1.0d ? Math.pow(d18, d13) * d12 : (Math.log(d18 - d15) * d14) + d16);
    }

    public static double c(r rVar, double d10) {
        double d11 = d10 < 0.0d ? -1.0d : 1.0d;
        double d12 = d10 * d11;
        double d13 = rVar.f18720b;
        double d14 = rVar.f18722d;
        double dPow = (Math.pow(d12, d14) * rVar.f18721c) + d13;
        return Math.pow((dPow >= 0.0d ? dPow : 0.0d) / ((Math.pow(d12, d14) * rVar.f18724f) + rVar.f18723e), rVar.f18725g) * d11;
    }

    public static double d(r rVar, double d10) {
        double d11 = d10 < 0.0d ? -1.0d : 1.0d;
        double d12 = d10 * d11;
        double d13 = -rVar.f18720b;
        double d14 = rVar.f18723e;
        double d15 = 1.0d / rVar.f18725g;
        return Math.pow(Math.max(d13 + (Math.pow(d12, d15) * d14), 0.0d) / ((Math.pow(d12, d15) * (-rVar.f18724f)) + rVar.f18721c), 1.0d / rVar.f18722d) * d11;
    }
}
