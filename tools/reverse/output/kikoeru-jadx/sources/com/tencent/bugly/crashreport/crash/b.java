package com.tencent.bugly.crashreport.crash;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class b implements Comparable<b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f4716a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f4717b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f4718c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f4719d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f4720e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f4721f = 0;

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(b bVar) {
        if (bVar == null) {
            return 1;
        }
        long j10 = this.f4717b - bVar.f4717b;
        if (j10 > 0) {
            return 1;
        }
        return j10 < 0 ? -1 : 0;
    }
}
