package com.tencent.bugly.proguard;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class E implements Comparable<E>, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f4852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f4853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f4854c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f4855d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f4856e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f4857f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f4858g;

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(E e10) {
        return (int) (this.f4854c - e10.f4854c);
    }
}
