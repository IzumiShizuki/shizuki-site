package com.tencent.bugly.proguard;

import java.io.Serializable;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0010m implements Serializable {
    public abstract void a(C0008k c0008k);

    public abstract void a(C0009l c0009l);

    public abstract void a(StringBuilder sb, int i10);

    public String toString() {
        StringBuilder sb = new StringBuilder();
        a(sb, 0);
        return sb.toString();
    }
}
