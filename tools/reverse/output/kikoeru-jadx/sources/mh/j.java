package mh;

import java.util.ArrayList;
import lh.y;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f15188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f15189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f15190c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f15191d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f15192e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f15193f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f15194g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f15195h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f15196i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f15197j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Long f15198k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Long f15199l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Long f15200m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Integer f15201n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Integer f15202o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Integer f15203p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ArrayList f15204q;

    public j(y yVar, boolean z10, String str, long j10, long j11, long j12, int i10, long j13, int i11, int i12, Long l10, Long l11, Long l12, Integer num, Integer num2, Integer num3) {
        jc.l.e(yVar, "canonicalPath");
        jc.l.e(str, "comment");
        this.f15188a = yVar;
        this.f15189b = z10;
        this.f15190c = str;
        this.f15191d = j10;
        this.f15192e = j11;
        this.f15193f = j12;
        this.f15194g = i10;
        this.f15195h = j13;
        this.f15196i = i11;
        this.f15197j = i12;
        this.f15198k = l10;
        this.f15199l = l11;
        this.f15200m = l12;
        this.f15201n = num;
        this.f15202o = num2;
        this.f15203p = num3;
        this.f15204q = new ArrayList();
    }

    public /* synthetic */ j(y yVar, boolean z10, String str, long j10, long j11, long j12, int i10, long j13, int i11, int i12, Long l10, Long l11, Long l12, int i13) {
        this(yVar, z10, (i13 & 4) != 0 ? "" : str, (i13 & 8) != 0 ? -1L : j10, (i13 & 16) != 0 ? -1L : j11, (i13 & 32) != 0 ? -1L : j12, (i13 & 64) != 0 ? -1 : i10, (i13 & 128) != 0 ? -1L : j13, (i13 & 256) != 0 ? -1 : i11, (i13 & 512) != 0 ? -1 : i12, (i13 & 1024) != 0 ? null : l10, (i13 & 2048) != 0 ? null : l11, (i13 & 4096) != 0 ? null : l12, null, null, null);
    }
}
