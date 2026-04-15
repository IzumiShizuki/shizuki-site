package t4;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class k implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f20450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f20451c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f20452d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final File f20453e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f20454f;

    public k(String str, long j10, long j11, long j12, File file) {
        this.f20449a = str;
        this.f20450b = j10;
        this.f20451c = j11;
        this.f20452d = file != null;
        this.f20453e = file;
        this.f20454f = j12;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(k kVar) {
        String str = kVar.f20449a;
        String str2 = this.f20449a;
        if (!str2.equals(str)) {
            return str2.compareTo(kVar.f20449a);
        }
        long j10 = this.f20450b - kVar.f20450b;
        if (j10 == 0) {
            return 0;
        }
        return j10 < 0 ? -1 : 1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        sb.append(this.f20450b);
        sb.append(", ");
        return a0.c.H(this.f20451c, "]", sb);
    }
}
